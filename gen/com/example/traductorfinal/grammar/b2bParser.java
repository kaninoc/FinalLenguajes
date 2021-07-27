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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, AMP=8, SEMIC=9, DOUBLE_SEMIC=10, 
		SEMIAMP=11, DOUBLE_SEMIAMP=12, PIPE=13, PIPEAMP=14, L_BR=15, R_BR=16, 
		L_SQUAREBR=17, R_SQUAREBR=18, L_CURLYBR=19, R_CURLYBR=20, LT=21, GT=22, 
		EQ=23, NE=24, GOET=25, LOET=26, NOT=27, DOUBLE_QUOTE=28, SINGLE_QUOTE=29, 
		BACKSLASH=30, PR_if=31, PR_then=32, PR_elif=33, PR_else=34, PR_fi=35, 
		PR_time=36, PR_for=37, PR_in=38, PR_until=39, PR_while=40, PR_do=41, PR_done=42, 
		PR_case=43, PR_esac=44, PR_coproc=45, PR_select=46, PR_function=47, PR_Lsquarebracket=48, 
		PR_Rsquarebracket=49, PR_true=50, PR_false=51, PR_null=52, PR_echo=53, 
		PR_read=54, END_OF_LINE=55, NUMERO=56, ID=57, FILENAME=58, SQ_WORD=59, 
		DQ_WORD=60, COMMENT=61, COMMENT_MUL=62, WS=63, SeMIC=64;
	public static final int
		RULE_root = 0, RULE_command = 1, RULE_gramar_excecution = 2, RULE_dash = 3, 
		RULE_dash1 = 4, RULE_dash2 = 5, RULE_dashargs = 6, RULE_echo = 7, RULE_comments = 8, 
		RULE_comment_lines = 9, RULE_read = 10, RULE_variables_expressions = 11, 
		RULE_var = 12, RULE_value = 13, RULE_nill = 14, RULE_arithmetic_logic = 15, 
		RULE_boolean_val = 16, RULE_logical_operators = 17, RULE_execution_control = 18, 
		RULE_b_if = 19, RULE_if1 = 20, RULE_if2 = 21, RULE_if3 = 22, RULE_if3a = 23, 
		RULE_if3b = 24, RULE_if4 = 25, RULE_b_while = 26, RULE_while1 = 27, RULE_while2 = 28, 
		RULE_b_for = 29, RULE_expr = 30, RULE_b_until = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "command", "gramar_excecution", "dash", "dash1", "dash2", "dashargs", 
			"echo", "comments", "comment_lines", "read", "variables_expressions", 
			"var", "value", "nill", "arithmetic_logic", "boolean_val", "logical_operators", 
			"execution_control", "b_if", "if1", "if2", "if3", "if3a", "if3b", "if4", 
			"b_while", "while1", "while2", "b_for", "expr", "b_until"
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
			"WS", "SeMIC"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_until) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << ID) | (1L << COMMENT) | (1L << COMMENT_MUL))) != 0)) {
				{
				{
				setState(64);
				command();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PR_echo:
			case PR_read:
			case COMMENT:
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				gramar_excecution();
				}
				break;
			case PR_if:
			case PR_for:
			case PR_until:
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				execution_control();
				}
				break;
			case PR_null:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
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
				setState(75);
				arithmetic_logic();
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				dash();
				}
				break;
			case PR_echo:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				echo();
				}
				break;
			case PR_read:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				read();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				comments();
				}
				break;
			case COMMENT_MUL:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
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
			setState(85);
			dash1();
			setState(86);
			dash2();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(87);
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
			setState(90);
			match(T__0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(91);
				dashargs();
				}
				}
				setState(96);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(97);
				match(FILENAME);
				}
				break;
			case 2:
				{
				setState(98);
				match(SINGLE_QUOTE);
				setState(99);
				command();
				setState(100);
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
			setState(104);
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
			setState(106);
			match(PR_echo);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(107);
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
		enterRule(_localctx, 16, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(COMMENT);
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
		enterRule(_localctx, 18, RULE_comment_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 20, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PR_read);
			setState(115);
			match(ID);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				var();
				}
				break;
			case PR_null:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(EQ);
			setState(125);
			value();
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
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(NUMERO);
				}
				break;
			case SQ_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(SQ_WORD);
				}
				break;
			case DQ_WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(DQ_WORD);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__4);
				setState(133);
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
		enterRule(_localctx, 28, RULE_nill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_true:
			case PR_false:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				boolean_val();
				}
				break;
			case OR:
			case AND:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
			setState(142);
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
			setState(144);
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
		public B_untilContext b_until() {
			return getRuleContext(B_untilContext.class,0);
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
		enterRule(_localctx, 36, RULE_execution_control);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_if:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				b_if();
				}
				break;
			case PR_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				b_while();
				}
				break;
			case PR_for:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				b_for();
				}
				break;
			case PR_until:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				b_until();
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
		enterRule(_localctx, 38, RULE_b_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			if1();
			setState(153);
			if2();
			setState(154);
			if3();
			setState(155);
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
		enterRule(_localctx, 40, RULE_if1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PR_if);
			setState(158);
			match(L_SQUAREBR);
			setState(159);
			command();
			setState(160);
			match(R_SQUAREBR);
			setState(161);
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
		enterRule(_localctx, 42, RULE_if2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PR_then);
			setState(164);
			match(END_OF_LINE);
			setState(165);
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
		enterRule(_localctx, 44, RULE_if3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_elif) {
				{
				{
				setState(167);
				if3a();
				setState(168);
				if3b();
				}
				}
				setState(174);
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
		enterRule(_localctx, 46, RULE_if3a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PR_elif);
			setState(176);
			match(L_SQUAREBR);
			setState(177);
			command();
			setState(178);
			match(R_SQUAREBR);
			setState(179);
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
		enterRule(_localctx, 48, RULE_if3b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(PR_then);
			setState(182);
			match(END_OF_LINE);
			setState(183);
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
		public List<TerminalNode> END_OF_LINE() { return getTokens(b2bParser.END_OF_LINE); }
		public TerminalNode END_OF_LINE(int i) {
			return getToken(b2bParser.END_OF_LINE, i);
		}
		public TerminalNode PR_else() { return getToken(b2bParser.PR_else, 0); }
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
		enterRule(_localctx, 50, RULE_if4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_else) {
				{
				setState(185);
				match(PR_else);
				setState(186);
				match(END_OF_LINE);
				setState(187);
				command();
				}
			}

			setState(190);
			match(PR_fi);
			setState(191);
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
		enterRule(_localctx, 52, RULE_b_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			while1();
			setState(194);
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
		enterRule(_localctx, 54, RULE_while1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(PR_while);
			setState(197);
			match(L_SQUAREBR);
			setState(198);
			command();
			setState(199);
			match(R_SQUAREBR);
			setState(200);
			match(SEMIC);
			setState(201);
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
		enterRule(_localctx, 56, RULE_while2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(PR_do);
			setState(204);
			match(END_OF_LINE);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				command();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << PR_if) | (1L << PR_for) | (1L << PR_until) | (1L << PR_while) | (1L << PR_true) | (1L << PR_false) | (1L << PR_null) | (1L << PR_echo) | (1L << PR_read) | (1L << ID) | (1L << COMMENT) | (1L << COMMENT_MUL))) != 0) );
			setState(210);
			match(PR_done);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_OF_LINE) {
				{
				setState(211);
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
		public TerminalNode PR_for() { return getToken(b2bParser.PR_for, 0); }
		public List<TerminalNode> L_BR() { return getTokens(b2bParser.L_BR); }
		public TerminalNode L_BR(int i) {
			return getToken(b2bParser.L_BR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public TerminalNode SeMIC() { return getToken(b2bParser.SeMIC, 0); }
		public List<TerminalNode> R_BR() { return getTokens(b2bParser.R_BR); }
		public TerminalNode R_BR(int i) {
			return getToken(b2bParser.R_BR, i);
		}
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
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
		enterRule(_localctx, 58, RULE_b_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PR_for);
			setState(215);
			match(L_BR);
			setState(216);
			match(L_BR);
			setState(217);
			expr();
			setState(218);
			match(SEMIC);
			setState(219);
			expr();
			setState(220);
			match(SeMIC);
			setState(221);
			expr();
			setState(222);
			match(R_BR);
			setState(223);
			match(R_BR);
			setState(224);
			match(PR_do);
			setState(225);
			command();
			setState(226);
			match(SEMIC);
			setState(227);
			match(PR_done);
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
		enterRule(_localctx, 60, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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

	public static class B_untilContext extends ParserRuleContext {
		public TerminalNode PR_until() { return getToken(b2bParser.PR_until, 0); }
		public TerminalNode L_SQUAREBR() { return getToken(b2bParser.L_SQUAREBR, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode R_SQUAREBR() { return getToken(b2bParser.R_SQUAREBR, 0); }
		public List<TerminalNode> SEMIC() { return getTokens(b2bParser.SEMIC); }
		public TerminalNode SEMIC(int i) {
			return getToken(b2bParser.SEMIC, i);
		}
		public TerminalNode PR_do() { return getToken(b2bParser.PR_do, 0); }
		public TerminalNode PR_done() { return getToken(b2bParser.PR_done, 0); }
		public B_untilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).enterB_until(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof b2bListener ) ((b2bListener)listener).exitB_until(this);
		}
	}

	public final B_untilContext b_until() throws RecognitionException {
		B_untilContext _localctx = new B_untilContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_b_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PR_until);
			setState(232);
			match(L_SQUAREBR);
			setState(233);
			command();
			setState(234);
			match(R_SQUAREBR);
			setState(235);
			match(SEMIC);
			setState(236);
			match(PR_do);
			setState(237);
			command();
			setState(238);
			match(SEMIC);
			setState(239);
			match(PR_done);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\7\6_\n\6\f\6\16\6"+
		"b\13\6\3\7\3\7\3\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\t\3\t\5\to\n\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\5\fx\n\f\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u0082\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\20\3\20\3\21\3"+
		"\21\5\21\u008f\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0099"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u00ad\n\30\f\30\16\30\u00b0\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00bf"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\6\36\u00d1\n\36\r\36\16\36\u00d2\3\36\3\36\5\36\u00d7"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\2\4\6\3\2\64"+
		"\65\4\2\b\t\35\35\2\u00ee\2E\3\2\2\2\4N\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2"+
		"\n\\\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2\22p\3\2\2\2\24r\3\2\2"+
		"\2\26t\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3\2\2"+
		"\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u0098\3\2\2\2(\u009a"+
		"\3\2\2\2*\u009f\3\2\2\2,\u00a5\3\2\2\2.\u00ae\3\2\2\2\60\u00b1\3\2\2\2"+
		"\62\u00b7\3\2\2\2\64\u00be\3\2\2\2\66\u00c3\3\2\2\28\u00c6\3\2\2\2:\u00cd"+
		"\3\2\2\2<\u00d8\3\2\2\2>\u00e7\3\2\2\2@\u00e9\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3"+
		"\2\2\2JO\5\6\4\2KO\5&\24\2LO\5\30\r\2MO\5 \21\2NJ\3\2\2\2NK\3\2\2\2NL"+
		"\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PV\5\b\5\2QV\5\20\t\2RV\5\26\f\2SV\5\22\n"+
		"\2TV\5\24\13\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\7\3"+
		"\2\2\2WX\5\n\6\2XZ\5\f\7\2Y[\79\2\2ZY\3\2\2\2Z[\3\2\2\2[\t\3\2\2\2\\`"+
		"\7\3\2\2]_\5\16\b\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2"+
		"\2b`\3\2\2\2ci\7<\2\2de\7\37\2\2ef\5\4\3\2fg\7\37\2\2gi\3\2\2\2hc\3\2"+
		"\2\2hd\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jk\t\2\2\2k\17\3\2\2\2ln\7\67\2\2m"+
		"o\79\2\2nm\3\2\2\2no\3\2\2\2o\21\3\2\2\2pq\7?\2\2q\23\3\2\2\2rs\7@\2\2"+
		"s\25\3\2\2\2tu\78\2\2uw\7;\2\2vx\79\2\2wv\3\2\2\2wx\3\2\2\2x\27\3\2\2"+
		"\2y|\5\32\16\2z|\5\36\20\2{y\3\2\2\2{z\3\2\2\2|\31\3\2\2\2}~\7;\2\2~\177"+
		"\7\31\2\2\177\u0081\5\34\17\2\u0080\u0082\79\2\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\33\3\2\2\2\u0083\u0089\7:\2\2\u0084\u0089\7=\2\2"+
		"\u0085\u0089\7>\2\2\u0086\u0087\7\7\2\2\u0087\u0089\7;\2\2\u0088\u0083"+
		"\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\35\3\2\2\2\u008a\u008b\7\66\2\2\u008b\37\3\2\2\2\u008c\u008f\5\"\22\2"+
		"\u008d\u008f\5$\23\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f!\3"+
		"\2\2\2\u0090\u0091\t\3\2\2\u0091#\3\2\2\2\u0092\u0093\t\4\2\2\u0093%\3"+
		"\2\2\2\u0094\u0099\5(\25\2\u0095\u0099\5\66\34\2\u0096\u0099\5<\37\2\u0097"+
		"\u0099\5@!\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0098\u0097\3\2\2\2\u0099\'\3\2\2\2\u009a\u009b\5*\26\2\u009b\u009c"+
		"\5,\27\2\u009c\u009d\5.\30\2\u009d\u009e\5\64\33\2\u009e)\3\2\2\2\u009f"+
		"\u00a0\7!\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3\7\24"+
		"\2\2\u00a3\u00a4\7\13\2\2\u00a4+\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7"+
		"\79\2\2\u00a7\u00a8\5\4\3\2\u00a8-\3\2\2\2\u00a9\u00aa\5\60\31\2\u00aa"+
		"\u00ab\5\62\32\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af/\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\5\4\3\2\u00b4"+
		"\u00b5\7\24\2\2\u00b5\u00b6\7\13\2\2\u00b6\61\3\2\2\2\u00b7\u00b8\7\""+
		"\2\2\u00b8\u00b9\79\2\2\u00b9\u00ba\5\4\3\2\u00ba\63\3\2\2\2\u00bb\u00bc"+
		"\7$\2\2\u00bc\u00bd\79\2\2\u00bd\u00bf\5\4\3\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\u00c2\79\2"+
		"\2\u00c2\65\3\2\2\2\u00c3\u00c4\58\35\2\u00c4\u00c5\5:\36\2\u00c5\67\3"+
		"\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\5\4\3\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\79\2\2\u00cc9\3\2\2\2"+
		"\u00cd\u00ce\7+\2\2\u00ce\u00d0\79\2\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\7,\2\2\u00d5\u00d7\79\2\2\u00d6\u00d5\3\2\2"+
		"\2\u00d6\u00d7\3\2\2\2\u00d7;\3\2\2\2\u00d8\u00d9\7\'\2\2\u00d9\u00da"+
		"\7\21\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\5> \2\u00dc\u00dd\7\13\2\2"+
		"\u00dd\u00de\5> \2\u00de\u00df\7B\2\2\u00df\u00e0\5> \2\u00e0\u00e1\7"+
		"\22\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\7+\2\2\u00e3\u00e4\5\4\3\2\u00e4"+
		"\u00e5\7\13\2\2\u00e5\u00e6\7,\2\2\u00e6=\3\2\2\2\u00e7\u00e8\5\4\3\2"+
		"\u00e8?\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\u00eb\7\23\2\2\u00eb\u00ec\5"+
		"\4\3\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\7+\2\2\u00ef"+
		"\u00f0\5\4\3\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\7,\2\2\u00f2A\3\2\2\2"+
		"\23ENUZ`hnw{\u0081\u0088\u008e\u0098\u00ae\u00be\u00d2\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}