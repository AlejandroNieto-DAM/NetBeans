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
public class Cancion extends Multimedia {
    
    private String album;
    private String artista;
    
    /*
     *@brief Constructor de la clase cancion
    */
    Cancion(){
        
        super();
        
        album = "";
        artista = "";
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo albm
    */
    public void setAlbum(String albm){
        album = albm;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo artist
    */
    public void setArtista(String artist){
        artista = artist;
    }
    
    /*
     *@brief Devuelve el valor del atributo album
    */
    public String getAlbum(){
        return album;
    }
    
    /*
     *@brief Devuelve el valor del atributo artista
    */
    public String getArtista(){
        return artista;
    }
    
    /*
     *@brief sobrecarga del print de la clase superior
    */
    @Override
    public void printMultimedia(){ 
        super.printMultimedia();
        
        System.out.println("Album --> " + getAlbum());
        System.out.println("Artista --> " + getArtista());
     
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
