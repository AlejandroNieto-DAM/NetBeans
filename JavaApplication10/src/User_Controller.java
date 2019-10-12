
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
     
     User_Controller(){
         a = new User_Model();
     }
       
    
    public void getUsuariosLoginPasswd(ArrayList<User> usuarios){
        a.getUsuariosLoginPasswd(usuarios);
    }
    
}
