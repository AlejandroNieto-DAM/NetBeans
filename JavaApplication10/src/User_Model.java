
import java.sql.Connection;
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
public class User_Model extends ConnectToBD{
    
    private String query;
     
    User_Model(){
        
        super();
       
    }
    
    public void setQuery(String query){
        this.query = query;
    }
    
    public String getQuery(){
        return this.query;
    }
    
    public void viewTable(Connection con, String dbName, String query, ArrayList<User> usuarios) throws SQLException {

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String login = rs.getString("id_user");
                String passwd = rs.getString("password");
                String nombre = rs.getString("name");
           

                User auxiliar = new User();

                auxiliar.setLogin(login);
                auxiliar.setNombreUsuario(nombre);
                auxiliar.setPasswd(passwd);

                usuarios.add(auxiliar);


            }
        } catch (SQLException e ) {
            System.out.println(e);
        }
    } 

    public void getUsuariosLoginPasswd(ArrayList<User> usuarios){
        
        this.setQuery( "select id_user, name, password " + "from " + this.getDBName() + ".user"); 
        
        try {
            this.viewTable(this.getConnector(), this.getDBName(), this.getQuery(), usuarios);
        } catch (SQLException ex) {
            Logger.getLogger(User_Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    } 
}
