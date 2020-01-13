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
public class GestionContenidoCiudad extends DefaultHandler{
    
    private ArrayList<Ciudad> ciudades;
    String elemento = "";
    Ciudad ciudad;
    
    
    public GestionContenidoCiudad() {
	        super();      
	    }
    
    public void setArray(ArrayList ciudades){
        this.ciudades = ciudades;
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
                
                if(elemento.equals("ciudad")){
                    ciudad = new Ciudad();
                }
	    } 	
	    public void endElement(String uri, String nombre, 
                          String nombreC) {
	        //System.out.printf("\tFin Elemento: %s %n", nombre);
                elemento = nombre;
                
                if(elemento.equals("ciudad")){
                    ciudades.add(ciudad);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) 
                                            throws SAXException {
		   String car=new String(ch, inicio, longitud);
               //quitar saltos de línea	
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   
                   if(elemento.equals("nombre")){
                       ciudad.setNombre(car);
                   } else if(elemento.equals("pais")){
                       ciudad.setPais(car);
                   } else if(elemento.equals("provincia")){
                       ciudad.setProvincia(car);
                   } else if(elemento.equals("edificioEmblematico")){
                       ciudad.setEdificioEmblematico(car);
                   } else if(elemento.equals("id")){
                       ciudad.setId(Integer.parseInt(car));
                   } else if(elemento.equals("lugar")){
                       ciudad.setLugar(car);
                   }
                   
	    }
}
