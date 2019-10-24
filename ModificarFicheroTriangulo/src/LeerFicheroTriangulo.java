
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class LeerFicheroTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File(args [0]);
        
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        
        int id, lado1, lado2, lado3;
        
        int posicion = 0;
        
        for(posicion = 0; !(file.getFilePointer() == file.length()); posicion = posicion + 16){
            
            file.seek(posicion);
            id = file.readInt();
                        
            lado1 = file.readInt();
            lado2 = file.readInt();
            lado3 = file.readInt();
            
            
            if(id > 0)
                System.out.println("ID: " + id + " Lado1: " + lado1 + " Lado2: " + lado2 + " Lado3: " + lado3);
            
            
        }
        
        file.close();
        
    }
    
}
