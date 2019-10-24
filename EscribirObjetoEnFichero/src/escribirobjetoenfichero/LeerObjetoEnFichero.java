/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirobjetoenfichero;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

/**
 *
 * @author alejandronieto
 */
public class LeerObjetoEnFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Persona persona; // defino la variable persona
        File fichero = new File("FichPersona.dat");
        ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));

        int i = 1;
        try {
            
            while (true) { // lectura del fichero
                persona = (Persona) dataIS.readObject(); // leer una Persona
                System.out.print(i + "=>");
                i++;
                System.out.println("Nombre: " + persona.getNombre() + " Altura: " + persona.getAltura() + " Peso: " + persona.getPeso()
                                    + " Edad: " + persona.getEdad());
            }
            
        } catch (EOFException eo) {
                System.out.println("FIN DE LECTURA.");
        } catch (StreamCorruptedException x) {
        }

        dataIS.close(); // cerrar stream de entrada
    }
    
}
