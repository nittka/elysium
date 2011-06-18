package org.elysium.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyPondLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SCHEME_ML_COMMENT=11;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=8;

    // delegates
    // delegators

    public InternalLilyPondLexer() {;} 
    public InternalLilyPondLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLilyPondLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:11:7: ( '=' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:12:7: ( '{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:13:7: ( '}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:14:7: ( '<<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:14:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:15:7: ( '>>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:15:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:16:7: ( '!' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:16:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:17:7: ( '?' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:17:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:18:7: ( '+' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:18:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:19:7: ( '<' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:20:7: ( '>' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:21:7: ( '[' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:22:7: ( ']' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:23:7: ( '~' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:23:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:24:7: ( '\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:24:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:25:7: ( '(' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:26:7: ( ')' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:27:7: ( '\\'' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:27:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:28:7: ( ',' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:29:7: ( ':' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:30:7: ( 'include' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:30:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:31:7: ( 'version' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:31:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:32:7: ( 'sourcefilename' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:32:9: 'sourcefilename'
            {
            match("sourcefilename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:33:7: ( 'sourcefileline' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:33:9: 'sourcefileline'
            {
            match("sourcefileline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:34:7: ( 'markup' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:34:9: 'markup'
            {
            match("markup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:35:7: ( 'markuplines' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:35:9: 'markuplines'
            {
            match("markuplines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:36:7: ( 'book' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:36:9: 'book'
            {
            match("book"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:37:7: ( 'bookpart' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:37:9: 'bookpart'
            {
            match("bookpart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:38:7: ( 'header' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:38:9: 'header'
            {
            match("header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:39:7: ( 'score' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:39:9: 'score'
            {
            match("score"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:40:7: ( 'paper' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:40:9: 'paper'
            {
            match("paper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:41:7: ( 'midi' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:41:9: 'midi'
            {
            match("midi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:42:7: ( 'layout' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:42:9: 'layout'
            {
            match("layout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:43:7: ( 'relative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:43:9: 'relative'
            {
            match("relative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:44:7: ( 'transpose' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:44:9: 'transpose'
            {
            match("transpose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:45:7: ( 'chordmode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:45:9: 'chordmode'
            {
            match("chordmode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:46:7: ( 'drummode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:46:9: 'drummode'
            {
            match("drummode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:47:7: ( 'figuremode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:47:9: 'figuremode'
            {
            match("figuremode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:48:7: ( 'lyricmode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:48:9: 'lyricmode'
            {
            match("lyricmode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:49:7: ( 'notemode' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:49:9: 'notemode'
            {
            match("notemode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:50:7: ( 'lyricsto' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:50:9: 'lyricsto'
            {
            match("lyricsto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:51:7: ( 'new' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:51:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:52:7: ( 'context' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:52:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:53:7: ( 'with' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:53:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:54:7: ( 'accepts' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:54:9: 'accepts'
            {
            match("accepts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:55:7: ( 'addlyrics' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:55:9: 'addlyrics'
            {
            match("addlyrics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:56:7: ( 'alias' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:56:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:57:7: ( 'alternative' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:57:9: 'alternative'
            {
            match("alternative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:58:7: ( 'change' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:58:9: 'change'
            {
            match("change"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:59:7: ( 'chords' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:59:9: 'chords'
            {
            match("chords"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:60:7: ( 'consists' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:60:9: 'consists'
            {
            match("consists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:61:7: ( 'default' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:61:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:62:7: ( 'defaultchild' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:62:9: 'defaultchild'
            {
            match("defaultchild"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:63:7: ( 'denies' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:63:9: 'denies'
            {
            match("denies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:64:7: ( 'description' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:64:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:65:7: ( 'drums' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:65:9: 'drums'
            {
            match("drums"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:66:7: ( 'figures' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:66:9: 'figures'
            {
            match("figures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:67:7: ( 'grobdescriptions' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:67:9: 'grobdescriptions'
            {
            match("grobdescriptions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:68:7: ( 'key' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:68:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:69:7: ( 'lyrics' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:69:9: 'lyrics'
            {
            match("lyrics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:70:7: ( 'maininput' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:70:9: 'maininput'
            {
            match("maininput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:71:7: ( 'mark' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:71:9: 'mark'
            {
            match("mark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:72:7: ( 'name' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:72:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:73:7: ( 'objectid' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:73:9: 'objectid'
            {
            match("objectid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:74:7: ( 'octave' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:74:9: 'octave'
            {
            match("octave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:75:7: ( 'once' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:75:9: 'once'
            {
            match("once"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:76:7: ( 'override' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:76:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:77:7: ( 'partial' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:77:9: 'partial'
            {
            match("partial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:78:7: ( 'remove' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:78:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:79:7: ( 'repeat' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:79:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:80:7: ( 'rest' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:80:9: 'rest'
            {
            match("rest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:81:7: ( 'revert' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:81:9: 'revert'
            {
            match("revert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:82:7: ( 'sequential' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:82:9: 'sequential'
            {
            match("sequential"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:83:7: ( 'set' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:83:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:84:7: ( 'simultaneous' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:84:9: 'simultaneous'
            {
            match("simultaneous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:85:7: ( 'skip' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:85:9: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:7: ( 'tempo' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:86:9: 'tempo'
            {
            match("tempo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:7: ( 'time' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:87:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:88:7: ( 'times' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:88:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:89:7: ( 'type' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:89:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:90:7: ( 'unset' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:90:9: 'unset'
            {
            match("unset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:91:7: ( '#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:91:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:7: ( '$' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:92:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:7: ( '`' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:93:9: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:7: ( '@' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:94:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:95:7: ( '#{' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:95:9: '#{'
            {
            match("#{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:96:7: ( '#}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:96:9: '#}'
            {
            match("#}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:97:7: ( '#\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:97:9: '#\\\\'
            {
            match("#\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:98:7: ( '\\\\\\\\' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:98:9: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:99:8: ( '-' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:99:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:100:8: ( '#:' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:100:10: '#:'
            {
            match("#:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4282:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4284:10: ( ( '0' .. '9' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4284:12: ( '0' .. '9' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4284:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4284:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4286:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00A1' .. '\\uFFDC' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4286:11: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00A1' .. '\\uFFDC' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4286:11: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u00A1' .. '\\uFFDC' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')||(LA3_0>='\u00A1' && LA3_0<='\uFFDC')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A1' && input.LA(1)<='\uFFDC') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4288:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:40: ( '\\r' )? '\\n'
                    {
                    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4290:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4292:17: ( '%{' ( options {greedy=false; } : . )* '%}' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4292:19: '%{' ( options {greedy=false; } : . )* '%}'
            {
            match("%{"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4292:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='%') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='}') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='|')||(LA8_1>='~' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='$')||(LA8_0>='&' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4292:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("%}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SCHEME_ML_COMMENT"
    public final void mRULE_SCHEME_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SCHEME_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:24: ( '#!' ( options {greedy=false; } : . )* '!#' )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:26: '#!' ( options {greedy=false; } : . )* '!#'
            {
            match("#!"); 

            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:31: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='!') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='#') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='\"')||(LA9_1>='$' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=' ')||(LA9_0>='\"' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4294:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("!#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCHEME_ML_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4296:16: ( . )
            // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:4296:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER )
        int alt10=98;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:552: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 92 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:564: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 93 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:573: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:581: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 95 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:589: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:605: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 97 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:621: RULE_SCHEME_ML_COMMENT
                {
                mRULE_SCHEME_ML_COMMENT(); 

                }
                break;
            case 98 :
                // ../org.elysium/src-gen/org/elysium/parser/antlr/internal/InternalLilyPond.g:1:644: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\4\uffff\1\65\1\67\6\uffff\1\77\5\uffff\24\106\1\161\4\uffff\1\60"+
        "\3\uffff\1\172\25\uffff\1\106\1\uffff\45\106\15\uffff\1\172\1\uffff"+
        "\5\106\1\u00b5\35\106\1\u00d4\7\106\1\u00dc\5\106\1\uffff\3\172"+
        "\5\106\1\uffff\1\106\1\u00ea\1\u00ec\1\106\1\u00ee\1\u00f0\10\106"+
        "\1\u00f9\3\106\1\u00fe\1\u00ff\12\106\1\uffff\1\u010b\1\u010c\5"+
        "\106\1\uffff\2\106\1\u0114\2\106\1\uffff\1\172\3\106\1\u011a\2\106"+
        "\1\uffff\1\106\1\uffff\1\106\1\uffff\1\106\1\uffff\1\106\1\u0121"+
        "\6\106\1\uffff\2\106\1\u012b\1\u012c\2\uffff\5\106\1\u0133\5\106"+
        "\2\uffff\2\106\1\u013b\4\106\1\uffff\1\106\1\u0141\3\106\1\uffff"+
        "\2\106\1\u0148\2\106\1\u014b\1\uffff\1\106\1\u014d\1\106\1\u0150"+
        "\1\106\1\u0152\1\u0153\1\u0154\1\106\2\uffff\1\106\1\u0157\1\u0158"+
        "\3\106\1\uffff\1\106\1\u015d\5\106\1\uffff\3\106\1\u0167\1\106\1"+
        "\uffff\1\u0169\1\u016a\4\106\1\uffff\2\106\1\uffff\1\u0171\1\uffff"+
        "\2\106\1\uffff\1\106\3\uffff\2\106\2\uffff\1\u0177\2\106\1\u017b"+
        "\1\uffff\2\106\1\u017e\1\106\1\u0180\4\106\1\uffff\1\106\2\uffff"+
        "\5\106\1\u018b\1\uffff\1\106\1\u018d\1\u018e\2\106\1\uffff\1\u0191"+
        "\1\u0192\1\106\1\uffff\2\106\1\uffff\1\u0196\1\uffff\3\106\1\u019a"+
        "\1\u019b\4\106\1\u01a0\1\uffff\1\u01a1\2\uffff\1\u01a2\1\u01a3\2"+
        "\uffff\3\106\1\uffff\1\u01a7\2\106\2\uffff\1\106\1\u01ac\2\106\4"+
        "\uffff\2\106\1\u01b1\1\uffff\4\106\1\uffff\1\106\1\u01b7\1\106\1"+
        "\u01b9\1\uffff\1\u01ba\3\106\1\u01be\1\uffff\1\u01bf\2\uffff\3\106"+
        "\2\uffff\1\106\1\u01c4\1\u01c5\1\106\2\uffff\1\106\1\u01c8\1\uffff";
    static final String DFA10_eofS =
        "\u01c9\uffff";
    static final String DFA10_minS =
        "\1\0\3\uffff\1\74\1\76\6\uffff\1\134\5\uffff\1\156\1\145\1\143\1"+
        "\141\1\157\1\145\2\141\2\145\1\150\1\145\1\151\1\141\1\151\1\143"+
        "\1\162\1\145\1\142\1\156\1\41\4\uffff\1\0\3\uffff\1\173\25\uffff"+
        "\1\143\1\uffff\1\162\1\165\1\157\1\161\1\155\2\151\1\144\1\157\1"+
        "\141\1\160\1\171\1\162\1\154\1\141\2\155\1\160\1\141\1\156\1\165"+
        "\1\146\1\147\1\164\1\167\1\155\1\164\1\143\1\144\1\151\1\157\1\171"+
        "\1\152\1\164\1\143\1\145\1\163\15\uffff\1\0\1\uffff\1\154\1\163"+
        "\2\162\1\165\1\101\1\165\1\160\1\153\1\156\1\151\1\153\1\144\1\145"+
        "\1\164\1\157\1\151\1\141\1\157\1\145\1\164\1\145\1\156\1\160\2\145"+
        "\1\162\1\156\1\163\1\155\1\141\1\151\1\143\1\165\1\145\1\101\1\145"+
        "\1\150\1\145\1\154\1\141\1\145\1\142\1\101\1\145\1\141\1\145\1\162"+
        "\1\145\4\0\1\165\1\151\1\143\2\145\1\uffff\1\154\2\101\1\151\2\101"+
        "\1\145\1\162\1\151\1\165\1\143\1\164\1\166\1\141\1\101\1\162\1\163"+
        "\1\157\2\101\1\144\1\147\1\145\1\151\1\155\1\165\1\145\2\162\1\155"+
        "\1\uffff\2\101\1\160\1\171\1\163\1\162\1\144\1\uffff\1\143\1\166"+
        "\1\101\1\162\1\164\1\uffff\1\0\1\144\1\157\1\145\1\101\1\156\1\164"+
        "\1\uffff\1\160\1\uffff\1\156\1\uffff\1\141\1\uffff\1\162\1\101\1"+
        "\141\1\164\1\155\1\151\1\145\1\164\1\uffff\1\164\1\160\2\101\2\uffff"+
        "\1\155\1\145\1\170\1\163\1\157\1\101\1\154\1\163\1\151\1\145\1\157"+
        "\2\uffff\1\164\1\162\1\101\1\156\1\145\1\164\1\145\1\uffff\1\151"+
        "\1\101\1\145\1\156\1\146\1\uffff\1\164\1\141\1\101\1\160\1\162\1"+
        "\101\1\uffff\1\154\1\101\1\157\1\101\1\166\3\101\1\157\2\uffff\1"+
        "\157\2\101\2\164\1\144\1\uffff\1\164\1\101\1\160\1\155\1\144\1\163"+
        "\1\151\1\uffff\1\141\1\163\1\151\1\101\1\144\1\uffff\2\101\2\151"+
        "\1\156\1\151\1\uffff\1\165\1\164\1\uffff\1\101\1\uffff\1\144\1\157"+
        "\1\uffff\1\145\3\uffff\1\163\1\144\2\uffff\1\101\1\163\1\145\1\101"+
        "\1\uffff\1\164\1\157\1\101\1\145\1\101\1\143\1\164\1\143\1\144\1"+
        "\uffff\1\145\2\uffff\1\154\1\141\1\145\1\156\1\164\1\101\1\uffff"+
        "\1\145\2\101\2\145\1\uffff\2\101\1\150\1\uffff\1\151\1\144\1\uffff"+
        "\1\101\1\uffff\1\163\1\151\1\162\2\101\1\145\1\154\1\157\1\145\1"+
        "\101\1\uffff\1\101\2\uffff\2\101\2\uffff\1\151\1\157\1\145\1\uffff"+
        "\1\101\1\166\1\151\2\uffff\1\154\1\101\1\165\1\163\4\uffff\1\154"+
        "\1\156\1\101\1\uffff\1\145\1\160\1\141\1\151\1\uffff\1\163\1\101"+
        "\1\144\1\101\1\uffff\1\101\1\164\1\155\1\156\1\101\1\uffff\1\101"+
        "\2\uffff\1\151\2\145\2\uffff\1\157\2\101\1\156\2\uffff\1\163\1\101"+
        "\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\3\uffff\1\74\1\76\6\uffff\1\134\5\uffff\1\156\1\145\1\157"+
        "\1\151\1\157\1\145\1\141\1\171\1\145\1\171\1\157\1\162\1\151\1\157"+
        "\1\151\1\154\1\162\1\145\1\166\1\156\1\175\4\uffff\1\uffff\3\uffff"+
        "\1\173\25\uffff\1\143\1\uffff\1\162\1\165\1\157\1\164\1\155\1\151"+
        "\1\162\1\144\1\157\1\141\1\162\1\171\1\162\1\166\1\141\2\155\1\160"+
        "\1\157\1\156\1\165\1\163\1\147\1\164\1\167\1\155\1\164\1\143\1\144"+
        "\1\164\1\157\1\171\1\152\1\164\1\143\1\145\1\163\15\uffff\1\uffff"+
        "\1\uffff\1\154\1\163\2\162\1\165\1\uffdc\1\165\1\160\1\153\1\156"+
        "\1\151\1\153\1\144\1\145\1\164\1\157\1\151\1\141\1\157\1\145\1\164"+
        "\1\145\1\156\1\160\2\145\1\162\1\156\1\164\1\155\1\141\1\151\1\143"+
        "\1\165\1\145\1\uffdc\1\145\1\150\1\145\1\154\1\141\1\145\1\142\1"+
        "\uffdc\1\145\1\141\1\145\1\162\1\145\4\uffff\1\165\1\151\1\143\2"+
        "\145\1\uffff\1\154\2\uffdc\1\151\2\uffdc\1\145\1\162\1\151\1\165"+
        "\1\143\1\164\1\166\1\141\1\uffdc\1\162\1\163\1\157\2\uffdc\1\144"+
        "\1\147\1\145\1\151\1\163\1\165\1\145\2\162\1\155\1\uffff\2\uffdc"+
        "\1\160\1\171\1\163\1\162\1\144\1\uffff\1\143\1\166\1\uffdc\1\162"+
        "\1\164\1\uffff\1\uffff\1\144\1\157\1\145\1\uffdc\1\156\1\164\1\uffff"+
        "\1\160\1\uffff\1\156\1\uffff\1\141\1\uffff\1\162\1\uffdc\1\141\1"+
        "\164\1\163\1\151\1\145\1\164\1\uffff\1\164\1\160\2\uffdc\2\uffff"+
        "\1\163\1\145\1\170\1\163\1\157\1\uffdc\1\154\1\163\1\151\1\145\1"+
        "\157\2\uffff\1\164\1\162\1\uffdc\1\156\1\145\1\164\1\145\1\uffff"+
        "\1\151\1\uffdc\1\145\1\156\1\146\1\uffff\1\164\1\141\1\uffdc\1\160"+
        "\1\162\1\uffdc\1\uffff\1\154\1\uffdc\1\157\1\uffdc\1\166\3\uffdc"+
        "\1\157\2\uffff\1\157\2\uffdc\2\164\1\144\1\uffff\1\164\1\uffdc\1"+
        "\160\1\163\1\144\1\163\1\151\1\uffff\1\141\1\163\1\151\1\uffdc\1"+
        "\144\1\uffff\2\uffdc\2\151\1\156\1\151\1\uffff\1\165\1\164\1\uffff"+
        "\1\uffdc\1\uffff\1\144\1\157\1\uffff\1\145\3\uffff\1\163\1\144\2"+
        "\uffff\1\uffdc\1\163\1\145\1\uffdc\1\uffff\1\164\1\157\1\uffdc\1"+
        "\145\1\uffdc\1\143\1\164\1\143\1\144\1\uffff\1\145\2\uffff\1\154"+
        "\1\141\1\145\1\156\1\164\1\uffdc\1\uffff\1\145\2\uffdc\2\145\1\uffff"+
        "\2\uffdc\1\150\1\uffff\1\151\1\144\1\uffff\1\uffdc\1\uffff\1\163"+
        "\1\151\1\162\2\uffdc\1\145\1\154\1\157\1\145\1\uffdc\1\uffff\1\uffdc"+
        "\2\uffff\2\uffdc\2\uffff\1\151\1\157\1\145\1\uffff\1\uffdc\1\166"+
        "\1\151\2\uffff\1\156\1\uffdc\1\165\1\163\4\uffff\1\154\1\156\1\uffdc"+
        "\1\uffff\1\145\1\160\1\141\1\151\1\uffff\1\163\1\uffdc\1\144\1\uffdc"+
        "\1\uffff\1\uffdc\1\164\1\155\1\156\1\uffdc\1\uffff\1\uffdc\2\uffff"+
        "\1\151\2\145\2\uffff\1\157\2\uffdc\1\156\2\uffff\1\163\1\uffdc\1"+
        "\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\1\10\1\13\1\14\1\15\1\uffff"+
        "\1\17\1\20\1\21\1\22\1\23\25\uffff\1\122\1\123\1\124\1\131\1\uffff"+
        "\1\134\1\135\1\136\1\uffff\1\142\1\1\1\2\1\3\1\4\1\11\1\5\1\12\1"+
        "\6\1\7\1\10\1\13\1\14\1\15\1\130\1\16\1\17\1\20\1\21\1\22\1\23\1"+
        "\uffff\1\135\45\uffff\1\125\1\126\1\127\1\132\1\141\1\121\1\122"+
        "\1\123\1\124\1\131\1\133\1\134\1\136\1\uffff\1\137\72\uffff\1\111"+
        "\36\uffff\1\51\7\uffff\1\72\5\uffff\1\140\7\uffff\1\113\1\uffff"+
        "\1\75\1\uffff\1\37\1\uffff\1\32\10\uffff\1\106\4\uffff\1\115\1\117"+
        "\13\uffff\1\76\1\53\7\uffff\1\101\5\uffff\1\35\6\uffff\1\36\11\uffff"+
        "\1\114\1\116\6\uffff\1\67\7\uffff\1\56\5\uffff\1\120\6\uffff\1\30"+
        "\2\uffff\1\34\1\uffff\1\40\2\uffff\1\73\1\uffff\1\104\1\105\1\107"+
        "\2\uffff\1\61\1\60\4\uffff\1\65\11\uffff\1\100\1\uffff\1\24\1\25"+
        "\6\uffff\1\103\5\uffff\1\52\3\uffff\1\63\2\uffff\1\70\1\uffff\1"+
        "\54\12\uffff\1\33\1\uffff\1\50\1\41\2\uffff\1\62\1\44\3\uffff\1"+
        "\47\3\uffff\1\77\1\102\4\uffff\1\74\1\46\1\42\1\43\3\uffff\1\55"+
        "\4\uffff\1\110\4\uffff\1\45\5\uffff\1\31\1\uffff\1\66\1\57\3\uffff"+
        "\1\112\1\64\4\uffff\1\26\1\27\2\uffff\1\71";
    static final String DFA10_specialS =
        "\1\1\52\uffff\1\7\115\uffff\1\3\62\uffff\1\4\1\2\1\5\1\6\63\uffff"+
        "\1\0\u00e5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\60\2\56\2\60\1\56\22\60\1\56\1\6\1\53\1\46\1\47\1\57\1\60"+
            "\1\17\1\15\1\16\1\60\1\10\1\20\1\52\2\60\12\54\1\21\1\60\1\4"+
            "\1\1\1\5\1\7\1\51\32\55\1\11\1\14\1\12\2\60\1\50\1\41\1\26\1"+
            "\34\1\35\1\55\1\36\1\42\1\27\1\22\1\55\1\43\1\31\1\25\1\37\1"+
            "\44\1\30\1\55\1\32\1\24\1\33\1\45\1\23\1\40\3\55\1\2\1\60\1"+
            "\3\1\13\42\60\uff3c\55\43\60",
            "",
            "",
            "",
            "\1\64",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\107",
            "\1\111\1\uffff\1\112\3\uffff\1\113\1\uffff\1\114\3\uffff\1"+
            "\110",
            "\1\115\7\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\27\uffff\1\123",
            "\1\124",
            "\1\126\3\uffff\1\127\10\uffff\1\125\6\uffff\1\130",
            "\1\131\6\uffff\1\132",
            "\1\134\14\uffff\1\133",
            "\1\135",
            "\1\140\3\uffff\1\137\11\uffff\1\136",
            "\1\141",
            "\1\142\1\143\7\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147\1\150\12\uffff\1\151\7\uffff\1\152",
            "\1\153",
            "\1\160\30\uffff\1\157\41\uffff\1\156\36\uffff\1\154\1\uffff"+
            "\1\155",
            "",
            "",
            "",
            "",
            "\0\166",
            "",
            "",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\2\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\10\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\1\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\1\u008d\2\uffff\1\u008e\2\uffff\1\u008f\2\uffff\1"+
            "\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0096\15\uffff\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\7\uffff\1\u009a\4\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\12\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00af\1\u00ad\2\u00af\1\u00ac\27\u00af\1\u00ae\uffda\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cd\1\u00cc",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\u00e2\1\u00ad\ufff5\u00e2",
            "\0\u00e2",
            "\12\u00af\1\u00ad\2\u00af\1\u00ac\27\u00af\1\u00ae\127\u00af"+
            "\1\u00e3\uff82\u00af",
            "\12\u00af\1\u00ad\2\u00af\1\u00ac\27\u00af\1\u00ae\uffda\u00af",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\24\106\1\u00eb\5\106\46\uffff\uff3c\106",
            "\1\u00ed",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\17\106\1\u00ef\12\106\46\uffff\uff3c\106",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\32\106\6\uffff\22\106\1\u00fd\7\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\5\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0115",
            "\1\u0116",
            "",
            "\12\u00af\1\u00ad\2\u00af\1\u00ac\27\u00af\1\u00ae\uffda\u00af",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\1\u0120",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124\5\uffff\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "",
            "\1\u012d\5\uffff\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\32\106\6\uffff\13\106\1\u0147\16\106\46\uffff\uff3c\106",
            "\1\u0149",
            "\1\u014a",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\1\u014c",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u014e",
            "\32\106\6\uffff\23\106\1\u014f\6\106\46\uffff\uff3c\106",
            "\1\u0151",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0155",
            "",
            "",
            "\1\u0156",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u015e",
            "\1\u015f\5\uffff\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0168",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "",
            "",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0178",
            "\1\u0179",
            "\32\106\6\uffff\2\106\1\u017a\27\106\46\uffff\uff3c\106",
            "",
            "\1\u017c",
            "\1\u017d",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u017f",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\1\u018c",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u018f",
            "\1\u0190",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "",
            "\1\u01ab\1\uffff\1\u01aa",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "",
            "",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u01b8",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "",
            "\1\u01c3",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            "\1\u01c6",
            "",
            "",
            "\1\u01c7",
            "\32\106\6\uffff\32\106\46\uffff\uff3c\106",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_STRING | RULE_INT | RULE_ID | RULE_WS | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_SCHEME_ML_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_227 = input.LA(1);

                        s = -1;
                        if ( (LA10_227=='%') ) {s = 174;}

                        else if ( (LA10_227=='\r') ) {s = 172;}

                        else if ( (LA10_227=='\n') ) {s = 173;}

                        else if ( ((LA10_227>='\u0000' && LA10_227<='\t')||(LA10_227>='\u000B' && LA10_227<='\f')||(LA10_227>='\u000E' && LA10_227<='$')||(LA10_227>='&' && LA10_227<='\uFFFF')) ) {s = 175;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='=') ) {s = 1;}

                        else if ( (LA10_0=='{') ) {s = 2;}

                        else if ( (LA10_0=='}') ) {s = 3;}

                        else if ( (LA10_0=='<') ) {s = 4;}

                        else if ( (LA10_0=='>') ) {s = 5;}

                        else if ( (LA10_0=='!') ) {s = 6;}

                        else if ( (LA10_0=='?') ) {s = 7;}

                        else if ( (LA10_0=='+') ) {s = 8;}

                        else if ( (LA10_0=='[') ) {s = 9;}

                        else if ( (LA10_0==']') ) {s = 10;}

                        else if ( (LA10_0=='~') ) {s = 11;}

                        else if ( (LA10_0=='\\') ) {s = 12;}

                        else if ( (LA10_0=='(') ) {s = 13;}

                        else if ( (LA10_0==')') ) {s = 14;}

                        else if ( (LA10_0=='\'') ) {s = 15;}

                        else if ( (LA10_0==',') ) {s = 16;}

                        else if ( (LA10_0==':') ) {s = 17;}

                        else if ( (LA10_0=='i') ) {s = 18;}

                        else if ( (LA10_0=='v') ) {s = 19;}

                        else if ( (LA10_0=='s') ) {s = 20;}

                        else if ( (LA10_0=='m') ) {s = 21;}

                        else if ( (LA10_0=='b') ) {s = 22;}

                        else if ( (LA10_0=='h') ) {s = 23;}

                        else if ( (LA10_0=='p') ) {s = 24;}

                        else if ( (LA10_0=='l') ) {s = 25;}

                        else if ( (LA10_0=='r') ) {s = 26;}

                        else if ( (LA10_0=='t') ) {s = 27;}

                        else if ( (LA10_0=='c') ) {s = 28;}

                        else if ( (LA10_0=='d') ) {s = 29;}

                        else if ( (LA10_0=='f') ) {s = 30;}

                        else if ( (LA10_0=='n') ) {s = 31;}

                        else if ( (LA10_0=='w') ) {s = 32;}

                        else if ( (LA10_0=='a') ) {s = 33;}

                        else if ( (LA10_0=='g') ) {s = 34;}

                        else if ( (LA10_0=='k') ) {s = 35;}

                        else if ( (LA10_0=='o') ) {s = 36;}

                        else if ( (LA10_0=='u') ) {s = 37;}

                        else if ( (LA10_0=='#') ) {s = 38;}

                        else if ( (LA10_0=='$') ) {s = 39;}

                        else if ( (LA10_0=='`') ) {s = 40;}

                        else if ( (LA10_0=='@') ) {s = 41;}

                        else if ( (LA10_0=='-') ) {s = 42;}

                        else if ( (LA10_0=='\"') ) {s = 43;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 44;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='e'||LA10_0=='j'||LA10_0=='q'||(LA10_0>='x' && LA10_0<='z')||(LA10_0>='\u00A1' && LA10_0<='\uFFDC')) ) {s = 45;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 46;}

                        else if ( (LA10_0=='%') ) {s = 47;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='&'||LA10_0=='*'||(LA10_0>='.' && LA10_0<='/')||LA10_0==';'||(LA10_0>='^' && LA10_0<='_')||LA10_0=='|'||(LA10_0>='\u007F' && LA10_0<='\u00A0')||(LA10_0>='\uFFDD' && LA10_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_173 = input.LA(1);

                        s = -1;
                        if ( ((LA10_173>='\u0000' && LA10_173<='\uFFFF')) ) {s = 226;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_121 = input.LA(1);

                        s = -1;
                        if ( (LA10_121=='\r') ) {s = 172;}

                        else if ( (LA10_121=='\n') ) {s = 173;}

                        else if ( (LA10_121=='%') ) {s = 174;}

                        else if ( ((LA10_121>='\u0000' && LA10_121<='\t')||(LA10_121>='\u000B' && LA10_121<='\f')||(LA10_121>='\u000E' && LA10_121<='$')||(LA10_121>='&' && LA10_121<='\uFFFF')) ) {s = 175;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_172 = input.LA(1);

                        s = -1;
                        if ( ((LA10_172>='\u0000' && LA10_172<='\t')||(LA10_172>='\u000B' && LA10_172<='\uFFFF')) ) {s = 226;}

                        else if ( (LA10_172=='\n') ) {s = 173;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_174 = input.LA(1);

                        s = -1;
                        if ( (LA10_174=='}') ) {s = 227;}

                        else if ( (LA10_174=='%') ) {s = 174;}

                        else if ( (LA10_174=='\r') ) {s = 172;}

                        else if ( (LA10_174=='\n') ) {s = 173;}

                        else if ( ((LA10_174>='\u0000' && LA10_174<='\t')||(LA10_174>='\u000B' && LA10_174<='\f')||(LA10_174>='\u000E' && LA10_174<='$')||(LA10_174>='&' && LA10_174<='|')||(LA10_174>='~' && LA10_174<='\uFFFF')) ) {s = 175;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_175 = input.LA(1);

                        s = -1;
                        if ( (LA10_175=='%') ) {s = 174;}

                        else if ( (LA10_175=='\r') ) {s = 172;}

                        else if ( (LA10_175=='\n') ) {s = 173;}

                        else if ( ((LA10_175>='\u0000' && LA10_175<='\t')||(LA10_175>='\u000B' && LA10_175<='\f')||(LA10_175>='\u000E' && LA10_175<='$')||(LA10_175>='&' && LA10_175<='\uFFFF')) ) {s = 175;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_43 = input.LA(1);

                        s = -1;
                        if ( ((LA10_43>='\u0000' && LA10_43<='\uFFFF')) ) {s = 118;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}