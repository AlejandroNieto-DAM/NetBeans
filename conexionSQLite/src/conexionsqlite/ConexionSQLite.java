/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author alejandronieto
 */
public class ConexionSQLite extends ConnectToBD {

    private String query;
    
    public void datosDB() throws SQLException{
        
        query =  "select * " + "from coches"; 
        
        try (Statement stmt = this.getConnector().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String login = rs.getString("matricula");
                String passwd = rs.getString("marca");
                
                System.out.println("Yeyo en mi matricula --> " + login);
                System.out.println("Yeyo en mi marca --> " + passwd);
                
                
                

            }
        } catch (SQLException e ) {
            
        }
        this.getConnector().close();
    }
    
    public void insertarCoche(){
         try{
         
          String query = " insert into coches (matricula, marca)"
            + " values (?, ?)";
          
          Scanner myObj = new Scanner(System.in);
          
          String matricula = myObj.nextLine();
          String marca = myObj.nextLine();

          PreparedStatement preparedStmt = this.getConnector().prepareStatement(query);
          
          preparedStmt.setString (1, matricula);
          preparedStmt.setString (2, marca);
          
          preparedStmt.execute();
          

          this.getConnector().close();
             System.out.println("yeyo en iphone yeye");
          
        }
        catch (Exception e){
            System.out.println("Excepcion de feooooos!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ConexionSQLite antonio = new ConexionSQLite();
        antonio.insertarCoche();
        antonio.datosDB();
    }
    
}
