
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
public class Alumnos_Controller {
    
     Alumno_Model a;
     
     Alumnos_Controller(){
         a = new Alumno_Model();
     }
       
    
    public void getAlumnos(ArrayList<Alumno> alumnos){
        a.getAlumnos(alumnos);
    }
    
    public void setAlumno(){
        a.setAlumno();
    }
    
    
}
