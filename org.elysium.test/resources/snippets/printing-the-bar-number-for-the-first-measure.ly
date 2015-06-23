%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.16.0"

\header {
  lsrtags = "rhythms"

  texidoc = "
By default, the first bar number in a score is suppressed if it is less
than or equal to `1'.  By setting @code{barNumberVisibility} to
@code{all-bar-numbers-visible}, any bar number can be printed for the
first measure and all subsequent measures.  Note that an empty bar line
must be inserted before the first note for this to work.

"
  doctitle = "Printing the bar number for the first measure"
} % begin verbatim


\relative c' {
  \set Score.barNumberVisibility = #all-bar-numbers-visible
  \bar ""
  c1 | d | e | f \break
  g1 | e | d | c
}