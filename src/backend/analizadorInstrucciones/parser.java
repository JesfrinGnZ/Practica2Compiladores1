
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package backend.analizadorInstrucciones;

import java_cup.runtime.*;
import backend.run.Run;
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
    "\000\012\000\002\002\004\000\002\002\005\000\002\002" +
    "\005\000\002\002\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\010\004\005\005\004\013\011\001\002\000" +
    "\016\002\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\014\ufff9" +
    "\001\002\000\016\002\ufffa\007\ufffa\010\ufffa\011\ufffa\012" +
    "\ufffa\014\ufffa\001\002\000\016\002\ufffe\007\ufffe\010\ufffe" +
    "\011\020\012\017\014\ufffe\001\002\000\016\002\ufffb\007" +
    "\ufffb\010\ufffb\011\ufffb\012\ufffb\014\ufffb\001\002\000\010" +
    "\002\024\007\013\010\014\001\002\000\010\004\005\005" +
    "\004\013\011\001\002\000\010\007\013\010\014\014\015" +
    "\001\002\000\010\004\005\005\004\013\011\001\002\000" +
    "\010\004\005\005\004\013\011\001\002\000\016\002\ufff8" +
    "\007\ufff8\010\ufff8\011\ufff8\012\ufff8\014\ufff8\001\002\000" +
    "\016\002\uffff\007\uffff\010\uffff\011\020\012\017\014\uffff" +
    "\001\002\000\010\004\005\005\004\013\011\001\002\000" +
    "\010\004\005\005\004\013\011\001\002\000\016\002\ufffd" +
    "\007\ufffd\010\ufffd\011\ufffd\012\ufffd\014\ufffd\001\002\000" +
    "\016\002\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\014\ufffc" +
    "\001\002\000\016\002\000\007\000\010\000\011\020\012" +
    "\017\014\000\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\010\002\007\003\005\004\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\002\011\003\005\004" +
    "\006\001\001\000\002\001\001\000\006\003\022\004\006" +
    "\001\001\000\006\003\015\004\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\021\001\001\000\004" +
    "\004\020\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

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





    // Connect this parser to a scanner!
    public parser(AnalizadorInstrucciones lex) {
	super(lex);

    }

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s){        
        System.out.println("ERROR SINTACTICO LOGIN"+s.value.toString());
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{        
        System.out.println("ERROR SINTACTICO LOGIN"+s.value.toString());
    }

    public Double operarElementos(Double num1,Double num2,char tipoDeOperacion){
        switch(tipoDeOperacion){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
        }
    return 0.0;
    }
    
    public Integer buscarValorDeIdentificador(String id){
        Integer valor =Run.variablesPrograma.get(id);
        if (valor == null){
            System.out.println("ERROR NO EXISTE LA VARIABLE");
            return 0;
        }
        return valor;
    }




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
          case 0: // $START ::= e EOF 
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
          case 1: // e ::= e MAS t 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'+');System.out.println("El resultado es:"+operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'+'));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // e ::= e MENOS t 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'-');System.out.println("El resultado es:"+operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'-'));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // e ::= t 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=i;System.out.println("Valor en t:"+i);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // t ::= t POR f 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'*');System.out.println("El resultado es:"+operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'*'));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("t",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // t ::= t DIV f 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'/');System.out.println("El resultado es:"+operarElementos(Double.valueOf(i.toString()),Double.valueOf(e.toString()),'/'));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("t",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // t ::= f 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=i;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("t",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // f ::= IDENTIFICADOR 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=buscarValorDeIdentificador(i.toString());System.out.println("IDENTIFICADOR:"+i);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // f ::= NUMERO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=i;System.out.println("NUMERO:"+i);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // f ::= PARENTESIS_ABIERTO e PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=i;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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