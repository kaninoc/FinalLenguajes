// Generated from C:/Users/moise/Desktop/X/Lenguajes/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\b2b.g4 by ANTLR 4.9.1
package com.example.traductorfinal.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class b2bParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OPMK=7, OR=8, AND=9, AMP=10, 
		SEMIC=11, DOUBLE_SEMIC=12, SEMIAMP=13, DOUBLE_SEMIAMP=14, PIPE=15, PIPEAMP=16, 
		L_BR=17, R_BR=18, L_SQUAREBR=19, R_SQUAREBR=20, L_CURLYBR=21, R_CURLYBR=22, 
		LT=23, GT=24, EQ=25, NE=26, GOET=27, LOET=28, NOT=29, MULT=30, DIV=31, 
		MOD=32, MAS=33, MENOS=34, DOUBLE_QUOTE=35, SINGLE_QUOTE=36, BACKSLASH=37, 
		PR_if=38, PR_then=39, PR_elif=40, PR_else=41, PR_fi=42, PR_time=43, PR_for=44, 
		PR_in=45, PR_until=46, PR_while=47, PR_do=48, PR_done=49, PR_case=50, 
		PR_esac=51, PR_coproc=52, PR_select=53, PR_function=54, PR_Lsquarebracket=55, 
		PR_Rsquarebracket=56, PR_true=57, PR_false=58, PR_null=59, PR_echo=60, 
		PR_bash=61, PR_read=62, PR_sleep=63, PR_cat=64, PR_touch=65, PR_file_ls=66, 
		PR_remove=67, PR_mkdir=68, PR_cd=69, END_OF_LINE=70, NUMERO=71, ID=72, 
		DIR=73, PATH_FILE=74, FILENAME=75, SQ_WORD=76, DQ_WORD=77, COMMENT=78, 
		COMMENT_MUL=79, WS=80;
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_gramar_excecution = 2, RULE_bash = 3, 
		RULE_echo = 4, RULE_read = 5, RULE_sleep = 6, RULE_cat = 7, RULE_cd = 8, 
		RULE_comments = 9, RULE_comment_lines = 10, RULE_variables_expressions = 11, 
		RULE_var = 12, RULE_value = 13, RULE_nill = 14, RULE_arithmetic_logic = 15, 
		RULE_boolean_val = 16, RULE_logical_operators = 17, RULE_arit_expr = 18, 
		RULE_execution_control = 19, RULE_b_if = 20, RULE_if1 = 21, RULE_if2 = 22, 
		RULE_if3 = 23, RULE_if3a = 24, RULE_if3b = 25, RULE_if4 = 26, RULE_b_while = 27, 
		RULE_while1 = 28, RULE_while2 = 29, RULE_b_for = 30, RULE_for1 = 31, RULE_for2 = 32, 
		RULE_for3 = 33, RULE_for4 = 34, RULE_files = 35, RULE_touch = 36, RULE_file_size = 37, 
		RULE_copy_rename = 38, RULE_remove = 39, RULE_directories = 40, RULE_mkdir = 41, 
		RULE_paths = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "gramar_excecution", "bash", "echo", "read", "sleep", 
			"cat", "cd", "comments", "comment_lines", "variables_expressions", "var", 
			"value", "nill", "arithmetic_logic", "boolean_val", "logical_operators", 
			"arit_expr", "execution_control", "b_if", "if1", "if2", "if3", "if3a", 
			"if3b", "if4", "b_while", "while1", "while2", "b_for", "for1", "for2", 
			"for3", "for4", "files", "touch", "file_size", "copy_rename", "remove", 
			"directories", "mkdir", "paths"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'..'", "'.'", "'$(('", "'))'", "'cp'", "'mv'", "'-p ~'", "'||'", 
			"'&&'", "'&'", "';'", "';;'", "';&'", "';;&'", "'|'", "'|&'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'='", "'!='", "'>='", 
			"'<='", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'\"'", "'''", "'\\'", 
			"'if'", "'then'", "'elif'", "'else'", "'fi'", "'time'", "'for'", "'in'", 
			"'until'", null, "'do'", "'done'", "'case'", "'esac'", "'coproc'", "'select'", 
			"'function'", "'[['", "']]'", "'true'", "'false'", "''''", null, null, 
			"'read'", "'sleep'", "'cat'", "'touch'", "'ls -l'", "'rm'", "'mkdir'", 
			"'cd'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "OPMK", "OR", "AND", "AMP", 
			"SEMIC", "DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", 
			"L_BR", "R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", 
			"LT", "GT", "EQ", "NE", "GOET", "LOET", "NOT", "MULT", "DIV", "MOD", 
			"MAS", "MENOS", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", "PR_if", 
			"PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", "PR_in", 
			"PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", "PR_coproc", 
			"PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_bash", "PR_read", "PR_sleep", 
			"PR_cat", "PR_touch", "PR_file_ls", "PR_remove", "PR_mkdir", "PR_cd", 
			"END_OF_LINE", "NUMERO", "ID", "DIR", "PATH_FILE", "FILENAME", "SQ_WORD", 
			"DQ_WORD", "COMMENT", "COMMENT_MUL", "WS"
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
	public String getGrammarFileName() { return "b2b.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public b2bParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(b2bParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(86);
				command();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public Gramar_excecutionContext gramar_excecution() {
			return getRuleContext(Gramar_excecutionContext.class,0);
		}
		public Execution_controlContext execution_control() {
			return getRuleContext(Execution_controlContext.class,0);
		}
		public Variables_expressionsContext variables_expressions() {
			return getRuleContext(Variables_expressionsContext.class,0);
		}
		public Arithmetic_logicContext arithmetic_logic() {
			return getRuleContext(Arithmetic_logicContext.class,0);
		}
		public FilesContext files() {
			return getRuleContext(FilesContext.class,0);
		}
		public DirectoriesContext directories() {
			return getRuleContext(DirectoriesContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_echo:
			case PR_bash:
			case PR_read:
			case PR_sleep:
			case PR_cat:
			case COMMENT:
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				execution_control();
				}
				break;
			case PR_null:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				variables_expressions();
				}
				break;
			case OR:
			case AND:
			case NOT:
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				arithmetic_logic();
				}
				break;
			case T__4:
			case T__5:
			case PR_touch:
			case PR_file_ls:
			case PR_remove:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				files();
				}
				break;
			case PR_mkdir:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				directories();
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

	public static class Gramar_excecutionContext extends ParserRuleContext {
		public BashContext bash() {
			return getRuleContext(BashContext.class,0);
		}
		public EchoContext echo() {
			return getRuleContext(EchoContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public SleepContext sleep() {
			return getRuleContext(SleepContext.class,0);
		}
		public CatContext cat() {
			return getRuleContext(CatContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Comment_linesContext comment_lines() {
			return getRuleContext(Comment_linesContext.class,0);
		}
		public Gramar_excecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramar_excecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterGramar_excecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitGramar_excecution(this);
		}
	}

	public final Gramar_excecutionContext gramar_excecution() throws RecognitionException {
		Gramar_excecutionContext _localctx = new Gramar_excecutionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gramar_excecution);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_bash:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				bash();
				}
				break;
			case PR_echo:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				echo();
				}
				break;
			case PR_read:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				read();
				}
				break;
			case PR_sleep:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				sleep();
				}
				break;
			case PR_cat:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				cat();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				comment_lines();
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

	public static class BashContext extends ParserRuleContext {
		public TerminalNode PR_bash() { return getToken(b2bParser.PR_bash, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public BashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterBash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitBash(this);
		}
	}

	public final BashContext bash() throws RecognitionException {
		BashContext _localctx = new BashContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PR_bash);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(112);
				match(END_OF_LINE);
				}
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

	public static class EchoContext extends ParserRuleContext {
		public TerminalNode PR_echo() { return getToken(b2bParser.PR_echo, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public EchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterEcho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitEcho(this);
		}
	}

	public final EchoContext echo() throws RecognitionException {
		EchoContext _localctx = new EchoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PR_echo);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(116);
				match(END_OF_LINE);
				}
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode PR_read() { return getToken(b2bParser.PR_read, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PR_read);
			setState(120);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(121);
				match(END_OF_LINE);
				}
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

	public static class SleepContext extends ParserRuleContext {
		public TerminalNode PR_sleep() { return getToken(b2bParser.PR_sleep, 0); }
		public TerminalNode NUMERO() { return getToken(b2bParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public SleepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterSleep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitSleep(this);
		}
	}

	public final SleepContext sleep() throws RecognitionException {
		SleepContext _localctx = new SleepContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sleep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PR_sleep);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(126);
				match(END_OF_LINE);
				}
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

	public static class CatContext extends ParserRuleContext {
		public TerminalNode PR_cat() { return getToken(b2bParser.PR_cat, 0); }
		public PathsContext paths() {
			return getRuleContext(PathsContext.class,0);
		}
		public TerminalNode GT() { return getToken(b2bParser.GT, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public CatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCat(this);
		}
	}

	public final CatContext cat() throws RecognitionException {
		CatContext _localctx = new CatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PR_cat);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(130);
				match(GT);
				}
			}

			setState(133);
			paths();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(134);
				match(END_OF_LINE);
				}
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

	public static class CdContext extends ParserRuleContext {
		public Token opt;
		public TerminalNode PR_cd() { return getToken(b2bParser.PR_cd, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode DIV() { return getToken(b2bParser.DIV, 0); }
		public CdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCd(this);
		}
	}

	public final CdContext cd() throws RecognitionException {
		CdContext _localctx = new CdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PR_cd);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(138);
				match(ID);
				setState(139);
				match(DIV);
				}
				break;
			case T__0:
			case T__1:
				{
				setState(140);
				((CdContext)_localctx).opt = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((CdContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(b2bParser.COMMENT, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitComments(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(COMMENT);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(144);
				match(END_OF_LINE);
				}
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

	public static class Comment_linesContext extends ParserRuleContext {
		public TerminalNode COMMENT_MUL() { return getToken(b2bParser.COMMENT_MUL, 0); }
		public Comment_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterComment_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitComment_lines(this);
		}
	}

	public final Comment_linesContext comment_lines() throws RecognitionException {
		Comment_linesContext _localctx = new Comment_linesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(COMMENT_MUL);
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

	public static class Variables_expressionsContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NillContext nill() {
			return getRuleContext(NillContext.class,0);
		}
		public Variables_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterVariables_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitVariables_expressions(this);
		}
	}

	public final Variables_expressionsContext variables_expressions() throws RecognitionException {
		Variables_expressionsContext _localctx = new Variables_expressionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variables_expressions);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				var();
				}
				break;
			case PR_null:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				nill();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode EQ() { return getToken(b2bParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(EQ);
			setState(155);
			value();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(156);
				match(END_OF_LINE);
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(b2bParser.NUMERO, 0); }
		public TerminalNode SQ_WORD() { return getToken(b2bParser.SQ_WORD, 0); }
		public TerminalNode DQ_WORD() { return getToken(b2bParser.DQ_WORD, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode MAS() { return getToken(b2bParser.MAS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(NUMERO);
				}
				break;
			case SQ_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(SQ_WORD);
				}
				break;
			case DQ_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(DQ_WORD);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(ID);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__2);
				setState(164);
				match(ID);
				setState(165);
				match(MAS);
				setState(166);
				match(NUMERO);
				setState(167);
				match(T__3);
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

	public static class NillContext extends ParserRuleContext {
		public TerminalNode PR_null() { return getToken(b2bParser.PR_null, 0); }
		public NillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterNill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitNill(this);
		}
	}

	public final NillContext nill() throws RecognitionException {
		NillContext _localctx = new NillContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PR_null);
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

	public static class Arithmetic_logicContext extends ParserRuleContext {
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public Logical_operatorsContext logical_operators() {
			return getRuleContext(Logical_operatorsContext.class,0);
		}
		public Arithmetic_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterArithmetic_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitArithmetic_logic(this);
		}
	}

	public final Arithmetic_logicContext arithmetic_logic() throws RecognitionException {
		Arithmetic_logicContext _localctx = new Arithmetic_logicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmetic_logic);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				boolean_val();
				}
				break;
			case OR:
			case AND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				logical_operators();
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

	public static class Boolean_valContext extends ParserRuleContext {
		public TerminalNode PR_true() { return getToken(b2bParser.PR_true, 0); }
		public TerminalNode PR_false() { return getToken(b2bParser.PR_false, 0); }
		public Boolean_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterBoolean_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitBoolean_val(this);
		}
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==PR_true || _la==PR_false) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logical_operatorsContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(b2bParser.AND, 0); }
		public TerminalNode OR() { return getToken(b2bParser.OR, 0); }
		public TerminalNode NOT() { return getToken(b2bParser.NOT, 0); }
		public Logical_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterLogical_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitLogical_operators(this);
		}
	}

	public final Logical_operatorsContext logical_operators() throws RecognitionException {
		Logical_operatorsContext _localctx = new Logical_operatorsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arit_exprContext extends ParserRuleContext {
		public Arit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit_expr; }
	 
		public Arit_exprContext() { }
		public void copyFrom(Arit_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultDivExprContext extends Arit_exprContext {
		public Token op;
		public List<Arit_exprContext> arit_expr() {
			return getRuleContexts(Arit_exprContext.class);
		}
		public Arit_exprContext arit_expr(int i) {
			return getRuleContext(Arit_exprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(b2bParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(b2bParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(b2bParser.MOD, 0); }
		public MultDivExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitMultDivExpr(this);
		}
	}
	public static class AndExprContext extends Arit_exprContext {
		public List<Arit_exprContext> arit_expr() {
			return getRuleContexts(Arit_exprContext.class);
		}
		public Arit_exprContext arit_expr(int i) {
			return getRuleContext(Arit_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(b2bParser.AND, 0); }
		public AndExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitAndExpr(this);
		}
	}
	public static class NumExprContext extends Arit_exprContext {
		public Token op;
		public TerminalNode NUMERO() { return getToken(b2bParser.NUMERO, 0); }
		public TerminalNode SQ_WORD() { return getToken(b2bParser.SQ_WORD, 0); }
		public TerminalNode DQ_WORD() { return getToken(b2bParser.DQ_WORD, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public NumExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitNumExpr(this);
		}
	}
	public static class MenosExprContext extends Arit_exprContext {
		public TerminalNode MENOS() { return getToken(b2bParser.MENOS, 0); }
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public MenosExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterMenosExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitMenosExpr(this);
		}
	}
	public static class VarExprContext extends Arit_exprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitVarExpr(this);
		}
	}
	public static class ParentExprContext extends Arit_exprContext {
		public TerminalNode L_BR() { return getToken(b2bParser.L_BR, 0); }
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(b2bParser.R_BR, 0); }
		public ParentExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterParentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitParentExpr(this);
		}
	}
	public static class CompExprContext extends Arit_exprContext {
		public Token op;
		public List<Arit_exprContext> arit_expr() {
			return getRuleContexts(Arit_exprContext.class);
		}
		public Arit_exprContext arit_expr(int i) {
			return getRuleContext(Arit_exprContext.class,i);
		}
		public TerminalNode LT() { return getToken(b2bParser.LT, 0); }
		public TerminalNode GT() { return getToken(b2bParser.GT, 0); }
		public TerminalNode LOET() { return getToken(b2bParser.LOET, 0); }
		public TerminalNode GOET() { return getToken(b2bParser.GOET, 0); }
		public CompExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCompExpr(this);
		}
	}
	public static class BooleanExprContext extends Arit_exprContext {
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public BooleanExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitBooleanExpr(this);
		}
	}
	public static class SumResExprContext extends Arit_exprContext {
		public Token op;
		public List<Arit_exprContext> arit_expr() {
			return getRuleContexts(Arit_exprContext.class);
		}
		public Arit_exprContext arit_expr(int i) {
			return getRuleContext(Arit_exprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(b2bParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(b2bParser.MENOS, 0); }
		public SumResExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterSumResExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitSumResExpr(this);
		}
	}
	public static class OrExprContext extends Arit_exprContext {
		public List<Arit_exprContext> arit_expr() {
			return getRuleContexts(Arit_exprContext.class);
		}
		public Arit_exprContext arit_expr(int i) {
			return getRuleContext(Arit_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(b2bParser.OR, 0); }
		public OrExprContext(Arit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitOrExpr(this);
		}
	}

	public final Arit_exprContext arit_expr() throws RecognitionException {
		return arit_expr(0);
	}

	private Arit_exprContext arit_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arit_exprContext _localctx = new Arit_exprContext(_ctx, _parentState);
		Arit_exprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arit_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new MenosExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(MENOS);
				setState(182);
				arit_expr(9);
				}
				break;
			case 2:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				((NumExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (NUMERO - 71)) | (1L << (ID - 71)) | (1L << (SQ_WORD - 71)) | (1L << (DQ_WORD - 71)))) != 0)) ) {
					((NumExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				var();
				}
				break;
			case 4:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(L_BR);
				setState(186);
				arit_expr(0);
				setState(187);
				match(R_BR);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				boolean_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						arit_expr(11);
						}
						break;
					case 2:
						{
						_localctx = new SumResExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						((SumResExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						arit_expr(9);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(198);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(199);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << GOET) | (1L << LOET))) != 0)) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						arit_expr(8);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
						match(AND);
						setState(203);
						arit_expr(7);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						match(OR);
						setState(206);
						arit_expr(6);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Execution_controlContext extends ParserRuleContext {
		public B_ifContext b_if() {
			return getRuleContext(B_ifContext.class,0);
		}
		public B_whileContext b_while() {
			return getRuleContext(B_whileContext.class,0);
		}
		public B_forContext b_for() {
			return getRuleContext(B_forContext.class,0);
		}
		public Execution_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterExecution_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitExecution_control(this);
		}
	}

	public final Execution_controlContext execution_control() throws RecognitionException {
		Execution_controlContext _localctx = new Execution_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_execution_control);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				b_for();
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

	public static class B_ifContext extends ParserRuleContext {
		public If1Context if1() {
			return getRuleContext(If1Context.class,0);
		}
		public If2Context if2() {
			return getRuleContext(If2Context.class,0);
		}
		public If3Context if3() {
			return getRuleContext(If3Context.class,0);
		}
		public If4Context if4() {
			return getRuleContext(If4Context.class,0);
		}
		public B_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_if(this);
		}
	}

	public final B_ifContext b_if() throws RecognitionException {
		B_ifContext _localctx = new B_ifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_b_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			if1();
			setState(218);
			if2();
			setState(219);
			if3();
			setState(220);
			if4();
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

	public static class If1Context extends ParserRuleContext {
		public TerminalNode PR_if() { return getToken(b2bParser.PR_if, 0); }
		public TerminalNode L_SQUAREBR() { return getToken(b2bParser.L_SQUAREBR, 0); }
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode R_SQUAREBR() { return getToken(b2bParser.R_SQUAREBR, 0); }
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
		public If1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf1(this);
		}
	}

	public final If1Context if1() throws RecognitionException {
		If1Context _localctx = new If1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_if1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PR_if);
			setState(223);
			match(L_SQUAREBR);
			setState(224);
			arit_expr(0);
			setState(225);
			match(R_SQUAREBR);
			setState(226);
			match(SEMIC);
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

	public static class If2Context extends ParserRuleContext {
		public TerminalNode PR_then() { return getToken(b2bParser.PR_then, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public If2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf2(this);
		}
	}

	public final If2Context if2() throws RecognitionException {
		If2Context _localctx = new If2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_if2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PR_then);
			setState(229);
			match(END_OF_LINE);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(230);
				command();
				}
				}
				setState(235);
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

	public static class If3Context extends ParserRuleContext {
		public List<If3aContext> if3a() {
			return getRuleContexts(If3aContext.class);
		}
		public If3aContext if3a(int i) {
			return getRuleContext(If3aContext.class,i);
		}
		public List<If3bContext> if3b() {
			return getRuleContexts(If3bContext.class);
		}
		public If3bContext if3b(int i) {
			return getRuleContext(If3bContext.class,i);
		}
		public If3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf3(this);
		}
	}

	public final If3Context if3() throws RecognitionException {
		If3Context _localctx = new If3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_if3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(236);
				if3a();
				setState(237);
				if3b();
				}
				}
				setState(243);
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

	public static class If3aContext extends ParserRuleContext {
		public TerminalNode PR_elif() { return getToken(b2bParser.PR_elif, 0); }
		public TerminalNode L_SQUAREBR() { return getToken(b2bParser.L_SQUAREBR, 0); }
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode R_SQUAREBR() { return getToken(b2bParser.R_SQUAREBR, 0); }
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
		public If3aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if3a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf3a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf3a(this);
		}
	}

	public final If3aContext if3a() throws RecognitionException {
		If3aContext _localctx = new If3aContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if3a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PR_elif);
			setState(245);
			match(L_SQUAREBR);
			setState(246);
			arit_expr(0);
			setState(247);
			match(R_SQUAREBR);
			setState(248);
			match(SEMIC);
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

	public static class If3bContext extends ParserRuleContext {
		public TerminalNode PR_then() { return getToken(b2bParser.PR_then, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public If3bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if3b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf3b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf3b(this);
		}
	}

	public final If3bContext if3b() throws RecognitionException {
		If3bContext _localctx = new If3bContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if3b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PR_then);
			setState(251);
			match(END_OF_LINE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(252);
				command();
				}
				}
				setState(257);
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

	public static class If4Context extends ParserRuleContext {
		public TerminalNode PR_fi() { return getToken(b2bParser.PR_fi, 0); }
		public TerminalNode PR_else() { return getToken(b2bParser.PR_else, 0); }
		public List<TerminalNode> END_OF_LINE() { return getTokens(b2bParser.END_OF_LINE); }
		public TerminalNode END_OF_LINE(int i) {
			return getToken(b2bParser.END_OF_LINE, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public If4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterIf4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitIf4(this);
		}
	}

	public final If4Context if4() throws RecognitionException {
		If4Context _localctx = new If4Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_if4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_else) {
				{
				setState(258);
				match(PR_else);
				setState(259);
				match(END_OF_LINE);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
					{
					{
					setState(260);
					command();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(268);
			match(PR_fi);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(269);
				match(END_OF_LINE);
				}
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

	public static class B_whileContext extends ParserRuleContext {
		public While1Context while1() {
			return getRuleContext(While1Context.class,0);
		}
		public While2Context while2() {
			return getRuleContext(While2Context.class,0);
		}
		public B_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_while(this);
		}
	}

	public final B_whileContext b_while() throws RecognitionException {
		B_whileContext _localctx = new B_whileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			while1();
			setState(273);
			while2();
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

	public static class While1Context extends ParserRuleContext {
		public TerminalNode PR_while() { return getToken(b2bParser.PR_while, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public While1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterWhile1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitWhile1(this);
		}
	}

	public final While1Context while1() throws RecognitionException {
		While1Context _localctx = new While1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PR_while);
			setState(276);
			match(END_OF_LINE);
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

	public static class While2Context extends ParserRuleContext {
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public List<TerminalNode> END_OF_LINE() { return getTokens(b2bParser.END_OF_LINE); }
		public TerminalNode END_OF_LINE(int i) {
			return getToken(b2bParser.END_OF_LINE, i);
		}
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public While2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterWhile2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitWhile2(this);
		}
	}

	public final While2Context while2() throws RecognitionException {
		While2Context _localctx = new While2Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_while2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(PR_do);
			setState(279);
			match(END_OF_LINE);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(280);
				command();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(PR_done);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(287);
				match(END_OF_LINE);
				}
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

	public static class B_forContext extends ParserRuleContext {
		public For1Context for1() {
			return getRuleContext(For1Context.class,0);
		}
		public For2Context for2() {
			return getRuleContext(For2Context.class,0);
		}
		public For3Context for3() {
			return getRuleContext(For3Context.class,0);
		}
		public For4Context for4() {
			return getRuleContext(For4Context.class,0);
		}
		public B_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_for(this);
		}
	}

	public final B_forContext b_for() throws RecognitionException {
		B_forContext _localctx = new B_forContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_b_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			for1();
			setState(291);
			for2();
			setState(292);
			for3();
			setState(293);
			for4();
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

	public static class For1Context extends ParserRuleContext {
		public TerminalNode PR_for() { return getToken(b2bParser.PR_for, 0); }
		public List<TerminalNode> L_BR() { return getTokens(b2bParser.L_BR); }
		public TerminalNode L_BR(int i) {
			return getToken(b2bParser.L_BR, i);
		}
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
		public For1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFor1(this);
		}
	}

	public final For1Context for1() throws RecognitionException {
		For1Context _localctx = new For1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_for1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(PR_for);
			setState(296);
			match(L_BR);
			setState(297);
			match(L_BR);
			setState(298);
			arit_expr(0);
			setState(299);
			match(SEMIC);
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

	public static class For2Context extends ParserRuleContext {
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
		public For2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFor2(this);
		}
	}

	public final For2Context for2() throws RecognitionException {
		For2Context _localctx = new For2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_for2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			arit_expr(0);
			setState(302);
			match(SEMIC);
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

	public static class For3Context extends ParserRuleContext {
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public List<TerminalNode> R_BR() { return getTokens(b2bParser.R_BR); }
		public TerminalNode R_BR(int i) {
			return getToken(b2bParser.R_BR, i);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public For3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFor3(this);
		}
	}

	public final For3Context for3() throws RecognitionException {
		For3Context _localctx = new For3Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_for3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			arit_expr(0);
			setState(305);
			match(R_BR);
			setState(306);
			match(R_BR);
			setState(307);
			match(END_OF_LINE);
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

	public static class For4Context extends ParserRuleContext {
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public List<TerminalNode> END_OF_LINE() { return getTokens(b2bParser.END_OF_LINE); }
		public TerminalNode END_OF_LINE(int i) {
			return getToken(b2bParser.END_OF_LINE, i);
		}
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public For4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFor4(this);
		}
	}

	public final For4Context for4() throws RecognitionException {
		For4Context _localctx = new For4Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_for4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PR_do);
			setState(310);
			match(END_OF_LINE);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_bash) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(311);
				command();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(PR_done);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(318);
				match(END_OF_LINE);
				}
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

	public static class FilesContext extends ParserRuleContext {
		public TouchContext touch() {
			return getRuleContext(TouchContext.class,0);
		}
		public File_sizeContext file_size() {
			return getRuleContext(File_sizeContext.class,0);
		}
		public Copy_renameContext copy_rename() {
			return getRuleContext(Copy_renameContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public FilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_files; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFiles(this);
		}
	}

	public final FilesContext files() throws RecognitionException {
		FilesContext _localctx = new FilesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_files);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_touch:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				touch();
				}
				break;
			case PR_file_ls:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				file_size();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				copy_rename();
				}
				break;
			case PR_remove:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				remove();
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

	public static class TouchContext extends ParserRuleContext {
		public TerminalNode PR_touch() { return getToken(b2bParser.PR_touch, 0); }
		public PathsContext paths() {
			return getRuleContext(PathsContext.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public TouchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_touch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterTouch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitTouch(this);
		}
	}

	public final TouchContext touch() throws RecognitionException {
		TouchContext _localctx = new TouchContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_touch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(PR_touch);
			setState(328);
			paths();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(329);
				match(END_OF_LINE);
				}
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

	public static class File_sizeContext extends ParserRuleContext {
		public TerminalNode PR_file_ls() { return getToken(b2bParser.PR_file_ls, 0); }
		public PathsContext paths() {
			return getRuleContext(PathsContext.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public File_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterFile_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitFile_size(this);
		}
	}

	public final File_sizeContext file_size() throws RecognitionException {
		File_sizeContext _localctx = new File_sizeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PR_file_ls);
			setState(333);
			paths();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(334);
				match(END_OF_LINE);
				}
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

	public static class Copy_renameContext extends ParserRuleContext {
		public Token opt;
		public List<PathsContext> paths() {
			return getRuleContexts(PathsContext.class);
		}
		public PathsContext paths(int i) {
			return getRuleContext(PathsContext.class,i);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public Copy_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterCopy_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitCopy_rename(this);
		}
	}

	public final Copy_renameContext copy_rename() throws RecognitionException {
		Copy_renameContext _localctx = new Copy_renameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_copy_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((Copy_renameContext)_localctx).opt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
				((Copy_renameContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			paths();
			setState(339);
			paths();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(340);
				match(END_OF_LINE);
				}
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

	public static class RemoveContext extends ParserRuleContext {
		public TerminalNode PR_remove() { return getToken(b2bParser.PR_remove, 0); }
		public PathsContext paths() {
			return getRuleContext(PathsContext.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitRemove(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PR_remove);
			setState(344);
			paths();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(345);
				match(END_OF_LINE);
				}
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

	public static class DirectoriesContext extends ParserRuleContext {
		public MkdirContext mkdir() {
			return getRuleContext(MkdirContext.class,0);
		}
		public DirectoriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directories; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDirectories(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDirectories(this);
		}
	}

	public final DirectoriesContext directories() throws RecognitionException {
		DirectoriesContext _localctx = new DirectoriesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_directories);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			mkdir();
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

	public static class MkdirContext extends ParserRuleContext {
		public TerminalNode PR_mkdir() { return getToken(b2bParser.PR_mkdir, 0); }
		public TerminalNode DIR() { return getToken(b2bParser.DIR, 0); }
		public TerminalNode ID() { return getToken(b2bParser.ID, 0); }
		public TerminalNode OPMK() { return getToken(b2bParser.OPMK, 0); }
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public MkdirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mkdir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterMkdir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitMkdir(this);
		}
	}

	public final MkdirContext mkdir() throws RecognitionException {
		MkdirContext _localctx = new MkdirContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mkdir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(PR_mkdir);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPMK) {
				{
				setState(351);
				match(OPMK);
				}
			}

			setState(354);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(355);
				match(END_OF_LINE);
				}
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

	public static class PathsContext extends ParserRuleContext {
		public TerminalNode PATH_FILE() { return getToken(b2bParser.PATH_FILE, 0); }
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
		public PathsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterPaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitPaths(this);
		}
	}

	public final PathsContext paths() throws RecognitionException {
		PathsContext _localctx = new PathsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_paths);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==PATH_FILE || _la==FILENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return arit_expr_sempred((Arit_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arit_expr_sempred(Arit_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3g"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\5\5t\n\5\3\6\3\6\5\6"+
		"x\n\6\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\5\t\u0086"+
		"\n\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\5\13"+
		"\u0094\n\13\3\f\3\f\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3\16\5\16\u00a0"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ab\n\17\3\20"+
		"\3\20\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c1\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d2\n\24\f\24"+
		"\16\24\u00d5\13\24\3\25\3\25\3\25\5\25\u00da\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u00ea\n\30\f\30"+
		"\16\30\u00ed\13\30\3\31\3\31\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0100\n\33\f\33"+
		"\16\33\u0103\13\33\3\34\3\34\3\34\7\34\u0108\n\34\f\34\16\34\u010b\13"+
		"\34\5\34\u010d\n\34\3\34\3\34\5\34\u0111\n\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\7\37\u011c\n\37\f\37\16\37\u011f\13\37\3\37\3\37"+
		"\5\37\u0123\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\7$\u013b\n$\f$\16$\u013e\13$\3$\3$\5$\u0142\n$\3%\3%"+
		"\3%\3%\5%\u0148\n%\3&\3&\3&\5&\u014d\n&\3\'\3\'\3\'\5\'\u0152\n\'\3(\3"+
		"(\3(\3(\5(\u0158\n(\3)\3)\3)\5)\u015d\n)\3*\3*\3+\3+\5+\u0163\n+\3+\3"+
		"+\5+\u0167\n+\3,\3,\3,\2\3&-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\r\3\2IJ\3\2\3\4\3\2;<\4\2\n\13\37"+
		"\37\4\2IJNO\3\2 \"\3\2#$\4\2\31\32\35\36\3\2\7\b\3\2JK\3\2LM\2\u0178\2"+
		"[\3\2\2\2\4f\3\2\2\2\6o\3\2\2\2\bq\3\2\2\2\nu\3\2\2\2\fy\3\2\2\2\16~\3"+
		"\2\2\2\20\u0083\3\2\2\2\22\u008b\3\2\2\2\24\u0091\3\2\2\2\26\u0095\3\2"+
		"\2\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u00aa\3\2\2\2\36\u00ac\3\2\2"+
		"\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00c0\3\2\2\2(\u00d9"+
		"\3\2\2\2*\u00db\3\2\2\2,\u00e0\3\2\2\2.\u00e6\3\2\2\2\60\u00f3\3\2\2\2"+
		"\62\u00f6\3\2\2\2\64\u00fc\3\2\2\2\66\u010c\3\2\2\28\u0112\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0118\3\2\2\2>\u0124\3\2\2\2@\u0129\3\2\2\2B\u012f\3\2\2\2D"+
		"\u0132\3\2\2\2F\u0137\3\2\2\2H\u0147\3\2\2\2J\u0149\3\2\2\2L\u014e\3\2"+
		"\2\2N\u0153\3\2\2\2P\u0159\3\2\2\2R\u015e\3\2\2\2T\u0160\3\2\2\2V\u0168"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\7\2\2\3_\3\3\2\2\2`g\5\6\4\2ag\5(\25\2bg\5\30\r\2cg\5 \21"+
		"\2dg\5H%\2eg\5R*\2f`\3\2\2\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2f"+
		"e\3\2\2\2g\5\3\2\2\2hp\5\b\5\2ip\5\n\6\2jp\5\f\7\2kp\5\16\b\2lp\5\20\t"+
		"\2mp\5\24\13\2np\5\26\f\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3"+
		"\2\2\2om\3\2\2\2on\3\2\2\2p\7\3\2\2\2qs\7?\2\2rt\7H\2\2sr\3\2\2\2st\3"+
		"\2\2\2t\t\3\2\2\2uw\7>\2\2vx\7H\2\2wv\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yz"+
		"\7@\2\2z|\7J\2\2{}\7H\2\2|{\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~\177\7A\2\2\177"+
		"\u0081\t\2\2\2\u0080\u0082\7H\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\17\3\2\2\2\u0083\u0085\7B\2\2\u0084\u0086\7\32\2\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5V,\2\u0088"+
		"\u008a\7H\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2"+
		"\u008b\u008f\7G\2\2\u008c\u008d\7J\2\2\u008d\u0090\7!\2\2\u008e\u0090"+
		"\t\3\2\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091"+
		"\u0093\7P\2\2\u0092\u0094\7H\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\25\3\2\2\2\u0095\u0096\7Q\2\2\u0096\27\3\2\2\2\u0097\u009a\5"+
		"\32\16\2\u0098\u009a\5\36\20\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\31\3\2\2\2\u009b\u009c\7J\2\2\u009c\u009d\7\33\2\2\u009d\u009f"+
		"\5\34\17\2\u009e\u00a0\7H\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\33\3\2\2\2\u00a1\u00ab\7I\2\2\u00a2\u00ab\7N\2\2\u00a3\u00ab\7"+
		"O\2\2\u00a4\u00ab\7J\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\7J\2\2\u00a7"+
		"\u00a8\7#\2\2\u00a8\u00a9\7I\2\2\u00a9\u00ab\7\6\2\2\u00aa\u00a1\3\2\2"+
		"\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5"+
		"\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\7=\2\2\u00ad\37\3\2\2\2\u00ae\u00b1"+
		"\5\"\22\2\u00af\u00b1\5$\23\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1!\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3#\3\2\2\2\u00b4\u00b5\t\5\2\2"+
		"\u00b5%\3\2\2\2\u00b6\u00b7\b\24\1\2\u00b7\u00b8\7$\2\2\u00b8\u00c1\5"+
		"&\24\13\u00b9\u00c1\t\6\2\2\u00ba\u00c1\5\32\16\2\u00bb\u00bc\7\23\2\2"+
		"\u00bc\u00bd\5&\24\2\u00bd\u00be\7\24\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1"+
		"\5\"\22\2\u00c0\u00b6\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2"+
		"\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00d3\3\2\2\2\u00c2\u00c3"+
		"\f\f\2\2\u00c3\u00c4\t\7\2\2\u00c4\u00d2\5&\24\r\u00c5\u00c6\f\n\2\2\u00c6"+
		"\u00c7\t\b\2\2\u00c7\u00d2\5&\24\13\u00c8\u00c9\f\t\2\2\u00c9\u00ca\t"+
		"\t\2\2\u00ca\u00d2\5&\24\n\u00cb\u00cc\f\b\2\2\u00cc\u00cd\7\13\2\2\u00cd"+
		"\u00d2\5&\24\t\u00ce\u00cf\f\7\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d2\5&"+
		"\24\b\u00d1\u00c2\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1"+
		"\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da"+
		"\5*\26\2\u00d7\u00da\58\35\2\u00d8\u00da\5> \2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da)\3\2\2\2\u00db\u00dc\5,\27\2"+
		"\u00dc\u00dd\5.\30\2\u00dd\u00de\5\60\31\2\u00de\u00df\5\66\34\2\u00df"+
		"+\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3\5&\24\2"+
		"\u00e3\u00e4\7\26\2\2\u00e4\u00e5\7\r\2\2\u00e5-\3\2\2\2\u00e6\u00e7\7"+
		")\2\2\u00e7\u00eb\7H\2\2\u00e8\u00ea\5\4\3\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec/\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\5\64\33\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\61\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7"+
		"\7*\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\7\26\2\2"+
		"\u00fa\u00fb\7\r\2\2\u00fb\63\3\2\2\2\u00fc\u00fd\7)\2\2\u00fd\u0101\7"+
		"H\2\2\u00fe\u0100\5\4\3\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\65\3\2\2\2\u0103\u0101\3\2\2"+
		"\2\u0104\u0105\7+\2\2\u0105\u0109\7H\2\2\u0106\u0108\5\4\3\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7,\2\2\u010f\u0111\7H\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\67\3\2\2\2\u0112\u0113\5:\36\2\u0113"+
		"\u0114\5<\37\2\u01149\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7H\2\2"+
		"\u0117;\3\2\2\2\u0118\u0119\7\62\2\2\u0119\u011d\7H\2\2\u011a\u011c\5"+
		"\4\3\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\63"+
		"\2\2\u0121\u0123\7H\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"=\3\2\2\2\u0124\u0125\5@!\2\u0125\u0126\5B\"\2\u0126\u0127\5D#\2\u0127"+
		"\u0128\5F$\2\u0128?\3\2\2\2\u0129\u012a\7.\2\2\u012a\u012b\7\23\2\2\u012b"+
		"\u012c\7\23\2\2\u012c\u012d\5&\24\2\u012d\u012e\7\r\2\2\u012eA\3\2\2\2"+
		"\u012f\u0130\5&\24\2\u0130\u0131\7\r\2\2\u0131C\3\2\2\2\u0132\u0133\5"+
		"&\24\2\u0133\u0134\7\24\2\2\u0134\u0135\7\24\2\2\u0135\u0136\7H\2\2\u0136"+
		"E\3\2\2\2\u0137\u0138\7\62\2\2\u0138\u013c\7H\2\2\u0139\u013b\5\4\3\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\63\2\2"+
		"\u0140\u0142\7H\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142G\3\2"+
		"\2\2\u0143\u0148\5J&\2\u0144\u0148\5L\'\2\u0145\u0148\5N(\2\u0146\u0148"+
		"\5P)\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148I\3\2\2\2\u0149\u014a\7C\2\2\u014a\u014c\5V,\2\u014b"+
		"\u014d\7H\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014dK\3\2\2\2\u014e"+
		"\u014f\7D\2\2\u014f\u0151\5V,\2\u0150\u0152\7H\2\2\u0151\u0150\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152M\3\2\2\2\u0153\u0154\t\n\2\2\u0154\u0155\5"+
		"V,\2\u0155\u0157\5V,\2\u0156\u0158\7H\2\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158O\3\2\2\2\u0159\u015a\7E\2\2\u015a\u015c\5V,\2\u015b\u015d"+
		"\7H\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015dQ\3\2\2\2\u015e\u015f"+
		"\5T+\2\u015fS\3\2\2\2\u0160\u0162\7F\2\2\u0161\u0163\7\t\2\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\t\13\2\2"+
		"\u0165\u0167\7H\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167U\3\2"+
		"\2\2\u0168\u0169\t\f\2\2\u0169W\3\2\2\2&[fosw|\u0081\u0085\u0089\u008f"+
		"\u0093\u0099\u009f\u00aa\u00b0\u00c0\u00d1\u00d3\u00d9\u00eb\u00f3\u0101"+
		"\u0109\u010c\u0110\u011d\u0122\u013c\u0141\u0147\u014c\u0151\u0157\u015c"+
		"\u0162\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}