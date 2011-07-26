% DO NOT EDIT this file manually; it is automatically
% generated from Documentation/snippets/new
% Make any changes in Documentation/snippets/new/
% and then run scripts/auxiliar/makelsr.py
%
% This file is in the public domain.
%% Note: this file works from version 2.14.0
\version "2.14.0"

\header {
%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2

  texidoces = "
He aquí una forma de imprimir un acorde en el que suena la misma nota
dos veces con distintas alteraciones.

"
  doctitlees = "Impresión de acordes complejos"

  lsrtags = "simultaneous-notes, chords"
  texidoc = "
Here is a way to display a chord where the same note is played twice
with different accidentals.
"
  doctitle = "Displaying complex chords"
} % begin verbatim


fixA = {
  \once \override Stem #'length = #9
}
fixB = {
  \once \override NoteHead #'X-offset = #1.7
  \once \override Stem #'rotation = #'(45 0 0)
  \once \override Stem #'extra-offset = #'(-0.2 . -0.2)
  \once \override Stem #'flag-style = #'no-flag
  \once \override Accidental #'extra-offset = #'(4 . 0)
}

\relative c' {
  << { \fixA <b d!>8 } \\ { \voiceThree \fixB dis } >> s
}