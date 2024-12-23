lexer grammar AngularLexer;
WhiteSpace:('\t'| '\n'| '\r'|' ')->skip;
COMMA:',';

Component_OPEN:WhiteSpace*'@Component({'WhiteSpace*->pushMode(Component);
APPComponent_OPEN:WhiteSpace*'export'WhiteSpace'class'WhiteSpace[a-zA-Z_]+WhiteSpace*'{'->pushMode(CLASS);

mode Component;
Component_COMMA:COMMA;
//Component_CLOSE:WhiteSpace*'})'WhiteSpace*->popMode;

SELECTOR:WhiteSpace*'selector'WhiteSpace*':'WhiteSpace*'"'WhiteSpace*[a-zA-Z-]+WhiteSpace*'"'WhiteSpace*;
STANDALONE:WhiteSpace*'standalone'WhiteSpace*':'WhiteSpace*('true'|'false')WhiteSpace*;
IMPORT:WhiteSpace*'imports'WhiteSpace*':'WhiteSpace*'['WhiteSpace*[a-zA-Z_]+WhiteSpace*']'WhiteSpace*;
TEMPLATE_OPEN:WhiteSpace*'template'WhiteSpace*':'WhiteSpace*'`'->pushMode(Template);
STYLES_OPEN:WhiteSpace*'styles'WhiteSpace*':'WhiteSpace*'['WhiteSpace*'`'->pushMode(Styles);
Component_CLOSE:WhiteSpace*'})'WhiteSpace*->popMode;
mode Template;
OPEN_DIV:WhiteSpace*'<div'->pushMode(Div);
Template_Close:'`'WhiteSpace*->popMode;

mode Styles;
P_app: WhiteSpace*'.app'WhiteSpace*'{'WhiteSpace*
       (
        WhiteSpace*'display'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
       |
        WhiteSpace*'flex-direction'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
       |
        WhiteSpace*'align-items'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
       |
        WhiteSpace*'margin'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
       )*
       WhiteSpace*'}'WhiteSpace*;
P_list: WhiteSpace*'.product-list'WhiteSpace*'{'WhiteSpace*
        (
         WhiteSpace*'display'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'flex-wrap'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'justify-content'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'gap'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        )*
        WhiteSpace*'}'WhiteSpace*;
P_card: WhiteSpace*'.product-card'WhiteSpace*'{'WhiteSpace*
        (
         WhiteSpace*'display'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'flex-direction'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'align-items'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'border'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'padding'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'width'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'cursor'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'transition'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
        |
         WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
        )*
        WhiteSpace*'}'WhiteSpace*;
P_card_h: WhiteSpace*'.product-card:hover'WhiteSpace*'{'WhiteSpace*
          (WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';')*
          WhiteSpace*'}'WhiteSpace*;
P_card_i: WhiteSpace*'.product-card img'WhiteSpace*'{'WhiteSpace*
          (
           WhiteSpace*'width'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
          |
           WhiteSpace*'height'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
          |
           WhiteSpace*'object-fit'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
          |
           WhiteSpace*'margin-bottom'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
          |
           WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          )*
        WhiteSpace*'}'WhiteSpace*;
P_detail: WhiteSpace*'.product-details'WhiteSpace*'{'WhiteSpace*
          (
           WhiteSpace*'width'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          |
           WhiteSpace*'border'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          |
           WhiteSpace*'padding'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          |
           WhiteSpace*'margin-top'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          |
           WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
          )*
          WhiteSpace*'}'WhiteSpace*;
P_detail_i: WhiteSpace*'.product-details img'WhiteSpace*'{'WhiteSpace*
            (
             WhiteSpace*'max-width'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
            |
             WhiteSpace*'height'WhiteSpace*':'WhiteSpace*Space WhiteSpace*';'
            |
             WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'
            )*
            WhiteSpace*'}'WhiteSpace*;
STYLES_CLOSE:WhiteSpace*'`'WhiteSpace*']'->popMode;

mode Div;
OPEN_NEW_DIV:WhiteSpace*'<div'->pushMode(Div);
IN_DIV: WhiteSpace*
        (
          (WhiteSpace*'class'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space WhiteSpace*'"'WhiteSpace*)
        |
          (WhiteSpace*'*ngFor'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*'let'WhiteSpace*Space WhiteSpace*'of'WhiteSpace*Space WhiteSpace*'"'WhiteSpace*)
        |
          (WhiteSpace*'*ngIf'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*[a-zA-Z_]+WhiteSpace*'"'WhiteSpace*)
        |
          (WhiteSpace*'(click)'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*[a-zA-Z_]+WhiteSpace*'('WhiteSpace*Space WhiteSpace*')'WhiteSpace*'"'WhiteSpace*)
        )*
        '>' WhiteSpace*;
