
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package main;

import java.util.List;
import java.util.ArrayList;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\005\004\000\002\006" +
    "\005\000\002\010\004\000\002\010\003\000\002\007\005" +
    "\000\002\011\003\000\002\011\004\000\002\004\004\000" +
    "\002\004\003\000\002\003\004\000\002\003\003\000\002" +
    "\002\006\000\002\002\006\000\002\002\010\000\002\002" +
    "\005\000\002\002\005\000\002\002\004\000\002\002\005" +
    "\000\002\002\006\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\020\005\001\002\000\004\002\060\001" +
    "\002\000\004\017\051\001\002\000\022\004\013\005\016" +
    "\006\007\007\011\010\021\011\014\017\012\023\017\001" +
    "\002\000\004\012\042\001\002\000\024\002\ufff6\004\ufff6" +
    "\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\017\ufff6\023" +
    "\ufff6\001\002\000\004\016\041\001\002\000\020\004\013" +
    "\005\016\006\007\007\011\010\021\011\014\023\017\001" +
    "\002\000\004\012\035\001\002\000\004\012\032\001\002" +
    "\000\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010" +
    "\ufff8\011\ufff8\017\ufff8\023\ufff8\001\002\000\004\012\027" +
    "\001\002\000\024\002\uffed\004\uffed\005\uffed\006\uffed\007" +
    "\uffed\010\uffed\011\uffed\017\uffed\023\uffed\001\002\000\024" +
    "\002\000\004\013\005\016\006\007\007\011\010\021\011" +
    "\014\017\012\023\017\001\002\000\004\012\022\001\002" +
    "\000\006\012\023\016\024\001\002\000\004\016\025\001" +
    "\002\000\024\002\uffef\004\uffef\005\uffef\006\uffef\007\uffef" +
    "\010\uffef\011\uffef\017\uffef\023\uffef\001\002\000\024\002" +
    "\uffee\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\011\uffee" +
    "\017\uffee\023\uffee\001\002\000\024\002\ufff9\004\ufff9\005" +
    "\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\017\ufff9\023\ufff9" +
    "\001\002\000\004\012\030\001\002\000\004\013\031\001" +
    "\002\000\024\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\011\ufff4\017\ufff4\023\ufff4\001\002\000\006\013" +
    "\034\016\033\001\002\000\024\002\ufff2\004\ufff2\005\ufff2" +
    "\006\ufff2\007\ufff2\010\ufff2\011\ufff2\017\ufff2\023\ufff2\001" +
    "\002\000\024\002\ufff1\004\ufff1\005\ufff1\006\ufff1\007\ufff1" +
    "\010\ufff1\011\ufff1\017\ufff1\023\ufff1\001\002\000\004\012" +
    "\036\001\002\000\004\012\037\001\002\000\024\002\ufff5" +
    "\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\017" +
    "\ufff5\023\ufff5\001\002\000\024\002\ufff7\004\ufff7\005\ufff7" +
    "\006\ufff7\007\ufff7\010\ufff7\011\ufff7\017\ufff7\023\ufff7\001" +
    "\002\000\024\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0" +
    "\010\ufff0\011\ufff0\017\ufff0\023\ufff0\001\002\000\004\013" +
    "\043\001\002\000\004\014\044\001\002\000\004\012\045" +
    "\001\002\000\004\015\046\001\002\000\024\002\ufff3\004" +
    "\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\017\ufff3" +
    "\023\ufff3\001\002\000\006\017\ufffd\021\ufffd\001\002\000" +
    "\006\017\051\021\057\001\002\000\004\022\052\001\002" +
    "\000\004\013\054\001\002\000\010\013\055\017\ufffc\021" +
    "\ufffc\001\002\000\010\013\ufffb\017\ufffb\021\ufffb\001\002" +
    "\000\010\013\ufffa\017\ufffa\021\ufffa\001\002\000\006\017" +
    "\ufffe\021\ufffe\001\002\000\022\004\uffff\005\uffff\006\uffff" +
    "\007\uffff\010\uffff\011\uffff\017\uffff\023\uffff\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\005\003\006\005\001\001\000\002\001" +
    "\001\000\006\007\046\010\047\001\001\000\010\002\007" +
    "\003\014\004\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\002\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\002\007\003\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\055\001\001\000\002\001\001\000\004" +
    "\011\052\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}







/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= data_section instructionList 
            {
              Object RESULT =null;
		 RESULT = Integer.valueOf(666); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // data_section ::= DOT_DATA var_declaration_list DOT_TEXT 
            {
              Object RESULT =null;
		 RESULT = Integer.valueOf(2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("data_section",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // var_declaration_list ::= var_declaration_list var_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration_list",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // var_declaration_list ::= var_declaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration_list",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // var_declaration ::= LABEL_DEF DATA_TYPE immediate_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // immediate_list ::= IMMEDIATE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("immediate_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // immediate_list ::= immediate_list IMMEDIATE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("immediate_list",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instructionList ::= instructionList labeled_instruction 
            {
              Object RESULT =null;
		 RESULT = "nose"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructionList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instructionList ::= labeled_instruction 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructionList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // labeled_instruction ::= LABEL_DEF instruction 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("labeled_instruction",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // labeled_instruction ::= instruction 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("labeled_instruction",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // instruction ::= ROPCODE REGISTER REGISTER REGISTER 
            {
              Object RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object opcode = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rdright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object rd = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // instruction ::= IOPCODE REGISTER REGISTER IMMEDIATE 
            {
              Object RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object opcode = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // instruction ::= IMOPCODE REGISTER IMMEDIATE OBRACKET REGISTER CBRACKET 
            {
              Object RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object opcode = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // instruction ::= LALIOPCODE REGISTER LABEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // instruction ::= LALIOPCODE REGISTER IMMEDIATE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // instruction ::= JOPCODE LABEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // instruction ::= PSOPCODE REGISTER LABEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // instruction ::= PSOPCODE REGISTER REGISTER LABEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // instruction ::= SYSCALL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
