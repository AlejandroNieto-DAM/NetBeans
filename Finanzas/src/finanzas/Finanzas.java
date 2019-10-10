/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandronieto
 */
public class Finanzas {
    
    float fValorDolar = 0;
    float fDinero = 0;
    float fCambio = 0;
    
    
    Finanzas(){
        fValorDolar = (float) 1.38;
    }
    
    Finanzas(float fNuevoValor){
        fValorDolar = fNuevoValor;
    }
    
    public float cambioEurosDolares(float fDinero){
                
        fCambio = fValorDolar * fDinero;
        
        return fCambio;
    }
    
    public float cambioDolaresEuros(float fDinero){
                
        fCambio = fDinero / fValorDolar  ;
        
        return fCambio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Finanzas a = new Finanzas();


        System.out.println(a.cambioDolaresEuros(1000));
        System.out.println(a.cambioEurosDolares(1000));

        Finanzas b = new Finanzas((float) 2.34);
        System.out.println(b.cambioDolaresEuros(1000));
        System.out.println(b.cambioEurosDolares(1000));
        
        
        
    }
    
  
}
