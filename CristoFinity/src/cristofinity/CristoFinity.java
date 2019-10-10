/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristofinity;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author alejandronieto
 */
public class CristoFinity extends JLabel implements ListCellRenderer{

    private static ArrayList<Multimedia> catalogo = new ArrayList();;
    Scanner in = new Scanner(System.in);
    private static int dimensionCatalogo;
    
    /*
     * @brief Constructor de la clase CristoFinity
     */
    CristoFinity(){
        dimensionCatalogo = 0; 
    }
    
    /*
     *@brief Devuelve la dimensino del catalogo
    */
    public int getDimensionCatalogo(){
        dimensionCatalogo = catalogo.size();
        return dimensionCatalogo;
    }
    
    /*
     *@brief Menu principal
    */
    public void menu(){
        
        
        
        int opcion = 0;
        
        do{
            
            System.out.println("[1] Registrar multimedia. ");
            System.out.println("[2] Borrar multimedia. ");
            System.out.println("[3] Mostrar catalogo. ");
            System.out.println("[4] Añadir comentario/valoracion a Multimedia.");
            System.out.println("[5] Eliminar comentario/valoracion a Multimedia.");
            System.out.println("[0] Salir. ");

            do{
                opcion = in.nextInt();

                if(opcion > 5 || opcion < 0){
                    System.out.println("Has escrito una opcion incorrecta. Pruebe de nuevo...");
                }

            }while(opcion > 5 && opcion < 0);

            switch(opcion){

                case 1: registrarMultimedia();
                    break;

                case 2: borrarMultimedia();
                    break;
                    
                case 3: mostrarCatalogo();
                    break;
                    
                case 4: insertarComentarioAMedia();
                    break;
                    
                case 5: borrarComentarioAMedia();
                    break;
                    
                case 0: System.out.println("Bye bye!");
                    break;


            }
        
        }while(opcion != 0);
        
    }
    
    
    /*
     *@brief pide los atributos de un multimedia para cambiarlos en el multimedia p mediante los sets
    */
    public void atributosMultimedia(Multimedia p){
        
        System.out.print("Titulo --> ");
        in.nextLine();
        String titulo = in.nextLine();
        System.out.print("Genero --> ");
        String genero = in.nextLine();
        System.out.print("Fecha de publicacion --> ");
        String fecha = in.nextLine();
        System.out.print("Resumen --> ");
        String resumen = in.nextLine();
        System.out.print("Duracion en seg --> ");
        int duracion = in.nextInt();
        System.out.print("Pegi --> ");
        int pegi = in.nextInt();
        
        p.setTitulo(titulo);
        p.setGenero(genero);
        p.setDuracionEnSegundos(duracion);
        p.setFechaPublicacion(fecha);
        p.setPegi(pegi);
        p.setResumen(resumen);
        
    }
    
    /*
     *@brief Registra una pelicula pidiendo todos sus atributos al usuario
    */
    public void registrarPelicula(){
        
        Pelicula pelicula = new Pelicula();
        
        atributosMultimedia(pelicula);
        
        System.out.print("Guion --> ");
        in.nextLine();
        String guion = in.nextLine();
        System.out.print("Reparto --> ");
        String reparto = in.nextLine();
        System.out.print("Productor --> ");
        String productor = in.nextLine();
        System.out.print("Direccion --> ");
        String direccion = in.nextLine();
        
        pelicula.setGuion(guion);
        pelicula.setReparto(reparto);
        pelicula.setProductor(productor);
        pelicula.setDireccion(direccion);
        
        pelicula.setIDMultimedia(newID());
        
        MostrarCatalogo.lista.add(pelicula);
        catalogo.add(pelicula);
         
    }

    /*
     *@brief Registra una cancion pidiendo todos sus atributos al usuario
    */
    public void registrarCancion(){
        
        
        Cancion cancion = new Cancion();
        atributosMultimedia(cancion);

        System.out.print("Album --> ");
        in.nextLine();
        String album = in.nextLine();
        System.out.print("Artista --> ");
        String artista = in.nextLine();
        
        cancion.setArtista(artista);
        cancion.setAlbum(album);
        
        cancion.setIDMultimedia(newID());
        
        
        MostrarCatalogo.lista.add(cancion);
        catalogo.add(cancion);
  
    }
    
    /*
     *@brief Registra una serie pidiendo todos sus atributos al usuario
    */
    public void registrarSerie(){
        
        Serie serie = new Serie();
        
        atributosMultimedia(serie);
         
        System.out.print("Guion --> ");
        in.nextLine();
        String guion = in.nextLine();
        System.out.print("Reparto --> ");
        String reparto = in.nextLine();
        System.out.print("Productor --> ");
        String productor = in.nextLine();
        System.out.print("Direccion --> ");
        String direccion = in.nextLine();
        
        serie.setGuion(guion);
        serie.setReparto(reparto);
        serie.setProductor(productor);
        serie.setDireccion(direccion);
        
        System.out.print("En emision? (0/1) --> ");
        int emision = in.nextInt();
        System.out.print("Temporadas --> ");
        int temporadas = in.nextInt();
        System.out.print("Capitulos --> ");
        int capitulos = in.nextInt();
        
        
        serie.setTemporadas(temporadas);
        serie.setCapitulos(capitulos);
        
        if(emision == 1){
            serie.setEmision(true);
        } else {
            serie.setEmision(false);
        }
        
        serie.setIDMultimedia(newID());
        
        MostrarCatalogo.lista.add(serie);
        catalogo.add(serie);
        
    }
    
