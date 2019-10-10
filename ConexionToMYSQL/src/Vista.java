

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
public class Vista {
    
    private ArrayList<Alumno> alAlumnos;
    private Alumnos_Controller a;
            
    Vista(){
        alAlumnos = new ArrayList();
        a = new Alumnos_Controller();
    }
    
    public void getAlumnos(){ 
         a.getAlumnos(alAlumnos);
    }

    public void printAlumnos(){
        
        for(int i = 0; i < alAlumnos.size(); i++){
            alAlumnos.get(i).printAlumno();
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Vista a = new Vista();
        
        a.getAlumnos();
        a.printAlumnos();
        
    }
    
}
