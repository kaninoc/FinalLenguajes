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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OR=8, AND=9, AMP=10, 
		SEMIC=11, DOUBLE_SEMIC=12, SEMIAMP=13, DOUBLE_SEMIAMP=14, PIPE=15, PIPEAMP=16, 
		L_BR=17, R_BR=18, L_SQUAREBR=19, R_SQUAREBR=20, L_CURLYBR=21, R_CURLYBR=22, 
		LT=23, GT=24, EQ=25, NE=26, GOET=27, LOET=28, NOT=29, DOUBLE_QUOTE=30, 
		SINGLE_QUOTE=31, BACKSLASH=32, PR_if=33, PR_then=34, PR_elif=35, PR_else=36, 
		PR_fi=37, PR_time=38, PR_for=39, PR_in=40, PR_until=41, PR_while=42, PR_do=43, 
		PR_done=44, PR_case=45, PR_esac=46, PR_coproc=47, PR_select=48, PR_function=49, 
		PR_Lsquarebracket=50, PR_Rsquarebracket=51, PR_true=52, PR_false=53, PR_null=54, 
		PR_echo=55, PR_read=56, PR_sleep=57, PR_cat=58, PR_touch=59, PR_file_ls=60, 
		PR_remove=61, END_OF_LINE=62, NUMERO=63, ID=64, FILENAME=65, SQ_WORD=66, 
		DQ_WORD=67, COMMENT=68, COMMENT_MUL=69, WS=70;
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_gramar_excecution = 2, RULE_dash = 3, 
		RULE_dash1 = 4, RULE_dash2 = 5, RULE_dashargs = 6, RULE_echo = 7, RULE_read = 8, 
		RULE_sleep = 9, RULE_cat = 10, RULE_comments = 11, RULE_comment_lines = 12, 
		RULE_variables_expressions = 13, RULE_var = 14, RULE_value = 15, RULE_nill = 16, 
		RULE_arithmetic_logic = 17, RULE_boolean_val = 18, RULE_logical_operators = 19, 
		RULE_execution_control = 20, RULE_b_if = 21, RULE_if1 = 22, RULE_if2 = 23, 
		RULE_if3 = 24, RULE_if3a = 25, RULE_if3b = 26, RULE_if4 = 27, RULE_b_while = 28, 
		RULE_while1 = 29, RULE_while2 = 30, RULE_b_for = 31, RULE_for1 = 32, RULE_for2 = 33, 
		RULE_for3 = 34, RULE_for4 = 35, RULE_expr = 36, RULE_files = 37, RULE_touch = 38, 
		RULE_file_size = 39, RULE_copy_rename = 40, RULE_remove = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "gramar_excecution", "dash", "dash1", "dash2", "dashargs", 
			"echo", "read", "sleep", "cat", "comments", "comment_lines", "variables_expressions", 
			"var", "value", "nill", "arithmetic_logic", "boolean_val", "logical_operators", 
			"execution_control", "b_if", "if1", "if2", "if3", "if3a", "if3b", "if4", 
			"b_while", "while1", "while2", "b_for", "for1", "for2", "for3", "for4", 
			"expr", "files", "touch", "file_size", "copy_rename", "remove"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bash'", "'-c'", "'-a'", "'-s'", "'$'", "'cp'", "'mv'", "'||'", 
			"'&&'", "'&'", "';'", "';;'", "';&'", "';;&'", "'|'", "'|&'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'='", "'!='", "'>='", 
			"'<='", "'!'", "'\"'", "'''", "'\\'", "'if'", "'then'", "'elif'", "'else'", 
			"'fi'", "'time'", "'for'", "'in'", "'until'", "'while'", "'do'", "'done'", 
			"'case'", "'esac'", "'coproc'", "'select'", "'function'", "'[['", "']]'", 
			"'true'", "'false'", "''''", null, "'read'", "'sleep'", "'cat'", "'touch'", 
			"'ls -l'", "'rm'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OR", "AND", "AMP", "SEMIC", 
			"DOUBLE_SEMIC", "SEMIAMP", "DOUBLE_SEMIAMP", "PIPE", "PIPEAMP", "L_BR", 
			"R_BR", "L_SQUAREBR", "R_SQUAREBR", "L_CURLYBR", "R_CURLYBR", "LT", "GT", 
			"EQ", "NE", "GOET", "LOET", "NOT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "BACKSLASH", 
			"PR_if", "PR_then", "PR_elif", "PR_else", "PR_fi", "PR_time", "PR_for", 
			"PR_in", "PR_until", "PR_while", "PR_do", "PR_done", "PR_case", "PR_esac", 
			"PR_coproc", "PR_select", "PR_function", "PR_Lsquarebracket", "PR_Rsquarebracket", 
			"PR_true", "PR_false", "PR_null", "PR_echo", "PR_read", "PR_sleep", "PR_cat", 
			"PR_touch", "PR_file_ls", "PR_remove", "END_OF_LINE", "NUMERO", "ID", 
			"FILENAME", "SQ_WORD", "DQ_WORD", "COMMENT", "COMMENT_MUL", "WS"
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep) | (1L << PR_cat) | (1L << PR_touch) | (1L << PR_file_ls) | (1L << PR_remove))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(84);
				command();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(97);
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
				setState(92);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				execution_control();
				}
				break;
			case PR_null:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
				setState(95);
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
				setState(96);
				files();
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				dash();
				}
				break;
			case PR_echo:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				echo();
				}
				break;
			case PR_read:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				read();
				}
				break;
			case PR_sleep:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				sleep();
				}
				break;
			case PR_cat:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				cat();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
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
			setState(108);
			dash1();
			setState(109);
			dash2();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(110);
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
			setState(113);
			match(T__0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(114);
				dashargs();
				}
				}
				setState(119);
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

	public static class Dash2Context extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
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
		enterRule(_localctx, 10, RULE_dash2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(120);
				match(FILENAME);
				}
				break;
			case 2:
				{
				setState(121);
				match(SINGLE_QUOTE);
				setState(122);
				command();
				setState(123);
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
		enterRule(_localctx, 12, RULE_dashargs);
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
			setState(129);
			match(PR_echo);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(130);
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
			setState(133);
			match(PR_read);
			setState(134);
			match(ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(135);
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
			setState(138);
			match(PR_sleep);
			setState(139);
			match(NUMERO);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(140);
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
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
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
			setState(143);
			match(PR_cat);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT) {
				{
				setState(144);
				match(GT);
				}
			}

			setState(147);
			match(FILENAME);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(148);
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
			setState(151);
			match(COMMENT);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(152);
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
			setState(155);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				var();
				}
				break;
			case PR_null:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(EQ);
			setState(163);
			value();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(164);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(NUMERO);
				}
				break;
			case SQ_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(SQ_WORD);
				}
				break;
			case DQ_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(DQ_WORD);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__4);
				setState(171);
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
			setState(174);
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				boolean_val();
				}
				break;
			case OR:
			case AND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
			setState(180);
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
			setState(182);
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
		enterRule(_localctx, 40, RULE_execution_control);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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
		enterRule(_localctx, 42, RULE_b_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			if1();
			setState(190);
			if2();
			setState(191);
			if3();
			setState(192);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 44, RULE_if1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PR_if);
			setState(195);
			match(L_SQUAREBR);
			setState(196);
			command();
			setState(197);
			match(R_SQUAREBR);
			setState(198);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 46, RULE_if2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PR_then);
			setState(201);
			match(END_OF_LINE);
			setState(202);
			command();
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
		enterRule(_localctx, 48, RULE_if3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(204);
				if3a();
				setState(205);
				if3b();
				}
				}
				setState(211);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 50, RULE_if3a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PR_elif);
			setState(213);
			match(L_SQUAREBR);
			setState(214);
			command();
			setState(215);
			match(R_SQUAREBR);
			setState(216);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 52, RULE_if3b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PR_then);
			setState(219);
			match(END_OF_LINE);
			setState(220);
			command();
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 54, RULE_if4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_else) {
				{
				setState(222);
				match(PR_else);
				setState(223);
				match(END_OF_LINE);
				setState(224);
				command();
				}
			}

			setState(227);
			match(PR_fi);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(228);
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
		enterRule(_localctx, 56, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			while1();
			setState(232);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
		enterRule(_localctx, 58, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PR_while);
			setState(235);
			match(L_SQUAREBR);
			setState(236);
			command();
			setState(237);
			match(R_SQUAREBR);
			setState(238);
			match(SEMIC);
			setState(239);
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
		enterRule(_localctx, 60, RULE_while2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PR_do);
			setState(242);
			match(END_OF_LINE);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				command();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep) | (1L << PR_cat) | (1L << PR_touch) | (1L << PR_file_ls) | (1L << PR_remove))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0) );
			setState(248);
			match(PR_done);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(249);
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
		enterRule(_localctx, 62, RULE_b_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			for1();
			setState(253);
			for2();
			setState(254);
			for3();
			setState(255);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 64, RULE_for1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(PR_for);
			setState(258);
			match(L_BR);
			setState(259);
			match(L_BR);
			setState(260);
			expr();
			setState(261);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 66, RULE_for2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expr();
			setState(264);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 68, RULE_for3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr();
			setState(267);
			match(R_BR);
			setState(268);
			match(R_BR);
			setState(269);
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
		enterRule(_localctx, 70, RULE_for4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(PR_do);
			setState(272);
			match(END_OF_LINE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << PR_sleep) | (1L << PR_cat) | (1L << PR_touch) | (1L << PR_file_ls) | (1L << PR_remove))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ID - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMENT_MUL - 64)))) != 0)) {
				{
				{
				setState(273);
				command();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(PR_done);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(280);
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

	public static class ExprContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case OR:
			case AND:
			case NOT:
			case PR_if:
			case PR_for:
			case PR_while:
			case PR_true:
			case PR_false:
			case PR_null:
			case PR_echo:
			case PR_read:
			case PR_sleep:
			case PR_cat:
			case PR_touch:
			case PR_file_ls:
			case PR_remove:
			case ID:
			case COMMENT:
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				command();
				}
				break;
			case SEMIC:
			case R_BR:
				enterOuterAlt(_localctx, 2);
				{
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
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_touch:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				touch();
				}
				break;
			case PR_file_ls:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				file_size();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				copy_rename();
				}
				break;
			case PR_remove:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
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
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
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
			setState(293);
			match(PR_touch);
			setState(294);
			match(FILENAME);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(295);
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
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
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
			setState(298);
			match(PR_file_ls);
			setState(299);
			match(FILENAME);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(300);
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
		public List<TerminalNode> FILENAME() { return getTokens(b2bParser.FILENAME); }
		public TerminalNode FILENAME(int i) {
			return getToken(b2bParser.FILENAME, i);
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
			setState(303);
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
			setState(304);
			match(FILENAME);
			setState(305);
			match(FILENAME);
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

	public static class RemoveContext extends ParserRuleContext {
		public TerminalNode PR_remove() { return getToken(b2bParser.PR_remove, 0); }
		public TerminalNode FILENAME() { return getToken(b2bParser.FILENAME, 0); }
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
			setState(309);
			match(PR_remove);
			setState(310);
			match(FILENAME);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(311);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3d\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\7\6v\n\6"+
		"\f\6\16\6y\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\t\3\t\5\t"+
		"\u0086\n\t\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\5\13\u0090\n\13\3"+
		"\f\3\f\5\f\u0094\n\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\5\r\u009c\n\r\3\16"+
		"\3\16\3\17\3\17\5\17\u00a2\n\17\3\20\3\20\3\20\3\20\5\20\u00a8\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\3\23\3\23\5\23\u00b5"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u00be\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u00d2\n\32\f\32\16\32\u00d5\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u00e4\n\35\3\35\3\35\5\35"+
		"\u00e8\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \6 \u00f7\n \r \16 \u00f8\3 \3 \5 \u00fd\n \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\7%\u0115\n%\f%\16%\u0118"+
		"\13%\3%\3%\5%\u011c\n%\3&\3&\5&\u0120\n&\3\'\3\'\3\'\3\'\5\'\u0126\n\'"+
		"\3(\3(\3(\5(\u012b\n(\3)\3)\3)\5)\u0130\n)\3*\3*\3*\3*\5*\u0136\n*\3+"+
		"\3+\3+\5+\u013b\n+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\6\3\2\4\6\3\2\66\67\4\2\n\13\37\37"+
		"\3\2\b\t\2\u013e\2Y\3\2\2\2\4c\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2\ns\3\2\2"+
		"\2\f\177\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u0087\3\2\2\2\24"+
		"\u008c\3\2\2\2\26\u0091\3\2\2\2\30\u0099\3\2\2\2\32\u009d\3\2\2\2\34\u00a1"+
		"\3\2\2\2\36\u00a3\3\2\2\2 \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00b4\3\2\2"+
		"\2&\u00b6\3\2\2\2(\u00b8\3\2\2\2*\u00bd\3\2\2\2,\u00bf\3\2\2\2.\u00c4"+
		"\3\2\2\2\60\u00ca\3\2\2\2\62\u00d3\3\2\2\2\64\u00d6\3\2\2\2\66\u00dc\3"+
		"\2\2\28\u00e3\3\2\2\2:\u00e9\3\2\2\2<\u00ec\3\2\2\2>\u00f3\3\2\2\2@\u00fe"+
		"\3\2\2\2B\u0103\3\2\2\2D\u0109\3\2\2\2F\u010c\3\2\2\2H\u0111\3\2\2\2J"+
		"\u011f\3\2\2\2L\u0125\3\2\2\2N\u0127\3\2\2\2P\u012c\3\2\2\2R\u0131\3\2"+
		"\2\2T\u0137\3\2\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\7\2\2\3]\3\3\2\2\2^d\5\6\4\2_d\5*\26\2`d\5\34"+
		"\17\2ad\5$\23\2bd\5L\'\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2"+
		"\2\2d\5\3\2\2\2em\5\b\5\2fm\5\20\t\2gm\5\22\n\2hm\5\24\13\2im\5\26\f\2"+
		"jm\5\30\r\2km\5\32\16\2le\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2"+
		"\2\2lj\3\2\2\2lk\3\2\2\2m\7\3\2\2\2no\5\n\6\2oq\5\f\7\2pr\7@\2\2qp\3\2"+
		"\2\2qr\3\2\2\2r\t\3\2\2\2sw\7\3\2\2tv\5\16\b\2ut\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2\2\2z\u0080\7C\2\2{|\7!\2\2|}\5\4\3"+
		"\2}~\7!\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\r\3\2\2\2\u0081\u0082\t\2\2\2\u0082\17\3\2\2\2\u0083\u0085\79\2"+
		"\2\u0084\u0086\7@\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21"+
		"\3\2\2\2\u0087\u0088\7:\2\2\u0088\u008a\7B\2\2\u0089\u008b\7@\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7;\2\2"+
		"\u008d\u008f\7A\2\2\u008e\u0090\7@\2\2\u008f\u008e\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\25\3\2\2\2\u0091\u0093\7<\2\2\u0092\u0094\7\32\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7C"+
		"\2\2\u0096\u0098\7@\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\27\3\2\2\2\u0099\u009b\7F\2\2\u009a\u009c\7@\2\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009e\7G\2\2\u009e\33\3\2"+
		"\2\2\u009f\u00a2\5\36\20\2\u00a0\u00a2\5\"\22\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\u00a5\7\33\2"+
		"\2\u00a5\u00a7\5 \21\2\u00a6\u00a8\7@\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00af\7A\2\2\u00aa\u00af\7D\2\2\u00ab"+
		"\u00af\7E\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00af\7B\2\2\u00ae\u00a9\3\2\2"+
		"\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af!"+
		"\3\2\2\2\u00b0\u00b1\78\2\2\u00b1#\3\2\2\2\u00b2\u00b5\5&\24\2\u00b3\u00b5"+
		"\5(\25\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5%\3\2\2\2\u00b6"+
		"\u00b7\t\3\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9)\3\2\2\2\u00ba"+
		"\u00be\5,\27\2\u00bb\u00be\5:\36\2\u00bc\u00be\5@!\2\u00bd\u00ba\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be+\3\2\2\2\u00bf\u00c0"+
		"\5.\30\2\u00c0\u00c1\5\60\31\2\u00c1\u00c2\5\62\32\2\u00c2\u00c3\58\35"+
		"\2\u00c3-\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7"+
		"\5\4\3\2\u00c7\u00c8\7\26\2\2\u00c8\u00c9\7\r\2\2\u00c9/\3\2\2\2\u00ca"+
		"\u00cb\7$\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\5\4\3\2\u00cd\61\3\2\2\2"+
		"\u00ce\u00cf\5\64\33\2\u00cf\u00d0\5\66\34\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\63\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7\u00d8"+
		"\7\25\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\26\2\2\u00da\u00db\7\r\2\2"+
		"\u00db\65\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\7@\2\2\u00de\u00df\5"+
		"\4\3\2\u00df\67\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e4"+
		"\5\4\3\2\u00e3\u00e0\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\7\'\2\2\u00e6\u00e8\7@\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e89\3\2\2\2\u00e9\u00ea\5<\37\2\u00ea\u00eb\5> \2\u00eb;\3\2\2"+
		"\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\5\4\3\2\u00ef\u00f0"+
		"\7\26\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2\7@\2\2\u00f2=\3\2\2\2\u00f3"+
		"\u00f4\7-\2\2\u00f4\u00f6\7@\2\2\u00f5\u00f7\5\4\3\2\u00f6\u00f5\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\7.\2\2\u00fb\u00fd\7@\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd?\3\2\2\2\u00fe\u00ff\5B\"\2\u00ff\u0100\5D#\2\u0100"+
		"\u0101\5F$\2\u0101\u0102\5H%\2\u0102A\3\2\2\2\u0103\u0104\7)\2\2\u0104"+
		"\u0105\7\23\2\2\u0105\u0106\7\23\2\2\u0106\u0107\5J&\2\u0107\u0108\7\r"+
		"\2\2\u0108C\3\2\2\2\u0109\u010a\5J&\2\u010a\u010b\7\r\2\2\u010bE\3\2\2"+
		"\2\u010c\u010d\5J&\2\u010d\u010e\7\24\2\2\u010e\u010f\7\24\2\2\u010f\u0110"+
		"\7@\2\2\u0110G\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0116\7@\2\2\u0113\u0115"+
		"\5\4\3\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7."+
		"\2\2\u011a\u011c\7@\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"I\3\2\2\2\u011d\u0120\5\4\3\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u011f\u011e\3\2\2\2\u0120K\3\2\2\2\u0121\u0126\5N(\2\u0122\u0126\5P)"+
		"\2\u0123\u0126\5R*\2\u0124\u0126\5T+\2\u0125\u0121\3\2\2\2\u0125\u0122"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126M\3\2\2\2\u0127"+
		"\u0128\7=\2\2\u0128\u012a\7C\2\2\u0129\u012b\7@\2\2\u012a\u0129\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012bO\3\2\2\2\u012c\u012d\7>\2\2\u012d\u012f\7"+
		"C\2\2\u012e\u0130\7@\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"Q\3\2\2\2\u0131\u0132\t\5\2\2\u0132\u0133\7C\2\2\u0133\u0135\7C\2\2\u0134"+
		"\u0136\7@\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136S\3\2\2\2\u0137"+
		"\u0138\7?\2\2\u0138\u013a\7C\2\2\u0139\u013b\7@\2\2\u013a\u0139\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013bU\3\2\2\2 Yclqw\177\u0085\u008a\u008f\u0093"+
		"\u0097\u009b\u00a1\u00a7\u00ae\u00b4\u00bd\u00d3\u00e3\u00e7\u00f8\u00fc"+
		"\u0116\u011b\u011f\u0125\u012a\u012f\u0135\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}