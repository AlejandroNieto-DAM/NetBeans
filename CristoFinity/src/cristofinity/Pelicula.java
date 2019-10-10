/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristofinity;

/**
 *
 * @author alejandronieto
 */
public class Pelicula extends Multimedia {
    
    private String reparto;
    private String guion;
    private String direccion;
    private String productor;
    
    /*
     *@brief Constructor de la clase pelicula
    */
    Pelicula(){
        
        super();
        
        reparto = "";
        guion = "";
        direccion = "";
        productor = "";
        
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo rprt
    */
    public void setReparto(String rprt){
        reparto = rprt;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo gui
    */
    public void setGuion(String gui){
        guion = gui;
    }
    
    public void setDireccion(String direccn){
        direccion = direccn;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo nombre
    */
    public void setProductor(String nombre){
        productor = nombre;
    }
    
    /*
     *@brief Devuelve el valor del atributo reparto
    */
    public String getReparto(){
        return reparto;
    }
    
    /*
     *@brief Devuelve el valor del atributo guion
    */
    public String getGuion(){
        return guion;
    }
    
    /*
     *@brief Devuelve el valor del atributo direccion
    */
    public String getDireccion(){
        return direccion;
    }
    
    /*
     *@brief Devuelve el valor del atributo productor
    */
    public String getProductor(){
        return productor;
    }
    
    /*
     *@brief sobrecarga del print de la clase superior
    */
    @Override
    public void printMultimedia(){
        
        super.printMultimedia();
        
        System.out.println("Reparto --> " + getReparto());
        System.out.println("Guion --> " + getGuion());
        System.out.println("Direccion --> " + getDireccion());
        System.out.println("Productor --> " + getProductor());
    }
    
    /*
     *@brief sobrecarga del print completo de la clase superior
    */
    @Override
    public void printMultimediaCompleta(){
        printMultimedia();
        super.printComentariosYValoraciones();
    }
}
