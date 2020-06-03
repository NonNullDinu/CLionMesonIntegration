/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.nonnulldinu.clionmeson.languages.lexers;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.nonnulldinu.clionmeson.build.psi.MesonBuildTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_MesonBuildLexer.flex</tt>
 */
public class _MesonBuildLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\2\1\1\3\22\0\1\4\1\36\3\0\1\37\1\0\1\15\1\30\1\31\1\20\1\40"+
    "\1\32\1\41\1\21\1\17\1\5\1\7\6\12\2\13\1\60\1\0\1\34\1\33\1\35\1\57\1\0\6"+
    "\11\24\14\1\24\1\16\1\25\1\0\1\14\1\0\1\47\1\6\1\53\1\55\1\45\1\46\1\14\1"+
    "\54\1\22\1\14\1\56\1\50\1\14\1\23\1\52\2\14\1\43\1\51\1\42\1\44\2\14\1\10"+
    "\2\14\1\26\1\0\1\27\7\0\1\1\32\0\1\4\337\0\1\4\177\0\13\4\35\0\2\1\5\0\1\4"+
    "\57\0\1\4\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\5"+
    "\1\1\1\7\1\10\1\11\2\5\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\1"+
    "\1\24\1\25\1\26\6\5\1\27\1\30\1\4\2\0"+
    "\1\5\1\0\1\31\1\0\1\32\1\0\1\33\1\34"+
    "\1\35\1\36\1\5\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\6\5\1\46\1\5\1\47\1\50\1\5"+
    "\1\31\1\0\1\51\6\5\1\52\2\5\1\53\1\54"+
    "\2\5\1\55\1\56\3\5\1\57\1\60\1\5\1\61"+
    "\6\5\1\62\2\5\1\63\1\5\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\142\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\61\0\u021b\0\u024c\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\61\0\61\0\u04fa\0\u052b\0\u055c"+
    "\0\u058d\0\u0188\0\61\0\u05be\0\u05ef\0\u0620\0\61\0\61"+
    "\0\u0157\0\u0157\0\u0651\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777"+
    "\0\u0157\0\u07a8\0\u052b\0\u055c\0\u07d9\0\u0188\0\u080a\0\u0157"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0157\0\u0961"+
    "\0\u0992\0\61\0\u0157\0\u09c3\0\u09f4\0\u0157\0\u0157\0\u0a25"+
    "\0\u0a56\0\u0a87\0\u0157\0\u0157\0\u0ab8\0\u0157\0\u0ae9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0157\0\u0c0f\0\u0c40\0\u0157"+
    "\0\u0c71\0\u0157";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\2\11"+
    "\2\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\2\11\1\37\1\40\1\41\2\11\1\42\1\43\3\11"+
    "\1\44\1\45\62\0\4\5\55\0\1\5\1\3\2\5"+
    "\61\0\1\46\1\47\1\46\1\50\1\0\1\46\53\0"+
    "\10\11\5\0\2\11\16\0\1\11\1\51\13\11\7\0"+
    "\1\10\1\0\1\10\2\0\2\10\52\0\10\11\5\0"+
    "\2\11\16\0\15\11\2\0\15\52\1\53\1\54\42\52"+
    "\17\0\1\55\1\56\12\0\1\57\60\0\1\60\32\0"+
    "\10\11\5\0\1\11\1\61\16\0\4\11\1\62\10\11"+
    "\7\0\10\11\5\0\2\11\16\0\10\11\1\63\4\11"+
    "\35\0\1\64\60\0\1\65\60\0\1\66\60\0\1\67"+
    "\60\0\1\70\60\0\1\71\60\0\1\72\32\0\10\11"+
    "\5\0\2\11\16\0\1\11\1\73\13\11\7\0\10\11"+
    "\5\0\1\11\1\74\16\0\6\11\1\75\6\11\7\0"+
    "\10\11\5\0\2\11\16\0\5\11\1\76\2\11\1\77"+
    "\4\11\7\0\10\11\5\0\1\11\1\100\16\0\15\11"+
    "\7\0\10\11\5\0\2\11\16\0\1\11\1\101\13\11"+
    "\7\0\10\11\5\0\2\11\16\0\10\11\1\102\4\11"+
    "\7\0\1\46\1\0\1\46\2\0\1\46\53\0\1\103"+
    "\1\0\1\103\56\0\3\104\1\0\3\104\31\0\3\104"+
    "\3\0\1\104\1\0\1\104\10\0\10\11\5\0\2\11"+
    "\16\0\3\11\1\105\11\11\2\0\15\52\1\106\1\54"+
    "\42\52\1\55\3\0\55\55\2\0\1\56\15\0\1\107"+
    "\1\56\44\0\10\11\5\0\2\11\16\0\1\110\14\11"+
    "\7\0\10\11\5\0\2\11\16\0\2\11\1\111\12\11"+
    "\7\0\10\11\5\0\2\11\16\0\13\11\1\112\1\11"+
    "\7\0\10\11\5\0\1\113\1\11\16\0\7\11\1\114"+
    "\5\11\7\0\10\11\5\0\2\11\16\0\6\11\1\115"+
    "\6\11\7\0\10\11\5\0\2\11\16\0\1\11\1\116"+
    "\13\11\7\0\10\11\5\0\2\11\16\0\13\11\1\117"+
    "\1\11\7\0\10\11\5\0\1\11\1\120\16\0\15\11"+
    "\7\0\10\11\5\0\2\11\16\0\5\11\1\121\7\11"+
    "\21\0\1\122\46\0\10\11\5\0\2\11\16\0\3\11"+
    "\1\123\11\11\7\0\10\11\5\0\1\124\1\11\16\0"+
    "\4\11\1\125\10\11\7\0\10\11\5\0\2\11\16\0"+
    "\4\11\1\126\10\11\7\0\10\11\5\0\2\11\16\0"+
    "\3\11\1\127\11\11\7\0\10\11\5\0\2\11\16\0"+
    "\7\11\1\130\5\11\7\0\10\11\5\0\2\11\16\0"+
    "\3\11\1\131\11\11\7\0\10\11\5\0\2\11\16\0"+
    "\1\132\14\11\7\0\10\11\5\0\2\11\16\0\14\11"+
    "\1\133\7\0\10\11\5\0\2\11\16\0\4\11\1\134"+
    "\10\11\7\0\10\11\5\0\2\11\16\0\10\11\1\135"+
    "\4\11\7\0\10\11\5\0\2\11\16\0\3\11\1\136"+
    "\11\11\7\0\10\11\5\0\2\11\16\0\5\11\1\137"+
    "\7\11\7\0\10\11\5\0\1\140\1\11\16\0\15\11"+
    "\7\0\10\11\5\0\2\11\16\0\1\11\1\141\13\11"+
    "\7\0\10\11\5\0\2\11\16\0\11\11\1\142\3\11"+
    "\7\0\10\11\5\0\1\11\1\143\16\0\15\11\7\0"+
    "\10\11\5\0\2\11\16\0\3\11\1\144\11\11\7\0"+
    "\10\11\5\0\2\11\16\0\12\11\1\145\2\11\7\0"+
    "\10\11\5\0\2\11\16\0\2\11\1\146\12\11\7\0"+
    "\10\11\5\0\2\11\16\0\5\11\1\147\7\11\7\0"+
    "\10\11\5\0\2\11\16\0\3\11\1\150\11\11\7\0"+
    "\10\11\5\0\2\11\16\0\11\11\1\151\3\11\7\0"+
    "\10\11\5\0\2\11\16\0\12\11\1\152\2\11\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3234];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\1\11\2\1\7\11\15\1\2\11"+
    "\1\1\2\0\1\1\1\0\1\11\1\0\1\1\1\0"+
    "\2\11\3\1\7\11\14\1\1\0\12\1\1\11\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MesonBuildLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MesonBuildLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 53: break;
          case 2: 
            { return NEWLINE;
            } 
            // fall through
          case 54: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 55: break;
          case 4: 
            { return OCTNUM;
            } 
            // fall through
          case 56: break;
          case 5: 
            { return ID;
            } 
            // fall through
          case 57: break;
          case 6: 
            { return DECNUM;
            } 
            // fall through
          case 58: break;
          case 7: 
            { return DIV_OP;
            } 
            // fall through
          case 59: break;
          case 8: 
            { return MULT_OP;
            } 
            // fall through
          case 60: break;
          case 9: 
            { return LANG_TOKEN_DOT;
            } 
            // fall through
          case 61: break;
          case 10: 
            { return BRACE_BEGIN;
            } 
            // fall through
          case 62: break;
          case 11: 
            { return BRACE_END;
            } 
            // fall through
          case 63: break;
          case 12: 
            { return CURLY_BRACE_BEGIN;
            } 
            // fall through
          case 64: break;
          case 13: 
            { return CURLY_BRACE_END;
            } 
            // fall through
          case 65: break;
          case 14: 
            { return PAREN_BEGIN;
            } 
            // fall through
          case 66: break;
          case 15: 
            { return PAREN_END;
            } 
            // fall through
          case 67: break;
          case 16: 
            { return COMMA;
            } 
            // fall through
          case 68: break;
          case 17: 
            { return ATR_OP;
            } 
            // fall through
          case 69: break;
          case 18: 
            { return COMP_OP4;
            } 
            // fall through
          case 70: break;
          case 19: 
            { return COMP_OP5;
            } 
            // fall through
          case 71: break;
          case 20: 
            { return MOD_OP;
            } 
            // fall through
          case 72: break;
          case 21: 
            { return PLUS_OP;
            } 
            // fall through
          case 73: break;
          case 22: 
            { return MINUS_OP;
            } 
            // fall through
          case 74: break;
          case 23: 
            { return LANG_TOKEN_QMARK;
            } 
            // fall through
          case 75: break;
          case 24: 
            { return LANG_TOKEN_COLON;
            } 
            // fall through
          case 76: break;
          case 25: 
            { return STRSIMPLE;
            } 
            // fall through
          case 77: break;
          case 26: 
            { return SINGLE_LINE_COMMENT;
            } 
            // fall through
          case 78: break;
          case 27: 
            { return COMP_ATR_OP2;
            } 
            // fall through
          case 79: break;
          case 28: 
            { return COMP_ATR_OP1;
            } 
            // fall through
          case 80: break;
          case 29: 
            { return IN_OP;
            } 
            // fall through
          case 81: break;
          case 30: 
            { return LANG_TOKEN_IF;
            } 
            // fall through
          case 82: break;
          case 31: 
            { return COMP_OP1;
            } 
            // fall through
          case 83: break;
          case 32: 
            { return COMP_OP2;
            } 
            // fall through
          case 84: break;
          case 33: 
            { return COMP_OP3;
            } 
            // fall through
          case 85: break;
          case 34: 
            { return COMP_OP6;
            } 
            // fall through
          case 86: break;
          case 35: 
            { return COMP_ATR_OP3;
            } 
            // fall through
          case 87: break;
          case 36: 
            { return COMP_ATR_OP4;
            } 
            // fall through
          case 88: break;
          case 37: 
            { return COMP_ATR_OP5;
            } 
            // fall through
          case 89: break;
          case 38: 
            { return LANG_TOKEN_OR;
            } 
            // fall through
          case 90: break;
          case 39: 
            { return BINNUM;
            } 
            // fall through
          case 91: break;
          case 40: 
            { return HEXNUM;
            } 
            // fall through
          case 92: break;
          case 41: 
            { return LANG_TOKEN_NOT;
            } 
            // fall through
          case 93: break;
          case 42: 
            { return LANG_TOKEN_AND;
            } 
            // fall through
          case 94: break;
          case 43: 
            { return MULTILINE_COMMENT;
            } 
            // fall through
          case 95: break;
          case 44: 
            { return BOOL_LITERAL_TRUE;
            } 
            // fall through
          case 96: break;
          case 45: 
            { return LANG_TOKEN_ELSE_IF;
            } 
            // fall through
          case 97: break;
          case 46: 
            { return LANG_TOKEN_ELSE;
            } 
            // fall through
          case 98: break;
          case 47: 
            { return LANG_TOKEN_JUMP_BREAK;
            } 
            // fall through
          case 99: break;
          case 48: 
            { return LANG_TOKEN_ENDIF;
            } 
            // fall through
          case 100: break;
          case 49: 
            { return BOOL_LITERAL_FALSE;
            } 
            // fall through
          case 101: break;
          case 50: 
            { return LANG_TOKEN_FOREACH;
            } 
            // fall through
          case 102: break;
          case 51: 
            { return LANG_TOKEN_JUMP_CONTINUE;
            } 
            // fall through
          case 103: break;
          case 52: 
            { return LANG_TOKEN_FOREACH_END;
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}