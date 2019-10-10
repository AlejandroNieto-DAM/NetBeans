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
public class Serie extends Pelicula {
    
    private int temporadas;
    private int capitulos;
    private Boolean emision;
    
    /*
     *@brief Constructor de la clase serie
    */
    Serie(){
        
        super();
        
        temporadas = 0;
        capitulos = 0;
        emision = false;
        
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo temp
    */
    public void setTemporadas(int temp){
        temporadas = temp;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo capts
    */
    public void setCapitulos(int capts){
        capitulos = capts;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo enEmision
    */
    public void setEmision(Boolean enEmision){
        emision = enEmision;
    }
    
    /*
     *@brief Devuelve el valor del atributo temporadas
    */
    public int getTemporadas(){
        return temporadas;
    }
    
    /*
     *@brief Devuelve el valor del atributo capitulos
    */
    public int getCapitulos(){
        return capitulos;
    }
    
    /*
     *@brief Devuelve el valor del atributo emision
    */
    public Boolean getEmision(){
        return emision;
    }
     
    /*
     *@brief sobrecarga del print de la clase superior
    */
    @Override
    public void printMultimedia(){
        super.printMultimedia();
        
        System.out.println("Temporadas --> " + getTemporadas());
        System.out.println("Capitulos --> " + getCapitulos());
        
        if(emision == true){
            System.out.println("En emision --> SI ");
        } else {
            System.out.println("En emision --> NO ");
        }
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
