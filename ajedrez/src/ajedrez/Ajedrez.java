/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author alejandronieto
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 1;
        int y = 3;
        
        int abs1 = 0;
        int abs2 = 0;
        
        
        
        
        String cadena = "";
        
        for(int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
                
                abs1 = Math.abs(x - i);
                abs2 = Math.abs(y - j);
                
                if((x != i || y != j) && (abs1 != abs2)){
                    if(i % 2 == 0){
                        if(j % 2 == 0){
                            cadena = cadena + "B";
                        } else {
                            cadena = cadena + "N";
                        }
                    } else {
                        if(j % 2 == 0){
                            cadena = cadena + "N";
                        } else {
                            cadena = cadena + "B";
                        }
                    }
                } else if((abs1 == abs2)){
                    cadena = cadena + "*";
                }  
                
            }
            
            
            System.out.println(cadena);
            
            cadena = "";
        }
    }
    
}
