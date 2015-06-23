%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.17.6"

\header {
  lsrtags = "contemporary-notation, expressive-marks, specific-notation"

  texidoc = "
A contemporary glissando without a final note can be typeset using a
hidden note and cadenza timing.

"
  doctitle = "Contemporary glissando"
} % begin verbatim


\relative c'' {
  \time 3/4
  \override Glissando.style = #'zigzag
  c4 c
  \cadenzaOn
  c4\glissando
  \hideNotes
  c,,4
  \unHideNotes
  \cadenzaOff
  \bar "|"
}
