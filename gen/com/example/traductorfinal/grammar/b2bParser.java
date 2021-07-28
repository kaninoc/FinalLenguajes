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
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_gramar_excecution = 2, RULE_dash = 3, 
		RULE_dash1 = 4, RULE_dashargs = 5, RULE_dash2 = 6, RULE_echo = 7, RULE_read = 8, 
		RULE_sleep = 9, RULE_cat = 10, RULE_comments = 11, RULE_comment_lines = 12, 
		RULE_variables_expressions = 13, RULE_var = 14, RULE_value = 15, RULE_nill = 16, 
		RULE_arithmetic_logic = 17, RULE_boolean_val = 18, RULE_logical_operators = 19, 
		RULE_arit_expr = 20, RULE_execution_control = 21, RULE_b_if = 22, RULE_if1 = 23, 
		RULE_if2 = 24, RULE_if3 = 25, RULE_if3a = 26, RULE_if3b = 27, RULE_if4 = 28, 
		RULE_b_while = 29, RULE_while1 = 30, RULE_while2 = 31, RULE_b_for = 32, 
		RULE_for1 = 33, RULE_for2 = 34, RULE_for3 = 35, RULE_for4 = 36, RULE_files = 37, 
		RULE_touch = 38, RULE_file_size = 39, RULE_copy_rename = 40, RULE_remove = 41, 
		RULE_directories = 42, RULE_mkdir = 43, RULE_paths = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "gramar_excecution", "dash", "dash1", "dashargs", 
			"dash2", "echo", "read", "sleep", "cat", "comments", "comment_lines", 
			"variables_expressions", "var", "value", "nill", "arithmetic_logic", 
			"boolean_val", "logical_operators", "arit_expr", "execution_control", 
			"b_if", "if1", "if2", "if3", "if3a", "if3b", "if4", "b_while", "while1", 
			"while2", "b_for", "for1", "for2", "for3", "for4", "files", "touch", 
			"file_size", "copy_rename", "remove", "directories", "mkdir", "paths"
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(90);
				command();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PR_echo:
			case PR_read:
			case PR_sleep:
			case PR_cat:
			case COMMENT:
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				execution_control();
				}
				break;
			case PR_null:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
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
				setState(101);
				arithmetic_logic();
				}
				break;
			case T__5:
			case T__6:
			case PR_touch:
			case PR_file_ls:
			case PR_remove:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				files();
				}
				break;
			case PR_mkdir:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
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
		public DashContext dash() {
			return getRuleContext(DashContext.class,0);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				dash();
				}
				break;
			case PR_echo:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				echo();
				}
				break;
			case PR_read:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				read();
				}
				break;
			case PR_sleep:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				sleep();
				}
				break;
			case PR_cat:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				cat();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
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

	public static class DashContext extends ParserRuleContext {
		public Dash1Context dash1() {
			return getRuleContext(Dash1Context.class,0);
		}
		public Dash2Context dash2() {
			return getRuleContext(Dash2Context.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(b2bParser.END_OF_LINE, 0); }
		public DashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDash(this);
		}
	}

	public final DashContext dash() throws RecognitionException {
		DashContext _localctx = new DashContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			dash1();
			setState(116);
			dash2();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(117);
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

	public static class Dash1Context extends ParserRuleContext {
		public List<DashargsContext> dashargs() {
			return getRuleContexts(DashargsContext.class);
		}
		public DashargsContext dashargs(int i) {
			return getRuleContext(DashargsContext.class,i);
		}
		public Dash1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDash1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDash1(this);
		}
	}

	public final Dash1Context dash1() throws RecognitionException {
		Dash1Context _localctx = new Dash1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_dash1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(121);
				dashargs();
				}
				}
				setState(126);
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

	public static class DashargsContext extends ParserRuleContext {
		public Token arg;
		public DashargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dashargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDashargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDashargs(this);
		}
	}

	public final DashargsContext dashargs() throws RecognitionException {
		DashargsContext _localctx = new DashargsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dashargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((DashargsContext)_localctx).arg = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				((DashargsContext)_localctx).arg = (Token)_errHandler.recoverInline(this);
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

	public static class Dash2Context extends ParserRuleContext {
		public PathsContext paths() {
			return getRuleContext(PathsContext.class,0);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(b2bParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(b2bParser.SINGLE_QUOTE, i);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Dash2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dash2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterDash2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitDash2(this);
		}
	}

	public final Dash2Context dash2() throws RecognitionException {
		Dash2Context _localctx = new Dash2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_dash2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				paths();
				}
				break;
			case 2:
				{
				setState(130);
				match(SINGLE_QUOTE);
				setState(131);
				command();
				setState(132);
				match(SINGLE_QUOTE);
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
		enterRule(_localctx, 14, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PR_echo);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(137);
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
		enterRule(_localctx, 16, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PR_read);
			setState(141);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(142);
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
		enterRule(_localctx, 18, RULE_sleep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PR_sleep);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(146);
				match(NUMERO);
				}
				break;
			case T__4:
				{
				setState(147);
				match(T__4);
				setState(148);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(151);
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
		enterRule(_localctx, 20, RULE_cat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PR_cat);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(155);
				match(GT);
				}
			}

			setState(158);
			paths();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(159);
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
		enterRule(_localctx, 22, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(COMMENT);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(163);
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
		enterRule(_localctx, 24, RULE_comment_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 26, RULE_variables_expressions);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				var();
				}
				break;
			case PR_null:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
		enterRule(_localctx, 28, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(EQ);
			setState(174);
			value();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(175);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NUMERO);
				}
				break;
			case SQ_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(SQ_WORD);
				}
				break;
			case DQ_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(DQ_WORD);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__4);
				setState(182);
				match(ID);
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
		enterRule(_localctx, 32, RULE_nill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 34, RULE_arithmetic_logic);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				boolean_val();
				}
				break;
			case OR:
			case AND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
		enterRule(_localctx, 36, RULE_boolean_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 38, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arit_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new MenosExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				match(MENOS);
				setState(197);
				arit_expr(9);
				}
				break;
			case 2:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				((NumExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NUMERO - 70)) | (1L << (ID - 70)) | (1L << (SQ_WORD - 70)) | (1L << (DQ_WORD - 70)))) != 0)) ) {
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
				setState(199);
				var();
				}
				break;
			case 4:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(L_BR);
				setState(201);
				arit_expr(0);
				setState(202);
				match(R_BR);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				boolean_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(207);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(208);
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
						setState(209);
						arit_expr(11);
						}
						break;
					case 2:
						{
						_localctx = new SumResExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(210);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(211);
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
						setState(212);
						arit_expr(9);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(213);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(214);
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
						setState(215);
						arit_expr(8);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(216);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(217);
						match(AND);
						setState(218);
						arit_expr(7);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new Arit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arit_expr);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						match(OR);
						setState(221);
						arit_expr(6);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 42, RULE_execution_control);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
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
		enterRule(_localctx, 44, RULE_b_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			if1();
			setState(233);
			if2();
			setState(234);
			if3();
			setState(235);
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
		enterRule(_localctx, 46, RULE_if1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PR_if);
			setState(238);
			match(L_SQUAREBR);
			setState(239);
			arit_expr(0);
			setState(240);
			match(R_SQUAREBR);
			setState(241);
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
		enterRule(_localctx, 48, RULE_if2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(PR_then);
			setState(244);
			match(END_OF_LINE);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(245);
				command();
				}
				}
				setState(250);
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
		enterRule(_localctx, 50, RULE_if3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(251);
				if3a();
				setState(252);
				if3b();
				}
				}
				setState(258);
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
		enterRule(_localctx, 52, RULE_if3a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PR_elif);
			setState(260);
			match(L_SQUAREBR);
			setState(261);
			arit_expr(0);
			setState(262);
			match(R_SQUAREBR);
			setState(263);
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
		enterRule(_localctx, 54, RULE_if3b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(PR_then);
			setState(266);
			match(END_OF_LINE);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(267);
				command();
				}
				}
				setState(272);
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
		enterRule(_localctx, 56, RULE_if4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_else) {
				{
				setState(273);
				match(PR_else);
				setState(274);
				match(END_OF_LINE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
					{
					{
					setState(275);
					command();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
			match(PR_fi);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(284);
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
		enterRule(_localctx, 58, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			while1();
			setState(288);
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
		public TerminalNode L_SQUAREBR() { return getToken(b2bParser.L_SQUAREBR, 0); }
		public Arit_exprContext arit_expr() {
			return getRuleContext(Arit_exprContext.class,0);
		}
		public TerminalNode R_SQUAREBR() { return getToken(b2bParser.R_SQUAREBR, 0); }
		public TerminalNode SEMIC() { return getToken(b2bParser.SEMIC, 0); }
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
		enterRule(_localctx, 60, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PR_while);
			setState(291);
			match(L_SQUAREBR);
			setState(292);
			arit_expr(0);
			setState(293);
			match(R_SQUAREBR);
			setState(294);
			match(SEMIC);
			setState(295);
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
		enterRule(_localctx, 62, RULE_while2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(PR_do);
			setState(298);
			match(END_OF_LINE);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(299);
				command();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(PR_done);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(306);
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
		enterRule(_localctx, 64, RULE_b_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			for1();
			setState(310);
			for2();
			setState(311);
			for3();
			setState(312);
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
		enterRule(_localctx, 66, RULE_for1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(PR_for);
			setState(315);
			match(L_BR);
			setState(316);
			match(L_BR);
			setState(317);
			arit_expr(0);
			setState(318);
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
		enterRule(_localctx, 68, RULE_for2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			arit_expr(0);
			setState(321);
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
		enterRule(_localctx, 70, RULE_for3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			arit_expr(0);
			setState(324);
			match(R_BR);
			setState(325);
			match(R_BR);
			setState(326);
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
		enterRule(_localctx, 72, RULE_for4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(PR_do);
			setState(329);
			match(END_OF_LINE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PR_cat - 64)) | (1L << (PR_touch - 64)) | (1L << (PR_file_ls - 64)) | (1L << (PR_remove - 64)) | (1L << (PR_mkdir - 64)) | (1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(330);
				command();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(PR_done);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(337);
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
		enterRule(_localctx, 74, RULE_files);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_touch:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				touch();
				}
				break;
			case PR_file_ls:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				file_size();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				copy_rename();
				}
				break;
			case PR_remove:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
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
		enterRule(_localctx, 76, RULE_touch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(PR_touch);
			setState(347);
			paths();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(348);
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
		enterRule(_localctx, 78, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(PR_file_ls);
			setState(352);
			paths();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(353);
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
		enterRule(_localctx, 80, RULE_copy_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((Copy_renameContext)_localctx).opt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
				((Copy_renameContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(357);
			paths();
			setState(358);
			paths();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(359);
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
		enterRule(_localctx, 82, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(PR_remove);
			setState(363);
			paths();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(364);
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
		enterRule(_localctx, 84, RULE_directories);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 86, RULE_mkdir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(PR_mkdir);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPMK) {
				{
				setState(370);
				match(OPMK);
				}
			}

			setState(373);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(374);
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
		enterRule(_localctx, 88, RULE_paths);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\5\3\5\3\5\5\5y"+
		"\n\5\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0089\n\b\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3"+
		"\13\3\13\3\13\5\13\u0098\n\13\3\13\5\13\u009b\n\13\3\f\3\f\5\f\u009f\n"+
		"\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\17\3\17\5\17"+
		"\u00ad\n\17\3\20\3\20\3\20\3\20\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00ba\n\21\3\22\3\22\3\23\3\23\5\23\u00c0\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d0\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\27\3\27\3\27\5\27\u00e9"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u00f9\n\32\f\32\16\32\u00fc\13\32\3\33\3\33\3\33\7\33\u0101"+
		"\n\33\f\33\16\33\u0104\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\7\35\u010f\n\35\f\35\16\35\u0112\13\35\3\36\3\36\3\36\7\36\u0117\n"+
		"\36\f\36\16\36\u011a\13\36\5\36\u011c\n\36\3\36\3\36\5\36\u0120\n\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\7!\u012f\n!\f!\16!\u0132\13"+
		"!\3!\3!\5!\u0136\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\7&\u014e\n&\f&\16&\u0151\13&\3&\3&\5&\u0155\n&\3"+
		"\'\3\'\3\'\3\'\5\'\u015b\n\'\3(\3(\3(\5(\u0160\n(\3)\3)\3)\5)\u0165\n"+
		")\3*\3*\3*\3*\5*\u016b\n*\3+\3+\3+\5+\u0170\n+\3,\3,\3-\3-\5-\u0176\n"+
		"-\3-\3-\5-\u017a\n-\3.\3.\3.\2\3*/\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\f\3\2\4\6\3\2<=\4\2\13\f"+
		"  \4\2HIMN\3\2!#\3\2$%\4\2\32\33\36\37\3\2\b\t\3\2IJ\3\2KL\2\u018b\2_"+
		"\3\2\2\2\4j\3\2\2\2\6s\3\2\2\2\bu\3\2\2\2\nz\3\2\2\2\f\u0081\3\2\2\2\16"+
		"\u0088\3\2\2\2\20\u008a\3\2\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2\26\u009c"+
		"\3\2\2\2\30\u00a4\3\2\2\2\32\u00a8\3\2\2\2\34\u00ac\3\2\2\2\36\u00ae\3"+
		"\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2(\u00c3"+
		"\3\2\2\2*\u00cf\3\2\2\2,\u00e8\3\2\2\2.\u00ea\3\2\2\2\60\u00ef\3\2\2\2"+
		"\62\u00f5\3\2\2\2\64\u0102\3\2\2\2\66\u0105\3\2\2\28\u010b\3\2\2\2:\u011b"+
		"\3\2\2\2<\u0121\3\2\2\2>\u0124\3\2\2\2@\u012b\3\2\2\2B\u0137\3\2\2\2D"+
		"\u013c\3\2\2\2F\u0142\3\2\2\2H\u0145\3\2\2\2J\u014a\3\2\2\2L\u015a\3\2"+
		"\2\2N\u015c\3\2\2\2P\u0161\3\2\2\2R\u0166\3\2\2\2T\u016c\3\2\2\2V\u0171"+
		"\3\2\2\2X\u0173\3\2\2\2Z\u017b\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\2\2\3c\3\3\2\2\2dk\5\6\4"+
		"\2ek\5,\27\2fk\5\34\17\2gk\5$\23\2hk\5L\'\2ik\5V,\2jd\3\2\2\2je\3\2\2"+
		"\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\5\3\2\2\2lt\5\b\5\2mt\5\20"+
		"\t\2nt\5\22\n\2ot\5\24\13\2pt\5\26\f\2qt\5\30\r\2rt\5\32\16\2sl\3\2\2"+
		"\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\7\3\2"+
		"\2\2uv\5\n\6\2vx\5\16\b\2wy\7G\2\2xw\3\2\2\2xy\3\2\2\2y\t\3\2\2\2z~\7"+
		"\3\2\2{}\5\f\7\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\13"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\2\2\2\u0082\r\3\2\2\2\u0083\u0089"+
		"\5Z.\2\u0084\u0085\7\'\2\2\u0085\u0086\5\4\3\2\u0086\u0087\7\'\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\17\3\2\2\2\u008a\u008c\7?\2\2\u008b\u008d\7G\2\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\7@\2\2\u008f"+
		"\u0091\7I\2\2\u0090\u0092\7G\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2"+
		"\2\u0092\23\3\2\2\2\u0093\u0097\7A\2\2\u0094\u0098\7H\2\2\u0095\u0096"+
		"\7\7\2\2\u0096\u0098\7I\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u009b\7G\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\25\3\2\2\2\u009c\u009e\7B\2\2\u009d\u009f\7\33\2\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\5Z.\2\u00a1"+
		"\u00a3\7G\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\27\3\2\2\2"+
		"\u00a4\u00a6\7O\2\2\u00a5\u00a7\7G\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7P\2\2\u00a9\33\3\2\2\2\u00aa\u00ad"+
		"\5\36\20\2\u00ab\u00ad\5\"\22\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\35\3\2\2\2\u00ae\u00af\7I\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b2"+
		"\5 \21\2\u00b1\u00b3\7G\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\37\3\2\2\2\u00b4\u00ba\7H\2\2\u00b5\u00ba\7M\2\2\u00b6\u00ba\7N\2\2\u00b7"+
		"\u00b8\7\7\2\2\u00b8\u00ba\7I\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2"+
		"\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc"+
		"\7>\2\2\u00bc#\3\2\2\2\u00bd\u00c0\5&\24\2\u00be\u00c0\5(\25\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0%\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2"+
		"\'\3\2\2\2\u00c3\u00c4\t\4\2\2\u00c4)\3\2\2\2\u00c5\u00c6\b\26\1\2\u00c6"+
		"\u00c7\7%\2\2\u00c7\u00d0\5*\26\13\u00c8\u00d0\t\5\2\2\u00c9\u00d0\5\36"+
		"\20\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd\7\25\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00d0\5&\24\2\u00cf\u00c5\3\2\2\2\u00cf\u00c8\3\2"+
		"\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00e2\3\2\2\2\u00d1\u00d2\f\f\2\2\u00d2\u00d3\t\6\2\2\u00d3\u00e1\5*"+
		"\26\r\u00d4\u00d5\f\n\2\2\u00d5\u00d6\t\7\2\2\u00d6\u00e1\5*\26\13\u00d7"+
		"\u00d8\f\t\2\2\u00d8\u00d9\t\b\2\2\u00d9\u00e1\5*\26\n\u00da\u00db\f\b"+
		"\2\2\u00db\u00dc\7\f\2\2\u00dc\u00e1\5*\26\t\u00dd\u00de\f\7\2\2\u00de"+
		"\u00df\7\13\2\2\u00df\u00e1\5*\26\b\u00e0\u00d1\3\2\2\2\u00e0\u00d4\3"+
		"\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3+\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e9\5.\30\2\u00e6\u00e9\5<\37\2\u00e7\u00e9"+
		"\5B\"\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"-\3\2\2\2\u00ea\u00eb\5\60\31\2\u00eb\u00ec\5\62\32\2\u00ec\u00ed\5\64"+
		"\33\2\u00ed\u00ee\5:\36\2\u00ee/\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1"+
		"\7\26\2\2\u00f1\u00f2\5*\26\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\7\16\2"+
		"\2\u00f4\61\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6\u00fa\7G\2\2\u00f7\u00f9"+
		"\5\4\3\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\63\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\66\34"+
		"\2\u00fe\u00ff\58\35\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\65\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0107\7\26\2\2\u0107\u0108\5*"+
		"\26\2\u0108\u0109\7\27\2\2\u0109\u010a\7\16\2\2\u010a\67\3\2\2\2\u010b"+
		"\u010c\7*\2\2\u010c\u0110\7G\2\2\u010d\u010f\5\4\3\2\u010e\u010d\3\2\2"+
		"\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u01119"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7,\2\2\u0114\u0118\7G\2\2\u0115"+
		"\u0117\5\4\3\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0113\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\7-"+
		"\2\2\u011e\u0120\7G\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		";\3\2\2\2\u0121\u0122\5> \2\u0122\u0123\5@!\2\u0123=\3\2\2\2\u0124\u0125"+
		"\7\62\2\2\u0125\u0126\7\26\2\2\u0126\u0127\5*\26\2\u0127\u0128\7\27\2"+
		"\2\u0128\u0129\7\16\2\2\u0129\u012a\7G\2\2\u012a?\3\2\2\2\u012b\u012c"+
		"\7\63\2\2\u012c\u0130\7G\2\2\u012d\u012f\5\4\3\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7\64\2\2\u0134\u0136\7G\2\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136A\3\2\2\2\u0137\u0138\5D#\2\u0138"+
		"\u0139\5F$\2\u0139\u013a\5H%\2\u013a\u013b\5J&\2\u013bC\3\2\2\2\u013c"+
		"\u013d\7/\2\2\u013d\u013e\7\24\2\2\u013e\u013f\7\24\2\2\u013f\u0140\5"+
		"*\26\2\u0140\u0141\7\16\2\2\u0141E\3\2\2\2\u0142\u0143\5*\26\2\u0143\u0144"+
		"\7\16\2\2\u0144G\3\2\2\2\u0145\u0146\5*\26\2\u0146\u0147\7\25\2\2\u0147"+
		"\u0148\7\25\2\2\u0148\u0149\7G\2\2\u0149I\3\2\2\2\u014a\u014b\7\63\2\2"+
		"\u014b\u014f\7G\2\2\u014c\u014e\5\4\3\2\u014d\u014c\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\7\64\2\2\u0153\u0155\7G\2\2\u0154\u0153\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155K\3\2\2\2\u0156\u015b\5N(\2\u0157\u015b"+
		"\5P)\2\u0158\u015b\5R*\2\u0159\u015b\5T+\2\u015a\u0156\3\2\2\2\u015a\u0157"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015bM\3\2\2\2\u015c"+
		"\u015d\7C\2\2\u015d\u015f\5Z.\2\u015e\u0160\7G\2\2\u015f\u015e\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160O\3\2\2\2\u0161\u0162\7D\2\2\u0162\u0164\5Z"+
		".\2\u0163\u0165\7G\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165Q"+
		"\3\2\2\2\u0166\u0167\t\t\2\2\u0167\u0168\5Z.\2\u0168\u016a\5Z.\2\u0169"+
		"\u016b\7G\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016bS\3\2\2\2\u016c"+
		"\u016d\7E\2\2\u016d\u016f\5Z.\2\u016e\u0170\7G\2\2\u016f\u016e\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170U\3\2\2\2\u0171\u0172\5X-\2\u0172W\3\2\2\2\u0173"+
		"\u0175\7F\2\2\u0174\u0176\7\n\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0179\t\n\2\2\u0178\u017a\7G\2\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017aY\3\2\2\2\u017b\u017c\t\13\2\2"+
		"\u017c[\3\2\2\2(_jsx~\u0088\u008c\u0091\u0097\u009a\u009e\u00a2\u00a6"+
		"\u00ac\u00b2\u00b9\u00bf\u00cf\u00e0\u00e2\u00e8\u00fa\u0102\u0110\u0118"+
		"\u011b\u011f\u0130\u0135\u014f\u0154\u015a\u015f\u0164\u016a\u016f\u0175"+
		"\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}