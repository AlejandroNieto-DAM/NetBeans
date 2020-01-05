
import java.sql.Connection;
import java.sql.DriverManager;
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
public class ConectorBD {
 
    private String conector = "jdbc";
    private String port = "3306";
    private String ip = "localhost";
    private String dbName = "insti";
    private String database = "mysql";
    
    private String user = "root";
    private String passwd = "cristorey";
    
    
    //******** SETS ********//
    
    public void setConector(String conector){
        this.conector = conector;
    }
    
    public void setPort(String port){
        this.port = port;
    }
    
    public void setIP(String ip){
        this.ip = ip;
    }
    
    public void setDBName(String dbname){
        this.dbName = dbname;
    }
    
    public void setDatabase(String database){
        this.database = database;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPasswd(String passwd){
        this.passwd = passwd;
    }
    
    
    //******** GETS ********//
    
    public String getConectorName(){
        return conector;
    }
    
    public String getPort(){
        return port;
    }
    
    public String getIP(){
        return ip;
    }
    
    public String getDBName(){
        return dbName;
    }
    
    public String getDataBase(){
        return database;
    }
    
    public String getDBUser(){
        return user;
    }
    
    public String getDBPasswd(){
        return passwd;
    }
    
    
    
    public Connection getConnector() throws SQLException{
        
        Connection con = DriverManager.getConnection(conector + ":" + database + "://" + ip + ":" + port + "/" + dbName,user, passwd);

        return con;
        
    }
    
    public static void viewTable(Connection con, String dbName, String query, ArrayList alumnos) throws SQLException {

        Statement stmt = null;

        try {
            stmt = con.createStatement();
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
            if (stmt != null) { stmt.close(); }
        }
    }   
}
