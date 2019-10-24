/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirobjetoenfichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alejandronieto
 */
public class EscribirObjetoEnFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona("Antonio", 1.74, 70, 19));
        personas.add(new Persona("Paquita", 1.60, 55, 19));
        personas.add(new Persona("Raul", 1.7, 60, 19));
   
        File fichero = new File("FichPersona.dat");
        FileOutputStream fileout = new FileOutputStream(fichero,true);  
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);  

        
        for (int i=0;i < personas.size(); i++){ //recorro los arrays    
	  
            dataOS.writeObject(personas.get(i)); //escribo la persona en el fichero
            System.out.println("GRABO LOS DATOS DE PERSONA.");  
               
        }     
        
        dataOS.close();  //cerrar stream de salida    
  
    }
    
}
