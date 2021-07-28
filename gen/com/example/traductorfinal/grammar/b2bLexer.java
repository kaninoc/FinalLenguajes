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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OPMK=8, OR=9, 
		AND=10, AMP=11, SEMIC=12, DOUBLE_SEMIC=13, SEMIAMP=14, DOUBLE_SEMIAMP=15, 
		PIPE=16, PIPEAMP=17, L_BR=18, R_BR=19, L_SQUAREBR=20, R_SQUAREBR=21, L_CURLYBR=22, 
		R_CURLYBR=23, LT=24, GT=25, EQ=26, NE=27, GOET=28, LOET=29, NOT=30, MULT=31, 
		DIV=32, MOD=33, MAS=34, MENOS=35, DOUBLE_QUOTE=36, SINGLE_QUOTE=37, BACKSLASH=38, 
		PR_if=39, PR_then=40, PR_elif=41, PR_else=42, PR_fi=43, PR_time=44, PR_for=45, 
		PR_in=46, PR_until=47, PR_while=48, PR_do=49, PR_done=50, PR_case=51, 
		PR_esac=52, PR_coproc=53, PR_select=54, PR_function=55, PR_Lsquarebracket=56, 
		PR_Rsquarebracket=57, PR_true=58, PR_false=59, PR_null=60, PR_echo=61, 
		PR_read=62, PR_sleep=63, PR_cat=64, PR_touch=65, PR_file_ls=66, PR_remove=67, 
		PR_mkdir=68, END_OF_LINE=69, NUMERO=70, ID=71, DIR=72, PATH_FILE=73, FILENAME=74, 
		SQ_WORD=75, DQ_WORD=76, COMMENT=77, COMMENT_MUL=78, WS=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OPMK", "OR", 
			"AND", "AMP", "SEMIC", "DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", 
			"PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", 
			"LT", "GT", "EQ", "NE", "GOET", "LOET", "NOT", "MULT", "DIV", "MOD", 
			"MAS", "MENOS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", "PR_if", 
			"PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", "PR_in", 
			"PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", "PR_coproc", 
			"PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "PR_sleep", "PR_cat", 
			"PR_touch", "PR_file_ls", "PR_remove", "PR_mkdir", "END_OF_LINE", "NUMERO", 
			"ID", "DIR", "PATH_FILE", "FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", 
			"COMMENT_MUL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bash'", "'-c'", "'-a'", "'-s'", "'$'", "'cp'", "'mv'", "'-p ~'", 
			"'||'", "'&&'", "'&'", "';'", "';;'", "';&'", "';;&'", "'|'", "'|&'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'='", "'!='", 
			"'>='", "'<='", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'\"'", "'''", 
			"'\\'", "'if'", "'then'", "'elif'", "'else'", "'fi'", "'time'", "'for'", 
			"'in'", "'until'", "'while'", "'do'", "'done'", "'case'", "'esac'", "'coproc'", 
			"'select'", "'function'", "'[['", "']]'", "'true'", "'false'", "''''", 
			null, "'read'", "'sleep'", "'cat'", "'touch'", "'ls -l'", "'rm'", "'mkdir'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OPMK", "OR", "AND", 
			"AMP", "SEMIC", "DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", 
			"PIPEAMP", "L_BR", "R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", 
			"LT", "GT", "EQ", "NE", "GOET", "LOET", "NOT", "MULT", "DIV", "MOD", 
			"MAS", "MENOS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", "PR_if", 
			"PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", "PR_in", 
			"PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", "PR_coproc", 
			"PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "PR_sleep", "PR_cat", 
			"PR_touch", "PR_file_ls", "PR_remove", "PR_mkdir", "END_OF_LINE", "NUMERO", 
			"ID", "DIR", "PATH_FILE", "FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", 
			"COMMENT_MUL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u0216\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u0173\n>\f"+
		">\16>\u0176\13>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3G\6G\u019f"+
		"\nG\rG\16G\u01a0\3G\3G\6G\u01a5\nG\rG\16G\u01a6\5G\u01a9\nG\3H\3H\7H\u01ad"+
		"\nH\fH\16H\u01b0\13H\3I\3I\3I\7I\u01b5\nI\fI\16I\u01b8\13I\7I\u01ba\n"+
		"I\fI\16I\u01bd\13I\3I\6I\u01c0\nI\rI\16I\u01c1\3J\3J\3J\7J\u01c7\nJ\f"+
		"J\16J\u01ca\13J\6J\u01cc\nJ\rJ\16J\u01cd\3J\3J\6J\u01d2\nJ\rJ\16J\u01d3"+
		"\3K\3K\7K\u01d8\nK\fK\16K\u01db\13K\3K\3K\6K\u01df\nK\rK\16K\u01e0\3L"+
		"\3L\3L\3L\7L\u01e7\nL\fL\16L\u01ea\13L\3L\3L\3M\3M\3M\3M\7M\u01f2\nM\f"+
		"M\16M\u01f5\13M\3M\3M\3N\3N\7N\u01fb\nN\fN\16N\u01fe\13N\3O\3O\3O\3O\3"+
		"O\3O\3O\7O\u0207\nO\fO\16O\u020a\13O\3O\3O\3O\3O\3P\6P\u0211\nP\rP\16"+
		"P\u0212\3P\3P\5\u01e8\u01f3\u0208\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\3\2\n\3\2\f\f\3\2\62;\3\2\60\60\4\2C\\c"+
		"|\6\2\62;C\\aac|\5\2\62;C\\c|\4\2\f\f\17\17\5\2\13\13\17\17\"\"\2\u0229"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\3\u00a1\3\2\2\2\5\u00a6\3\2\2\2\7\u00a9\3\2\2\2\t\u00ac\3\2\2\2\13"+
		"\u00af\3\2\2\2\r\u00b1\3\2\2\2\17\u00b4\3\2\2\2\21\u00b7\3\2\2\2\23\u00bc"+
		"\3\2\2\2\25\u00bf\3\2\2\2\27\u00c2\3\2\2\2\31\u00c4\3\2\2\2\33\u00c6\3"+
		"\2\2\2\35\u00c9\3\2\2\2\37\u00cc\3\2\2\2!\u00d0\3\2\2\2#\u00d2\3\2\2\2"+
		"%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3"+
		"\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5\3\2\2"+
		"\2\67\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2?\u00f2"+
		"\3\2\2\2A\u00f4\3\2\2\2C\u00f6\3\2\2\2E\u00f8\3\2\2\2G\u00fa\3\2\2\2I"+
		"\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0105\3\2"+
		"\2\2S\u010a\3\2\2\2U\u010f\3\2\2\2W\u0114\3\2\2\2Y\u0117\3\2\2\2[\u011c"+
		"\3\2\2\2]\u0120\3\2\2\2_\u0123\3\2\2\2a\u0129\3\2\2\2c\u012f\3\2\2\2e"+
		"\u0132\3\2\2\2g\u0137\3\2\2\2i\u013c\3\2\2\2k\u0141\3\2\2\2m\u0148\3\2"+
		"\2\2o\u014f\3\2\2\2q\u0158\3\2\2\2s\u015b\3\2\2\2u\u015e\3\2\2\2w\u0163"+
		"\3\2\2\2y\u0169\3\2\2\2{\u016c\3\2\2\2}\u0177\3\2\2\2\177\u017c\3\2\2"+
		"\2\u0081\u0182\3\2\2\2\u0083\u0186\3\2\2\2\u0085\u018c\3\2\2\2\u0087\u0192"+
		"\3\2\2\2\u0089\u0195\3\2\2\2\u008b\u019b\3\2\2\2\u008d\u019e\3\2\2\2\u008f"+
		"\u01aa\3\2\2\2\u0091\u01bb\3\2\2\2\u0093\u01cb\3\2\2\2\u0095\u01d5\3\2"+
		"\2\2\u0097\u01e2\3\2\2\2\u0099\u01ed\3\2\2\2\u009b\u01f8\3\2\2\2\u009d"+
		"\u01ff\3\2\2\2\u009f\u0210\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7c\2"+
		"\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7j\2\2\u00a5\4\3\2\2\2\u00a6\u00a7\7"+
		"/\2\2\u00a7\u00a8\7e\2\2\u00a8\6\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7u\2\2\u00ae\n"+
		"\3\2\2\2\u00af\u00b0\7&\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7r\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7x\2\2\u00b6\20"+
		"\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7\"\2\2\u00ba"+
		"\u00bb\7\u0080\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be\7~"+
		"\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\7(\2\2\u00c1\26\3"+
		"\2\2\2\u00c2\u00c3\7(\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\32"+
		"\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7\u00c8\7=\2\2\u00c8\34\3\2\2\2\u00c9"+
		"\u00ca\7=\2\2\u00ca\u00cb\7(\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd"+
		"\u00ce\7=\2\2\u00ce\u00cf\7(\2\2\u00cf \3\2\2\2\u00d0\u00d1\7~\2\2\u00d1"+
		"\"\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3\u00d4\7(\2\2\u00d4$\3\2\2\2\u00d5"+
		"\u00d6\7*\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8(\3\2\2\2\u00d9\u00da"+
		"\7]\2\2\u00da*\3\2\2\2\u00db\u00dc\7_\2\2\u00dc,\3\2\2\2\u00dd\u00de\7"+
		"}\2\2\u00de.\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0\60\3\2\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\64\3\2\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8\u00e9\7?\2\2\u00e98"+
		"\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ec:\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee\u00ef\7?\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1>\3"+
		"\2\2\2\u00f2\u00f3\7,\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5B\3"+
		"\2\2\2\u00f6\u00f7\7\'\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9F\3"+
		"\2\2\2\u00fa\u00fb\7/\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7$\2\2\u00fdJ\3\2"+
		"\2\2\u00fe\u00ff\7)\2\2\u00ffL\3\2\2\2\u0100\u0101\7^\2\2\u0101N\3\2\2"+
		"\2\u0102\u0103\7k\2\2\u0103\u0104\7h\2\2\u0104P\3\2\2\2\u0105\u0106\7"+
		"v\2\2\u0106\u0107\7j\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109R"+
		"\3\2\2\2\u010a\u010b\7g\2\2\u010b\u010c\7n\2\2\u010c\u010d\7k\2\2\u010d"+
		"\u010e\7h\2\2\u010eT\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111"+
		"\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113V\3\2\2\2\u0114\u0115\7h\2\2\u0115"+
		"\u0116\7k\2\2\u0116X\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119\7k\2\2\u0119"+
		"\u011a\7o\2\2\u011a\u011b\7g\2\2\u011bZ\3\2\2\2\u011c\u011d\7h\2\2\u011d"+
		"\u011e\7q\2\2\u011e\u011f\7t\2\2\u011f\\\3\2\2\2\u0120\u0121\7k\2\2\u0121"+
		"\u0122\7p\2\2\u0122^\3\2\2\2\u0123\u0124\7w\2\2\u0124\u0125\7p\2\2\u0125"+
		"\u0126\7v\2\2\u0126\u0127\7k\2\2\u0127\u0128\7n\2\2\u0128`\3\2\2\2\u0129"+
		"\u012a\7y\2\2\u012a\u012b\7j\2\2\u012b\u012c\7k\2\2\u012c\u012d\7n\2\2"+
		"\u012d\u012e\7g\2\2\u012eb\3\2\2\2\u012f\u0130\7f\2\2\u0130\u0131\7q\2"+
		"\2\u0131d\3\2\2\2\u0132\u0133\7f\2\2\u0133\u0134\7q\2\2\u0134\u0135\7"+
		"p\2\2\u0135\u0136\7g\2\2\u0136f\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139"+
		"\7c\2\2\u0139\u013a\7u\2\2\u013a\u013b\7g\2\2\u013bh\3\2\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7u\2\2\u013e\u013f\7c\2\2\u013f\u0140\7e\2\2\u0140"+
		"j\3\2\2\2\u0141\u0142\7e\2\2\u0142\u0143\7q\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7t\2\2\u0145\u0146\7q\2\2\u0146\u0147\7e\2\2\u0147l\3\2\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014a\7g\2\2\u014a\u014b\7n\2\2\u014b\u014c\7g\2\2"+
		"\u014c\u014d\7e\2\2\u014d\u014e\7v\2\2\u014en\3\2\2\2\u014f\u0150\7h\2"+
		"\2\u0150\u0151\7w\2\2\u0151\u0152\7p\2\2\u0152\u0153\7e\2\2\u0153\u0154"+
		"\7v\2\2\u0154\u0155\7k\2\2\u0155\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157"+
		"p\3\2\2\2\u0158\u0159\7]\2\2\u0159\u015a\7]\2\2\u015ar\3\2\2\2\u015b\u015c"+
		"\7_\2\2\u015c\u015d\7_\2\2\u015dt\3\2\2\2\u015e\u015f\7v\2\2\u015f\u0160"+
		"\7t\2\2\u0160\u0161\7w\2\2\u0161\u0162\7g\2\2\u0162v\3\2\2\2\u0163\u0164"+
		"\7h\2\2\u0164\u0165\7c\2\2\u0165\u0166\7n\2\2\u0166\u0167\7u\2\2\u0167"+
		"\u0168\7g\2\2\u0168x\3\2\2\2\u0169\u016a\7)\2\2\u016a\u016b\7)\2\2\u016b"+
		"z\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e\7e\2\2\u016e\u016f\7j\2\2\u016f"+
		"\u0170\7q\2\2\u0170\u0174\3\2\2\2\u0171\u0173\n\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"|\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7t\2\2\u0178\u0179\7g\2\2\u0179"+
		"\u017a\7c\2\2\u017a\u017b\7f\2\2\u017b~\3\2\2\2\u017c\u017d\7u\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7g\2\2\u017f\u0180\7g\2\2\u0180\u0181\7r\2\2"+
		"\u0181\u0080\3\2\2\2\u0182\u0183\7e\2\2\u0183\u0184\7c\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0082\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\7q\2\2\u0188"+
		"\u0189\7w\2\2\u0189\u018a\7e\2\2\u018a\u018b\7j\2\2\u018b\u0084\3\2\2"+
		"\2\u018c\u018d\7n\2\2\u018d\u018e\7u\2\2\u018e\u018f\7\"\2\2\u018f\u0190"+
		"\7/\2\2\u0190\u0191\7n\2\2\u0191\u0086\3\2\2\2\u0192\u0193\7t\2\2\u0193"+
		"\u0194\7o\2\2\u0194\u0088\3\2\2\2\u0195\u0196\7o\2\2\u0196\u0197\7m\2"+
		"\2\u0197\u0198\7f\2\2\u0198\u0199\7k\2\2\u0199\u019a\7t\2\2\u019a\u008a"+
		"\3\2\2\2\u019b\u019c\t\2\2\2\u019c\u008c\3\2\2\2\u019d\u019f\t\3\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a8\3\2\2\2\u01a2\u01a4\t\4\2\2\u01a3\u01a5\t\3\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u008e\3\2\2\2\u01aa\u01ae\t\5\2\2\u01ab\u01ad\t\6\2\2\u01ac\u01ab\3\2"+
		"\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u0090\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b6\t"+
		"\5\2\2\u01b3\u01b5\t\6\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b9\u01b1\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\t\7"+
		"\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u0092\3\2\2\2\u01c3\u01c4\7\61\2\2\u01c4\u01c8\t"+
		"\5\2\2\u01c5\u01c7\t\6\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01c3\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\t\4\2\2\u01d0\u01d2\t\7"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u0094\3\2\2\2\u01d5\u01d9\t\5\2\2\u01d6\u01d8\t\6"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\t\4"+
		"\2\2\u01dd\u01df\t\7\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u0096\3\2\2\2\u01e2\u01e8\7)"+
		"\2\2\u01e3\u01e4\7^\2\2\u01e4\u01e7\7$\2\2\u01e5\u01e7\13\2\2\2\u01e6"+
		"\u01e3\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\7)\2\2\u01ec\u0098\3\2\2\2\u01ed\u01f3\7$\2\2\u01ee\u01ef\7^\2"+
		"\2\u01ef\u01f2\7$\2\2\u01f0\u01f2\13\2\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f0"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7$\2\2\u01f7\u009a\3\2"+
		"\2\2\u01f8\u01fc\7%\2\2\u01f9\u01fb\n\b\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u009c\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7>\2\2\u0200\u0201\7>\2\2\u0201\u0202"+
		"\7G\2\2\u0202\u0203\7Q\2\2\u0203\u0204\7H\2\2\u0204\u0208\3\2\2\2\u0205"+
		"\u0207\13\2\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0209\3"+
		"\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\7G\2\2\u020c\u020d\7Q\2\2\u020d\u020e\7H\2\2\u020e\u009e\3\2\2"+
		"\2\u020f\u0211\t\t\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\bP\2\2\u0215"+
		"\u00a0\3\2\2\2\27\2\u0174\u01a0\u01a6\u01a8\u01ae\u01b6\u01bb\u01c1\u01c8"+
		"\u01cd\u01d3\u01d9\u01e0\u01e6\u01e8\u01f1\u01f3\u01fc\u0208\u0212\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}