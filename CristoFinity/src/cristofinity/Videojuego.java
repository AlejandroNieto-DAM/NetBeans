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
public class Videojuego extends Multimedia {
    
   private String desarrollador;
   private String editor;
   private int jugadores;
   private String plataforma;
   
   /*
     *@brief Constructor de la clase videojuego
    */
   Videojuego(){
       
       super();
       desarrollador = "";
       editor = "";
       jugadores = 0;
       plataforma = "";
       
   }
   
   /*
     *@brief Cambia el valor del atributo por el nuevo developer
   */
   public void setDesarrollador(String developer){
       desarrollador = developer;
   }
   
   /*
     *@brief Cambia el valor del atributo por el nuevo edtr
   */
   public void setEditor(String edtr){
       editor = edtr;
   }
   
   /*
     *@brief Cambia el valor del atributo por el nuevo numeroJugadores
   */
   public void setJugadores(int numeroJugadores){
       jugadores = numeroJugadores;
   }
   
   /*
     *@brief Cambia el valor del atributo por el nuevo platafrm
   */
   public void setPlataforma(String platafrm){
       plataforma = platafrm;
   }
   
   /*
     *@brief Devuelve el valor del atributo desarrollador
    */
   public String getDesarrollador(){
       return desarrollador;
   }
   
   /*
     *@brief Devuelve el valor del atributo editor
    */
   public String getEditor(){
       return editor;
   }
   
   /*
     *@brief Devuelve el valor del atributo plataforma
    */
   public String getPlataforma(){
       return plataforma;
   }
   
   /*
     *@brief Devuelve el valor del atributo jugadores
    */
   public int getJugadores(){
       return jugadores;
   }
   
   /*
     *@brief sobrecarga del print de la clase superior
    */
   @Override
   public void printMultimedia(){
       super.printMultimedia();
       
       System.out.println("Desarrollador --> " + getDesarrollador());
       System.out.println("Editor --> " + getEditor());
       System.out.println("Jugadores --> " + getJugadores());
       System.out.println("Plataforma --> " + getPlataforma());
       
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
