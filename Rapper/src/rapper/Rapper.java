/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapper;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandronieto
 */
public class Rapper {
    
    float fNumber = 0;
    float fResult = 0;
    
    public void setNumber(float fValue){
        fNumber = fValue;
    }
    
    public float getNumberDouble (){
        fResult = fNumber * 2;
        return fResult;
    }
    
    public float getNumberTriple (){
        fResult = fNumber * 3;
        return fResult;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rapper a = new Rapper();
        
        a.setNumber(5);
        
        System.out.println(a.getNumberDouble());
        System.out.println(a.getNumberTriple());
    }
    
}
