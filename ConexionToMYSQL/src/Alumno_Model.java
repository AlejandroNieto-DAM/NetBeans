
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Alumno_Model extends ConectorBD {
         
    private String query;
     
    Alumno_Model(){
        
        super();
       
    }
    
    public void setQuery(String query){
        this.query = query;
    }
    
    public String getQuery(){
        return this.query;
    }
    
    public void viewTable(Connection con, String dbName, String query, ArrayList<Alumno> alumnos) throws SQLException {
        
        Statement stmt = con.createStatement();

        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String dni = rs.getString("DNI");
                String nombre = rs.getString("nom_alum");

                Alumno auxiliar = new Alumno();

                auxiliar.setDNI(dni);
                auxiliar.setNomAlum(nombre);

                alumnos.add(auxiliar);


            }
        } catch (SQLException e ) {
            System.out.println(e);
            
        } finally {
            
            if(stmt != null) { stmt.close(); }
            
        }
        
        
    } 

    public void getAlumnos(ArrayList<Alumno> alAlumnos){
        
        this.setQuery( "select DNI, nom_alum " + "from " + this.getDBName() + ".alumnos"); 
        
        try {
            this.viewTable(this.getConnector(), this.getDBName(), this.getQuery(), alAlumnos);
        } catch (SQLException ex) {
            Logger.getLogger(Alumno_Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public void setAlumno(){
        
        try{
         
          String query = " insert into alumnos (DNI, nom_alum)"
            + " values (?, ?)";

          PreparedStatement preparedStmt = this.getConnector().prepareStatement(query);
          preparedStmt.setString (1, "123456789");
          preparedStmt.setString (2, "Carlos Artista");
            
          preparedStmt.execute();

          this.getConnector().close();
        }
        catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
    }
   
}