H1:WhiteSpace*'<h1>'WhiteSpace*Space +WhiteSpace*'</h1>'WhiteSpace*;
H2:WhiteSpace*'<h2>'WhiteSpace*Space +WhiteSpace*'</h2>'WhiteSpace*;
H3:WhiteSpace*'<h3>'WhiteSpace*Space +WhiteSpace*'</h3>'WhiteSpace*;
H4:WhiteSpace*'<h4>'WhiteSpace*Space +WhiteSpace*'</h4>'WhiteSpace*;
H5:WhiteSpace*'<h5>'WhiteSpace*Space +WhiteSpace*'</h5>'WhiteSpace*;
H6:WhiteSpace*'<h6>'WhiteSpace*Space +WhiteSpace*'</h6>'WhiteSpace*;
IMG: WhiteSpace*'<'WhiteSpace*'img'WhiteSpace*
     '[src]'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space'.'WhiteSpace*'image'WhiteSpace*'"'WhiteSpace*
     (
        (
          WhiteSpace*'alt'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space+WhiteSpace*'"'WhiteSpace*
        )|
        (
          WhiteSpace*'class'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space+WhiteSpace*'"'WhiteSpace*
        )
     )*
     WhiteSpace* '/>' WhiteSpace*;
P:WhiteSpace*'<p>'WhiteSpace*Space+ WhiteSpace*'</p>'WhiteSpace*;
SPAN:WhiteSpace*'<span>'WhiteSpace*Space +WhiteSpace*'</span>'WhiteSpace*;
STRONG:WhiteSpace*'<strong>'WhiteSpace*Space +WhiteSpace*'</strong>'WhiteSpace*;
EM:WhiteSpace*'<em>'WhiteSpace*Space +WhiteSpace*'</em>'WhiteSpace*;
I:WhiteSpace*'<i>'WhiteSpace*Space +WhiteSpace*'</i>'WhiteSpace*;
U:WhiteSpace*'<u>'WhiteSpace*Space +WhiteSpace*'</u>'WhiteSpace*;
B:WhiteSpace*'<b>'WhiteSpace*Space +WhiteSpace*'</b>'WhiteSpace*;
SMALL:WhiteSpace*'<small>'WhiteSpace*Space +WhiteSpace*'</small>'WhiteSpace*;
MARK:WhiteSpace*'<mark>'WhiteSpace*Space +WhiteSpace*'</mark>'WhiteSpace*;
HEADER:WhiteSpace*'<header>'WhiteSpace*Space +WhiteSpace*'</header>'WhiteSpace*;
SECTION:WhiteSpace*'<section>'WhiteSpace*Space +WhiteSpace*'</section>'WhiteSpace*;
ARTICLE:WhiteSpace*'<article>'WhiteSpace*Space +WhiteSpace*'</article>'WhiteSpace*;
ASIDE:WhiteSpace*'<aside>'WhiteSpace*Space +WhiteSpace*'</aside>'WhiteSpace*;
DETAILS:WhiteSpace*'<details>'WhiteSpace*Space +WhiteSpace*'</details>'WhiteSpace*;
A:WhiteSpace*'<a>'WhiteSpace*Space +WhiteSpace*'</a>'WhiteSpace*;
UL:WhiteSpace*'<ul>'WhiteSpace*Space +WhiteSpace*'</ul>'WhiteSpace*;
OL:WhiteSpace*'<ol>'WhiteSpace*Space +WhiteSpace*'</ol>'WhiteSpace*;
LI:WhiteSpace*'<li>'WhiteSpace*Space +WhiteSpace*'</li>'WhiteSpace*;
NAV:WhiteSpace*'<nav>'WhiteSpace*Space +WhiteSpace*'</nav>'WhiteSpace*;
CLOSE_DIV:WhiteSpace*'</div>'WhiteSpace*->popMode;

mode CLASS;
Array_Product_OPEN:WhiteSpace*[a-zA-Z_]+WhiteSpace*'='WhiteSpace*'['WhiteSpace*->pushMode(Array_Product);
SelectedProduct:WhiteSpace*[a-zA-Z_]+WhiteSpace*':'WhiteSpace*[a-zA-Z]+ WhiteSpace*'='WhiteSpace*[a-zA-Z]+WhiteSpace*';'WhiteSpace*;
OnProductClick:WhiteSpace*[a-zA-Z_]+WhiteSpace*'('WhiteSpace*->pushMode(ProductClick);
APPComponent_CLOSE:WhiteSpace*'}'->popMode;

mode Array_Product;
Array_COMMA:WhiteSpace*COMMA WhiteSpace*;
Array_Product_CLOSE:WhiteSpace*']'WhiteSpace*';'->popMode;

Array_element_Open:WhiteSpace*'{'WhiteSpace*;
Element_name:WhiteSpace*[a-zA-Z_]+WhiteSpace*':'WhiteSpace*'"'WhiteSpace* Space+ WhiteSpace*'"'WhiteSpace*;
Element_Array_Close:WhiteSpace*'}'WhiteSpace*;

mode ProductClick;
ProductClick_Attribute:WhiteSpace*[a-zA-Z]+WhiteSpace*':'WhiteSpace*[a-zA-Z]+WhiteSpace*')'WhiteSpace*'{'WhiteSpace*;
ProductClick_body:WhiteSpace*'this.'[a-zA-Z_]+WhiteSpace*'='WhiteSpace*[a-zA-Z]+WhiteSpace*';'WhiteSpace*;
ProductClick_Close:WhiteSpace*'}'->popMode;

fragment
Space:(' '|'.'|[0-9]|[a-zA-Z]|'{'|'}'|'-'|'_'|'#'|'%'|'/'|':'|'$')+;