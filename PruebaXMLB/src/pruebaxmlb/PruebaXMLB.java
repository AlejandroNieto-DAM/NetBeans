/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxmlb;

import java.util.Scanner;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQResultSequence;

/**
 *
 * @author alejandronieto
 */
public class PruebaXMLB {

    private static final String nomClaseDS = "net.xqj.exist.ExistXQDataSource"; 
        
	private static XQConnection obtenConexion() throws ClassNotFoundException,  InstantiationException, 
	IllegalAccessException, XQException { 
            XQDataSource xqs = (XQDataSource) Class.forName(nomClaseDS).newInstance();
            xqs.setProperty("serverName", "localhost");
            xqs.setProperty("port", "8080");
            xqs.setProperty("user", "admin");
            xqs.setProperty("password", "");
            return xqs.getConnection();
        } 

	private static void muestraErrorXQuery(XQException e) { 
            System.err.println("XQuery ERROR mensaje: " + e.getMessage());
            System.err.println("XQuery ERROR causa: " + e.getCause());
            System.err.println("XQuery ERROR código: " + e.getVendorCode());
        } 

	public static void main(String[] args) { 
		XQConnection c = null; 
		try { 
                    
                    String yeyo = "";
			c = obtenConexion(); 
			/*String cad = "update insert "
                                + "<cliente DNI=\"12344578\">"
                                +   "<apellidos>GAMBOA</apellidos>" 
                                +   "<CP>52531</CP>"
                                + "</cliente>"
                                + " into doc(\"//db/prueba2/Clientes.xml\")/clientes";*/ 
                        
                        // String cad1 = "update value "
                         //       + "doc(\"/db/prueba2/Clientes.xml\")/clientes/cliente[@DNI=\"12344578\"]/apellidos"
                          //      + " with \"Dorce\""; 
                        
                         // update value //fname[. = "Andrew"] with 'Andy'
                         
                         String update = "update delete doc(\"//db/EjercicioLuis/Personas.xml\")/personas/persona[id=\"2\"]";
                        
                        String cad = "doc(\"//db/EjercicioLuis/Personas.xml\")/personas/persona"; 
                        
			XQExpression xqe = c.createExpression();
                        xqe.executeCommand(update);
			/*XQResultSequence xqrs = xqe.executeQuery(cad); 
			int i=1; 
                        boolean cogerTextoAhora = false;
			while (xqrs.next()) { 
				System.out.println("[Resultado "+(i++)+"]"); 
                                cogerTextoAhora = false;
				XMLStreamReader xsr = xqrs.getItemAsStream(); 
                                
				while (xsr.hasNext()) { 
					if (xsr.getEventType() == XMLStreamConstants.CHARACTERS) {
                                            if(cogerTextoAhora){
                                               yeyo += xsr.getText() + "#"; 
                                                
                                                cogerTextoAhora = false;
                                            } else {
                                                cogerTextoAhora = true;
                                            }
                                            
                                            System.out.println("1" + xsr.getText() + "2");
                                           
					} 
					xsr.next(); 
				} 
			} 
                        
                        System.out.println(yeyo);*/
                        
		} 
		catch (XQException e) { 
			muestraErrorXQuery(e);
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		finally { 
			try { 
				if (c != null) { 
					c.close(); 
				} 
			} 
			catch (XQException xe) { 
				xe.printStackTrace(); 
			} 
		} 
	} 
    
}
