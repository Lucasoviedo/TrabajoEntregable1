// Generated from c:\Users\adm\Documents\TC\Proyectos\Compiladores2021\Compiladores2021\src\main\java\Compiladores2021\programa.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, CA=3, CC=4, LA=5, LC=6, PYC=7, COMA=8, EQ=9, MEN=10, MENEQ=11, 
		EQL=12, MAY=13, MAYEQ=14, DST=15, SUM=16, RES=17, MUL=18, DIV=19, MOD=20, 
		INT=21, CHAR=22, DOUBLE=23, VOID=24, RETURN=25, ENTERO=26, DECIMAL=27, 
		CARACTER=28, OR=29, AND=30, NOT=31, IF=32, ELSE=33, FOR=34, WHILE=35, 
		ID=36, WS=37, OTRO=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", 
			"EQ", "MEN", "MENEQ", "EQL", "MAY", "MAYEQ", "DST", "SUM", "RES", "MUL", 
			"DIV", "MOD", "INT", "CHAR", "DOUBLE", "VOID", "RETURN", "ENTERO", "DECIMAL", 
			"CARACTER", "OR", "AND", "NOT", "IF", "ELSE", "FOR", "WHILE", "ID", "WS", 
			"OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "'='", 
			"'<'", "'<='", "'=='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'int'", "'char'", "'double'", "'void'", "'return'", null, null, 
			null, "'||'", "'&&'", "'!'", "'if'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", "EQ", "MEN", 
			"MENEQ", "EQL", "MAY", "MAYEQ", "DST", "SUM", "RES", "MUL", "DIV", "MOD", 
			"INT", "CHAR", "DOUBLE", "VOID", "RETURN", "ENTERO", "DECIMAL", "CARACTER", 
			"OR", "AND", "NOT", "IF", "ELSE", "FOR", "WHILE", "ID", "WS", "OTRO"
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


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\6\35\u00a1\n\35\r\35\16\35\u00a2\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\5\'\u00c9\n\'\3\'\3\'\3\'\7\'\u00ce\n\'\f\'\16\'"+
		"\u00d1\13\'\3(\3(\3(\3(\3)\3)\2\2*\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b"+
		"\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27"+
		"\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(\3\2\5\4\2"+
		"C\\c|\3\2\62;\4\2\13\f\"\"\2\u00da\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S"+
		"\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3"+
		"\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33"+
		"k\3\2\2\2\35n\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'{\3\2"+
		"\2\2)}\3\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0083\3\2\2\2\61\u0087\3\2"+
		"\2\2\63\u008c\3\2\2\2\65\u0093\3\2\2\2\67\u0098\3\2\2\29\u00a0\3\2\2\2"+
		";\u00a4\3\2\2\2=\u00a8\3\2\2\2?\u00ac\3\2\2\2A\u00af\3\2\2\2C\u00b2\3"+
		"\2\2\2E\u00b4\3\2\2\2G\u00b7\3\2\2\2I\u00bc\3\2\2\2K\u00c0\3\2\2\2M\u00c8"+
		"\3\2\2\2O\u00d2\3\2\2\2Q\u00d6\3\2\2\2ST\t\2\2\2T\4\3\2\2\2UV\t\3\2\2"+
		"V\6\3\2\2\2WX\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z\n\3\2\2\2[\\\7]\2\2\\\f\3\2"+
		"\2\2]^\7_\2\2^\16\3\2\2\2_`\7}\2\2`\20\3\2\2\2ab\7\177\2\2b\22\3\2\2\2"+
		"cd\7=\2\2d\24\3\2\2\2ef\7.\2\2f\26\3\2\2\2gh\7?\2\2h\30\3\2\2\2ij\7>\2"+
		"\2j\32\3\2\2\2kl\7>\2\2lm\7?\2\2m\34\3\2\2\2no\7?\2\2op\7?\2\2p\36\3\2"+
		"\2\2qr\7@\2\2r \3\2\2\2st\7@\2\2tu\7?\2\2u\"\3\2\2\2vw\7#\2\2wx\7?\2\2"+
		"x$\3\2\2\2yz\7-\2\2z&\3\2\2\2{|\7/\2\2|(\3\2\2\2}~\7,\2\2~*\3\2\2\2\177"+
		"\u0080\7\61\2\2\u0080,\3\2\2\2\u0081\u0082\7\'\2\2\u0082.\3\2\2\2\u0083"+
		"\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\60\3\2\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2"+
		"\u008b\62\3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e\7q\2\2\u008e\u008f\7"+
		"w\2\2\u008f\u0090\7d\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\64"+
		"\3\2\2\2\u0093\u0094\7x\2\2\u0094\u0095\7q\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7f\2\2\u0097\66\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c\u009d\7t\2\2\u009d\u009e\7p\2\2"+
		"\u009e8\3\2\2\2\u009f\u00a1\5\5\3\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3:\3\2\2\2\u00a4\u00a5"+
		"\59\35\2\u00a5\u00a6\7\60\2\2\u00a6\u00a7\59\35\2\u00a7<\3\2\2\2\u00a8"+
		"\u00a9\7)\2\2\u00a9\u00aa\5\3\2\2\u00aa\u00ab\7)\2\2\u00ab>\3\2\2\2\u00ac"+
		"\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae@\3\2\2\2\u00af\u00b0\7(\2\2\u00b0"+
		"\u00b1\7(\2\2\u00b1B\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3D\3\2\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7h\2\2\u00b6F\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bbH\3\2\2\2\u00bc\u00bd"+
		"\7h\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bfJ\3\2\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5L\3\2\2\2\u00c6\u00c9\5\3\2\2\u00c7\u00c9\7a\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00ce\5\3"+
		"\2\2\u00cb\u00ce\5\5\3\2\u00cc\u00ce\7a\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0N\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\t\4\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b(\2\2\u00d5P\3\2\2\2\u00d6\u00d7"+
		"\13\2\2\2\u00d7R\3\2\2\2\7\2\u00a2\u00c8\u00cd\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}