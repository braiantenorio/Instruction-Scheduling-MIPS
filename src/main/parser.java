
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
    "\000\026\000\002\002\004\000\002\002\004\000\002\003" +
    "\005\000\002\005\004\000\002\005\003\000\002\004\005" +
    "\000\002\006\003\000\002\006\004\000\002\007\004\000" +
    "\002\007\003\000\002\010\003\000\002\010\003\000\002" +
    "\011\006\000\002\011\006\000\002\011\010\000\002\011" +
    "\005\000\002\011\005\000\002\011\004\000\002\011\004" +
    "\000\002\011\005\000\002\011\006\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\020\005\001\002\000\004\002\060\001" +
    "\002\000\004\017\051\001\002\000\022\004\014\005\017" +
    "\006\007\007\012\010\021\011\015\017\013\023\020\001" +
    "\002\000\004\012\042\001\002\000\024\002\ufff7\004\ufff7" +
    "\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\017\ufff7\023" +
    "\ufff7\001\002\000\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\010\ufff8\011\ufff8\017\ufff8\023\ufff8\001\002\000" +
    "\006\012\041\016\040\001\002\000\024\002\ufff6\004\ufff6" +
    "\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\017\ufff6\023" +
    "\ufff6\001\002\000\004\012\035\001\002\000\004\012\032" +
    "\001\002\000\024\002\000\004\014\005\017\006\007\007" +
    "\012\010\021\011\015\017\013\023\020\001\002\000\004" +
    "\012\026\001\002\000\024\002\uffec\004\uffec\005\uffec\006" +
    "\uffec\007\uffec\010\uffec\011\uffec\017\uffec\023\uffec\001\002" +
    "\000\004\012\022\001\002\000\006\012\024\016\023\001" +
    "\002\000\024\002\uffee\004\uffee\005\uffee\006\uffee\007\uffee" +
    "\010\uffee\011\uffee\017\uffee\023\uffee\001\002\000\004\016" +
    "\025\001\002\000\024\002\uffed\004\uffed\005\uffed\006\uffed" +
    "\007\uffed\010\uffed\011\uffed\017\uffed\023\uffed\001\002\000" +
    "\004\012\027\001\002\000\004\013\030\001\002\000\024" +
    "\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011" +
    "\ufff4\017\ufff4\023\ufff4\001\002\000\024\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\017\ufff9\023" +
    "\ufff9\001\002\000\006\013\034\016\033\001\002\000\024" +
    "\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\011" +
    "\ufff2\017\ufff2\023\ufff2\001\002\000\024\002\ufff1\004\ufff1" +
    "\005\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1\017\ufff1\023" +
    "\ufff1\001\002\000\004\012\036\001\002\000\004\012\037" +
    "\001\002\000\024\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007" +
    "\ufff5\010\ufff5\011\ufff5\017\ufff5\023\ufff5\001\002\000\024" +
    "\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011" +
    "\ufff0\017\ufff0\023\ufff0\001\002\000\024\002\uffef\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef\017\uffef\023" +
    "\uffef\001\002\000\004\013\043\001\002\000\004\014\044" +
    "\001\002\000\004\012\045\001\002\000\004\015\046\001" +
    "\002\000\024\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\011\ufff3\017\ufff3\023\ufff3\001\002\000\006\017" +
    "\ufffd\021\ufffd\001\002\000\006\017\051\021\057\001\002" +
    "\000\004\022\052\001\002\000\004\013\054\001\002\000" +
    "\010\013\055\017\ufffc\021\ufffc\001\002\000\010\013\ufffb" +
    "\017\ufffb\021\ufffb\001\002\000\010\013\ufffa\017\ufffa\021" +
    "\ufffa\001\002\000\006\017\ufffe\021\ufffe\001\002\000\022" +
    "\004\uffff\005\uffff\006\uffff\007\uffff\010\uffff\011\uffff\017" +
    "\uffff\023\uffff\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\006\004\046\005\047\001\001\000\010\007\015" +
    "\010\010\011\007\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\030\011" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\055\001\001\000\002\001\001\000\004\006\052" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

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




        List Program = new ArrayList();
        List immediates = new ArrayList();
        List instructionsList = new ArrayList();
        List varDeclarationList = new ArrayList();



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
		List<Line> start_val = (List<Line>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= data_section instructions_and_label_defs 
            {
              List<Line> RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Line> d = (List<Line>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<Line> i = (List<Line>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        List finalProgram = new ArrayList();
                        finalProgram.add(d);
                        finalProgram.add(i);
                        RESULT = finalProgram; 
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // data_section ::= DOT_DATA var_declaration_list DOT_TEXT 
            {
              List<Line> RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Line> v = (List<Line>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		      
									List<Line> data = new ArrayList();
									data.add(new Line(".data"));
									data.addAll(v);
									data.add(new Line(".text"));
									RESULT = data;
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("data_section",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // var_declaration_list ::= var_declaration_list var_declaration 
            {
              List<Line> RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Line v = (Line)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
									varDeclarationList.add(v);
									RESULT = varDeclarationList;
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // var_declaration_list ::= var_declaration 
            {
              List<Line> RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Line v = (Line)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
									varDeclarationList.add(v);
									RESULT = varDeclarationList;
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // var_declaration ::= LABEL_DEF DATA_TYPE immediate_list 
            {
              Line RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> i = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                                String inm = "";
                                for(String s: i){
                                        inm += String.format("%s, ", s);
                                } 
                                inm = inm.substring(0, inm.length() - 2);

                                RESULT = new Line(String.format("%s %s %s", l, d, inm));
                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_declaration",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // immediate_list ::= IMMEDIATE 
            {
              List<String> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                                immediates.add(i);
                                RESULT = immediates;
                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("immediate_list",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // immediate_list ::= immediate_list IMMEDIATE 
            {
              List<String> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                                immediates.add(i);
                                RESULT = immediates;
                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("immediate_list",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instructions_and_label_defs ::= instructions_and_label_defs instruction_or_label_def 
            {
              List<Line> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Line i = (Line)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        instructionsList.add(i);
                        RESULT = instructionsList;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructions_and_label_defs",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instructions_and_label_defs ::= instruction_or_label_def 
            {
              List<Line> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Line i = (Line)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        instructionsList.add(i);
                        RESULT = instructionsList;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instructions_and_label_defs",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // instruction_or_label_def ::= instruction 
            {
              Line RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Line i = (Line)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        RESULT = i;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction_or_label_def",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // instruction_or_label_def ::= LABEL_DEF 
            {
              Line RESULT =null;
		int lableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int labright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String lab = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                         RESULT = new LabelDef(String.format("%s", lab));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction_or_label_def",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // instruction ::= ROPCODE REGISTER REGISTER REGISTER 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rdright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String rd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String rt = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        Instruction ins = new Instruction(String.format("%s %s, %s, %s", opcode, rd, rs, rt), opcode);
                        ins.addWriteRegister(rd);
                        ins.addReadRegister(rs);
                        ins.addReadRegister(rt);
                        RESULT = ins;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // instruction ::= IOPCODE REGISTER REGISTER IMMEDIATE 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String rt = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int immdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int immdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String immd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        Instruction ins = new Instruction(String.format("%s %s, %s, %s", opcode, rt, rs, immd), opcode);
                        ins.addWriteRegister(rt);
                        ins.addReadRegister(rs);
                        RESULT = ins;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // instruction ::= IMOPCODE REGISTER IMMEDIATE OBRACKET REGISTER CBRACKET 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String rt = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int immdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int immdright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String immd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		      
                        Instruction ins = new Instruction(String.format("%s %s, %s(%s)", opcode, rt, immd, rs), opcode);
                        ins.addWriteRegister(rt);
                        ins.addReadRegister(rs);
                        RESULT = ins;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // instruction ::= LALIOPCODE REGISTER LABEL 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rdright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int labright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String lab = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        Instruction ins = new Instruction(String.format("%s %s, %s", opcode, rd, lab), opcode);
                        ins.addWriteRegister(rd);
                        // aca no puse label como que lo lee, creo que esta bien xd
                        RESULT = ins;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // instruction ::= LALIOPCODE REGISTER IMMEDIATE 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rdright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int immdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int immdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String immd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		      
                        Instruction ins = new Instruction(String.format("%s %s, %s", opcode, rd, immd), opcode);
                        ins.addWriteRegister(rd);
                        RESULT = ins;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // instruction ::= JOPCODE LABEL 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int labright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String lab = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        RESULT = new JumpInstruction(String.format("%s %s", opcode, lab));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // instruction ::= JOPCODE REGISTER 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        RESULT = new JumpInstruction(String.format("%s %s", opcode, rs));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // instruction ::= PSOPCODE REGISTER LABEL 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int labright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String lab = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        RESULT = new JumpInstruction(String.format("%s %s, %s", opcode, rs, lab));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // instruction ::= PSOPCODE REGISTER REGISTER LABEL 
            {
              Line RESULT =null;
		int opcodeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int opcoderight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String opcode = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String rs = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String rt = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lableft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int labright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String lab = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        RESULT = new JumpInstruction(String.format("%s %s, %s, %s", opcode, rs, rt, lab));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // instruction ::= SYSCALL 
            {
              Line RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        RESULT = new JumpInstruction(String.format("%s",s));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruction",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
