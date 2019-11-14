/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import escribirobjetoenficheroxml.GestionContenido;
import escribirobjetoenficheroxml.Persona;
import java.io.*;
import java.util.ArrayList;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader.*;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
/**
 *
 * @author alejandronieto
 */
public class LeerObjetoEnFicheroXML {

    private static ArrayList<Persona> personas = new ArrayList();
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException, SAXException {
         XMLReader  procesadorXML = XMLReaderFactory.createXMLReader();
	 GestionContenido gestor= new GestionContenido();  
         gestor.setArray(personas);
	 procesadorXML.setContentHandler(gestor);
 	 InputSource fileXML = new InputSource("Empleados.xml");	    
       procesadorXML.parse(fileXML);
        
    }
    
    
    
}
