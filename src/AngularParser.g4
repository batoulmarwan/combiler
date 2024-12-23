parser grammar AngularParser;

options {tokenVocab=AngularLexer;}

app:component appComponent ;

component:Component_OPEN component_body Component_CLOSE;
component_body:(SELECTOR|STANDALONE|IMPORT|template|styles)(Component_COMMA (SELECTOR|STANDALONE|IMPORT|template|styles))*;
template:TEMPLATE_OPEN template_body Template_Close;
template_body:OPEN_DIV IN_DIV div_body CLOSE_DIV;
div_body:(div|HEADER|SECTION|ARTICLE|ASIDE|DETAILS|A|OL|UL|LI|NAV|H1|H2|H3|H4|H5|H6|P|IMG|SPAN|STRONG|I|U|B|SMALL|MARK|EM)+;
div:OPEN_NEW_DIV IN_DIV div_body CLOSE_DIV;
styles:STYLES_OPEN styles_body STYLES_CLOSE;
styles_body:(P_app|P_list|P_card|P_card_h|P_card_i|P_detail|P_detail_i)+;

appComponent:APPComponent_OPEN appComponent_body APPComponent_CLOSE;
appComponent_body:(products|SelectedProduct|click)+;
products:Array_Product_OPEN productElement Array_Product_CLOSE;
productElement:element_Array(Array_COMMA element_Array)*;
element_Array:Array_element_Open element_body Element_Array_Close;
element_body:Element_name(Array_COMMA Element_name)*;
click:OnProductClick ProductClick_Attribute ProductClick_body ProductClick_Close;