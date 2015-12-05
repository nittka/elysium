package org.elysium.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.elysium.parser.antlr.lexer.InternalLilyPondLexer;

class MarkupBodyFinisher {

	public enum InsertEndPosition{
		BEFORE,
		AFTER,
		NOT
	}

	private boolean justStarted=true;
	private int markupLineIndentPosition;
	private int markupLine;
	private boolean countBracket=false;
	private boolean lookForNewLineWithoutIndentation=false;
	private int bracketIndent=0;
	private boolean thereWasAtLeastOneNonWhitespaceToken=false;
	private String wsTrimmedTextAfterMarkup="";

	public InsertEndPosition getInsertMarkupEndPosition(Token candidate) {
		if(justStarted){
			markupLineIndentPosition=getIndentPositionOfMarkupLine(candidate);
			markupLine=candidate.getLine();
			justStarted=false;
			return InsertEndPosition.NOT;
		}else if(candidate.getType()==InternalLilyPondLexer.EOF){
			return InsertEndPosition.BEFORE;
		}else{
			tryDetermineEndCriterion(candidate);
			if(isExpectedEndCriterionKnown()){
				return processTokenAndCheckIfEnd(candidate);
			}
		}
		return InsertEndPosition.NOT;
	}

	private int getIndentPositionOfMarkupLine(Token markup){
		int positionOfFirstNonWSInLine = markup.getCharPositionInLine();
		CharStream stream = markup.getInputStream();
		int i=-markup.getText().length()-1;
		boolean startOfLineFound=false;
		int tabCount=0;
		int wsCount=0;
		do{
			int character=stream.LA(i);
			if(character=='\n'||character==-1){
				startOfLineFound=true;
			} else if(character=='\t'){
				tabCount++;
			} else if(character==' '){
				wsCount++;
			} else{
				positionOfFirstNonWSInLine--;
				positionOfFirstNonWSInLine=positionOfFirstNonWSInLine-wsCount-8*tabCount;
				wsCount=0;
				tabCount=0;
			}
			i--;
		}while(!startOfLineFound);
		return positionOfFirstNonWSInLine;
	}

	private InsertEndPosition processTokenAndCheckIfEnd(Token candidate) {
		int tokenType=candidate.getType();
		if(countBracket){
			if(tokenType==InternalLilyPondLexer.LeftCurlyBracket){
				bracketIndent++;
			}else if(tokenType==InternalLilyPondLexer.RightCurlyBracket){
				bracketIndent--;
			}
			if(bracketIndent==0){
				return InsertEndPosition.AFTER;
			}
		}else if(lookForNewLineWithoutIndentation){
			if(tokenType==InternalLilyPondLexer.RULE_WS){
				String tokenText= candidate.getText();
				if(tokenText.charAt(tokenText.length()-1)=='\n'){
					return InsertEndPosition.BEFORE;
				};
			}
			if(candidate.getCharPositionInLine()<=markupLineIndentPosition){
				return InsertEndPosition.BEFORE;
			}
		}
		return InsertEndPosition.NOT;
	}

	private void tryDetermineEndCriterion(Token candidate) {
		int type = candidate.getType();
		if(type==InternalLilyPondLexer.LeftCurlyBracket){
			if(!isExpectedEndCriterionKnown() || candidate.getLine()==markupLine){
				countBracket=true;
			}
		}

		String text = candidate.getText();
		String trimmed=text.trim();
		if(!trimmed.isEmpty()){
			thereWasAtLeastOneNonWhitespaceToken=true;
			if(wsTrimmedTextAfterMarkup.length()<7){
				wsTrimmedTextAfterMarkup=wsTrimmedTextAfterMarkup+trimmed;
			}
		}
		//this is a hack to deal with incipit.ly
		if(wsTrimmedTextAfterMarkup.startsWith("\\score{")){
			countBracket=true;
		}
		if(thereWasAtLeastOneNonWhitespaceToken && text.indexOf('\n')>=0){
			lookForNewLineWithoutIndentation=true;
		}
	}

	private boolean isExpectedEndCriterionKnown(){
		return countBracket || lookForNewLineWithoutIndentation;
	}
}
