// Generated from C:/Users/DELL/Desktop/compilernew/compiler/src/AngularParser.g4 by
// ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, COMMA=2, Component_OPEN=3, APPComponent_OPEN=4, Component_COMMA=5, 
		SELECTOR=6, STANDALONE=7, IMPORT=8, TEMPLATE_OPEN=9, STYLES_OPEN=10, Component_CLOSE=11, 
		OPEN_DIV=12, Template_Close=13, P_app=14, P_list=15, P_card=16, P_card_h=17, 
		P_card_i=18, P_detail=19, P_detail_i=20, STYLES_CLOSE=21, OPEN_NEW_DIV=22, 
		IN_DIV=23, H1=24, H2=25, H3=26, H4=27, H5=28, H6=29, IMG=30, P=31, SPAN=32, 
		STRONG=33, EM=34, I=35, U=36, B=37, SMALL=38, MARK=39, HEADER=40, SECTION=41, 
		ARTICLE=42, ASIDE=43, DETAILS=44, A=45, UL=46, OL=47, LI=48, NAV=49, CLOSE_DIV=50, 
		Array_Product_OPEN=51, SelectedProduct=52, OnProductClick=53, APPComponent_CLOSE=54, 
		Array_COMMA=55, Array_Product_CLOSE=56, Array_element_Open=57, Element_name=58, 
		Element_Array_Close=59, ProductClick_Attribute=60, ProductClick_body=61, 
		ProductClick_Close=62;
	public static final int
		RULE_app = 0, RULE_component = 1, RULE_component_body = 2, RULE_template = 3, 
		RULE_template_body = 4, RULE_div_body = 5, RULE_div = 6, RULE_styles = 7, 
		RULE_styles_body = 8, RULE_appComponent = 9, RULE_appComponent_body = 10, 
		RULE_products = 11, RULE_productElement = 12, RULE_element_Array = 13, 
		RULE_element_body = 14, RULE_click = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "component", "component_body", "template", "template_body", "div_body", 
			"div", "styles", "styles_body", "appComponent", "appComponent_body", 
			"products", "productElement", "element_Array", "element_body", "click"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WhiteSpace", "COMMA", "Component_OPEN", "APPComponent_OPEN", "Component_COMMA", 
			"SELECTOR", "STANDALONE", "IMPORT", "TEMPLATE_OPEN", "STYLES_OPEN", "Component_CLOSE", 
			"OPEN_DIV", "Template_Close", "P_app", "P_list", "P_card", "P_card_h", 
			"P_card_i", "P_detail", "P_detail_i", "STYLES_CLOSE", "OPEN_NEW_DIV", 
			"IN_DIV", "H1", "H2", "H3", "H4", "H5", "H6", "IMG", "P", "SPAN", "STRONG", 
			"EM", "I", "U", "B", "SMALL", "MARK", "HEADER", "SECTION", "ARTICLE", 
			"ASIDE", "DETAILS", "A", "UL", "OL", "LI", "NAV", "CLOSE_DIV", "Array_Product_OPEN", 
			"SelectedProduct", "OnProductClick", "APPComponent_CLOSE", "Array_COMMA", 
			"Array_Product_CLOSE", "Array_element_Open", "Element_name", "Element_Array_Close", 
			"ProductClick_Attribute", "ProductClick_body", "ProductClick_Close"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public AppComponentContext appComponent() {
			return getRuleContext(AppComponentContext.class,0);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			component();
			setState(33);
			appComponent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode Component_OPEN() { return getToken(AngularParser.Component_OPEN, 0); }
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public TerminalNode Component_CLOSE() { return getToken(AngularParser.Component_CLOSE, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(Component_OPEN);
			setState(36);
			component_body();
			setState(37);
			match(Component_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_bodyContext extends ParserRuleContext {
		public List<TerminalNode> SELECTOR() { return getTokens(AngularParser.SELECTOR); }
		public TerminalNode SELECTOR(int i) {
			return getToken(AngularParser.SELECTOR, i);
		}
		public List<TerminalNode> STANDALONE() { return getTokens(AngularParser.STANDALONE); }
		public TerminalNode STANDALONE(int i) {
			return getToken(AngularParser.STANDALONE, i);
		}
		public List<TerminalNode> IMPORT() { return getTokens(AngularParser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(AngularParser.IMPORT, i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<StylesContext> styles() {
			return getRuleContexts(StylesContext.class);
		}
		public StylesContext styles(int i) {
			return getRuleContext(StylesContext.class,i);
		}
		public List<TerminalNode> Component_COMMA() { return getTokens(AngularParser.Component_COMMA); }
		public TerminalNode Component_COMMA(int i) {
			return getToken(AngularParser.Component_COMMA, i);
		}
		public Component_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_bodyContext component_body() throws RecognitionException {
		Component_bodyContext _localctx = new Component_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(39);
				match(SELECTOR);
				}
				break;
			case STANDALONE:
				{
				setState(40);
				match(STANDALONE);
				}
				break;
			case IMPORT:
				{
				setState(41);
				match(IMPORT);
				}
				break;
			case TEMPLATE_OPEN:
				{
				setState(42);
				template();
				}
				break;
			case STYLES_OPEN:
				{
				setState(43);
				styles();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Component_COMMA) {
				{
				{
				setState(46);
				match(Component_COMMA);
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(47);
					match(SELECTOR);
					}
					break;
				case STANDALONE:
					{
					setState(48);
					match(STANDALONE);
					}
					break;
				case IMPORT:
					{
					setState(49);
					match(IMPORT);
					}
					break;
				case TEMPLATE_OPEN:
					{
					setState(50);
					template();
					}
					break;
				case STYLES_OPEN:
					{
					setState(51);
					styles();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_OPEN() { return getToken(AngularParser.TEMPLATE_OPEN, 0); }
		public Template_bodyContext template_body() {
			return getRuleContext(Template_bodyContext.class,0);
		}
		public TerminalNode Template_Close() { return getToken(AngularParser.Template_Close, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TEMPLATE_OPEN);
			setState(60);
			template_body();
			setState(61);
			match(Template_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_DIV() { return getToken(AngularParser.OPEN_DIV, 0); }
		public TerminalNode IN_DIV() { return getToken(AngularParser.IN_DIV, 0); }
		public Div_bodyContext div_body() {
			return getRuleContext(Div_bodyContext.class,0);
		}
		public TerminalNode CLOSE_DIV() { return getToken(AngularParser.CLOSE_DIV, 0); }
		public Template_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_bodyContext template_body() throws RecognitionException {
		Template_bodyContext _localctx = new Template_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_template_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(OPEN_DIV);
			setState(64);
			match(IN_DIV);
			setState(65);
			div_body();
			setState(66);
			match(CLOSE_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Div_bodyContext extends ParserRuleContext {
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public List<TerminalNode> HEADER() { return getTokens(AngularParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(AngularParser.HEADER, i);
		}
		public List<TerminalNode> SECTION() { return getTokens(AngularParser.SECTION); }
		public TerminalNode SECTION(int i) {
			return getToken(AngularParser.SECTION, i);
		}
		public List<TerminalNode> ARTICLE() { return getTokens(AngularParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(AngularParser.ARTICLE, i);
		}
		public List<TerminalNode> ASIDE() { return getTokens(AngularParser.ASIDE); }
		public TerminalNode ASIDE(int i) {
			return getToken(AngularParser.ASIDE, i);
		}
		public List<TerminalNode> DETAILS() { return getTokens(AngularParser.DETAILS); }
		public TerminalNode DETAILS(int i) {
			return getToken(AngularParser.DETAILS, i);
		}
		public List<TerminalNode> A() { return getTokens(AngularParser.A); }
		public TerminalNode A(int i) {
			return getToken(AngularParser.A, i);
		}
		public List<TerminalNode> OL() { return getTokens(AngularParser.OL); }
		public TerminalNode OL(int i) {
			return getToken(AngularParser.OL, i);
		}
		public List<TerminalNode> UL() { return getTokens(AngularParser.UL); }
		public TerminalNode UL(int i) {
			return getToken(AngularParser.UL, i);
		}
		public List<TerminalNode> LI() { return getTokens(AngularParser.LI); }
		public TerminalNode LI(int i) {
			return getToken(AngularParser.LI, i);
		}
		public List<TerminalNode> NAV() { return getTokens(AngularParser.NAV); }
		public TerminalNode NAV(int i) {
			return getToken(AngularParser.NAV, i);
		}
		public List<TerminalNode> H1() { return getTokens(AngularParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(AngularParser.H1, i);
		}
		public List<TerminalNode> H2() { return getTokens(AngularParser.H2); }
		public TerminalNode H2(int i) {
			return getToken(AngularParser.H2, i);
		}
		public List<TerminalNode> H3() { return getTokens(AngularParser.H3); }
		public TerminalNode H3(int i) {
			return getToken(AngularParser.H3, i);
		}
		public List<TerminalNode> H4() { return getTokens(AngularParser.H4); }
		public TerminalNode H4(int i) {
			return getToken(AngularParser.H4, i);
		}
		public List<TerminalNode> H5() { return getTokens(AngularParser.H5); }
		public TerminalNode H5(int i) {
			return getToken(AngularParser.H5, i);
		}
		public List<TerminalNode> H6() { return getTokens(AngularParser.H6); }
		public TerminalNode H6(int i) {
			return getToken(AngularParser.H6, i);
		}
		public List<TerminalNode> P() { return getTokens(AngularParser.P); }
		public TerminalNode P(int i) {
			return getToken(AngularParser.P, i);
		}
		public List<TerminalNode> IMG() { return getTokens(AngularParser.IMG); }
		public TerminalNode IMG(int i) {
			return getToken(AngularParser.IMG, i);
		}
		public List<TerminalNode> SPAN() { return getTokens(AngularParser.SPAN); }
		public TerminalNode SPAN(int i) {
			return getToken(AngularParser.SPAN, i);
		}
		public List<TerminalNode> STRONG() { return getTokens(AngularParser.STRONG); }
		public TerminalNode STRONG(int i) {
			return getToken(AngularParser.STRONG, i);
		}
		public List<TerminalNode> I() { return getTokens(AngularParser.I); }
		public TerminalNode I(int i) {
			return getToken(AngularParser.I, i);
		}
		public List<TerminalNode> U() { return getTokens(AngularParser.U); }
		public TerminalNode U(int i) {
			return getToken(AngularParser.U, i);
		}
		public List<TerminalNode> B() { return getTokens(AngularParser.B); }
		public TerminalNode B(int i) {
			return getToken(AngularParser.B, i);
		}
		public List<TerminalNode> SMALL() { return getTokens(AngularParser.SMALL); }
		public TerminalNode SMALL(int i) {
			return getToken(AngularParser.SMALL, i);
		}
		public List<TerminalNode> MARK() { return getTokens(AngularParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(AngularParser.MARK, i);
		}
		public List<TerminalNode> EM() { return getTokens(AngularParser.EM); }
		public TerminalNode EM(int i) {
			return getToken(AngularParser.EM, i);
		}
		public Div_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDiv_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDiv_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDiv_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_bodyContext div_body() throws RecognitionException {
		Div_bodyContext _localctx = new Div_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_NEW_DIV:
					{
					setState(68);
					div();
					}
					break;
				case HEADER:
					{
					setState(69);
					match(HEADER);
					}
					break;
				case SECTION:
					{
					setState(70);
					match(SECTION);
					}
					break;
				case ARTICLE:
					{
					setState(71);
					match(ARTICLE);
					}
					break;
				case ASIDE:
					{
					setState(72);
					match(ASIDE);
					}
					break;
				case DETAILS:
					{
					setState(73);
					match(DETAILS);
					}
					break;
				case A:
					{
					setState(74);
					match(A);
					}
					break;
				case OL:
					{
					setState(75);
					match(OL);
					}
					break;
				case UL:
					{
					setState(76);
					match(UL);
					}
					break;
				case LI:
					{
					setState(77);
					match(LI);
					}
					break;
				case NAV:
					{
					setState(78);
					match(NAV);
					}
					break;
				case H1:
					{
					setState(79);
					match(H1);
					}
					break;
				case H2:
					{
					setState(80);
					match(H2);
					}
					break;
				case H3:
					{
					setState(81);
					match(H3);
					}
					break;
				case H4:
					{
					setState(82);
					match(H4);
					}
					break;
				case H5:
					{
					setState(83);
					match(H5);
					}
					break;
				case H6:
					{
					setState(84);
					match(H6);
					}
					break;
				case P:
					{
					setState(85);
					match(P);
					}
					break;
				case IMG:
					{
					setState(86);
					match(IMG);
					}
					break;
				case SPAN:
					{
					setState(87);
					match(SPAN);
					}
					break;
				case STRONG:
					{
					setState(88);
					match(STRONG);
					}
					break;
				case I:
					{
					setState(89);
					match(I);
					}
					break;
				case U:
					{
					setState(90);
					match(U);
					}
					break;
				case B:
					{
					setState(91);
					match(B);
					}
					break;
				case SMALL:
					{
					setState(92);
					match(SMALL);
					}
					break;
				case MARK:
					{
					setState(93);
					match(MARK);
					}
					break;
				case EM:
					{
					setState(94);
					match(EM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899894259712L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode OPEN_NEW_DIV() { return getToken(AngularParser.OPEN_NEW_DIV, 0); }
		public TerminalNode IN_DIV() { return getToken(AngularParser.IN_DIV, 0); }
		public Div_bodyContext div_body() {
			return getRuleContext(Div_bodyContext.class,0);
		}
		public TerminalNode CLOSE_DIV() { return getToken(AngularParser.CLOSE_DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(OPEN_NEW_DIV);
			setState(100);
			match(IN_DIV);
			setState(101);
			div_body();
			setState(102);
			match(CLOSE_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode STYLES_OPEN() { return getToken(AngularParser.STYLES_OPEN, 0); }
		public Styles_bodyContext styles_body() {
			return getRuleContext(Styles_bodyContext.class,0);
		}
		public TerminalNode STYLES_CLOSE() { return getToken(AngularParser.STYLES_CLOSE, 0); }
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_styles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(STYLES_OPEN);
			setState(105);
			styles_body();
			setState(106);
			match(STYLES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Styles_bodyContext extends ParserRuleContext {
		public List<TerminalNode> P_app() { return getTokens(AngularParser.P_app); }
		public TerminalNode P_app(int i) {
			return getToken(AngularParser.P_app, i);
		}
		public List<TerminalNode> P_list() { return getTokens(AngularParser.P_list); }
		public TerminalNode P_list(int i) {
			return getToken(AngularParser.P_list, i);
		}
		public List<TerminalNode> P_card() { return getTokens(AngularParser.P_card); }
		public TerminalNode P_card(int i) {
			return getToken(AngularParser.P_card, i);
		}
		public List<TerminalNode> P_card_h() { return getTokens(AngularParser.P_card_h); }
		public TerminalNode P_card_h(int i) {
			return getToken(AngularParser.P_card_h, i);
		}
		public List<TerminalNode> P_card_i() { return getTokens(AngularParser.P_card_i); }
		public TerminalNode P_card_i(int i) {
			return getToken(AngularParser.P_card_i, i);
		}
		public List<TerminalNode> P_detail() { return getTokens(AngularParser.P_detail); }
		public TerminalNode P_detail(int i) {
			return getToken(AngularParser.P_detail, i);
		}
		public List<TerminalNode> P_detail_i() { return getTokens(AngularParser.P_detail_i); }
		public TerminalNode P_detail_i(int i) {
			return getToken(AngularParser.P_detail_i, i);
		}
		public Styles_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Styles_bodyContext styles_body() throws RecognitionException {
		Styles_bodyContext _localctx = new Styles_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styles_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2080768L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2080768L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppComponentContext extends ParserRuleContext {
		public TerminalNode APPComponent_OPEN() { return getToken(AngularParser.APPComponent_OPEN, 0); }
		public AppComponent_bodyContext appComponent_body() {
			return getRuleContext(AppComponent_bodyContext.class,0);
		}
		public TerminalNode APPComponent_CLOSE() { return getToken(AngularParser.APPComponent_CLOSE, 0); }
		public AppComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppComponentContext appComponent() throws RecognitionException {
		AppComponentContext _localctx = new AppComponentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_appComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(APPComponent_OPEN);
			setState(114);
			appComponent_body();
			setState(115);
			match(APPComponent_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppComponent_bodyContext extends ParserRuleContext {
		public List<ProductsContext> products() {
			return getRuleContexts(ProductsContext.class);
		}
		public ProductsContext products(int i) {
			return getRuleContext(ProductsContext.class,i);
		}
		public List<TerminalNode> SelectedProduct() { return getTokens(AngularParser.SelectedProduct); }
		public TerminalNode SelectedProduct(int i) {
			return getToken(AngularParser.SelectedProduct, i);
		}
		public List<ClickContext> click() {
			return getRuleContexts(ClickContext.class);
		}
		public ClickContext click(int i) {
			return getRuleContext(ClickContext.class,i);
		}
		public AppComponent_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appComponent_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppComponent_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppComponent_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppComponent_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppComponent_bodyContext appComponent_body() throws RecognitionException {
		AppComponent_bodyContext _localctx = new AppComponent_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_appComponent_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Array_Product_OPEN:
					{
					setState(117);
					products();
					}
					break;
				case SelectedProduct:
					{
					setState(118);
					match(SelectedProduct);
					}
					break;
				case OnProductClick:
					{
					setState(119);
					click();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductsContext extends ParserRuleContext {
		public TerminalNode Array_Product_OPEN() { return getToken(AngularParser.Array_Product_OPEN, 0); }
		public ProductElementContext productElement() {
			return getRuleContext(ProductElementContext.class,0);
		}
		public TerminalNode Array_Product_CLOSE() { return getToken(AngularParser.Array_Product_CLOSE, 0); }
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProducts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProducts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Array_Product_OPEN);
			setState(125);
			productElement();
			setState(126);
			match(Array_Product_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductElementContext extends ParserRuleContext {
		public List<Element_ArrayContext> element_Array() {
			return getRuleContexts(Element_ArrayContext.class);
		}
		public Element_ArrayContext element_Array(int i) {
			return getRuleContext(Element_ArrayContext.class,i);
		}
		public List<TerminalNode> Array_COMMA() { return getTokens(AngularParser.Array_COMMA); }
		public TerminalNode Array_COMMA(int i) {
			return getToken(AngularParser.Array_COMMA, i);
		}
		public ProductElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductElementContext productElement() throws RecognitionException {
		ProductElementContext _localctx = new ProductElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_productElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			element_Array();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array_COMMA) {
				{
				{
				setState(129);
				match(Array_COMMA);
				setState(130);
				element_Array();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_ArrayContext extends ParserRuleContext {
		public TerminalNode Array_element_Open() { return getToken(AngularParser.Array_element_Open, 0); }
		public Element_bodyContext element_body() {
			return getRuleContext(Element_bodyContext.class,0);
		}
		public TerminalNode Element_Array_Close() { return getToken(AngularParser.Element_Array_Close, 0); }
		public Element_ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_Array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement_Array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_ArrayContext element_Array() throws RecognitionException {
		Element_ArrayContext _localctx = new Element_ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element_Array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(Array_element_Open);
			setState(137);
			element_body();
			setState(138);
			match(Element_Array_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_bodyContext extends ParserRuleContext {
		public List<TerminalNode> Element_name() { return getTokens(AngularParser.Element_name); }
		public TerminalNode Element_name(int i) {
			return getToken(AngularParser.Element_name, i);
		}
		public List<TerminalNode> Array_COMMA() { return getTokens(AngularParser.Array_COMMA); }
		public TerminalNode Array_COMMA(int i) {
			return getToken(AngularParser.Array_COMMA, i);
		}
		public Element_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_bodyContext element_body() throws RecognitionException {
		Element_bodyContext _localctx = new Element_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_element_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Element_name);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array_COMMA) {
				{
				{
				setState(141);
				match(Array_COMMA);
				setState(142);
				match(Element_name);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClickContext extends ParserRuleContext {
		public TerminalNode OnProductClick() { return getToken(AngularParser.OnProductClick, 0); }
		public TerminalNode ProductClick_Attribute() { return getToken(AngularParser.ProductClick_Attribute, 0); }
		public TerminalNode ProductClick_body() { return getToken(AngularParser.ProductClick_body, 0); }
		public TerminalNode ProductClick_Close() { return getToken(AngularParser.ProductClick_Close, 0); }
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(OnProductClick);
			setState(149);
			match(ProductClick_Attribute);
			setState(150);
			match(ProductClick_body);
			setState(151);
			match(ProductClick_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0005\u00027\b\u0002\n\u0002"+
		"\f\u0002:\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005`\b\u0005\u000b\u0005\f\u0005a\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bn\b\b\u000b\b\f\bo\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\ny\b\n\u000b\n\f\nz\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0084\b\f\n\f\f\f\u0087\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0090\b\u000e\n\u000e\f\u000e\u0093"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000\u000e\u0014"+
		"\u00b3\u0000 \u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004"+
		",\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\b?\u0001\u0000"+
		"\u0000\u0000\n_\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000e"+
		"h\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012q\u0001"+
		"\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000"+
		"\u0000\u0018\u0080\u0001\u0000\u0000\u0000\u001a\u0088\u0001\u0000\u0000"+
		"\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0002\u0001\u0000!\"\u0003\u0012\t\u0000\"\u0001\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0003\u0000\u0000$%\u0003\u0004\u0002\u0000"+
		"%&\u0005\u000b\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'-\u0005\u0006"+
		"\u0000\u0000(-\u0005\u0007\u0000\u0000)-\u0005\b\u0000\u0000*-\u0003\u0006"+
		"\u0003\u0000+-\u0003\u000e\u0007\u0000,\'\u0001\u0000\u0000\u0000,(\u0001"+
		"\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-8\u0001\u0000\u0000\u0000.4\u0005\u0005\u0000"+
		"\u0000/5\u0005\u0006\u0000\u000005\u0005\u0007\u0000\u000015\u0005\b\u0000"+
		"\u000025\u0003\u0006\u0003\u000035\u0003\u000e\u0007\u00004/\u0001\u0000"+
		"\u0000\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000043\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"6.\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0003\b\u0004\u0000=>\u0005"+
		"\r\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\f\u0000\u0000@A"+
		"\u0005\u0017\u0000\u0000AB\u0003\n\u0005\u0000BC\u00052\u0000\u0000C\t"+
		"\u0001\u0000\u0000\u0000D`\u0003\f\u0006\u0000E`\u0005(\u0000\u0000F`"+
		"\u0005)\u0000\u0000G`\u0005*\u0000\u0000H`\u0005+\u0000\u0000I`\u0005"+
		",\u0000\u0000J`\u0005-\u0000\u0000K`\u0005/\u0000\u0000L`\u0005.\u0000"+
		"\u0000M`\u00050\u0000\u0000N`\u00051\u0000\u0000O`\u0005\u0018\u0000\u0000"+
		"P`\u0005\u0019\u0000\u0000Q`\u0005\u001a\u0000\u0000R`\u0005\u001b\u0000"+
		"\u0000S`\u0005\u001c\u0000\u0000T`\u0005\u001d\u0000\u0000U`\u0005\u001f"+
		"\u0000\u0000V`\u0005\u001e\u0000\u0000W`\u0005 \u0000\u0000X`\u0005!\u0000"+
		"\u0000Y`\u0005#\u0000\u0000Z`\u0005$\u0000\u0000[`\u0005%\u0000\u0000"+
		"\\`\u0005&\u0000\u0000]`\u0005\'\u0000\u0000^`\u0005\"\u0000\u0000_D\u0001"+
		"\u0000\u0000\u0000_E\u0001\u0000\u0000\u0000_F\u0001\u0000\u0000\u0000"+
		"_G\u0001\u0000\u0000\u0000_H\u0001\u0000\u0000\u0000_I\u0001\u0000\u0000"+
		"\u0000_J\u0001\u0000\u0000\u0000_K\u0001\u0000\u0000\u0000_L\u0001\u0000"+
		"\u0000\u0000_M\u0001\u0000\u0000\u0000_N\u0001\u0000\u0000\u0000_O\u0001"+
		"\u0000\u0000\u0000_P\u0001\u0000\u0000\u0000_Q\u0001\u0000\u0000\u0000"+
		"_R\u0001\u0000\u0000\u0000_S\u0001\u0000\u0000\u0000_T\u0001\u0000\u0000"+
		"\u0000_U\u0001\u0000\u0000\u0000_V\u0001\u0000\u0000\u0000_W\u0001\u0000"+
		"\u0000\u0000_X\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001"+
		"\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000b\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0016\u0000\u0000de\u0005\u0017\u0000\u0000"+
		"ef\u0003\n\u0005\u0000fg\u00052\u0000\u0000g\r\u0001\u0000\u0000\u0000"+
		"hi\u0005\n\u0000\u0000ij\u0003\u0010\b\u0000jk\u0005\u0015\u0000\u0000"+
		"k\u000f\u0001\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\u0011\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000"+
		"\u0000rs\u0003\u0014\n\u0000st\u00056\u0000\u0000t\u0013\u0001\u0000\u0000"+
		"\u0000uy\u0003\u0016\u000b\u0000vy\u00054\u0000\u0000wy\u0003\u001e\u000f"+
		"\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0015\u0001\u0000\u0000\u0000|}\u00053\u0000\u0000"+
		"}~\u0003\u0018\f\u0000~\u007f\u00058\u0000\u0000\u007f\u0017\u0001\u0000"+
		"\u0000\u0000\u0080\u0085\u0003\u001a\r\u0000\u0081\u0082\u00057\u0000"+
		"\u0000\u0082\u0084\u0003\u001a\r\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u00059\u0000\u0000\u0089"+
		"\u008a\u0003\u001c\u000e\u0000\u008a\u008b\u0005;\u0000\u0000\u008b\u001b"+
		"\u0001\u0000\u0000\u0000\u008c\u0091\u0005:\u0000\u0000\u008d\u008e\u0005"+
		"7\u0000\u0000\u008e\u0090\u0005:\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u001d\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u00055\u0000\u0000"+
		"\u0095\u0096\u0005<\u0000\u0000\u0096\u0097\u0005=\u0000\u0000\u0097\u0098"+
		"\u0005>\u0000\u0000\u0098\u001f\u0001\u0000\u0000\u0000\n,48_aoxz\u0085"+
		"\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}