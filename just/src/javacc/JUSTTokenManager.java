/* Generated By:JavaCC: Do not edit this line. JUSTTokenManager.java */
package javacc;

/** Token Manager. */
public class JUSTTokenManager implements JUSTConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xff8000000L) != 0L)
         {
            jjmatchedKind = 36;
            return 8;
         }
         return -1;
      case 1:
         if ((active0 & 0xdf8000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
            return 9;
         }
         if ((active0 & 0x200000000L) != 0L)
            return 9;
         return -1;
      case 2:
         if ((active0 & 0xdd8000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
            return 9;
         }
         if ((active0 & 0x20000000L) != 0L)
            return 9;
         return -1;
      case 3:
         if ((active0 & 0x9c8000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x410000000L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0x148000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 4;
            return 9;
         }
         if ((active0 & 0x880000000L) != 0L)
            return 9;
         return -1;
      case 5:
         if ((active0 & 0x48000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 5;
            return 9;
         }
         if ((active0 & 0x100000000L) != 0L)
            return 9;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
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
      case 33:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 40:
         return jjStopAtPos(0, 19);
      case 41:
         return jjStopAtPos(0, 20);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 25);
      case 45:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStopAtPos(0, 8);
      case 59:
         return jjStopAtPos(0, 26);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 61:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 62:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 91:
         return jjStopAtPos(0, 23);
      case 93:
         return jjStopAtPos(0, 24);
      case 98:
         return jjMoveStringLiteralDfa1_0(0xc0000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x220000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 123:
         return jjStopAtPos(0, 21);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 125:
         return jjStopAtPos(0, 22);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 61:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 102:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 9);
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
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 124:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x810000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 9);
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 9);
         break;
      case 101:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x840000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 9);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 9);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x108000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x48000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 109:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 9);
         break;
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(6, 30, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 8;
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
               case 9:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(2, 1);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(0, 2);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(2, 1);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(3, 5);
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
               case 9:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddStates(6, 8);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(6);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddTwoStates(2, 1);
                  }
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(9, 11);
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddStates(6, 8);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(6);
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(2, 1);
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddStates(6, 8);
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
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 3, 4, 2, 1, 4, 2, 1, 7, 2, 6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", "\75", "\75\75", 
"\41\75", "\76", "\76\75", "\74", "\74\75", "\41", "\174\174", "\46\46", "\50", "\51", 
"\173", "\175", "\133", "\135", "\54", "\73", "\160\162\157\147\162\141\155", 
"\166\157\151\144", "\151\156\164", "\142\157\157\154\145\141\156", "\142\171\162\145\146", 
"\162\145\164\165\162\156", "\151\146", "\145\154\163\145", "\167\150\151\154\145", null, null, null, null, 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xbfffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[8];
static private final int[] jjstateSet = new int[16];
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
   for (i = 8; i-- > 0;)
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

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
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

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
