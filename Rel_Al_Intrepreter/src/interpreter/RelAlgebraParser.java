// Generated from RelAlgebra.g4 by ANTLR 4.5
package interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelAlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SELECT=4, PROJECT=5, NATURAL=6, CARTESIAN=7, ATTRIBUTE=8, 
		PREDICATE=9, RELATION=10, WS=11;
	public static final int
		RULE_expression = 0, RULE_select = 1, RULE_project = 2, RULE_natural = 3, 
		RULE_cartesian = 4, RULE_relation = 5;
	public static final String[] ruleNames = {
		"expression", "select", "project", "natural", "cartesian", "relation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SELECT", "PROJECT", "NATURAL", "CARTESIAN", "ATTRIBUTE", 
		"PREDICATE", "RELATION", "WS"
	};
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
	public String getGrammarFileName() { return "RelAlgebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RelAlgebraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public NaturalContext natural() {
			return getRuleContext(NaturalContext.class,0);
		}
		public CartesianContext cartesian() {
			return getRuleContext(CartesianContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(16);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				select();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				project();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				natural();
				}
				break;
			case CARTESIAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				cartesian();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RelAlgebraParser.SELECT, 0); }
		public TerminalNode PREDICATE() { return getToken(RelAlgebraParser.PREDICATE, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(SELECT);
			setState(19);
			match(PREDICATE);
			setState(20);
			match(T__0);
			setState(21);
			relation();
			setState(22);
			match(T__1);
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

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(RelAlgebraParser.PROJECT, 0); }
		public TerminalNode PREDICATE() { return getToken(RelAlgebraParser.PREDICATE, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PROJECT);
			setState(25);
			match(PREDICATE);
			setState(26);
			match(T__0);
			setState(27);
			relation();
			setState(28);
			match(T__1);
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

	public static class NaturalContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(RelAlgebraParser.NATURAL, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public NaturalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterNatural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitNatural(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitNatural(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalContext natural() throws RecognitionException {
		NaturalContext _localctx = new NaturalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_natural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(NATURAL);
			setState(31);
			match(T__0);
			setState(32);
			relation();
			setState(33);
			match(T__2);
			setState(34);
			relation();
			setState(35);
			match(T__1);
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

	public static class CartesianContext extends ParserRuleContext {
		public TerminalNode CARTESIAN() { return getToken(RelAlgebraParser.CARTESIAN, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public CartesianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesian; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterCartesian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitCartesian(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitCartesian(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CartesianContext cartesian() throws RecognitionException {
		CartesianContext _localctx = new CartesianContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cartesian);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(CARTESIAN);
			setState(38);
			match(T__0);
			setState(39);
			relation();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(40);
				match(T__2);
				setState(41);
				relation();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__1);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NestedContext extends RelationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestedContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleContext extends RelationContext {
		public TerminalNode RELATION() { return getToken(RelAlgebraParser.RELATION, 0); }
		public SimpleContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelAlgebraListener ) ((RelAlgebraListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelAlgebraVisitor ) return ((RelAlgebraVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relation);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case RELATION:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(RELATION);
				}
				break;
			case SELECT:
			case PROJECT:
			case NATURAL:
			case CARTESIAN:
				_localctx = new NestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r8\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\3\6\3\7\3\7\5\7\66\n"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2\66\2\22\3\2\2\2\4\24\3\2\2\2\6\32\3\2\2\2"+
		"\b \3\2\2\2\n\'\3\2\2\2\f\65\3\2\2\2\16\23\5\4\3\2\17\23\5\6\4\2\20\23"+
		"\5\b\5\2\21\23\5\n\6\2\22\16\3\2\2\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21"+
		"\3\2\2\2\23\3\3\2\2\2\24\25\7\6\2\2\25\26\7\13\2\2\26\27\7\3\2\2\27\30"+
		"\5\f\7\2\30\31\7\4\2\2\31\5\3\2\2\2\32\33\7\7\2\2\33\34\7\13\2\2\34\35"+
		"\7\3\2\2\35\36\5\f\7\2\36\37\7\4\2\2\37\7\3\2\2\2 !\7\b\2\2!\"\7\3\2\2"+
		"\"#\5\f\7\2#$\7\5\2\2$%\5\f\7\2%&\7\4\2\2&\t\3\2\2\2\'(\7\t\2\2()\7\3"+
		"\2\2).\5\f\7\2*+\7\5\2\2+-\5\f\7\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62\13\3\2\2\2\63\66\7\f\2"+
		"\2\64\66\5\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\r\3\2\2\2\5\22.\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}