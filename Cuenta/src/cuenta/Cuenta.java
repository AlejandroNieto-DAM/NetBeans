/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author alejandronieto
 */
public class Cuenta {
    
    private String sTitular = "";
    private double dCantidad = 0.0;
    
    Cuenta(String titular){
        this.setTitular(titular);
    }
    
    Cuenta(String titular, double cantidad){
        this.setTitular(titular);
        this.setCantidad(cantidad);
    }
    
    public void setTitular(String titular){
        sTitular = titular;
    }
    
    public void setCantidad(double cantidad){
        dCantidad = cantidad;
    }
    
    public String getTitular(){
        return sTitular;
    }
    
    public double getCantidad(){
        return dCantidad;
    }
    
    public void ingresar(double cantidad){
        
        if(cantidad > 0){
            this.setCantidad(dCantidad += cantidad);
            System.out.println("El ingreso se ha realizado con exito " + this.getTitular() + ". Su saldo actual es: " + dCantidad);
        }
    }
    
    public void retirar(double cantidad){
        
        if(cantidad > this.getCantidad()){
            System.out.println(this.getTitular() + " no hay dinero suficiente su saldo actual es: " + dCantidad);
        } else {
            this.setCantidad(dCantidad -= cantidad);
            System.out.println("La cantidad se ha retirado existosamente " + this.getTitular() + ". Su saldo actual es: " + dCantidad);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta a = new Cuenta("Antonio");
        
        System.out.println(a.getTitular());
        System.out.println(a.getCantidad());
        
        a.ingresar(100);
        a.retirar(200);
        
        
        Cuenta b = new Cuenta("Carlos", 15000.0);
        
        System.out.println(b.getTitular());
        System.out.println(b.getCantidad());
        
        b.retirar(100);
        b.ingresar(100);
      
        String letras = "oihgdjfk";
        
    }
    
}
