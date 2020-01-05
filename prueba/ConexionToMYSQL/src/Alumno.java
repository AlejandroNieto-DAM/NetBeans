
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private String sDNI = "";
    private String sNom_Alum = "";
    ArrayList<Alumno> alAlumnos = new ArrayList<Alumno>();
    
    private ConectorBD a = new ConectorBD();
    
    private String query = "select DNI, nom_alum " +
                   "from " + a.getDBName() + ".alumnos";

    
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
    
    public void connectToBD(){
        
        try {
            a.viewTable(a.getConnector(), a.getDBName(), query, alAlumnos);
        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    } 
    
    public void printAlumnos(){
        
        this.connectToBD();
        
        for(int i = 0; i < alAlumnos.size(); i++){
            System.out.println(alAlumnos.get(i).getDNI() + "\t" + alAlumnos.get(i).getNomAlum());
        }
        
    }
    
}
