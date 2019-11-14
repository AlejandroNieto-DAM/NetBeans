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
public class GestionContenidoGrupos extends DefaultHandler{
    
    private ArrayList<Grupo> grupos;
    String elemento = "";
    Grupo grupo;
    
    
    public GestionContenidoGrupos() {
	        super();      
	    }
    
    public void setArray(ArrayList grupo){
        this.grupos = grupo;
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
                
                if(elemento.equals("grupo")){
                    grupo = new Grupo();
                }
	    } 	
	    public void endElement(String uri, String nombre, 
                          String nombreC) {
	        //System.out.printf("\tFin Elemento: %s %n", nombre);
                elemento = nombre;
                
                if(elemento.equals("grupo")){
                    grupos.add(grupo);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) 
                                            throws SAXException {
		   String car=new String(ch, inicio, longitud);
               //quitar saltos de línea	
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   
                   if(elemento.equals("nombre")){
                       grupo.setNombre(car);
                   } else if(elemento.equals("nombreDirector")){
                       grupo.setNombreDirector(car);
                   } else if(elemento.equals("edadMinima")){
                       grupo.setEdadMinima(Integer.parseInt(car));
                   } else if(elemento.equals("horario")){
                       grupo.setHorario(car);
                   } else if(elemento.equals("id")){
                       grupo.setId(Integer.parseInt(car));
                   } else if(elemento.equals("nombrePersona")){
                       grupo.setNombrePersona(car);
                   }
                   
	    }
}
