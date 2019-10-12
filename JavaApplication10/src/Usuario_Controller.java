
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
public class Usuario_Controller {
    
    Usuario_Model a;
     
     Usuario_Controller(){
         a = new Usuario_Model();
     }
       
    
    public void getUsuariosLoginPasswd(ArrayList<Usuario> usuarios){
        a.getUsuariosLoginPasswd(usuarios);
    }
    
}
