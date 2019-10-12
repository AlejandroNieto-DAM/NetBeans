
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
public class Amigo_Controller {
    
     Amigo_Model a;
     
     Amigo_Controller(){
         a = new Amigo_Model();
     }
     
    public void getAmigos(ArrayList<Amigo> amigos){
        a.getUsuarios(amigos);
    }
    
}
