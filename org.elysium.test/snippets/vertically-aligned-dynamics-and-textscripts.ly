%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.14.0"

\header {
  lsrtags = "tweaks-and-overrides, spacing"

%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2
  texidoces = "
Mediante el establecimiento de la propiedad @code{'Y-extent} a un valor
adecuado, todos los objetos @code{DynamicLineSpanner} (reguladores e
indicaciones dinámicas textuales) se pueden alinear con un punto de
referencia común, independientemente de sus dimensiones.  De esta
manera, todos los elementos estarán alineados verticalmente,
produciendo así un resultado más satisfactorio.

Se usa una idea similar para alinear las inscripciones de texto a lo
largo de su línea de base.

"
  doctitlees = "Indicaciones dinámicas y textuales alineadas verticalmente"


%% Translation of GIT committish: 0a868be38a775ecb1ef935b079000cebbc64de40
texidocde = "
Indem man die @code{'Y-extent}-Eigenschaft auf einen passenden Wert setzt,
können alle @code{DynamicLineSpanner}-Objekte (Crescendo-Klammern und
Dynamik-Texte)  (hairpins and dynamic texts) unabhängig von ihrer
wirklichen Ausdehnung an einem gemeinsamen Referenzpunkt ausgerichtet werden.
Auf diese Weise ist jedes Element vertikal ausgerichtet und der Notensatz
sieht ansprechender aus.

Die gleiche Idee wird benutzt, um Textbeschriftungen an ihrer
Grundlinie auszurichten.

"
  doctitlede = "Vertikale Ausrichtung von Dynamik und Textbeschriftung beeinflussen"

%% Translation of GIT committish: 217cd2b9de6e783f2a5c8a42be9c70a82195ad20
  texidocfr = "
Vous pourrez, en jouant sur la propriété @code{'Y-extent}, aligner les
différents objets @code{DynamicLineSpanner} (souflets ou textuels)
quelle que soit leur étendue, par rapport à un même point de référence.
Tous les éléments seront alors centrés sur une même ligne, ce qui sera
visuellement plus agréable.

C'est le même principe qui sert à aligner les indications textuelles sur
une ligne de référence.

"
  doctitlefr = "Alignement vertical des nuances indications textuelles"


  texidoc = "
By setting the @code{'Y-extent} property to a suitable value, all
@code{DynamicLineSpanner} objects (hairpins and dynamic texts) can be
aligned to a common reference point, regardless of their actual extent.
This way, every element will be vertically aligned, thus producing a
more pleasing output.

The same idea is used to align the text scripts along their baseline.

"
  doctitle = "Vertically aligned dynamics and textscripts"
} % begin verbatim

music = \relative c' {
  a'2\p b\f
  e4\p f\f\> g, b\p
  c2^\markup { \huge gorgeous } c^\markup { \huge fantastic }
}

{
  \music
  \break
  \override DynamicLineSpanner #'staff-padding = #2.0
  \override DynamicLineSpanner #'Y-extent = #'(-1.5 . 1.5)
  \override TextScript #'Y-extent = #'(-1.5 . 1.5)
  \music
}

