// Generated from Additionrecursion.g4 by ANTLR 4.7.1
package src.de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdditionrecursionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NUM=29, NEWLINE=30, IDENTIFIER=31, 
		WHITESPACE=32, STRING=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_varDeclaration = 3, 
		RULE_varDeclarationList = 4, RULE_assignment = 5, RULE_println = 6, RULE_print = 7, 
		RULE_branch = 8, RULE_do_while = 9, RULE_while_statement = 10, RULE_block = 11, 
		RULE_userInput = 12, RULE_incrementation = 13, RULE_decrement = 14, RULE_forLoop = 15, 
		RULE_forInitialization = 16, RULE_forChange = 17;
	public static final String[] ruleNames = {
		"program", "statement", "expression", "varDeclaration", "varDeclarationList", 
		"assignment", "println", "print", "branch", "do_while", "while_statement", 
		"block", "userInput", "incrementation", "decrement", "forLoop", "forInitialization", 
		"forChange"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", 
		"'&&'", "'||'", "'int'", "'='", "','", "'println('", "')'", "'print('", 
		"'if'", "'('", "'else'", "'do'", "'while'", "'{'", "'}'", "'UserInputReader.readInt()'", 
		"'++'", "'--'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUM", "NEWLINE", "IDENTIFIER", "WHITESPACE", 
		"STRING"
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

	@Override
	public String getGrammarFileName() { return "Additionrecursion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdditionrecursionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << IDENTIFIER))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				println();
				setState(42);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				print();
				setState(45);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				varDeclarationList(0);
				setState(48);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				varDeclaration();
				setState(51);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				assignment();
				setState(54);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				branch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				do_while();
				setState(58);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				incrementation();
				setState(62);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				decrement();
				setState(65);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(67);
				forLoop();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUM() { return getToken(AdditionrecursionParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				((NumberContext)_localctx).number = match(NUM);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(77);
						match(T__1);
						setState(78);
						((DivContext)_localctx).rght = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(80);
						match(T__2);
						setState(81);
						((MultContext)_localctx).rght = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(83);
						match(T__3);
						setState(84);
						((MinusContext)_localctx).rght = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						match(T__4);
						setState(87);
						((PlusContext)_localctx).rght = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((RelationalContext)_localctx).rght = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						match(T__9);
						setState(93);
						((AndContext)_localctx).rght = expression(6);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
						match(T__10);
						setState(96);
						((OrContext)_localctx).rght = expression(5);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationAndAssignmentContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationAndAssignmentContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ListDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__11);
				setState(103);
				((VarDeclarationAndAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(104);
				match(T__12);
				setState(105);
				((VarDeclarationAndAssignmentContext)_localctx).exp = expression(0);
				}
				break;
			case 2:
				_localctx = new SimpleVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__11);
				setState(107);
				((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__13);
				setState(109);
				((ListDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		return varDeclarationList(0);
	}

	private VarDeclarationListContext varDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, _parentState);
		VarDeclarationListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_varDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			varDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclarationList);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					varDeclaration();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputVarContext extends AssignmentContext {
		public Token varName;
		public UserInputContext input;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public UserInputContext userInput() {
			return getRuleContext(UserInputContext.class,0);
		}
		public InputVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectVarAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DirectVarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDirectVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DirectVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((DirectVarAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(123);
				match(T__12);
				setState(124);
				((DirectVarAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new InputVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((InputVarContext)_localctx).varName = match(IDENTIFIER);
				setState(126);
				match(T__12);
				setState(127);
				((InputVarContext)_localctx).input = userInput();
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

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementAndVariableContext extends PrintlnContext {
		public Token txt;
		public Token varName;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public PrintStatementAndVariableContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrintStatementAndVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePrintStatementContext extends PrintlnContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplePrintStatementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimplePrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintStatementAndVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__14);
				setState(131);
				((PrintStatementAndVariableContext)_localctx).txt = match(STRING);
				setState(132);
				match(T__4);
				setState(133);
				((PrintStatementAndVariableContext)_localctx).varName = match(IDENTIFIER);
				setState(134);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new SimplePrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__14);
				setState(136);
				((SimplePrintStatementContext)_localctx).argument = expression(0);
				setState(137);
				match(T__15);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__16);
			setState(142);
			((PrintContext)_localctx).argument = expression(0);
			setState(143);
			match(T__15);
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

	public static class BranchContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__17);
			setState(146);
			match(T__18);
			setState(147);
			((BranchContext)_localctx).condition = expression(0);
			setState(148);
			match(T__15);
			setState(149);
			((BranchContext)_localctx).onTrue = block();
			setState(150);
			match(T__19);
			setState(151);
			((BranchContext)_localctx).onFalse = block();
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

	public static class Do_whileContext extends ParserRuleContext {
		public BlockContext loop;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__20);
			setState(154);
			((Do_whileContext)_localctx).loop = block();
			setState(155);
			match(T__21);
			setState(156);
			match(T__18);
			setState(157);
			((Do_whileContext)_localctx).condition = expression(0);
			setState(158);
			match(T__15);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext loopCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__21);
			setState(161);
			match(T__18);
			setState(162);
			((While_statementContext)_localctx).condition = expression(0);
			setState(163);
			match(T__15);
			setState(164);
			((While_statementContext)_localctx).loopCondition = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__22);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__23);
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

	public static class UserInputContext extends ParserRuleContext {
		public UserInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInput; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputContext userInput() throws RecognitionException {
		UserInputContext _localctx = new UserInputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_userInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__24);
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

	public static class IncrementationContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public IncrementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitIncrementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementationContext incrementation() throws RecognitionException {
		IncrementationContext _localctx = new IncrementationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incrementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((IncrementationContext)_localctx).varName = match(IDENTIFIER);
			setState(178);
			match(T__25);
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

	public static class DecrementContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((DecrementContext)_localctx).varName = match(IDENTIFIER);
			setState(181);
			match(T__26);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForInitializationContext initialization;
		public ExpressionContext condition;
		public ForChangeContext change;
		public BlockContext loopCondition;
		public ForInitializationContext forInitialization() {
			return getRuleContext(ForInitializationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForChangeContext forChange() {
			return getRuleContext(ForChangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__27);
			setState(184);
			match(T__18);
			setState(185);
			((ForLoopContext)_localctx).initialization = forInitialization();
			setState(186);
			match(T__0);
			setState(187);
			((ForLoopContext)_localctx).condition = expression(0);
			setState(188);
			match(T__0);
			setState(189);
			((ForLoopContext)_localctx).change = forChange();
			setState(190);
			match(T__15);
			setState(191);
			((ForLoopContext)_localctx).loopCondition = block();
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

	public static class ForInitializationContext extends ParserRuleContext {
		public ForInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitialization; }
	 
		public ForInitializationContext() { }
		public void copyFrom(ForInitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVariable_ForContext extends ForInitializationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclareVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDeclareVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariable_ForContext extends ForInitializationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAssignVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializationContext forInitialization() throws RecognitionException {
		ForInitializationContext _localctx = new ForInitializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forInitialization);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
				_localctx = new DeclareVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				varDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				assignment();
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

	public static class ForChangeContext extends ParserRuleContext {
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForChangeContext forChange() throws RecognitionException {
		ForChangeContext _localctx = new ForChangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forChange);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				incrementation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				decrement();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return varDeclarationList_sempred((VarDeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean varDeclarationList_sempred(VarDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3G\n\3\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"x\n\6\f\6\16\6{\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae\13\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\5\23\u00ca\n\23\3\23\2\4\6\n"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\b\13\2\u00d5\2"+
		"\'\3\2\2\2\4F\3\2\2\2\6L\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\f\u0082\3\2\2\2"+
		"\16\u008d\3\2\2\2\20\u008f\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2\26"+
		"\u00a2\3\2\2\2\30\u00a8\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2\2\36\u00b6"+
		"\3\2\2\2 \u00b9\3\2\2\2\"\u00c5\3\2\2\2$\u00c9\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\5\16\b\2,-\7\3\2\2"+
		"-G\3\2\2\2./\5\20\t\2/\60\7\3\2\2\60G\3\2\2\2\61\62\5\n\6\2\62\63\7\3"+
		"\2\2\63G\3\2\2\2\64\65\5\b\5\2\65\66\7\3\2\2\66G\3\2\2\2\678\5\f\7\28"+
		"9\7\3\2\29G\3\2\2\2:G\5\22\n\2;<\5\24\13\2<=\7\3\2\2=G\3\2\2\2>G\5\26"+
		"\f\2?@\5\34\17\2@A\7\3\2\2AG\3\2\2\2BC\5\36\20\2CD\7\3\2\2DG\3\2\2\2E"+
		"G\5 \21\2F+\3\2\2\2F.\3\2\2\2F\61\3\2\2\2F\64\3\2\2\2F\67\3\2\2\2F:\3"+
		"\2\2\2F;\3\2\2\2F>\3\2\2\2F?\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI"+
		"\b\4\1\2IM\7\37\2\2JM\7#\2\2KM\7!\2\2LH\3\2\2\2LJ\3\2\2\2LK\3\2\2\2Me"+
		"\3\2\2\2NO\f\f\2\2OP\7\4\2\2Pd\5\6\4\rQR\f\13\2\2RS\7\5\2\2Sd\5\6\4\f"+
		"TU\f\n\2\2UV\7\6\2\2Vd\5\6\4\13WX\f\t\2\2XY\7\7\2\2Yd\5\6\4\nZ[\f\b\2"+
		"\2[\\\t\2\2\2\\d\5\6\4\t]^\f\7\2\2^_\7\f\2\2_d\5\6\4\b`a\f\6\2\2ab\7\r"+
		"\2\2bd\5\6\4\7cN\3\2\2\2cQ\3\2\2\2cT\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2"+
		"\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\7"+
		"\16\2\2ij\7!\2\2jk\7\17\2\2kq\5\6\4\2lm\7\16\2\2mq\7!\2\2no\7\20\2\2o"+
		"q\7!\2\2ph\3\2\2\2pl\3\2\2\2pn\3\2\2\2q\t\3\2\2\2rs\b\6\1\2st\5\b\5\2"+
		"ty\3\2\2\2uv\f\4\2\2vx\5\b\5\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\13\3\2\2\2{y\3\2\2\2|}\7!\2\2}~\7\17\2\2~\u0083\5\6\4\2\177\u0080\7"+
		"!\2\2\u0080\u0081\7\17\2\2\u0081\u0083\5\32\16\2\u0082|\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7#\2\2\u0086"+
		"\u0087\7\7\2\2\u0087\u0088\7!\2\2\u0088\u008e\7\22\2\2\u0089\u008a\7\21"+
		"\2\2\u008a\u008b\5\6\4\2\u008b\u008c\7\22\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0084\3\2\2\2\u008d\u0089\3\2\2\2\u008e\17\3\2\2\2\u008f\u0090\7\23\2"+
		"\2\u0090\u0091\5\6\4\2\u0091\u0092\7\22\2\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\7\24\2\2\u0094\u0095\7\25\2\2\u0095\u0096\5\6\4\2\u0096\u0097\7\22\2"+
		"\2\u0097\u0098\5\30\r\2\u0098\u0099\7\26\2\2\u0099\u009a\5\30\r\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\7\27\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7\30"+
		"\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7\22\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5\6"+
		"\4\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\5\30\r\2\u00a7\27\3\2\2\2\u00a8"+
		"\u00ac\7\31\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7\32\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\33"+
		"\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\34\2\2\u00b5\35"+
		"\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\7\35\2\2\u00b8\37\3\2\2\2\u00b9"+
		"\u00ba\7\36\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd"+
		"\7\3\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5$\23\2\u00c0"+
		"\u00c1\7\22\2\2\u00c1\u00c2\5\30\r\2\u00c2!\3\2\2\2\u00c3\u00c6\5\b\5"+
		"\2\u00c4\u00c6\5\f\7\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6#"+
		"\3\2\2\2\u00c7\u00ca\5\34\17\2\u00c8\u00ca\5\36\20\2\u00c9\u00c7\3\2\2"+
		"\2\u00c9\u00c8\3\2\2\2\u00ca%\3\2\2\2\16)FLcepy\u0082\u008d\u00ac\u00c5"+
		"\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}