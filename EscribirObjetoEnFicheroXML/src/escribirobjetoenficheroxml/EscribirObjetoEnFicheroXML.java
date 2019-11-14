/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirobjetoenficheroxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.xml.parsers.DocumentBuilderFactory;

import java.util.ArrayList;


import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

/**
 *
 * @author alejandronieto
 */
public class EscribirObjetoEnFicheroXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ArrayList<Persona> personas = new ArrayList();
        
        personas.add(new Persona("Carlos", 113.0, 3, 18));
        personas.add(new Persona("Pepe", 113.0, 3, 18));
        personas.add(new Persona("Alexinio", 113.0, 3, 18));
        personas.add(new Persona("pedrillo", 113.0, 3, 18));
        personas.add(new Persona("josegras", 113.0, 3, 18));
        
     
        DocumentBuilderFactory factory =
                   DocumentBuilderFactory.newInstance();

    try{
      DocumentBuilder builder = factory.newDocumentBuilder();
      DOMImplementation implementation = builder.getDOMImplementation();
      Document document = 
           implementation.createDocument(null, "Personas", null);
      document.setXmlVersion("1.0"); 

      for(int i = 0; i < personas.size(); i++) {
          
          

          //id validos a partir de 1
            Element raiz = 
                    document.createElement("persona"); //nodo empleado
          document.getDocumentElement().appendChild(raiz); 

          //añadir ID                       
          CrearElemento("nombre", personas.get(i).getNombre() , raiz, document); 
          //Apellido
          CrearElemento("altura", String.valueOf(personas.get(i).getAltura()), raiz, document); 
          //añadir DEP
          CrearElemento("peso",String.valueOf(personas.get(i).getPeso()), raiz, document); 
          //añadir salario
          CrearElemento("edad",String.valueOf(personas.get(i).getEdad()), raiz,
                                                           document); 
         
 

      }//fin del for que recorre el fichero

      Source source = new DOMSource(document);
      Result result = 
             new StreamResult(new java.io.File("Empleados.xml"));        
      Transformer transformer =
             TransformerFactory.newInstance().newTransformer();
      transformer.transform(source, result);

     }catch(Exception e){ System.err.println("Error: "+e); }

         //cerrar fichero 	
    }//fin de main
 
    //Inserción de los datos del empleado
    static void  CrearElemento(String datoEmple, String valor,
                               Element raiz, Document document){
       Element elem = document.createElement(datoEmple); 
       Text text = document.createTextNode(valor); //damos valor
       raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
       elem.appendChild(text); //pegamos el valor		 	
    }
    
}
