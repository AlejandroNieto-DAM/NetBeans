
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
public class Amigo_Model extends ConnectToBD{
    
    private String query;
     
    Amigo_Model(){
        
        super();
       
    }
    
    public void setQuery(String query){
        this.query = query;
    }
    
    public String getQuery(){
        return this.query;
    }
    
    public void viewTable(Connection con, String dbName, String query, ArrayList<Amigo> amigos) throws SQLException {

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String login = rs.getString("login_orig");
                String login2 = rs.getString("login_des");
                Boolean request = rs.getBoolean("accept_request");
           

                Amigo auxiliar = new Amigo();

                auxiliar.setLogin_orig(login);
                auxiliar.setLogin_des(login2);
                auxiliar.setAccept_request(request);

                amigos.add(auxiliar);


            }
        } catch (SQLException e ) {
            System.out.println(e);
        }
    } 

    public void getUsuarios(ArrayList<Amigo> amigos){
        
        this.setQuery( "select login_orig, login_des, accept_request " + "from " + this.getDBName() + ".amigo"); 
        
        try {
            this.viewTable(this.getConnector(), this.getDBName(), this.getQuery(), amigos);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    } 
    
}
