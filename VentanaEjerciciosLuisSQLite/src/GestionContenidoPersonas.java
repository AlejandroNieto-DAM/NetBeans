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
public class GestionContenidoPersonas extends DefaultHandler{
    
    private ArrayList<Persona> personas;
    String elemento = "";
    Persona persona;
    
    
    public GestionContenidoPersonas() {
	        super();      
	    }
    
    public void setArray(ArrayList personas){
        this.personas = personas;
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
                
                if(elemento.equals("persona")){
                    persona = new Persona();
                }
	    } 	
	    public void endElement(String uri, String nombre, 
                          String nombreC) {
	        //System.out.printf("\tFin Elemento: %s %n", nombre);
                elemento = nombre;
                
                if(elemento.equals("persona")){
                    personas.add(persona);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) 
                                            throws SAXException {
		   String car=new String(ch, inicio, longitud);
               //quitar saltos de línea	
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   
                   if(elemento.equals("nombre")){
                       persona.setNombre(car);
                   } else if(elemento.equals("altura")){
                       persona.setAltura(Double.parseDouble(car));
                   } else if(elemento.equals("peso")){
                       persona.setPeso(Float.parseFloat(car));
                   } else if(elemento.equals("edad")){
                       persona.setEdad(Integer.parseInt(car));
                   } else if(elemento.equals("id")){
                       persona.setId(Integer.parseInt(car));
                   }
                   
	    }
}
