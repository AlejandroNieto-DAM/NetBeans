/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author alejandronieto
 */
public class GestionContenidoLugares extends DefaultHandler{
    
    private ArrayList<Lugar> lugares;
    String elemento = "";
    Lugar lugar;
    
    
    public GestionContenidoLugares() {
	        super();      
	    }
    
    public void setArray(ArrayList lugares){
        this.lugares = lugares;
    }
    
	    public void startDocument() {
	       //System.out.println("Comienzo del Documento XML");
	    }	    
	    public void endDocument() {
	        //System.out.println("Final del Documento XML");  
	    }	 	    
	    public void startElement(String uri, String nombre,
	              String nombreC, Attributes atts) {
	        //System.out.printf("\t Principio Elemento: %s %n",nombre);
                
                elemento = nombre;
                
                if(elemento.equals("lugar")){
                    lugar = new Lugar();
                }
	    } 	
	    public void endElement(String uri, String nombre, 
                          String nombreC) {
	        //System.out.printf("\tFin Elemento: %s %n", nombre);
                elemento = nombre;
                
                if(elemento.equals("lugar")){
                    lugares.add(lugar);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) 
                                            throws SAXException {
		   String car=new String(ch, inicio, longitud);
               //quitar saltos de línea	
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   
                   if(elemento.equals("nombre")){
                       lugar.setNombre(car);
                   } else if(elemento.equals("direccion")){
                       lugar.setDireccion(car);
                   } else if(elemento.equals("numeroEdif")){
                       lugar.setNumeroEdif(Integer.parseInt(car));
                   } else if(elemento.equals("horario")){
                       lugar.setHorario(car);
                   } else if(elemento.equals("id")){
                       lugar.setId(Integer.parseInt(car));
                   } else if(elemento.equals("grupo")){
                       lugar.setGrupo(car);
                   }
                   
	    }
}
