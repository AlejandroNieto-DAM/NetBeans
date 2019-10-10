/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristofinity;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alejandronieto
 */
public class Multimedia {
    
    private int idMultimedia;
    private String titulo;
    private String genero;
    private int duracionEnSegundos;
    private String fechaPublicacion;
    private int pegi;
    private String resumen;
    private int totalLikes;
    private double puntuacion;
    private double puntuacionMediaEnCatalogo;
    
    private static ArrayList<Comentario> comentarios = new ArrayList();
    private static ArrayList<Valoracion> valoraciones = new ArrayList();
    private int dim_comentarios;
    private int dim_valoraciones;
    
    /*
     *@brief Constructor de la clase multimedia.
    */
    Multimedia(){
        
        idMultimedia = 0;
        titulo = "";
        genero = "";
        duracionEnSegundos = 0;
        fechaPublicacion = "";
        pegi = 0;
        resumen = "";
        totalLikes = 0;
        puntuacion = 0;
        puntuacionMediaEnCatalogo = 0.0;
        dim_comentarios = 0;
        dim_valoraciones = 0;
            
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo id
    */
    public void setIDMultimedia(int id){
        idMultimedia = id;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo ttl
    */
    public void setTitulo(String ttl){
        titulo = ttl;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo gnr
    */
    public void setGenero(String gnr){
        genero = gnr;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo segundos
    */
    public void setDuracionEnSegundos(int segundos){
        duracionEnSegundos = segundos;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo fecha
    */
    public void setFechaPublicacion(String fecha){
        fechaPublicacion = fecha;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo pgi
    */
    public void setPegi(int pgi){
        pegi = pgi;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo descripcion
    */
    public void setResumen(String descripcion){
        resumen = descripcion;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo likes
    */
    public void setTotalLikes(int likes){
        totalLikes = likes;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo valoracion
    */
    public void setPuntuacion(double valoracion){
        puntuacion = valoracion;
    }
    
    /*
     *@brief Cambia el valor del atributo por el nuevo puntuacionMedia
    */
    public void setPuntuacionMediaEnCatalogo(double puntuacionMedia){
        this.puntuacionMediaEnCatalogo = puntuacionMedia;
    }
    
    /*
     *@brief Devuelve el valor del atributo idMultimedia
    */
    public int getIDMultimedia(){
        return idMultimedia;
    }
    
    /*
     *@brief Devuelve el valor del atributo titulo
    */
    public String getTitulo(){
        return titulo;
    }
    
    /*
     *@brief Devuelve el valor del atributo genero
    */        
    public String getGenero(){
        return genero;
    }
    
    /*
     *@brief Devuelve el valor del atributo duracionEnSegundos
    */
    public int getDuracionEnSegundos(){
        return duracionEnSegundos;
    }
    
    /*
     *@brief Devuelve el valor del atributo fechaPublicacion
    */
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    /*
     *@brief Devuelve el valor del atributo resumen
    */
    public String getResumen(){
        return resumen;
    }
    
    /*
     *@brief Devuelve el valor del atributo totalLikes
    */
    public int getTotalLikes(){
        return totalLikes;
    }
    
    /*
     *@brief Devuelve el valor del atributo puntuacion
    */
    public double getPuntuacion(){
        return puntuacion;
    }
    
    /*
     *@brief Devuelve el valor del atributo puntuacionMediaEnCatalogo
    */
    public double getPuntuacionMediaEnCatalogo(){
        return puntuacionMediaEnCatalogo;
    }
    
    /*
     *@brief Devuelve el valor del atributo pegi
    */
    public int getPegi(){
        return pegi;
    }
    
    /*
     *@brief Devuelve el valor del atributo dim_comentarios
    */
    public int getDimComentarios(){
        return dim_comentarios;
    }
    
    /*
     *@brief Devuelve el valor del atributo dim_valoraciones
    */
    public int getDimValoraciones(){
        return dim_valoraciones;
    }
    
    /*
     *@brief Devuelve el valor del id de un comentario en una posicion
    */
    public int getIDComentarioEnMultimedia(int posicion){
        return comentarios.get(posicion).getIDComentario();
    }
    
    /*
     *@brief Devuelve el valor del login de un comentario en una posicion
    */
    public String getLoginEnComentario(int posicion){
        return comentarios.get(posicion).getLoginUsuarioEnComentario();
    }
    
    /*
     *@brief Devuelve el valor de la descripcion de un comentario en una posicion
    */
    public String getDescripcionEnComentario(int posicion){
        return comentarios.get(posicion).getDescripcion();
    }
    
    /*
     *@brief Devuelve el valor del id de una valoracion en una posicion
    */
    public int getIDValoracionEnMultimedia(int posicion){
        return valoraciones.get(posicion).getIDValoracion();
    }
    
    /*
     *@brief Devuelve el valor del login de una valoracion en una posicion
    */
    public String getLoginEnValoracion(int posicion){
        return valoraciones.get(posicion).getLoginUsuarioEnValoracion();
    }
    
    /*
     *@brief Devuelve el valor de la puntuacion de una valoracion en una posicion
    */
    public float getPuntuacionEnValoraciones(int posicion){
        return valoraciones.get(posicion).getPuntuacion();
    }
    
    /*
     *@brief print de la clase multimedia
    */
    public void printMultimedia(){
        
        System.out.println("ID MULTIMEDIA --> " + getIDMultimedia());
        System.out.println("TITULO --> " + getTitulo());
        System.out.println("GENERO --> " + getGenero());
        System.out.println("DURACION EN SEGUNDOS --> " + getDuracionEnSegundos());
        System.out.println("FECHA DE PUBLICACION --> " + getFechaPublicacion());
        System.out.println("PEGI --> " + getPegi());
        System.out.println("RESUMEN --> " + getResumen());
        System.out.println("TOTAL LIKES --> " + getTotalLikes());
        System.out.println("PUNTUACION MEDIA --> " + getPuntuacion());
        System.out.println("PUNTUACION MEDIA EN EL CATALOGO --> " + getPuntuacionMediaEnCatalogo());
        
    }
    
    /*
     *@brief print de la clase multimedia de una forma completa
    */
    public void printMultimediaCompleta(){
        
        printMultimedia();
               
        printComentariosYValoraciones();
        
    }
    
    /*
     *@brief print de los comentarios y valoraciones de un multimedia
    */
    public void printComentariosYValoraciones(){
        
        System.out.println("\nComentarios --> ");

        for(int i = 0; i < comentarios.size(); i++){
            System.out.println(comentarios.get(i));
        }
        
        System.out.println("\nValoraciones --> ");
        
        for(int i = 0; i < valoraciones.size(); i++){
            System.out.println(valoraciones.get(i));
        }
    }
    
    /*
     *@brief Crea un nuevo id para comentarios/valoraciones cada vez que se introducen
    */
    private int newID(){
        
        int nuevaID;
        
        if(getDimComentarios() == 0){
            nuevaID = 0;     
        } else {
           nuevaID = comentarios.get(getDimComentarios() - 1).getIDComentario() + 1;
        }
        
        return nuevaID;
    }
    
    /*
     *@brief Inserta un comentario a la clase multimedia.
    */
    public void insertarComentario(){
        
        Comentario auxiliar = new Comentario();
        Valoracion auxiliar1 = new Valoracion();

        int nuevaID = newID();
  
        Scanner in = new Scanner(System.in);
        
        String comentario;
        int punct;
         
        System.out.print("Introduce tu comentario: ");
        comentario = in.nextLine();
        System.out.print("Introduce tu puntuacion: ");
        punct = in.nextInt();
        

        auxiliar.setIDComentario(nuevaID);
        auxiliar1.setIDValoracion(nuevaID);
        
        auxiliar.setDescripcion(comentario);
        auxiliar1.setPuntuacion(punct);

        comentarios.add(auxiliar);
        valoraciones.add(auxiliar1);
        
        dim_comentarios++;
        dim_valoraciones++;
        
        calcularPuntuacion();
    }
    
    /*
     *@brief Borra un comentario de la clase multimedia
    */
    public void borrarComentario(){
        
        Scanner in = new Scanner(System.in);
        
        int id;
        int posicionComentario = 0;
        Boolean encontrado = false;
        
        if(!comentarios.isEmpty()){
            System.out.println("Introduce la id del comentario y valoracion a borrar: ");
            id = in.nextInt();

            for(int i = 0; i < comentarios.size(); i++){
                if(getIDComentarioEnMultimedia(i) == id){
                    encontrado = true;
                    posicionComentario = i;
                }
            }

            if(encontrado == true){
                deleteComentarioYValoracion(posicionComentario);
                System.out.println("Se ha eliminado correctamente! ");
            } else if(encontrado == false){
                System.out.println("No hay comentarios con ese id :( ");
            }

            calcularPuntuacion();
            
        } else {
            System.out.println("Este multimedia no tiene comentarios:( ");
        }

    }
    
    /*
     *@brief Deletea el comentario/valoracion de una posicion de la clase multimedia
    */
    public void deleteComentarioYValoracion(int posicion){
        
      
        comentarios.remove(posicion);
        valoraciones.remove(posicion);
       
        
        dim_comentarios--;
        dim_valoraciones--;
                       
    }
    
    /*
     *@brief calcula la puntuaciond del media
    */
    public void calcularPuntuacion(){
        
        double media = 0.0;
        
        for(int i = 0; i < valoraciones.size(); i++){
            media += valoraciones.get(i).getPuntuacion();
        }
        
        media = media / getDimValoraciones();

        setPuntuacion(media);
    }

    
    
    
}
