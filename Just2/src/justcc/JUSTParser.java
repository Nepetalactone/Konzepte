/* Generated By:JavaCC: Do not edit this line. JUSTParser.java */
package justcc;
import java.io.FileInputStream;
import symbol.Kind;
import symbol.MethodSymbol;
import symbol.NameList;
import symbol.Scope;
import symbol.Symbol;
import symbol.SymbolTable;
import symbol.Type;
import classfile.ClassFile;
import classfile.constant.Constant;
import classfile.constant.MethodRefConstant;
import code.CodeGenerator;
import code.Descriptor;
import code.fixup.VarAddressFixup;
import code.OpCode;

public class JUSTParser implements JUSTParserConstants {
  private static ClassFile m_classFile = new ClassFile();

  private static NameList m_nameList = new NameList();

  private static SymbolTable m_symboltable = new SymbolTable(m_nameList); //Semantikanschluss Seite 41
  private static CodeGenerator m_codeGen = new CodeGenerator();

  public static void main(String args [])
  {
    try
    {
      JUSTParser parser = new JUSTParser(new FileInputStream("JustCode/Test.jus"));
      parser.file();
      System.out.println("OK.");
      m_classFile.write("JustCode/output.jl");
    }
    catch (ParseException e)
    {
      System.out.println("NOK.");
      System.out.println(e.getMessage());
      JUSTParser.ReInit(System.in);
    }
    catch (Error e)
    {
      System.out.println("Oops.");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    catch (Exception e)
    {
      System.out.println("Other oops.");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

/*Ab hier einfach die Regeln aus den Folien Abschreiben:file ="program" ident "{" Definition "}".Definition={ VarDef| FuncDef}.VarDef=Type ident[ Init] ";".Init="=" number.Type="void" | "int" | "boolean".FuncDef=FuncHeadBlock.FuncHead=Type ident "(" [ FormParList] ")".FormParList=["byref"] Type ident{"," ["byref"] Type ident}.Block="{" { VarDef| Stat} "}".Stat=AssignStat| CallStat| IfStat| WhileStat| ReturnStat| Block | ";".AssignStat=ident "=" Expr";".CallStat=Call ";".Call=ident "(" [ ActParList] ")".ActParList=Expr{ "," Expr}.IfStat="if" "(" Expr ")" Stat [ "else" Stat ].WhileStat="while" "(" Expr")" Stat.ReturnStat="return" [ Expr] ";" .Expr=OrExpr.OrExpr=AndExpr{ "||" AndExpr}.AndExpr=RelExpr{ "&&" RelExpr}.RelExpr=SimpleExpr[ ("==" | "!=" | "<" | "<=" | ">" | ">=") SimpleExpr].SimpleExpr=["+" | "-"] Term { ("+" | "-") Term }.Term=NotFact{ ("*" | "/") NotFact}.NotFact=["!"] Fact.Fact=number| ident["(" [ ActParList] ")" ]| "(" Expr")".*/
  static final public void file() throws ParseException {
    program();
  }

  static final public void program() throws ParseException {
  Symbol s;
  Constant classConstant;
    jj_consume_token(PROGRAM);
    token = jj_consume_token(IDENT);
    s = m_nameList.insert(token.image, Kind.programKind);
    m_symboltable.insert(s);
    m_symboltable.enterScope("program: " + token.image);
    classConstant = m_classFile.addClassConstant(s);
    jj_consume_token(LEFTCURLYBRACKET);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
      case INT:
      case BOOL:
      case VAR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
        fieldVarDef();
        break;
      case VOID:
      case INT:
      case BOOL:
        FuncDef();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RIGHTTCURLYBRACKET);
    m_symboltable.leaveScope();
  }

  static final public void fieldVarDef() throws ParseException {
  Constant constant;
    jj_consume_token(VAR);
    constant = VarDef(Kind.fieldKind);
    jj_consume_token(SEMICOLON);
  }

  static final public void localVarDef() throws ParseException {
  Constant constant;
    jj_consume_token(VAR);
    constant = VarDef(Kind.localKind);
    jj_consume_token(SEMICOLON);
  }

  static final public Constant VarDef(Kind kind) throws ParseException {
  Type type;
  Symbol s;
  Constant varConstant;
    type = Type();
    token = jj_consume_token(IDENT);
    s = m_nameList.insert(token.image, kind);
    s.setType(type);
    m_symboltable.insert(s);
    {if (true) return m_classFile.addVarConstant(s);}
    throw new Error("Missing return statement in function");
  }

  static final public void FuncDef() throws ParseException {
  Type type;
  MethodSymbol s;
  MethodRefConstant methodConstant;
  Scope scope;
    type = Type();
    token = jj_consume_token(IDENT);
    s = (MethodSymbol) m_nameList.insert(token.image, Kind.methodKind);
    s.setType(type);
    m_symboltable.insert(s);
    scope = m_symboltable.enterScope(token.image);
    jj_consume_token(LEFTBRACKET);
    FormParList(s);
    jj_consume_token(RIGHTBRACKET);
    methodConstant = (MethodRefConstant) m_classFile.addMethodConstant(s, scope);
    m_codeGen.setCurrentCode(methodConstant.getCode());
    Block();
    m_symboltable.leaveScope();
  }

  static final public Type Type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VOID:
      jj_consume_token(VOID);
    {if (true) return Type.Void;}
      break;
    case INT:
      jj_consume_token(INT);
    {if (true) return Type.Int;}
      break;
    case BOOL:
      jj_consume_token(BOOL);
    {if (true) return Type.Bool;}
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Block() throws ParseException {
    jj_consume_token(LEFTCURLYBRACKET);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case RETURN:
      case VAR:
      case IDENT:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      Stat();
    }
    jj_consume_token(RIGHTTCURLYBRACKET);
  }

  static final public void Stat() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR:
      localVarDef();
      break;
    case IDENT:
      AssignStat();
      break;
    case RETURN:
      ReturnStat();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void AssignStat() throws ParseException {
  //Seite 41  //Attribute  Descriptor desc;
    desc = var(false);
    jj_consume_token(ASSIGN);
    Expr();
    m_codeGen.save(desc);
    jj_consume_token(SEMICOLON);
  }

  static final public void CallStat() throws ParseException {
    Call();
    jj_consume_token(SEMICOLON);
  }

  static final public void Call() throws ParseException {
    jj_consume_token(IDENT);
    jj_consume_token(LEFTBRACKET);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOT:
    case LEFTBRACKET:
    case CALL:
    case CONSTANT:
    case IDENT:
      ActParList();
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    jj_consume_token(RIGHTBRACKET);
  }

  static final public void ActParList() throws ParseException {
    Expr();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COLON:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
      jj_consume_token(COLON);
      Expr();
    }
  }

