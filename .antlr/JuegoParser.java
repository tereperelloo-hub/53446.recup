// Generated from c:/Users/terep/OneDrive/Desktop/juego-antlr/juego-antlr-proyecto/Juego.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JuegoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, STRING=12, NUMBER=13, WS=14;
	public static final int
		RULE_juego = 0, RULE_escenas = 1, RULE_escena = 2, RULE_acciones = 3, 
		RULE_accion = 4, RULE_imprimir = 5, RULE_leer = 6, RULE_condicion = 7, 
		RULE_comparacion = 8, RULE_valor = 9, RULE_saltar = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"juego", "escenas", "escena", "acciones", "accion", "imprimir", "leer", 
			"condicion", "comparacion", "valor", "saltar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'juego'", "'{'", "'}'", "'escena'", "'mostrar'", "';'", "'leer'", 
			"'si'", "'saltar'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Juego.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuegoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JuegoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public EscenasContext escenas() {
			return getRuleContext(EscenasContext.class,0);
		}
		public JuegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_juego; }
	}

	public final JuegoContext juego() throws RecognitionException {
		JuegoContext _localctx = new JuegoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_juego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(ID);
			setState(24);
			match(T__1);
			setState(25);
			escenas();
			setState(26);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscenasContext extends ParserRuleContext {
		public List<EscenaContext> escena() {
			return getRuleContexts(EscenaContext.class);
		}
		public EscenaContext escena(int i) {
			return getRuleContext(EscenaContext.class,i);
		}
		public EscenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escenas; }
	}

	public final EscenasContext escenas() throws RecognitionException {
		EscenasContext _localctx = new EscenasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_escenas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				escena();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscenaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public EscenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escena; }
	}

	public final EscenaContext escena() throws RecognitionException {
		EscenaContext _localctx = new EscenaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_escena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__3);
			setState(34);
			match(ID);
			setState(35);
			match(T__1);
			setState(36);
			acciones();
			setState(37);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionesContext extends ParserRuleContext {
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public AccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones; }
	}

	public final AccionesContext acciones() throws RecognitionException {
		AccionesContext _localctx = new AccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_acciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				accion();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 928L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public SaltarContext saltar() {
			return getRuleContext(SaltarContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accion);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				imprimir();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				leer();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				condicion();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				saltar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JuegoParser.STRING, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			match(STRING);
			setState(52);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			match(ID);
			setState(56);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__7);
			setState(59);
			comparacion();
			setState(60);
			match(T__8);
			setState(61);
			match(ID);
			setState(62);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(T__9);
			setState(66);
			valor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JuegoParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JuegoParser.NUMBER, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaltarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuegoParser.ID, 0); }
		public SaltarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltar; }
	}

	public final SaltarContext saltar() throws RecognitionException {
		SaltarContext _localctx = new SaltarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_saltar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			match(ID);
			setState(72);
			match(T__5);
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
		"\u0004\u0001\u000eK\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001e"+
		"\b\u0001\u000b\u0001\f\u0001\u001f\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003)\b\u0003"+
		"\u000b\u0003\f\u0003*\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0001\u0001\u0000\f\rD\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001d"+
		"\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006(\u0001\u0000"+
		"\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f6"+
		"\u0001\u0000\u0000\u0000\u000e:\u0001\u0000\u0000\u0000\u0010@\u0001\u0000"+
		"\u0000\u0000\u0012D\u0001\u0000\u0000\u0000\u0014F\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u000b\u0000\u0000"+
		"\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000"+
		"\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0004\u0000\u0000\"#\u0005\u000b\u0000\u0000#$\u0005\u0002\u0000\u0000"+
		"$%\u0003\u0006\u0003\u0000%&\u0005\u0003\u0000\u0000&\u0005\u0001\u0000"+
		"\u0000\u0000\')\u0003\b\u0004\u0000(\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+\u0007\u0001\u0000\u0000\u0000,1\u0003\n\u0005\u0000-1\u0003\f\u0006"+
		"\u0000.1\u0003\u000e\u0007\u0000/1\u0003\u0014\n\u00000,\u0001\u0000\u0000"+
		"\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005"+
		"\f\u0000\u000045\u0005\u0006\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"67\u0005\u0007\u0000\u000078\u0005\u000b\u0000\u000089\u0005\u0006\u0000"+
		"\u00009\r\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000;<\u0003\u0010"+
		"\b\u0000<=\u0005\t\u0000\u0000=>\u0005\u000b\u0000\u0000>?\u0005\u0006"+
		"\u0000\u0000?\u000f\u0001\u0000\u0000\u0000@A\u0005\u000b\u0000\u0000"+
		"AB\u0005\n\u0000\u0000BC\u0003\u0012\t\u0000C\u0011\u0001\u0000\u0000"+
		"\u0000DE\u0007\u0000\u0000\u0000E\u0013\u0001\u0000\u0000\u0000FG\u0005"+
		"\t\u0000\u0000GH\u0005\u000b\u0000\u0000HI\u0005\u0006\u0000\u0000I\u0015"+
		"\u0001\u0000\u0000\u0000\u0003\u001f*0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}