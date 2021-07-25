// Generated from C:/Users/Albert/Documents/lenguajes/Final/FinalLenguajes/src/main/java/com/example/traductorfinal/grammar\lenguaje.g4 by ANTLR 4.9.1
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
public class lenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FP=1, FFP=2, LEER=3, IMPRIMIR=4, SI=5, ENTONCES=6, FIN_SI=7, SI_NO=8, 
		MIENTRAS=9, HACER=10, FIN_MIENTRAS=11, PARA=12, FIN_PARA=13, SELECCIONAR=14, 
		ENTRE=15, CASO=16, ROMPER=17, DEFECTO=18, FIN_SELECCIONAR=19, ESTRUCTURA=20, 
		FIN_ESTRUCTURA=21, FUNCION=22, RETORNAR=23, FIN_FUNCION=24, BOOLEANO=25, 
		ENTERO=26, REAL=27, CARACTER=28, CADENA=29, TK_PYC=30, TK_DOSP=31, TK_ASIG=32, 
		TK_COMA=33, TK_PUNTO=34, TK_MAS=35, TK_MENOS=36, TK_MULT=37, TK_DIV=38, 
		TK_MOD=39, TK_PAR_IZQ=40, TK_PAR_DER=41, TK_Y=42, TK_O=43, TK_MENOR=44, 
		TK_MAYOR=45, TK_MENOR_IGUAL=46, TK_MAYOR_IGUAL=47, TK_IGUAL=48, TK_DIF=49, 
		TK_BOOLEANO=50, ID=51, TK_ENTERO=52, TK_REAL=53, TK_CADENA=54, TK_CARACTER=55, 
		ESP=56, COMMENT=57, COMMENTS=58;
	public static final int
		RULE_raiz = 0, RULE_f_principal = 1, RULE_contenido = 2, RULE_declaracion = 3, 
		RULE_varBooleano = 4, RULE_extvarB = 5, RULE_varEntero = 6, RULE_extvarE = 7, 
		RULE_varReal = 8, RULE_extvarR = 9, RULE_varCaracter = 10, RULE_extvarC = 11, 
		RULE_varCadena = 12, RULE_extvarS = 13, RULE_varEstructura = 14, RULE_extvarEstructura = 15, 
		RULE_varAsigEstructura = 16, RULE_varDeclarada = 17, RULE_asigfuncion = 18, 
		RULE_repeticion = 19, RULE_operacion = 20, RULE_expresion = 21, RULE_operador = 22, 
		RULE_tipovar = 23, RULE_lectura = 24, RULE_imprimir = 25, RULE_impresion = 26, 
		RULE_repeticionimpresion = 27, RULE_varimpresion = 28, RULE_condicional = 29, 
		RULE_cuerpoif = 30, RULE_sino = 31, RULE_operacionlogica = 32, RULE_operadorlogico = 33, 
		RULE_comparador = 34, RULE_ciclomientras = 35, RULE_cuerpociclomientras = 36, 
		RULE_ciclohacer = 37, RULE_cuerpociclohacer = 38, RULE_ciclopara = 39, 
		RULE_contenidopara = 40, RULE_contparaopt = 41, RULE_contparaoptfinal = 42, 
		RULE_elementospara = 43, RULE_complementopara = 44, RULE_elementosparados = 45, 
		RULE_comparadorpara = 46, RULE_segundocomparador = 47, RULE_segcomfinal = 48, 
		RULE_varcomparable = 49, RULE_credec = 50, RULE_multiple = 51, RULE_casos = 52, 
		RULE_multiplescasos = 53, RULE_defecto = 54, RULE_estructuras = 55, RULE_decfuncion = 56, 
		RULE_cierredecfuncion = 57, RULE_cuerpodecfuncion = 58, RULE_retornar = 59, 
		RULE_parametros = 60, RULE_complementoparametros = 61, RULE_masparametros = 62, 
		RULE_nextid = 63, RULE_tipofuncion = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz", "f_principal", "contenido", "declaracion", "varBooleano", "extvarB", 
			"varEntero", "extvarE", "varReal", "extvarR", "varCaracter", "extvarC", 
			"varCadena", "extvarS", "varEstructura", "extvarEstructura", "varAsigEstructura", 
			"varDeclarada", "asigfuncion", "repeticion", "operacion", "expresion", 
			"operador", "tipovar", "lectura", "imprimir", "impresion", "repeticionimpresion", 
			"varimpresion", "condicional", "cuerpoif", "sino", "operacionlogica", 
			"operadorlogico", "comparador", "ciclomientras", "cuerpociclomientras", 
			"ciclohacer", "cuerpociclohacer", "ciclopara", "contenidopara", "contparaopt", 
			"contparaoptfinal", "elementospara", "complementopara", "elementosparados", 
			"comparadorpara", "segundocomparador", "segcomfinal", "varcomparable", 
			"credec", "multiple", "casos", "multiplescasos", "defecto", "estructuras", 
			"decfuncion", "cierredecfuncion", "cuerpodecfuncion", "retornar", "parametros", 
			"complementoparametros", "masparametros", "nextid", "tipofuncion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion_principal'", "'fin_principal'", "'leer'", "'imprimir'", 
			"'si'", "'entonces'", "'fin_si'", "'si_no'", "'mientras'", "'hacer'", 
			"'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", "'entre'", 
			"'caso'", "'romper'", "'defecto'", "'fin_seleccionar'", "'estructura'", 
			"'fin_estructura'", "'funcion'", "'retornar'", "'fin_funcion'", "'booleano'", 
			"'entero'", "'real'", "'caracter'", "'cadena'", "';'", "':'", "'='", 
			"','", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'&&'", 
			"'||'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FP", "FFP", "LEER", "IMPRIMIR", "SI", "ENTONCES", "FIN_SI", "SI_NO", 
			"MIENTRAS", "HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"ENTRE", "CASO", "ROMPER", "DEFECTO", "FIN_SELECCIONAR", "ESTRUCTURA", 
			"FIN_ESTRUCTURA", "FUNCION", "RETORNAR", "FIN_FUNCION", "BOOLEANO", "ENTERO", 
			"REAL", "CARACTER", "CADENA", "TK_PYC", "TK_DOSP", "TK_ASIG", "TK_COMA", 
			"TK_PUNTO", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_Y", "TK_O", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_DIF", "TK_BOOLEANO", "ID", "TK_ENTERO", 
			"TK_REAL", "TK_CADENA", "TK_CARACTER", "ESP", "COMMENT", "COMMENTS"
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
	public String getGrammarFileName() { return "lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RaizContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(lenguajeParser.EOF, 0); }
		public F_principalContext f_principal() {
			return getRuleContext(F_principalContext.class,0);
		}
		public List<EstructurasContext> estructuras() {
			return getRuleContexts(EstructurasContext.class);
		}
		public EstructurasContext estructuras(int i) {
			return getRuleContext(EstructurasContext.class,i);
		}
		public List<DecfuncionContext> decfuncion() {
			return getRuleContexts(DecfuncionContext.class);
		}
		public DecfuncionContext decfuncion(int i) {
			return getRuleContext(DecfuncionContext.class,i);
		}
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitRaiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(130);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(131);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(137);
			f_principal();
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(138);
					estructuras();
					}
					break;
				case FUNCION:
					{
					setState(139);
					decfuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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

	public static class F_principalContext extends ParserRuleContext {
		public TerminalNode FP() { return getToken(lenguajeParser.FP, 0); }
		public TerminalNode FFP() { return getToken(lenguajeParser.FFP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public F_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterF_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitF_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitF_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_principalContext f_principal() throws RecognitionException {
		F_principalContext _localctx = new F_principalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_f_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FP);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				contenido();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(153);
			match(FFP);
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

	public static class ContenidoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CiclomientrasContext ciclomientras() {
			return getRuleContext(CiclomientrasContext.class,0);
		}
		public CiclohacerContext ciclohacer() {
			return getRuleContext(CiclohacerContext.class,0);
		}
		public CicloparaContext ciclopara() {
			return getRuleContext(CicloparaContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public AsigfuncionContext asigfuncion() {
			return getRuleContext(AsigfuncionContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterContenido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitContenido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contenido);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				lectura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				ciclomientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				ciclohacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				ciclopara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				multiple();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				asigfuncion();
				}
				break;
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

	public static class DeclaracionContext extends ParserRuleContext {
		public VarBooleanoContext varBooleano() {
			return getRuleContext(VarBooleanoContext.class,0);
		}
		public VarEnteroContext varEntero() {
			return getRuleContext(VarEnteroContext.class,0);
		}
		public VarRealContext varReal() {
			return getRuleContext(VarRealContext.class,0);
		}
		public VarCaracterContext varCaracter() {
			return getRuleContext(VarCaracterContext.class,0);
		}
		public VarCadenaContext varCadena() {
			return getRuleContext(VarCadenaContext.class,0);
		}
		public VarEstructuraContext varEstructura() {
			return getRuleContext(VarEstructuraContext.class,0);
		}
		public VarAsigEstructuraContext varAsigEstructura() {
			return getRuleContext(VarAsigEstructuraContext.class,0);
		}
		public VarDeclaradaContext varDeclarada() {
			return getRuleContext(VarDeclaradaContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				varBooleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				varEntero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				varReal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				varCaracter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				varCadena();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				varEstructura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				varAsigEstructura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				varDeclarada();
				}
				break;
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

	public static class VarBooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(lenguajeParser.BOOLEANO, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarBContext extvarB() {
			return getRuleContext(ExtvarBContext.class,0);
		}
		public VarBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBooleanoContext varBooleano() throws RecognitionException {
		VarBooleanoContext _localctx = new VarBooleanoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varBooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BOOLEANO);
			setState(177);
			match(ID);
			setState(178);
			extvarB();
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

	public static class ExtvarBContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_BOOLEANO() { return getToken(lenguajeParser.TK_BOOLEANO, 0); }
		public ExtvarBContext extvarB() {
			return getRuleContext(ExtvarBContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarBContext extvarB() throws RecognitionException {
		ExtvarBContext _localctx = new ExtvarBContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extvarB);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(TK_ASIG);
				setState(182);
				match(TK_BOOLEANO);
				setState(183);
				extvarB();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(TK_COMA);
				setState(185);
				match(ID);
				setState(186);
				extvarB();
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

	public static class VarEnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(lenguajeParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarEContext extvarE() {
			return getRuleContext(ExtvarEContext.class,0);
		}
		public VarEnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarEnteroContext varEntero() throws RecognitionException {
		VarEnteroContext _localctx = new VarEnteroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varEntero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ENTERO);
			setState(190);
			match(ID);
			setState(191);
			extvarE();
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

	public static class ExtvarEContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public ExtvarEContext extvarE() {
			return getRuleContext(ExtvarEContext.class,0);
		}
		public TerminalNode TK_MENOS() { return getToken(lenguajeParser.TK_MENOS, 0); }
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarEContext extvarE() throws RecognitionException {
		ExtvarEContext _localctx = new ExtvarEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extvarE);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(TK_ASIG);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(195);
					match(TK_MENOS);
					}
				}

				setState(198);
				match(TK_ENTERO);
				setState(199);
				extvarE();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(TK_COMA);
				setState(201);
				match(ID);
				setState(202);
				extvarE();
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

	public static class VarRealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(lenguajeParser.REAL, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarRContext extvarR() {
			return getRuleContext(ExtvarRContext.class,0);
		}
		public VarRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRealContext varReal() throws RecognitionException {
		VarRealContext _localctx = new VarRealContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(REAL);
			setState(206);
			match(ID);
			setState(207);
			extvarR();
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

	public static class ExtvarRContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_REAL() { return getToken(lenguajeParser.TK_REAL, 0); }
		public ExtvarRContext extvarR() {
			return getRuleContext(ExtvarRContext.class,0);
		}
		public TerminalNode TK_MENOS() { return getToken(lenguajeParser.TK_MENOS, 0); }
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarRContext extvarR() throws RecognitionException {
		ExtvarRContext _localctx = new ExtvarRContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extvarR);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(TK_ASIG);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_MENOS) {
					{
					setState(211);
					match(TK_MENOS);
					}
				}

				setState(214);
				match(TK_REAL);
				setState(215);
				extvarR();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(TK_COMA);
				setState(217);
				match(ID);
				setState(218);
				extvarR();
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

	public static class VarCaracterContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(lenguajeParser.CARACTER, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarCContext extvarC() {
			return getRuleContext(ExtvarCContext.class,0);
		}
		public VarCaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCaracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarCaracter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarCaracter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarCaracterContext varCaracter() throws RecognitionException {
		VarCaracterContext _localctx = new VarCaracterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varCaracter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CARACTER);
			setState(222);
			match(ID);
			setState(223);
			extvarC();
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

	public static class ExtvarCContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_CARACTER() { return getToken(lenguajeParser.TK_CARACTER, 0); }
		public ExtvarCContext extvarC() {
			return getRuleContext(ExtvarCContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarCContext extvarC() throws RecognitionException {
		ExtvarCContext _localctx = new ExtvarCContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extvarC);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(TK_ASIG);
				setState(227);
				match(TK_CARACTER);
				setState(228);
				extvarC();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(TK_COMA);
				setState(230);
				match(ID);
				setState(231);
				extvarC();
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

	public static class VarCadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(lenguajeParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarSContext extvarS() {
			return getRuleContext(ExtvarSContext.class,0);
		}
		public VarCadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarCadenaContext varCadena() throws RecognitionException {
		VarCadenaContext _localctx = new VarCadenaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varCadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CADENA);
			setState(235);
			match(ID);
			setState(236);
			extvarS();
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

	public static class ExtvarSContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_CADENA() { return getToken(lenguajeParser.TK_CADENA, 0); }
		public ExtvarSContext extvarS() {
			return getRuleContext(ExtvarSContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarSContext extvarS() throws RecognitionException {
		ExtvarSContext _localctx = new ExtvarSContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_extvarS);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(TK_PYC);
				}
				break;
			case TK_ASIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(TK_ASIG);
				setState(240);
				match(TK_CADENA);
				setState(241);
				extvarS();
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(TK_COMA);
				setState(243);
				match(ID);
				setState(244);
				extvarS();
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

	public static class VarEstructuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lenguajeParser.ID, i);
		}
		public ExtvarEstructuraContext extvarEstructura() {
			return getRuleContext(ExtvarEstructuraContext.class,0);
		}
		public VarEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarEstructuraContext varEstructura() throws RecognitionException {
		VarEstructuraContext _localctx = new VarEstructuraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(ID);
			setState(249);
			extvarEstructura();
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

	public static class ExtvarEstructuraContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public ExtvarEstructuraContext extvarEstructura() {
			return getRuleContext(ExtvarEstructuraContext.class,0);
		}
		public ExtvarEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extvarEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExtvarEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExtvarEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExtvarEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtvarEstructuraContext extvarEstructura() throws RecognitionException {
		ExtvarEstructuraContext _localctx = new ExtvarEstructuraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extvarEstructura);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(TK_PYC);
				}
				break;
			case TK_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(TK_COMA);
				setState(253);
				match(ID);
				setState(254);
				extvarEstructura();
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

	public static class VarAsigEstructuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lenguajeParser.ID, i);
		}
		public List<TerminalNode> TK_PUNTO() { return getTokens(lenguajeParser.TK_PUNTO); }
		public TerminalNode TK_PUNTO(int i) {
			return getToken(lenguajeParser.TK_PUNTO, i);
		}
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public VarAsigEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAsigEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarAsigEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarAsigEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarAsigEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAsigEstructuraContext varAsigEstructura() throws RecognitionException {
		VarAsigEstructuraContext _localctx = new VarAsigEstructuraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varAsigEstructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(258);
			match(TK_PUNTO);
			setState(259);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PUNTO) {
				{
				{
				setState(260);
				match(TK_PUNTO);
				setState(261);
				match(ID);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(TK_ASIG);
			setState(268);
			varimpresion();
			setState(269);
			match(TK_PYC);
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

	public static class VarDeclaradaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public VarDeclaradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarDeclarada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarDeclarada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarDeclarada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclaradaContext varDeclarada() throws RecognitionException {
		VarDeclaradaContext _localctx = new VarDeclaradaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDeclarada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(272);
			match(TK_ASIG);
			setState(273);
			varimpresion();
			setState(274);
			match(TK_PYC);
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

	public static class AsigfuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public List<RepeticionContext> repeticion() {
			return getRuleContexts(RepeticionContext.class);
		}
		public RepeticionContext repeticion(int i) {
			return getRuleContext(RepeticionContext.class,i);
		}
		public AsigfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterAsigfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitAsigfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitAsigfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigfuncionContext asigfuncion() throws RecognitionException {
		AsigfuncionContext _localctx = new AsigfuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asigfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(TK_PAR_IZQ);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOS) | (1L << TK_PAR_IZQ) | (1L << TK_BOOLEANO) | (1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER))) != 0)) {
				{
				setState(278);
				varimpresion();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(279);
					repeticion();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287);
			match(TK_PAR_DER);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(288);
				match(TK_PYC);
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

	public static class RepeticionContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public RepeticionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterRepeticion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitRepeticion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitRepeticion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticionContext repeticion() throws RecognitionException {
		RepeticionContext _localctx = new RepeticionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeticion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TK_COMA);
			setState(292);
			varimpresion();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expresion();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(295);
				operador();
				setState(296);
				expresion();
				}
				}
				setState(302);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENOS:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				tipovar();
				}
				break;
			case TK_PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(TK_PAR_IZQ);
				setState(305);
				operacion();
				setState(306);
				match(TK_PAR_DER);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode TK_MAS() { return getToken(lenguajeParser.TK_MAS, 0); }
		public TerminalNode TK_MENOS() { return getToken(lenguajeParser.TK_MENOS, 0); }
		public TerminalNode TK_MULT() { return getToken(lenguajeParser.TK_MULT, 0); }
		public TerminalNode TK_DIV() { return getToken(lenguajeParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(lenguajeParser.TK_MOD, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
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

	public static class TipovarContext extends ParserRuleContext {
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(lenguajeParser.TK_REAL, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_MENOS() { return getToken(lenguajeParser.TK_MENOS, 0); }
		public TipovarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipovar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterTipovar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitTipovar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitTipovar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipovarContext tipovar() throws RecognitionException {
		TipovarContext _localctx = new TipovarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_MENOS) {
				{
				setState(312);
				match(TK_MENOS);
				}
			}

			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL))) != 0)) ) {
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(lenguajeParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitLectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LEER);
			setState(318);
			match(TK_PAR_IZQ);
			setState(319);
			match(ID);
			setState(320);
			match(TK_PAR_DER);
			setState(321);
			match(TK_PYC);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(lenguajeParser.IMPRIMIR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IMPRIMIR);
			setState(324);
			match(TK_PAR_IZQ);
			setState(325);
			impresion();
			setState(326);
			match(TK_PAR_DER);
			setState(327);
			match(TK_PYC);
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

	public static class ImpresionContext extends ParserRuleContext {
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public List<RepeticionimpresionContext> repeticionimpresion() {
			return getRuleContexts(RepeticionimpresionContext.class);
		}
		public RepeticionimpresionContext repeticionimpresion(int i) {
			return getRuleContext(RepeticionimpresionContext.class,i);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			varimpresion();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(330);
				repeticionimpresion();
				}
				}
				setState(335);
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

	public static class RepeticionimpresionContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public RepeticionimpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticionimpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterRepeticionimpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitRepeticionimpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitRepeticionimpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticionimpresionContext repeticionimpresion() throws RecognitionException {
		RepeticionimpresionContext _localctx = new RepeticionimpresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repeticionimpresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(TK_COMA);
			setState(337);
			varimpresion();
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

	public static class VarimpresionContext extends ParserRuleContext {
		public TerminalNode TK_BOOLEANO() { return getToken(lenguajeParser.TK_BOOLEANO, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(lenguajeParser.TK_REAL, 0); }
		public TerminalNode TK_CARACTER() { return getToken(lenguajeParser.TK_CARACTER, 0); }
		public TerminalNode TK_CADENA() { return getToken(lenguajeParser.TK_CADENA, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public AsigfuncionContext asigfuncion() {
			return getRuleContext(AsigfuncionContext.class,0);
		}
		public VarimpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varimpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarimpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarimpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarimpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarimpresionContext varimpresion() throws RecognitionException {
		VarimpresionContext _localctx = new VarimpresionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varimpresion);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(TK_BOOLEANO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(TK_ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(TK_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(TK_CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				operacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				asigfuncion();
				}
				break;
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(lenguajeParser.SI, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public CuerpoifContext cuerpoif() {
			return getRuleContext(CuerpoifContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(SI);
			setState(350);
			operacionlogica();
			setState(351);
			cuerpoif();
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

	public static class CuerpoifContext extends ParserRuleContext {
		public TerminalNode ENTONCES() { return getToken(lenguajeParser.ENTONCES, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpoifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCuerpoif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCuerpoif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCuerpoif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoifContext cuerpoif() throws RecognitionException {
		CuerpoifContext _localctx = new CuerpoifContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cuerpoif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ENTONCES);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				contenido();
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(359);
			sino();
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode FIN_SI() { return getToken(lenguajeParser.FIN_SI, 0); }
		public TerminalNode SI_NO() { return getToken(lenguajeParser.SI_NO, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(361);
				match(SI_NO);
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(362);
					contenido();
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
				}
			}

			setState(369);
			match(FIN_SI);
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

	public static class OperacionlogicaContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public List<VarimpresionContext> varimpresion() {
			return getRuleContexts(VarimpresionContext.class);
		}
		public VarimpresionContext varimpresion(int i) {
			return getRuleContext(VarimpresionContext.class,i);
		}
		public List<ComparadorContext> comparador() {
			return getRuleContexts(ComparadorContext.class);
		}
		public ComparadorContext comparador(int i) {
			return getRuleContext(ComparadorContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public OperadorlogicoContext operadorlogico() {
			return getRuleContext(OperadorlogicoContext.class,0);
		}
		public OperacionlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionlogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterOperacionlogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitOperacionlogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitOperacionlogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionlogicaContext operacionlogica() throws RecognitionException {
		OperacionlogicaContext _localctx = new OperacionlogicaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operacionlogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(TK_PAR_IZQ);
			setState(372);
			varimpresion();
			setState(373);
			comparador();
			setState(374);
			varimpresion();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(375);
				operadorlogico();
				setState(376);
				varimpresion();
				setState(377);
				comparador();
				setState(378);
				varimpresion();
				}
			}

			setState(382);
			match(TK_PAR_DER);
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

	public static class OperadorlogicoContext extends ParserRuleContext {
		public TerminalNode TK_Y() { return getToken(lenguajeParser.TK_Y, 0); }
		public TerminalNode TK_O() { return getToken(lenguajeParser.TK_O, 0); }
		public OperadorlogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorlogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterOperadorlogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitOperadorlogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitOperadorlogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorlogicoContext operadorlogico() throws RecognitionException {
		OperadorlogicoContext _localctx = new OperadorlogicoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==TK_Y || _la==TK_O) ) {
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

	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode TK_MENOR() { return getToken(lenguajeParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(lenguajeParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(lenguajeParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(lenguajeParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_IGUAL() { return getToken(lenguajeParser.TK_IGUAL, 0); }
		public TerminalNode TK_DIF() { return getToken(lenguajeParser.TK_DIF, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitComparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitComparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUAL) | (1L << TK_DIF))) != 0)) ) {
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

	public static class CiclomientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(lenguajeParser.MIENTRAS, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public CuerpociclomientrasContext cuerpociclomientras() {
			return getRuleContext(CuerpociclomientrasContext.class,0);
		}
		public CiclomientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclomientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCiclomientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCiclomientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCiclomientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiclomientrasContext ciclomientras() throws RecognitionException {
		CiclomientrasContext _localctx = new CiclomientrasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ciclomientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(MIENTRAS);
			setState(389);
			operacionlogica();
			setState(390);
			cuerpociclomientras();
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

	public static class CuerpociclomientrasContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(lenguajeParser.HACER, 0); }
		public TerminalNode FIN_MIENTRAS() { return getToken(lenguajeParser.FIN_MIENTRAS, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpociclomientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpociclomientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCuerpociclomientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCuerpociclomientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCuerpociclomientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpociclomientrasContext cuerpociclomientras() throws RecognitionException {
		CuerpociclomientrasContext _localctx = new CuerpociclomientrasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cuerpociclomientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(HACER);
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				contenido();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(398);
			match(FIN_MIENTRAS);
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

	public static class CiclohacerContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(lenguajeParser.HACER, 0); }
		public CuerpociclohacerContext cuerpociclohacer() {
			return getRuleContext(CuerpociclohacerContext.class,0);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CiclohacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclohacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCiclohacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCiclohacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCiclohacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiclohacerContext ciclohacer() throws RecognitionException {
		CiclohacerContext _localctx = new CiclohacerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ciclohacer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(HACER);
			setState(402); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(401);
					contenido();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(406);
			cuerpociclohacer();
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

	public static class CuerpociclohacerContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(lenguajeParser.MIENTRAS, 0); }
		public OperacionlogicaContext operacionlogica() {
			return getRuleContext(OperacionlogicaContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public CuerpociclohacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpociclohacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCuerpociclohacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCuerpociclohacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCuerpociclohacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpociclohacerContext cuerpociclohacer() throws RecognitionException {
		CuerpociclohacerContext _localctx = new CuerpociclohacerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cuerpociclohacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(MIENTRAS);
			setState(409);
			operacionlogica();
			setState(410);
			match(TK_PYC);
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

	public static class CicloparaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(lenguajeParser.PARA, 0); }
		public ElementosparaContext elementospara() {
			return getRuleContext(ElementosparaContext.class,0);
		}
		public ContenidoparaContext contenidopara() {
			return getRuleContext(ContenidoparaContext.class,0);
		}
		public CicloparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCiclopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCiclopara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCiclopara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloparaContext ciclopara() throws RecognitionException {
		CicloparaContext _localctx = new CicloparaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ciclopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(PARA);
			setState(413);
			elementospara();
			setState(414);
			contenidopara();
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

	public static class ContenidoparaContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(lenguajeParser.HACER, 0); }
		public TerminalNode FIN_PARA() { return getToken(lenguajeParser.FIN_PARA, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ContparaoptContext contparaopt() {
			return getRuleContext(ContparaoptContext.class,0);
		}
		public ContenidoparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterContenidopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitContenidopara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitContenidopara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoparaContext contenidopara() throws RecognitionException {
		ContenidoparaContext _localctx = new ContenidoparaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_contenidopara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(HACER);
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(417);
				contenido();
				}
				}
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(422);
			match(FIN_PARA);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(423);
				contparaopt();
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

	public static class ContparaoptContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(lenguajeParser.PARA, 0); }
		public ElementosparadosContext elementosparados() {
			return getRuleContext(ElementosparadosContext.class,0);
		}
		public ContparaoptfinalContext contparaoptfinal() {
			return getRuleContext(ContparaoptfinalContext.class,0);
		}
		public ContparaoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contparaopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterContparaopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitContparaopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitContparaopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContparaoptContext contparaopt() throws RecognitionException {
		ContparaoptContext _localctx = new ContparaoptContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_contparaopt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(PARA);
			setState(427);
			elementosparados();
			setState(428);
			contparaoptfinal();
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

	public static class ContparaoptfinalContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(lenguajeParser.HACER, 0); }
		public TerminalNode FIN_PARA() { return getToken(lenguajeParser.FIN_PARA, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ContparaoptfinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contparaoptfinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterContparaoptfinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitContparaoptfinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitContparaoptfinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContparaoptfinalContext contparaoptfinal() throws RecognitionException {
		ContparaoptfinalContext _localctx = new ContparaoptfinalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_contparaoptfinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(HACER);
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(431);
				contenido();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(436);
			match(FIN_PARA);
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

	public static class ElementosparaContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode ENTERO() { return getToken(lenguajeParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public ComparadorparaContext comparadorpara() {
			return getRuleContext(ComparadorparaContext.class,0);
		}
		public ComplementoparaContext complementopara() {
			return getRuleContext(ComplementoparaContext.class,0);
		}
		public ElementosparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementospara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterElementospara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitElementospara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitElementospara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementosparaContext elementospara() throws RecognitionException {
		ElementosparaContext _localctx = new ElementosparaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elementospara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(TK_PAR_IZQ);
			setState(439);
			match(ENTERO);
			setState(440);
			match(ID);
			setState(441);
			match(TK_ASIG);
			setState(442);
			match(TK_ENTERO);
			setState(443);
			match(TK_PYC);
			setState(444);
			comparadorpara();
			setState(445);
			complementopara();
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

	public static class ComplementoparaContext extends ParserRuleContext {
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public ComplementoparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementopara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterComplementopara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitComplementopara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitComplementopara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementoparaContext complementopara() throws RecognitionException {
		ComplementoparaContext _localctx = new ComplementoparaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_complementopara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(TK_PYC);
			setState(448);
			varcomparable();
			setState(449);
			match(TK_PAR_DER);
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

	public static class ElementosparadosContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(lenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public ComparadorparaContext comparadorpara() {
			return getRuleContext(ComparadorparaContext.class,0);
		}
		public ComplementoparaContext complementopara() {
			return getRuleContext(ComplementoparaContext.class,0);
		}
		public ElementosparadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementosparados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterElementosparados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitElementosparados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitElementosparados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementosparadosContext elementosparados() throws RecognitionException {
		ElementosparadosContext _localctx = new ElementosparadosContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementosparados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TK_PAR_IZQ);
			setState(452);
			match(ID);
			setState(453);
			match(TK_ASIG);
			setState(454);
			match(TK_ENTERO);
			setState(455);
			match(TK_PYC);
			setState(456);
			comparadorpara();
			setState(457);
			complementopara();
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

	public static class ComparadorparaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public CredecContext credec() {
			return getRuleContext(CredecContext.class,0);
		}
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public SegundocomparadorContext segundocomparador() {
			return getRuleContext(SegundocomparadorContext.class,0);
		}
		public ComparadorparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadorpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterComparadorpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitComparadorpara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitComparadorpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadorparaContext comparadorpara() throws RecognitionException {
		ComparadorparaContext _localctx = new ComparadorparaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comparadorpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(ID);
			setState(460);
			credec();
			setState(461);
			varcomparable();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_Y || _la==TK_O) {
				{
				setState(462);
				segundocomparador();
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

	public static class SegundocomparadorContext extends ParserRuleContext {
		public OperadorlogicoContext operadorlogico() {
			return getRuleContext(OperadorlogicoContext.class,0);
		}
		public SegcomfinalContext segcomfinal() {
			return getRuleContext(SegcomfinalContext.class,0);
		}
		public SegundocomparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segundocomparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterSegundocomparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitSegundocomparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitSegundocomparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegundocomparadorContext segundocomparador() throws RecognitionException {
		SegundocomparadorContext _localctx = new SegundocomparadorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_segundocomparador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			operadorlogico();
			setState(466);
			segcomfinal();
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

	public static class SegcomfinalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public CredecContext credec() {
			return getRuleContext(CredecContext.class,0);
		}
		public VarcomparableContext varcomparable() {
			return getRuleContext(VarcomparableContext.class,0);
		}
		public SegcomfinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segcomfinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterSegcomfinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitSegcomfinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitSegcomfinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegcomfinalContext segcomfinal() throws RecognitionException {
		SegcomfinalContext _localctx = new SegcomfinalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_segcomfinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(ID);
			setState(469);
			credec();
			setState(470);
			varcomparable();
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

	public static class VarcomparableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public VarcomparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcomparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterVarcomparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitVarcomparable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitVarcomparable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarcomparableContext varcomparable() throws RecognitionException {
		VarcomparableContext _localctx = new VarcomparableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_varcomparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TK_ENTERO) ) {
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

	public static class CredecContext extends ParserRuleContext {
		public TerminalNode TK_MENOR() { return getToken(lenguajeParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(lenguajeParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(lenguajeParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(lenguajeParser.TK_MAYOR_IGUAL, 0); }
		public CredecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCredec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCredec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCredec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CredecContext credec() throws RecognitionException {
		CredecContext _localctx = new CredecContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_credec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
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

	public static class MultipleContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(lenguajeParser.SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode ENTRE() { return getToken(lenguajeParser.ENTRE, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(lenguajeParser.FIN_SELECCIONAR, 0); }
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(SELECCIONAR);
			setState(477);
			match(TK_PAR_IZQ);
			setState(478);
			match(ID);
			setState(479);
			match(TK_PAR_DER);
			setState(480);
			match(ENTRE);
			setState(481);
			casos();
			setState(482);
			match(FIN_SELECCIONAR);
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

	public static class CasosContext extends ParserRuleContext {
		public List<MultiplescasosContext> multiplescasos() {
			return getRuleContexts(MultiplescasosContext.class);
		}
		public MultiplescasosContext multiplescasos(int i) {
			return getRuleContext(MultiplescasosContext.class,i);
		}
		public DefectoContext defecto() {
			return getRuleContext(DefectoContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_casos);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484);
					multiplescasos();
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASO );
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFECTO) {
					{
					setState(489);
					defecto();
					}
				}

				}
				break;
			case DEFECTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				defecto();
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

	public static class MultiplescasosContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(lenguajeParser.CASO, 0); }
		public TerminalNode TK_ENTERO() { return getToken(lenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_DOSP() { return getToken(lenguajeParser.TK_DOSP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public TerminalNode ROMPER() { return getToken(lenguajeParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public MultiplescasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplescasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterMultiplescasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitMultiplescasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitMultiplescasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplescasosContext multiplescasos() throws RecognitionException {
		MultiplescasosContext _localctx = new MultiplescasosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_multiplescasos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495);
			match(CASO);
			setState(496);
			match(TK_ENTERO);
			setState(497);
			match(TK_DOSP);
			setState(499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				contenido();
				}
				}
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROMPER) {
				{
				setState(503);
				match(ROMPER);
				setState(504);
				match(TK_PYC);
				}
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

	public static class DefectoContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(lenguajeParser.DEFECTO, 0); }
		public TerminalNode TK_DOSP() { return getToken(lenguajeParser.TK_DOSP, 0); }
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitDefecto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitDefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_defecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(DEFECTO);
			setState(508);
			match(TK_DOSP);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
				{
				{
				setState(509);
				contenido();
				}
				}
				setState(514);
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

	public static class EstructurasContext extends ParserRuleContext {
		public TerminalNode ESTRUCTURA() { return getToken(lenguajeParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode FIN_ESTRUCTURA() { return getToken(lenguajeParser.FIN_ESTRUCTURA, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public EstructurasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitEstructuras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitEstructuras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructurasContext estructuras() throws RecognitionException {
		EstructurasContext _localctx = new EstructurasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_estructuras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(ESTRUCTURA);
			setState(516);
			match(ID);
			setState(518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(517);
				declaracion();
				}
				}
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0) );
			setState(522);
			match(FIN_ESTRUCTURA);
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

	public static class DecfuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(lenguajeParser.FUNCION, 0); }
		public TipofuncionContext tipofuncion() {
			return getRuleContext(TipofuncionContext.class,0);
		}
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(lenguajeParser.TK_PAR_IZQ, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public CierredecfuncionContext cierredecfuncion() {
			return getRuleContext(CierredecfuncionContext.class,0);
		}
		public DecfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterDecfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitDecfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitDecfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfuncionContext decfuncion() throws RecognitionException {
		DecfuncionContext _localctx = new DecfuncionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_decfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(FUNCION);
			setState(525);
			tipofuncion();
			setState(526);
			match(ID);
			setState(527);
			match(TK_PAR_IZQ);
			setState(528);
			parametros();
			setState(529);
			cierredecfuncion();
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

	public static class CierredecfuncionContext extends ParserRuleContext {
		public TerminalNode TK_PAR_DER() { return getToken(lenguajeParser.TK_PAR_DER, 0); }
		public CuerpodecfuncionContext cuerpodecfuncion() {
			return getRuleContext(CuerpodecfuncionContext.class,0);
		}
		public CierredecfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cierredecfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCierredecfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCierredecfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCierredecfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CierredecfuncionContext cierredecfuncion() throws RecognitionException {
		CierredecfuncionContext _localctx = new CierredecfuncionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cierredecfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(TK_PAR_DER);
			setState(532);
			cuerpodecfuncion();
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

	public static class CuerpodecfuncionContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(lenguajeParser.HACER, 0); }
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpodecfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpodecfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterCuerpodecfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitCuerpodecfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitCuerpodecfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpodecfuncionContext cuerpodecfuncion() throws RecognitionException {
		CuerpodecfuncionContext _localctx = new CuerpodecfuncionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cuerpodecfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(HACER);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEER) | (1L << IMPRIMIR) | (1L << SI) | (1L << MIENTRAS) | (1L << HACER) | (1L << PARA) | (1L << SELECCIONAR) | (1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA) | (1L << ID))) != 0)) {
				{
				{
				setState(535);
				contenido();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			retornar();
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

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(lenguajeParser.RETORNAR, 0); }
		public VarimpresionContext varimpresion() {
			return getRuleContext(VarimpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(lenguajeParser.TK_PYC, 0); }
		public TerminalNode FIN_FUNCION() { return getToken(lenguajeParser.FIN_FUNCION, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(RETORNAR);
			setState(544);
			varimpresion();
			setState(545);
			match(TK_PYC);
			setState(546);
			match(FIN_FUNCION);
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

	public static class ParametrosContext extends ParserRuleContext {
		public TipofuncionContext tipofuncion() {
			return getRuleContext(TipofuncionContext.class,0);
		}
		public ComplementoparametrosContext complementoparametros() {
			return getRuleContext(ComplementoparametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			tipofuncion();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(549);
				complementoparametros();
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

	public static class ComplementoparametrosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public List<MasparametrosContext> masparametros() {
			return getRuleContexts(MasparametrosContext.class);
		}
		public MasparametrosContext masparametros(int i) {
			return getRuleContext(MasparametrosContext.class,i);
		}
		public ComplementoparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementoparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterComplementoparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitComplementoparametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitComplementoparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementoparametrosContext complementoparametros() throws RecognitionException {
		ComplementoparametrosContext _localctx = new ComplementoparametrosContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_complementoparametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(ID);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(553);
				masparametros();
				}
				}
				setState(558);
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

	public static class MasparametrosContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(lenguajeParser.TK_COMA, 0); }
		public TipofuncionContext tipofuncion() {
			return getRuleContext(TipofuncionContext.class,0);
		}
		public NextidContext nextid() {
			return getRuleContext(NextidContext.class,0);
		}
		public MasparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterMasparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitMasparametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitMasparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MasparametrosContext masparametros() throws RecognitionException {
		MasparametrosContext _localctx = new MasparametrosContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_masparametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(TK_COMA);
			setState(560);
			tipofuncion();
			setState(561);
			nextid();
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

	public static class NextidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lenguajeParser.ID, 0); }
		public NextidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterNextid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitNextid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitNextid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextidContext nextid() throws RecognitionException {
		NextidContext _localctx = new NextidContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nextid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(ID);
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

	public static class TipofuncionContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(lenguajeParser.BOOLEANO, 0); }
		public TerminalNode ENTERO() { return getToken(lenguajeParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(lenguajeParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(lenguajeParser.CARACTER, 0); }
		public TerminalNode CADENA() { return getToken(lenguajeParser.CADENA, 0); }
		public TipofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).enterTipofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenguajeListener ) ((lenguajeListener)listener).exitTipofuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenguajeVisitor ) return ((lenguajeVisitor<? extends T>)visitor).visitTipofuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipofuncionContext tipofuncion() throws RecognitionException {
		TipofuncionContext _localctx = new TipofuncionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tipofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u023a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\7\2\u0087\n\2\f\2\16\2\u008a\13"+
		"\2\3\2\3\2\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\3\2\3\3\3\3\6\3\u0098"+
		"\n\3\r\3\16\3\u0099\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a7"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b1\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"\u00c7\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00de\n\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00eb\n\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0102\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u0109"+
		"\n\22\f\22\16\22\u010c\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e\13\24\5\24\u0120"+
		"\n\24\3\24\3\24\5\24\u0124\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u012d\n\26\f\26\16\26\u0130\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u0137"+
		"\n\27\3\30\3\30\3\31\5\31\u013c\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u014e\n\34\f\34\16"+
		"\34\u0151\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u015e\n\36\3\37\3\37\3\37\3\37\3 \3 \6 \u0166\n \r \16 \u0167\3"+
		" \3 \3!\3!\6!\u016e\n!\r!\16!\u016f\5!\u0172\n!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u017f\n\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&"+
		"\3&\6&\u018d\n&\r&\16&\u018e\3&\3&\3\'\3\'\6\'\u0195\n\'\r\'\16\'\u0196"+
		"\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\6*\u01a5\n*\r*\16*\u01a6\3*\3*"+
		"\5*\u01ab\n*\3+\3+\3+\3+\3,\3,\6,\u01b3\n,\r,\16,\u01b4\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\5\60\u01d2\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u01e8\n\66\r\66"+
		"\16\66\u01e9\3\66\5\66\u01ed\n\66\3\66\5\66\u01f0\n\66\3\67\3\67\3\67"+
		"\3\67\6\67\u01f6\n\67\r\67\16\67\u01f7\3\67\3\67\5\67\u01fc\n\67\38\3"+
		"8\38\78\u0201\n8\f8\168\u0204\138\39\39\39\69\u0209\n9\r9\169\u020a\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\7<\u021b\n<\f<\16<\u021e\13<"+
		"\3<\3<\3=\3=\3=\3=\3=\3>\3>\5>\u0229\n>\3?\3?\7?\u022d\n?\f?\16?\u0230"+
		"\13?\3@\3@\3@\3@\3A\3A\3B\3B\3B\2\2C\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\2\t\3\2%)\3\2\65\67\3\2,-\3\2.\63\3\2\65\66\3\2.\61\3\2\33\37\2"+
		"\u023c\2\u0088\3\2\2\2\4\u0095\3\2\2\2\6\u00a6\3\2\2\2\b\u00b0\3\2\2\2"+
		"\n\u00b2\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2\2\2\20\u00cd\3\2\2\2\22"+
		"\u00cf\3\2\2\2\24\u00dd\3\2\2\2\26\u00df\3\2\2\2\30\u00ea\3\2\2\2\32\u00ec"+
		"\3\2\2\2\34\u00f7\3\2\2\2\36\u00f9\3\2\2\2 \u0101\3\2\2\2\"\u0103\3\2"+
		"\2\2$\u0111\3\2\2\2&\u0116\3\2\2\2(\u0125\3\2\2\2*\u0128\3\2\2\2,\u0136"+
		"\3\2\2\2.\u0138\3\2\2\2\60\u013b\3\2\2\2\62\u013f\3\2\2\2\64\u0145\3\2"+
		"\2\2\66\u014b\3\2\2\28\u0152\3\2\2\2:\u015d\3\2\2\2<\u015f\3\2\2\2>\u0163"+
		"\3\2\2\2@\u0171\3\2\2\2B\u0175\3\2\2\2D\u0182\3\2\2\2F\u0184\3\2\2\2H"+
		"\u0186\3\2\2\2J\u018a\3\2\2\2L\u0192\3\2\2\2N\u019a\3\2\2\2P\u019e\3\2"+
		"\2\2R\u01a2\3\2\2\2T\u01ac\3\2\2\2V\u01b0\3\2\2\2X\u01b8\3\2\2\2Z\u01c1"+
		"\3\2\2\2\\\u01c5\3\2\2\2^\u01cd\3\2\2\2`\u01d3\3\2\2\2b\u01d6\3\2\2\2"+
		"d\u01da\3\2\2\2f\u01dc\3\2\2\2h\u01de\3\2\2\2j\u01ef\3\2\2\2l\u01f1\3"+
		"\2\2\2n\u01fd\3\2\2\2p\u0205\3\2\2\2r\u020e\3\2\2\2t\u0215\3\2\2\2v\u0218"+
		"\3\2\2\2x\u0221\3\2\2\2z\u0226\3\2\2\2|\u022a\3\2\2\2~\u0231\3\2\2\2\u0080"+
		"\u0235\3\2\2\2\u0082\u0237\3\2\2\2\u0084\u0087\5p9\2\u0085\u0087\5r:\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0090\5\4\3\2\u008c\u008f\5p9\2\u008d\u008f\5r:\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\2\2\3\u0094"+
		"\3\3\2\2\2\u0095\u0097\7\3\2\2\u0096\u0098\5\6\4\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\7\4\2\2\u009c\5\3\2\2\2\u009d\u00a7\5\b\5\2\u009e"+
		"\u00a7\5\62\32\2\u009f\u00a7\5\64\33\2\u00a0\u00a7\5<\37\2\u00a1\u00a7"+
		"\5H%\2\u00a2\u00a7\5L\'\2\u00a3\u00a7\5P)\2\u00a4\u00a7\5h\65\2\u00a5"+
		"\u00a7\5&\24\2\u00a6\u009d\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2"+
		"\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\7\3\2\2\2"+
		"\u00a8\u00b1\5\n\6\2\u00a9\u00b1\5\16\b\2\u00aa\u00b1\5\22\n\2\u00ab\u00b1"+
		"\5\26\f\2\u00ac\u00b1\5\32\16\2\u00ad\u00b1\5\36\20\2\u00ae\u00b1\5\""+
		"\22\2\u00af\u00b1\5$\23\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0"+
		"\u00aa\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\t\3\2\2\2\u00b2\u00b3"+
		"\7\33\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b5\5\f\7\2\u00b5\13\3\2\2\2\u00b6"+
		"\u00be\7 \2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7\64\2\2\u00b9\u00be\5\f"+
		"\7\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7\65\2\2\u00bc\u00be\5\f\7\2\u00bd"+
		"\u00b6\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\r\3\2\2\2"+
		"\u00bf\u00c0\7\34\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2\5\20\t\2\u00c2"+
		"\17\3\2\2\2\u00c3\u00ce\7 \2\2\u00c4\u00c6\7\"\2\2\u00c5\u00c7\7&\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\7\66\2\2\u00c9\u00ce\5\20\t\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7\65\2\2"+
		"\u00cc\u00ce\5\20\t\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00ca"+
		"\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\7\65\2\2\u00d1"+
		"\u00d2\5\24\13\2\u00d2\23\3\2\2\2\u00d3\u00de\7 \2\2\u00d4\u00d6\7\"\2"+
		"\2\u00d5\u00d7\7&\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\7\67\2\2\u00d9\u00de\5\24\13\2\u00da\u00db\7#\2\2"+
		"\u00db\u00dc\7\65\2\2\u00dc\u00de\5\24\13\2\u00dd\u00d3\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\36\2"+
		"\2\u00e0\u00e1\7\65\2\2\u00e1\u00e2\5\30\r\2\u00e2\27\3\2\2\2\u00e3\u00eb"+
		"\7 \2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\79\2\2\u00e6\u00eb\5\30\r\2\u00e7"+
		"\u00e8\7#\2\2\u00e8\u00e9\7\65\2\2\u00e9\u00eb\5\30\r\2\u00ea\u00e3\3"+
		"\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\31\3\2\2\2\u00ec"+
		"\u00ed\7\37\2\2\u00ed\u00ee\7\65\2\2\u00ee\u00ef\5\34\17\2\u00ef\33\3"+
		"\2\2\2\u00f0\u00f8\7 \2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\78\2\2\u00f3"+
		"\u00f8\5\34\17\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7\65\2\2\u00f6\u00f8\5"+
		"\34\17\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8"+
		"\35\3\2\2\2\u00f9\u00fa\7\65\2\2\u00fa\u00fb\7\65\2\2\u00fb\u00fc\5 \21"+
		"\2\u00fc\37\3\2\2\2\u00fd\u0102\7 \2\2\u00fe\u00ff\7#\2\2\u00ff\u0100"+
		"\7\65\2\2\u0100\u0102\5 \21\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2"+
		"\u0102!\3\2\2\2\u0103\u0104\7\65\2\2\u0104\u0105\7$\2\2\u0105\u010a\7"+
		"\65\2\2\u0106\u0107\7$\2\2\u0107\u0109\7\65\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\"\2\2\u010e\u010f\5:\36\2\u010f"+
		"\u0110\7 \2\2\u0110#\3\2\2\2\u0111\u0112\7\65\2\2\u0112\u0113\7\"\2\2"+
		"\u0113\u0114\5:\36\2\u0114\u0115\7 \2\2\u0115%\3\2\2\2\u0116\u0117\7\65"+
		"\2\2\u0117\u011f\7*\2\2\u0118\u011c\5:\36\2\u0119\u011b\5(\25\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0118\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7+\2\2\u0122\u0124\7 \2"+
		"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\'\3\2\2\2\u0125\u0126"+
		"\7#\2\2\u0126\u0127\5:\36\2\u0127)\3\2\2\2\u0128\u012e\5,\27\2\u0129\u012a"+
		"\5.\30\2\u012a\u012b\5,\27\2\u012b\u012d\3\2\2\2\u012c\u0129\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f+\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0137\5\60\31\2\u0132\u0133\7*\2\2\u0133\u0134"+
		"\5*\26\2\u0134\u0135\7+\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0137-\3\2\2\2\u0138\u0139\t\2\2\2\u0139/\3\2\2\2\u013a"+
		"\u013c\7&\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\t\3\2\2\u013e\61\3\2\2\2\u013f\u0140\7\5\2\2\u0140\u0141"+
		"\7*\2\2\u0141\u0142\7\65\2\2\u0142\u0143\7+\2\2\u0143\u0144\7 \2\2\u0144"+
		"\63\3\2\2\2\u0145\u0146\7\6\2\2\u0146\u0147\7*\2\2\u0147\u0148\5\66\34"+
		"\2\u0148\u0149\7+\2\2\u0149\u014a\7 \2\2\u014a\65\3\2\2\2\u014b\u014f"+
		"\5:\36\2\u014c\u014e\58\35\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\67\3\2\2\2\u0151\u014f\3\2\2"+
		"\2\u0152\u0153\7#\2\2\u0153\u0154\5:\36\2\u01549\3\2\2\2\u0155\u015e\7"+
		"\64\2\2\u0156\u015e\7\66\2\2\u0157\u015e\7\67\2\2\u0158\u015e\79\2\2\u0159"+
		"\u015e\78\2\2\u015a\u015e\5*\26\2\u015b\u015e\7\65\2\2\u015c\u015e\5&"+
		"\24\2\u015d\u0155\3\2\2\2\u015d\u0156\3\2\2\2\u015d\u0157\3\2\2\2\u015d"+
		"\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015c\3\2\2\2\u015e;\3\2\2\2\u015f\u0160\7\7\2\2\u0160\u0161"+
		"\5B\"\2\u0161\u0162\5> \2\u0162=\3\2\2\2\u0163\u0165\7\b\2\2\u0164\u0166"+
		"\5\6\4\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5@!\2\u016a?\3\2\2\2\u016b"+
		"\u016d\7\n\2\2\u016c\u016e\5\6\4\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016b\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\t"+
		"\2\2\u0174A\3\2\2\2\u0175\u0176\7*\2\2\u0176\u0177\5:\36\2\u0177\u0178"+
		"\5F$\2\u0178\u017e\5:\36\2\u0179\u017a\5D#\2\u017a\u017b\5:\36\2\u017b"+
		"\u017c\5F$\2\u017c\u017d\5:\36\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7+\2\2\u0181C\3"+
		"\2\2\2\u0182\u0183\t\4\2\2\u0183E\3\2\2\2\u0184\u0185\t\5\2\2\u0185G\3"+
		"\2\2\2\u0186\u0187\7\13\2\2\u0187\u0188\5B\"\2\u0188\u0189\5J&\2\u0189"+
		"I\3\2\2\2\u018a\u018c\7\f\2\2\u018b\u018d\5\6\4\2\u018c\u018b\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\7\r\2\2\u0191K\3\2\2\2\u0192\u0194\7\f\2\2\u0193"+
		"\u0195\5\6\4\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5N(\2\u0199M"+
		"\3\2\2\2\u019a\u019b\7\13\2\2\u019b\u019c\5B\"\2\u019c\u019d\7 \2\2\u019d"+
		"O\3\2\2\2\u019e\u019f\7\16\2\2\u019f\u01a0\5X-\2\u01a0\u01a1\5R*\2\u01a1"+
		"Q\3\2\2\2\u01a2\u01a4\7\f\2\2\u01a3\u01a5\5\6\4\2\u01a4\u01a3\3\2\2\2"+
		"\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01aa\7\17\2\2\u01a9\u01ab\5T+\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01abS\3\2\2\2\u01ac\u01ad\7\16\2\2\u01ad\u01ae\5\\/\2"+
		"\u01ae\u01af\5V,\2\u01afU\3\2\2\2\u01b0\u01b2\7\f\2\2\u01b1\u01b3\5\6"+
		"\4\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\17\2\2\u01b7W\3\2\2\2"+
		"\u01b8\u01b9\7*\2\2\u01b9\u01ba\7\34\2\2\u01ba\u01bb\7\65\2\2\u01bb\u01bc"+
		"\7\"\2\2\u01bc\u01bd\7\66\2\2\u01bd\u01be\7 \2\2\u01be\u01bf\5^\60\2\u01bf"+
		"\u01c0\5Z.\2\u01c0Y\3\2\2\2\u01c1\u01c2\7 \2\2\u01c2\u01c3\5d\63\2\u01c3"+
		"\u01c4\7+\2\2\u01c4[\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6\u01c7\7\65\2\2\u01c7"+
		"\u01c8\7\"\2\2\u01c8\u01c9\7\66\2\2\u01c9\u01ca\7 \2\2\u01ca\u01cb\5^"+
		"\60\2\u01cb\u01cc\5Z.\2\u01cc]\3\2\2\2\u01cd\u01ce\7\65\2\2\u01ce\u01cf"+
		"\5f\64\2\u01cf\u01d1\5d\63\2\u01d0\u01d2\5`\61\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2_\3\2\2\2\u01d3\u01d4\5D#\2\u01d4\u01d5\5b\62\2\u01d5"+
		"a\3\2\2\2\u01d6\u01d7\7\65\2\2\u01d7\u01d8\5f\64\2\u01d8\u01d9\5d\63\2"+
		"\u01d9c\3\2\2\2\u01da\u01db\t\6\2\2\u01dbe\3\2\2\2\u01dc\u01dd\t\7\2\2"+
		"\u01ddg\3\2\2\2\u01de\u01df\7\20\2\2\u01df\u01e0\7*\2\2\u01e0\u01e1\7"+
		"\65\2\2\u01e1\u01e2\7+\2\2\u01e2\u01e3\7\21\2\2\u01e3\u01e4\5j\66\2\u01e4"+
		"\u01e5\7\25\2\2\u01e5i\3\2\2\2\u01e6\u01e8\5l\67\2\u01e7\u01e6\3\2\2\2"+
		"\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01ed\5n8\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01f0\5n8\2\u01ef\u01e7\3\2\2\2\u01ef\u01ee\3\2\2"+
		"\2\u01f0k\3\2\2\2\u01f1\u01f2\7\22\2\2\u01f2\u01f3\7\66\2\2\u01f3\u01f5"+
		"\7!\2\2\u01f4\u01f6\5\6\4\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01fa\7\23"+
		"\2\2\u01fa\u01fc\7 \2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"m\3\2\2\2\u01fd\u01fe\7\24\2\2\u01fe\u0202\7!\2\2\u01ff\u0201\5\6\4\2"+
		"\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203o\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\26\2\2\u0206"+
		"\u0208\7\65\2\2\u0207\u0209\5\b\5\2\u0208\u0207\3\2\2\2\u0209\u020a\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\7\27\2\2\u020dq\3\2\2\2\u020e\u020f\7\30\2\2\u020f\u0210\5\u0082"+
		"B\2\u0210\u0211\7\65\2\2\u0211\u0212\7*\2\2\u0212\u0213\5z>\2\u0213\u0214"+
		"\5t;\2\u0214s\3\2\2\2\u0215\u0216\7+\2\2\u0216\u0217\5v<\2\u0217u\3\2"+
		"\2\2\u0218\u021c\7\f\2\2\u0219\u021b\5\6\4\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2"+
		"\2\2\u021e\u021c\3\2\2\2\u021f\u0220\5x=\2\u0220w\3\2\2\2\u0221\u0222"+
		"\7\31\2\2\u0222\u0223\5:\36\2\u0223\u0224\7 \2\2\u0224\u0225\7\32\2\2"+
		"\u0225y\3\2\2\2\u0226\u0228\5\u0082B\2\u0227\u0229\5|?\2\u0228\u0227\3"+
		"\2\2\2\u0228\u0229\3\2\2\2\u0229{\3\2\2\2\u022a\u022e\7\65\2\2\u022b\u022d"+
		"\5~@\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f}\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7#\2\2\u0232"+
		"\u0233\5\u0082B\2\u0233\u0234\5\u0080A\2\u0234\177\3\2\2\2\u0235\u0236"+
		"\7\65\2\2\u0236\u0081\3\2\2\2\u0237\u0238\t\b\2\2\u0238\u0083\3\2\2\2"+
		".\u0086\u0088\u008e\u0090\u0099\u00a6\u00b0\u00bd\u00c6\u00cd\u00d6\u00dd"+
		"\u00ea\u00f7\u0101\u010a\u011c\u011f\u0123\u012e\u0136\u013b\u014f\u015d"+
		"\u0167\u016f\u0171\u017e\u018e\u0196\u01a6\u01aa\u01b4\u01d1\u01e9\u01ec"+
		"\u01ef\u01f7\u01fb\u0202\u020a\u021c\u0228\u022e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}