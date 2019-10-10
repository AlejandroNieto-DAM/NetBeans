/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesesdias;

/**
 *
 * @author alejandronieto
 */
public class Mesesdias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mes = 2;
        int anio = 2008;
        
        switch(mes){
            case 1: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 2: 
                if( (anio % 400 == 0 ) || (anio % 4 == 0 && anio % 100 != 0)){
                    System.out.println("El mes " + mes + " del año " + anio + " tiene 29 dias!");
                } else {
                    System.out.println("El mes " + mes + " del año " + anio + " tiene 28 dias!");
                }
                
                break;
                
            case 3: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 4: System.out.println("El mes " + mes + " del año " + anio + " tiene 30 dias!"); break;
            case 5: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 6: System.out.println("El mes " + mes + " del año " + anio + " tiene 30 dias!"); break;
            case 7: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 8: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 9: System.out.println("El mes " + mes + " del año " + anio + " tiene 30 dias!"); break;
            case 10: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            case 11: System.out.println("El mes " + mes + " del año " + anio + " tiene 30 dias!"); break;
            case 12: System.out.println("El mes " + mes + " del año " + anio + " tiene 31 dias!"); break;
            
        }
    }
    
}
