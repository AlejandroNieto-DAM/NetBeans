/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Alumno {
    
    
    private String sDNI;
    private String sNom_Alum;
    
    Alumno(){
        sDNI = "";
        sNom_Alum = "";
    }
    
    public void setDNI(String dni){
        sDNI = dni;
    }
    
    public void setNomAlum(String nombre){
        sNom_Alum = nombre;
    }
    
    public String getDNI(){
        return sDNI;
    }
    
    public String getNomAlum(){
        return sNom_Alum;
    }
    
    public void printAlumno(){
        System.out.println(this.getDNI() + "\t" + this.getNomAlum());
    }
}