  static final public void IfStat() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IF:
      jj_consume_token(IF);
      jj_consume_token(LEFTBRACKET);

      jj_consume_token(RIGHTBRACKET);
      Stat();
      jj_consume_token(ELSE);

      Stat();

      break;
    default:
      jj_la1[7] = jj_gen;

    }
  }

  static final public void WhileStat() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(LEFTBRACKET);
    Expr();
    jj_consume_token(RIGHTBRACKET);
    Stat();
  }

  static final public void ReturnStat() throws ParseException {
    jj_consume_token(RETURN);
    Expr();
    m_codeGen.emit(OpCode.IRETURN);
    jj_consume_token(SEMICOLON);
  }

  static final public void Expr() throws ParseException {
    OrExpr();
  }

  static final public void OrExpr() throws ParseException {
    AndExpr();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      jj_consume_token(OR);
      AndExpr();
      m_codeGen.emit(OpCode.IOR);
    }
  }

  static final public void AndExpr() throws ParseException {
    RelExpr();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
      jj_consume_token(AND);
      RelExpr();
      m_codeGen.emit(OpCode.IAND);
    }
  }

  static final public void RelExpr() throws ParseException {
    SimpleExpr();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQUALS:
      case NQ:
      case GT:
      case GET:
      case LT:
      case LET:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_6;
      }
      Compare();
      SimpleExpr();
    }
  }

  static final public void SimpleExpr() throws ParseException {
  OpCode code;
    Term();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        code = OpCode.IADD;
        break;
      case MINUS:
        jj_consume_token(MINUS);
        code = OpCode.ISUB;
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term();
      m_codeGen.emit(code);
    }
  }

  static final public void Term() throws ParseException {
  OpCode code;
    NotFact();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
        code = OpCode.IMUL;
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
        code = OpCode.IDIV;
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      NotFact();
      m_codeGen.emit(code);
    }
  }

  static final public void NotFact() throws ParseException {
  boolean not = false;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOT:
      jj_consume_token(NOT);
      not = true;
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    Fact();
    if (not)
    {
      m_codeGen.emit(OpCode.INEG);
    }
  }

  static final public void Fact() throws ParseException {
  Constant constant;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CONSTANT:
      token = jj_consume_token(CONSTANT);
    constant = m_classFile.addValueConstant(token.image, "integer");
    m_codeGen.emit2(OpCode.LDC_W, constant.getIndex());
      break;
    case IDENT:
      var(true);
      break;
    case CALL:
      simpleCallStat();
      break;
    case LEFTBRACKET:
      jj_consume_token(LEFTBRACKET);
      Expr();
      jj_consume_token(RIGHTBRACKET);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public Descriptor var(boolean generate) throws ParseException {
  Symbol s;
  Descriptor desc;
    token = jj_consume_token(IDENT);
    s = m_symboltable.lookup(token.image);
    if(s==null)
    {
      s = m_nameList.insert(token.image, Kind.noneKind);
    }
    desc = m_codeGen.getDescriptor(s);

    if(generate)
    {
      m_codeGen.load(desc);
    }
    {if (true) return desc;}
    throw new Error("Missing return statement in function");
  }

  static final public void simpleCallStat() throws ParseException {
    jj_consume_token(CALL);
    call();
  }

  static final public void call() throws ParseException {
  Descriptor desc;
    desc = var(false);
    jj_consume_token(LEFTBRACKET);
    ActParList();
    jj_consume_token(RIGHTBRACKET);
    m_codeGen.emit2(OpCode.INVOKESTATIC, new VarAddressFixup(desc, m_symboltable.getCurScope()));
  }

  static final public void Compare() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQUALS:
      jj_consume_token(EQUALS);
      break;
    case NQ:
      jj_consume_token(NQ);
      break;
    case LT:
      jj_consume_token(LT);
      break;
    case LET:
      jj_consume_token(LET);
      break;
    case GT:
      jj_consume_token(GT);
      break;
    case GET:
      jj_consume_token(GET);
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Init() throws ParseException {
    jj_consume_token(ASSIGN);
    jj_consume_token(CONSTANT);
  }

  static final public void FormParList(MethodSymbol s) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VOID:
    case INT:
    case BOOL:
    case BYREF:
      formPar(s);
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COLON:
          ;
          break;
        default:
          jj_la1[18] = jj_gen;
          break label_9;
        }
        jj_consume_token(COLON);
        formPar(s);
      }
      break;
    default:
      jj_la1[19] = jj_gen;
      ;
    }
  }

  static final public void formPar(MethodSymbol method) throws ParseException {
  Type type;
  Symbol s;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BYREF:
      jj_consume_token(BYREF);
      break;
    default:
      jj_la1[20] = jj_gen;
      ;
    }
    type = Type();
    token = jj_consume_token(IDENT);
    s = m_nameList.insert(token.image, Kind.paramKind);
    s.setType(type);
    m_symboltable.insert(s);
    s.setConstant(m_classFile.addVarConstant(s));
    method.addParam(s);
  }

  static final public void sum() throws ParseException {
    Term();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[21] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public JUSTParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[23];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xe0000000,0xe0000000,0xe0000000,0x0,0x0,0x90000,0x2000000,0x0,0x20000,0x40000,0xfc00,0x60,0x60,0x180,0x180,0x10000,0x80000,0xfc00,0x2000000,0xe0000000,0x0,0x60,0x60,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x20,0x20,0x0,0x1022,0x1022,0x1840,0x0,0x4,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1840,0x0,0x0,0x1,0x1,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public JUSTParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public JUSTParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JUSTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public JUSTParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new JUSTParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public JUSTParser(JUSTParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JUSTParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[47];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 23; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 47; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
