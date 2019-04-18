//------------------>1era area<--------------------------    

package backend.analizadorInstrucciones;
import java_cup.runtime.*;
import static backend.analizadorInstrucciones.sym.*;


%% //------------------>2da area<--------------------------    

%public
%class AnalizadorInstrucciones
%cup
%cupdebug
%unicode
%line
%column


Salto = \r|\n|\r\n
Espacio = {Salto} | [ \t\f]
Identificador = [:]([:jletterdigit:] | [-] | [_] | [$] )+
Digitos= 0|[1-9][:digit:]*

%{
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

%}


%% //------------------>3er area<--------------------------    
 <YYINITIAL>  {

    {Identificador} {return symbol(IDENTIFICADOR,yytext());}

    {Digitos}	{return symbol(NUMERO,yytext());}				
	
    "="    {return symbol(IGUAL,yytext());}

    "+"    {return symbol(MAS,yytext());}

    "-"    {return symbol(MENOS,yytext());}

    "*"    {return symbol(POR,yytext());}

    "/"    {return symbol(DIV,yytext());}

   "("    {return symbol(PARENTESIS_ABIERTO,yytext());}

   ")"    {return symbol(PARENTESIS_CERRADO,yytext());}

   //"["~"]" {return symbol(FORMATO_PASSWORD,yytext());}


{Espacio} 	{/*IGNORAMOS*/}
}

//<<EOF>>                 { return symbol(EOF);

[^]     {/*Ignoramos System.out.println("Error:"+yytext());*/}
