/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerpalabraenfichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alejandronieto
 */
public class LeerPalabraEnFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Indicar por favor el nombre del fichero!");
        }
        
        String nomFich = args[0];
        
        
        String palabra = args[1];
        String words[] = null;
        int col = 0;
        int fil = 0;
        
        try(BufferedReader fbr = new BufferedReader(new FileReader(nomFich))){
            
            String linea = fbr.readLine();
            int i = 0;
            
            while(linea != null){
                i++;
              
                if(linea.contains(palabra)){
                    col = linea.indexOf(palabra);
                    fil = i;
                }

                linea = fbr.readLine();    
            }
            
            System.out.println("Se encuentra en la columna: " + col + " y fila: " + i);
            
           
            
            
            
        } catch (FileNotFoundException e){
            System.out.println("No existe fichero " + nomFich);
        } catch (IOException e){
            System.out.println("Error de E/S " + e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
        
       
    }
    
}