    /*
     *@brief Registra un videojuego pidiendo todos sus atributos al usuario
    */
    public void registrarVideojuego(){

        Videojuego videojuego = new Videojuego();
        
        atributosMultimedia(videojuego);
        
        
        System.out.print("Desarrollador --> ");
        in.nextLine();
        String desarrollador = in.nextLine();
        System.out.print("Editor --> ");
        String editor = in.nextLine();
        System.out.print("Plataforma --> ");
        String plataforma = in.nextLine();
        System.out.print("Jugadores --> ");
        int jugadores = in.nextInt();
        
        videojuego.setDesarrollador(desarrollador);
        videojuego.setEditor(editor);
        videojuego.setPlataforma(plataforma);
        videojuego.setJugadores(jugadores);
        
        videojuego.setIDMultimedia(newID());
        
        
        MostrarCatalogo.lista.add(videojuego);
        catalogo.add(videojuego);
        
    }
    
    /*
     *@brief muestra el catalogo
    */
    public void mostrarCatalogo(){

       
       MostrarCatalogo ventana = new MostrarCatalogo();

       ventana.setVisible(true);
         
    }
 
    /*
     *@brief Menu para elegir cuales de los medias vamos a registrar
    */
    public void registrarMultimedia(){
        
        int opcion = 0;
         
        System.out.println("Que quiere registrar?");
        System.out.println("[1] Pelicula.");
        System.out.println("[2] Serie.");
        System.out.println("[3] Cancion.");
        System.out.println("[4] Videojuego.");
         
        opcion = in.nextInt();
        
        switch(opcion){
            
            case 1: registrarPelicula();
                break;
                
            case 2: registrarSerie();
                break;
                
            case 3: registrarCancion();
                break;
                
             case 4: registrarVideojuego();
                break;
        }
    }
    
    /*
     *@brief Crea un nuevo id para cada multimedia nuevo que se registra
    */
    private int newID(){
        
        int nuevaID;
        
        if(catalogo.isEmpty()){
            nuevaID = 0;
        } else {
            nuevaID = catalogo.get(catalogo.size() - 1).getIDMultimedia() + 1;
        }
        
        return nuevaID;
    }
    /*
     *@brief borra un multimedia en el catalogo
    */
    
    public void borrarMultimedia(){
        
        int posicion = 0;
        
        if(!catalogo.isEmpty()){
        
            mostrarCatalogo();
            System.out.println("Introduce el ID del Multimedia que quieres borrar: ");

            posicion = buscarIDMultimedia();

            catalogo.remove(posicion);
            MostrarCatalogo.lista.remove(posicion);
            
        } else {
            System.out.println("No hay multimedias :( Prueba despues...");
        }
        
    }
    
    /*
     *@brief busca la posicion de un multimedia mediante su id
    */
    public int buscarIDMultimedia(){
        
        int posicion = 0;

        int id = in.nextInt();

            for(int i = 0; i < catalogo.size(); i++){
                if(id == catalogo.get(i).getIDMultimedia()){
                    posicion = i;
                }
            }


        return posicion;
       
    }
    
    /*
     *@brief inserta un comentario/valoracion a un multimedia en el catalogo
    */
    public void insertarComentarioAMedia(){
        
        int posicion;
        
         if(!catalogo.isEmpty()){
        
            mostrarCatalogoNormal();
            System.out.println("Introduce el ID del Multimedia al que quieres añadirle un comentario: ");

            posicion = buscarIDMultimedia();

            catalogo.get(posicion).insertarComentario();
            
        } else {
            System.out.println("No hay multimedias :( Prueba despues...");
        }
        
    }
    
    /*
     *@brief borra un comentario/valoracion a un media en el catalogo
    */
    public void borrarComentarioAMedia(){
        
        int posicion;
        
         if(!catalogo.isEmpty()){
        
            mostrarCatalogoNormal();
            System.out.println("Introduce el ID del Multimedia al que quieres borrarle un comentario: ");

            posicion = buscarIDMultimedia();

            catalogo.get(posicion).borrarComentario();
            
        } else {
            System.out.println("No hay multimedias :( Prueba despues...");
        }
        
    }
    
    /*
     *@brief muestra el catalogo por terminal
    */
    public void mostrarCatalogoNormal(){
        
        for(int i = 0;  i < catalogo.size(); i++){
            catalogo.get(i).printMultimediaCompleta();
        }
    }
    
    public static void main(String[] args) {
      
        
       CristoFinity aplicacionPrincipal = new CristoFinity(); 
       aplicacionPrincipal.menu();
   
    }
    
    //Definicion de las imagenes que utilizaremos en la primera ventana de mostrarCatalogo
    final static ImageIcon p = new ImageIcon("p1.png");
    final static ImageIcon s = new ImageIcon("s.png");
    final static ImageIcon c = new ImageIcon("c.png");
    final static ImageIcon v = new ImageIcon("v.png");
    
    /*
     *@brief Sobreescritura del menoto getListCellRendererComponent que nos servira para asociar iconos a cada uno de nuestros multimedias.
    */
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
       
        String valor = ("       " + catalogo.get(index).getTitulo());
        setText(valor);
        if(catalogo.get(index) instanceof Serie){
            setIcon(s);
        } else if(catalogo.get(index) instanceof Pelicula) {
            setIcon(p);
        } else if(catalogo.get(index) instanceof Cancion){
            setIcon(c);
        } else if(catalogo.get(index) instanceof Videojuego){
            setIcon(v);
        }
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }


    
}
