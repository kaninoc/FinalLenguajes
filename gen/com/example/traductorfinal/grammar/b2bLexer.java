// Generated from C:/Users/moise/Desktop/X/Lenguajes/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\b2b.g4 by ANTLR 4.9.1
package com.example.traductorfinal.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class b2bLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, AMP=8, SEMIC=9, DOUBLE_SEMIC=10, 
		SEMIAMP=11, DOUBLE_SEMIAMP=12, PIPE=13, PIPEAMP=14, L_BR=15, R_BR=16, 
		L_SQUAREBR=17, R_SQUAREBR=18, L_CURLYBR=19, R_CURLYBR=20, LT=21, GT=22, 
		EQ=23, NE=24, GOET=25, LOET=26, NOT=27, DOUBLE_QUOTE=28, SINGLE_QUOTE=29, 
		BACKSLASH=30, PR_if=31, PR_then=32, PR_elif=33, PR_else=34, PR_fi=35, 
		PR_time=36, PR_for=37, PR_in=38, PR_until=39, PR_while=40, PR_do=41, PR_done=42, 
		PR_case=43, PR_esac=44, PR_coproc=45, PR_select=46, PR_function=47, PR_Lsquarebracket=48, 
		PR_Rsquarebracket=49, PR_true=50, PR_false=51, PR_null=52, PR_echo=53, 
		PR_read=54, END_OF_LINE=55, NUMERO=56, ID=57, FILENAME=58, SQ_WORD=59, 
		DQ_WORD=60, COMMENT=61, COMMENT_MUL=62, WS=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OR", "AND", "AMP", "SEMIC", 
			"DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", 
			"R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", 
			"EQ", "NE", "GOET", "LOET", "NOT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", 
			"PR_if", "PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", 
			"PR_in", "PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", 
			"PR_coproc", "PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "END_OF_LINE", 
			"NUMERO", "ID", "FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", "COMMENT_MUL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dash'", "'-c'", "'-a'", "'-s'", "'$'", "'||'", "'&&'", "'&'", 
			"';'", "';;'", "';&'", "';;&'", "'|'", "'|&'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "'='", "'!='", "'>='", "'<='", "'!'", "'\"'", 
			"'''", "'\\'", "'if'", "'then'", "'elif'", "'else'", "'fi'", "'time'", 
			"'for'", "'in'", "'until'", "'while'", "'do'", "'done'", "'case'", "'esac'", 
			"'coproc'", "'select'", "'function'", "'[['", "']]'", "'true'", "'false'", 
			"''''", null, "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "AMP", "SEMIC", "DOUBLE_SEMIC", 
			"SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", 
			"R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", "EQ", "NE", "GOET", 
			"LOET", "NOT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", "PR_if", 
			"PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", "PR_in", 
			"PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", "PR_coproc", 
			"PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "END_OF_LINE", 
			"NUMERO", "ID", "FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", "COMMENT_MUL", 
			"WS"
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


	public b2bLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "b2b.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u019e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\7\66\u013e\n\66\f\66\16\66\u0141\13\66\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\39\69\u014b\n9\r9\169\u014c\39\39\69\u0151\n9\r9\169\u0152"+
		"\59\u0155\n9\3:\3:\7:\u0159\n:\f:\16:\u015c\13:\3;\3;\7;\u0160\n;\f;\16"+
		";\u0163\13;\3;\3;\6;\u0167\n;\r;\16;\u0168\3<\3<\3<\3<\7<\u016f\n<\f<"+
		"\16<\u0172\13<\3<\3<\3=\3=\3=\3=\7=\u017a\n=\f=\16=\u017d\13=\3=\3=\3"+
		">\3>\7>\u0183\n>\f>\16>\u0186\13>\3?\3?\3?\3?\3?\3?\3?\7?\u018f\n?\f?"+
		"\16?\u0192\13?\3?\3?\3?\3?\3@\6@\u0199\n@\r@\16@\u019a\3@\3@\5\u0170\u017b"+
		"\u0190\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\3\2\n\3\2\f\f\3\2\62;\3\2\60\60\4\2C\\"+
		"c|\6\2\62;C\\aac|\5\2\62;C\\c|\3\2\17\17\5\2\13\13\17\17\"\"\2\u01ab\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0086\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008c\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0094\3\2"+
		"\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2\2\27\u009e\3\2\2"+
		"\2\31\u00a1\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2\2\2\37\u00aa\3\2\2\2"+
		"!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b4\3"+
		"\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63"+
		"\u00bf\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3\2\2\29\u00c7\3\2\2\2;\u00c9"+
		"\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d0\3\2\2\2C\u00d5\3\2\2\2E"+
		"\u00da\3\2\2\2G\u00df\3\2\2\2I\u00e2\3\2\2\2K\u00e7\3\2\2\2M\u00eb\3\2"+
		"\2\2O\u00ee\3\2\2\2Q\u00f4\3\2\2\2S\u00fa\3\2\2\2U\u00fd\3\2\2\2W\u0102"+
		"\3\2\2\2Y\u0107\3\2\2\2[\u010c\3\2\2\2]\u0113\3\2\2\2_\u011a\3\2\2\2a"+
		"\u0123\3\2\2\2c\u0126\3\2\2\2e\u0129\3\2\2\2g\u012e\3\2\2\2i\u0134\3\2"+
		"\2\2k\u0137\3\2\2\2m\u0142\3\2\2\2o\u0147\3\2\2\2q\u014a\3\2\2\2s\u0156"+
		"\3\2\2\2u\u015d\3\2\2\2w\u016a\3\2\2\2y\u0175\3\2\2\2{\u0180\3\2\2\2}"+
		"\u0187\3\2\2\2\177\u0198\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7u\2\2\u0084\u0085\7j\2\2\u0085\4\3\2\2\2\u0086\u0087\7/"+
		"\2\2\u0087\u0088\7e\2\2\u0088\6\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b"+
		"\7c\2\2\u008b\b\3\2\2\2\u008c\u008d\7/\2\2\u008d\u008e\7u\2\2\u008e\n"+
		"\3\2\2\2\u008f\u0090\7&\2\2\u0090\f\3\2\2\2\u0091\u0092\7~\2\2\u0092\u0093"+
		"\7~\2\2\u0093\16\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096\20"+
		"\3\2\2\2\u0097\u0098\7(\2\2\u0098\22\3\2\2\2\u0099\u009a\7=\2\2\u009a"+
		"\24\3\2\2\2\u009b\u009c\7=\2\2\u009c\u009d\7=\2\2\u009d\26\3\2\2\2\u009e"+
		"\u009f\7=\2\2\u009f\u00a0\7(\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2"+
		"\u00a3\7=\2\2\u00a3\u00a4\7(\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6"+
		"\34\3\2\2\2\u00a7\u00a8\7~\2\2\u00a8\u00a9\7(\2\2\u00a9\36\3\2\2\2\u00aa"+
		"\u00ab\7*\2\2\u00ab \3\2\2\2\u00ac\u00ad\7+\2\2\u00ad\"\3\2\2\2\u00ae"+
		"\u00af\7]\2\2\u00af$\3\2\2\2\u00b0\u00b1\7_\2\2\u00b1&\3\2\2\2\u00b2\u00b3"+
		"\7}\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7\177\2\2\u00b5*\3\2\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7"+
		"?\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be\62"+
		"\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6"+
		"8\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7)\2\2\u00ca<"+
		"\3\2\2\2\u00cb\u00cc\7^\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7p\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7h\2\2\u00d9D\3\2\2\2\u00da\u00db"+
		"\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7k\2\2\u00e1H\3\2\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"J\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"L\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00edN\3\2\2\2\u00ee\u00ef"+
		"\7w\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7y\2\2\u00f5\u00f6\7j\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7g\2\2\u00f9R\3\2\2\2\u00fa"+
		"\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fcT\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe"+
		"\u00ff\7q\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7g\2\2\u0101V\3\2\2\2\u0102"+
		"\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2"+
		"\u0106X\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7u\2\2\u0109\u010a\7c\2"+
		"\2\u010a\u010b\7e\2\2\u010bZ\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7"+
		"q\2\2\u010e\u010f\7r\2\2\u010f\u0110\7t\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7e\2\2\u0112\\\3\2\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7n\2\2\u0116\u0117\7g\2\2\u0117\u0118\7e\2\2\u0118\u0119\7v\2\2\u0119"+
		"^\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c\7w\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u011e\7e\2\2\u011e\u011f\7v\2\2\u011f\u0120\7k\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0122\7p\2\2\u0122`\3\2\2\2\u0123\u0124\7]\2\2\u0124\u0125\7]\2"+
		"\2\u0125b\3\2\2\2\u0126\u0127\7_\2\2\u0127\u0128\7_\2\2\u0128d\3\2\2\2"+
		"\u0129\u012a\7v\2\2\u012a\u012b\7t\2\2\u012b\u012c\7w\2\2\u012c\u012d"+
		"\7g\2\2\u012df\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130\7c\2\2\u0130\u0131"+
		"\7n\2\2\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133h\3\2\2\2\u0134\u0135"+
		"\7)\2\2\u0135\u0136\7)\2\2\u0136j\3\2\2\2\u0137\u0138\7g\2\2\u0138\u0139"+
		"\7e\2\2\u0139\u013a\7j\2\2\u013a\u013b\7q\2\2\u013b\u013f\3\2\2\2\u013c"+
		"\u013e\n\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140l\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143"+
		"\7t\2\2\u0143\u0144\7g\2\2\u0144\u0145\7c\2\2\u0145\u0146\7f\2\2\u0146"+
		"n\3\2\2\2\u0147\u0148\t\2\2\2\u0148p\3\2\2\2\u0149\u014b\t\3\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0154\3\2\2\2\u014e\u0150\t\4\2\2\u014f\u0151\t\3\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"r\3\2\2\2\u0156\u015a\t\5\2\2\u0157\u0159\t\6\2\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bt\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\t\5\2\2\u015e\u0160\t\6\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\t\4\2\2\u0165"+
		"\u0167\t\7\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169v\3\2\2\2\u016a\u0170\7)\2\2\u016b\u016c"+
		"\7^\2\2\u016c\u016f\7$\2\2\u016d\u016f\13\2\2\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7)\2\2\u0174"+
		"x\3\2\2\2\u0175\u017b\7$\2\2\u0176\u0177\7^\2\2\u0177\u017a\7$\2\2\u0178"+
		"\u017a\13\2\2\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7$\2\2\u017fz\3\2\2\2\u0180\u0184\7%\2\2\u0181"+
		"\u0183\n\b\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185|\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188"+
		"\7>\2\2\u0188\u0189\7>\2\2\u0189\u018a\7G\2\2\u018a\u018b\7Q\2\2\u018b"+
		"\u018c\7H\2\2\u018c\u0190\3\2\2\2\u018d\u018f\13\2\2\2\u018e\u018d\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7G\2\2\u0194\u0195\7Q\2"+
		"\2\u0195\u0196\7H\2\2\u0196~\3\2\2\2\u0197\u0199\t\t\2\2\u0198\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\b@\2\2\u019d\u0080\3\2\2\2\21\2\u013f\u014c"+
		"\u0152\u0154\u015a\u0161\u0168\u016e\u0170\u0179\u017b\u0184\u0190\u019a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}