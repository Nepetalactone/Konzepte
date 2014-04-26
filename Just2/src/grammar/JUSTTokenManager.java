/* Generated By:JavaCC: Do not edit this line. JUSTTokenManager.java */
package grammar;

/** Token Manager. */
public class JUSTTokenManager implements JUSTConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 3;
         return jjMoveNfa_0(1, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(1, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveNfa_0(1, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(1, 0);
      case 33:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 40:
         jjmatchedKind = 19;
         return jjMoveNfa_0(1, 0);
      case 41:
         jjmatchedKind = 20;
         return jjMoveNfa_0(1, 0);
      case 42:
         jjmatchedKind = 7;
         return jjMoveNfa_0(1, 0);
      case 43:
         jjmatchedKind = 5;
         return jjMoveNfa_0(1, 0);
      case 44:
         jjmatchedKind = 25;
         return jjMoveNfa_0(1, 0);
      case 45:
         jjmatchedKind = 6;
         return jjMoveNfa_0(1, 0);
      case 47:
         jjmatchedKind = 8;
         return jjMoveNfa_0(1, 0);
      case 59:
         jjmatchedKind = 26;
         return jjMoveNfa_0(1, 0);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 61:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 62:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0xc0000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x220000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 91:
         jjmatchedKind = 23;
         return jjMoveNfa_0(1, 0);
      case 93:
         jjmatchedKind = 24;
         return jjMoveNfa_0(1, 0);
      case 98:
         return jjMoveStringLiteralDfa1_0(0xc0000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x220000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 123:
         jjmatchedKind = 21;
         return jjMoveNfa_0(1, 0);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 125:
         jjmatchedKind = 22;
         return jjMoveNfa_0(1, 0);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 0);
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 70:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
         }
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 89:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 102:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
         }
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10008000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 124:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 1);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x810000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 84:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x810000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 2);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
         }
         break;
      case 69:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x840000000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 100:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
         }
         break;
      case 101:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x840000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 3);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 70:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x108000000L);
      case 101:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x108000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 4);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x48000000L);
      case 78:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x48000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 5);
   }
   switch(curChar)
   {
      case 77:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 6;
         }
         break;
      case 78:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
         }
         break;
      case 109:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 6;
         }
         break;
      case 110:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 6);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", "\75", "\75\75", 
"\41\75", "\76", "\76\75", "\74", "\74\75", "\41", "\174\174", "\46\46", "\50", "\51", 
"\173", "\175", "\133", "\135", "\54", "\73", null, null, null, null, null, null, null, 
null, null, null, null, null, null, "\164\162\165\145", "\146\141\154\163\145", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3cfffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[3];
static private final int[] jjstateSet = new int[6];
static protected char curChar;
/** Constructor. */
public JUSTTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public JUSTTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
