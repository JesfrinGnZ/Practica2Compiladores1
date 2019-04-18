/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.run;

import backend.analizadorInstrucciones.AnalizadorInstrucciones;
import backend.analizadorInstrucciones.parser;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class Run {

    public static HashMap<String, Integer> variablesPrograma = new HashMap<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String instruccion="(2*3+4*:id1-4+2*4-7/:id5+8*3/:id2)+(4-2)";

        variablesPrograma.put(":id1", 2);
        variablesPrograma.put(":id2", 3);
        variablesPrograma.put(":id3", 4);
        variablesPrograma.put(":id4", 5);
        String instruccion = ":id1+:id5";
        AnalizadorInstrucciones lex = new AnalizadorInstrucciones(new BufferedReader(new StringReader(instruccion)));
        parser sintactico = new parser(lex);
        try {
            sintactico.parse();
        } catch (Exception ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }


        //Hash map-->Clave,valor
        HashMap<String, Integer> variables = new HashMap<>();
        variables.put("variable1", 25);
        //System.out.println(variables.get("variable1"));//Devuelve nul si no la encuentra,devuelve el valor si la encuentra
        if (variables.get("variable1") != null) {
            System.out.println("Ya existe esa variable");
        }

//        System.out.println(variables.get("variable1"));//Devuelve nul si no la encuentra,devuelve el valor si la encuentra
    }

}
