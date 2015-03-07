// Generated from RelAlgebra.g4 by ANTLR 4.5
package interpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelAlgebraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SELECT=4, PROJECT=5, NATURAL=6, CARTESIAN=7, ATTRIBUTE=8, 
		PREDICATE=9, RELATION=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SELECT", "PROJECT", "NATURAL", "CARTESIAN", "ATTRIBUTE", 
		"PREDICATE", "RELATION", "WS", "A", "B", "C", "D", "E", "F", "G", "H", 
		"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
		"W", "X", "Y", "Z"
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


	public RelAlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelAlgebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u0087\n\t\f"+
		"\t\16\t\u008a\13\t\3\t\3\t\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3"+
		"\n\3\n\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f\6\f\u009f"+
		"\n\f\r\f\16\f\u00a0\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\4\u0088\u0091\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37\2"+
		"!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2"+
		"I\2K\2\3\2 \3\2aa\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u00c1\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13Z\3\2\2\2\re\3\2\2\2\17r"+
		"\3\2\2\2\21\u0084\3\2\2\2\23\u008d\3\2\2\2\25\u0096\3\2\2\2\27\u009e\3"+
		"\2\2\2\31\u00a4\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00aa\3\2"+
		"\2\2!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C\u00ce\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d2\3\2\2\2I\u00d4\3\2\2\2K\u00d6\3\2\2\2MN\7*\2\2N"+
		"\4\3\2\2\2OP\7+\2\2P\6\3\2\2\2QR\7.\2\2R\b\3\2\2\2ST\5=\37\2TU\5!\21\2"+
		"UV\5/\30\2VW\5!\21\2WX\5\35\17\2XY\5? \2Y\n\3\2\2\2Z[\5\67\34\2[\\\5;"+
		"\36\2\\]\5\65\33\2]^\5+\26\2^_\5!\21\2_`\5\35\17\2`a\5? \2ab\5)\25\2b"+
		"c\5\65\33\2cd\5\63\32\2d\f\3\2\2\2ef\5\63\32\2fg\5\31\r\2gh\5? \2hi\5"+
		"A!\2ij\5;\36\2jk\5\31\r\2kl\5/\30\2lm\t\2\2\2mn\5+\26\2no\5\65\33\2op"+
		"\5)\25\2pq\5\63\32\2q\16\3\2\2\2rs\5\35\17\2st\5\31\r\2tu\5;\36\2uv\5"+
		"? \2vw\5!\21\2wx\5=\37\2xy\5)\25\2yz\5\31\r\2z{\5\63\32\2{|\t\2\2\2|}"+
		"\5\67\34\2}~\5;\36\2~\177\5\65\33\2\177\u0080\5\37\20\2\u0080\u0081\5"+
		"A!\2\u0081\u0082\5\35\17\2\u0082\u0083\5? \2\u0083\20\3\2\2\2\u0084\u0088"+
		"\7)\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7)\2\2\u008c\22\3\2\2\2\u008d\u0091\7]\2\2\u008e\u0090"+
		"\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095"+
		"\7_\2\2\u0095\24\3\2\2\2\u0096\u009a\t\3\2\2\u0097\u0099\t\4\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\26\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\t\5\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\b\f\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\t\6\2"+
		"\2\u00a5\32\3\2\2\2\u00a6\u00a7\t\7\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\t"+
		"\b\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\t\t\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\t\n\2\2\u00ad\"\3\2\2\2\u00ae\u00af\t\13\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\t\f\2\2\u00b1&\3\2\2\2\u00b2\u00b3\t\r\2\2\u00b3(\3\2\2\2\u00b4\u00b5"+
		"\t\16\2\2\u00b5*\3\2\2\2\u00b6\u00b7\t\17\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\t\20\2\2\u00b9.\3\2\2\2\u00ba\u00bb\t\21\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\t\22\2\2\u00bd\62\3\2\2\2\u00be\u00bf\t\23\2\2\u00bf\64\3\2\2\2\u00c0"+
		"\u00c1\t\24\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\t\25\2\2\u00c38\3\2\2\2\u00c4"+
		"\u00c5\t\26\2\2\u00c5:\3\2\2\2\u00c6\u00c7\t\27\2\2\u00c7<\3\2\2\2\u00c8"+
		"\u00c9\t\30\2\2\u00c9>\3\2\2\2\u00ca\u00cb\t\31\2\2\u00cb@\3\2\2\2\u00cc"+
		"\u00cd\t\32\2\2\u00cdB\3\2\2\2\u00ce\u00cf\t\33\2\2\u00cfD\3\2\2\2\u00d0"+
		"\u00d1\t\34\2\2\u00d1F\3\2\2\2\u00d2\u00d3\t\35\2\2\u00d3H\3\2\2\2\u00d4"+
		"\u00d5\t\36\2\2\u00d5J\3\2\2\2\u00d6\u00d7\t\37\2\2\u00d7L\3\2\2\2\7\2"+
		"\u0088\u0091\u009a\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}