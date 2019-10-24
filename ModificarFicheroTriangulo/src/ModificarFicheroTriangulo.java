
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alejandronieto
 */
public class ModificarFicheroTriangulo {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File fichero = new File("FichData.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        ArrayList<Triangulo> triangulos = new ArrayList();
        triangulos.add(new Triangulo(1, 2, 3));
        triangulos.add(new Triangulo(5, 5, 5));
        triangulos.add(new Triangulo(15, 15, 15));
        

        StringBuffer buffer = null;
        
        for(int i = 0; i < triangulos.size(); i++){
            file.writeInt(i + 1);
            file.writeInt(triangulos.get(i).getLado1());
            file.writeInt(triangulos.get(i).getLado2());
            file.writeInt(triangulos.get(i).getLado3());
            
        }
        
        file.close();
        
        
        
    }
    
}
