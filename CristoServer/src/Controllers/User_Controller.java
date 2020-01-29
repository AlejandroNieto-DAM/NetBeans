package Controllers;


import Classes.User;
import Models.User_Model;
import cristoserver.CristoServer;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class User_Controller {
    
    User_Model a;
     
    public User_Controller(){
        a = new User_Model();
    }
       
    
    public void getUsuarios(ArrayList<User> usuarios){
        CristoServer.debug("Debug: getUsuarios");
        a.getUsuariosLoginPasswd(usuarios);
    }
    
    public void insertUser(User user){
        CristoServer.debug("Debug: insertUser");
        a.insertUser(user);
    }
    
    public void getUser(User user) throws SQLException{
        a.getUser(user);
    }
    
}
