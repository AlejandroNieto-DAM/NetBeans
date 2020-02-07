
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQResultSequence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class ExistXML {
    
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
        
        public void deletePersona(int id){
            String delete = "update delete doc(\"//db/EjercicioLuis/Personas.xml\")/personas/persona[id=\"" + id + "\"]";
            
            XQConnection c = null; 
            try { 
			c = obtenConexion(); 
                        
			XQExpression xqe = c.createExpression(); 
			xqe.executeCommand(delete);
			
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
        
        public void update(String nombre, Double altura, Float peso, int edad, int id){
            String updateNombre = "update value doc(\"//db/EjercicioLuis/Personas.xml\")"
                    + "/personas/persona[id=\"" + id + "\"]/nombre with \'" + nombre +"\'";
            
            String updatePeso = "update value doc(\"//db/EjercicioLuis/Personas.xml\")"
                    + "/personas/persona[id=\"" + id + "\"]/peso with \'" + peso +"\'";
            
            String updateAltura = "update value doc(\"//db/EjercicioLuis/Personas.xml\")"
                    + "/personas/persona[id=\"" + id + "\"]/altura with \'" + altura +"\'";
            
            String updateEdad = "update value doc(\"//db/EjercicioLuis/Personas.xml\")"
                    + "/personas/persona[id=\"" + id + "\"]/edad with \'" + edad +"\'";
            
            XQConnection c = null; 
            try { 
			c = obtenConexion(); 
                        
			XQExpression xqe = c.createExpression(); 
			xqe.executeCommand(updateNombre);
                        xqe.executeCommand(updateAltura); 
                        xqe.executeCommand(updatePeso); 
                        xqe.executeCommand(updateEdad); 
                        
			
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
        
        public void insertarPersona(String nombre, Double altura, Float peso, int edad, int id){
            String cad = "update insert "
                                + "<persona>"
                                +   "<id>" + id + "</id>" 
                                +   "<nombre>" + nombre + "</nombre>"
                                +   "<peso>" + peso + "</peso>"
                                +   "<altura>" + altura + "</altura>"
                                +   "<edad>" + edad + "</edad>"
                                + "</persona>"
                                + " into doc(\"//db/EjercicioLuis/Personas.xml\")/personas";
            
            XQConnection c = null; 
            try { 
			c = obtenConexion(); 
                        
			XQExpression xqe = c.createExpression(); 
			xqe.executeCommand(cad); 
			
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

        public String getXML() { 
            
            String cadena = "";
		XQConnection c = null; 
		try { 
			c = obtenConexion(); 
			String cad = "doc(\"//db/EjercicioLuis/Personas.xml\")/personas/persona"; 
                        
			XQExpression xqe = c.createExpression(); 
			XQResultSequence xqrs = xqe.executeQuery(cad); 
			int i=1; 
                        boolean cogerTextoAhora = false;
			while (xqrs.next()) { 
				System.out.println("[Resultado "+(i++)+"]"); 
                                cogerTextoAhora = false;
				XMLStreamReader xsr = xqrs.getItemAsStream(); 
                                
				while (xsr.hasNext()) { 
					if (xsr.getEventType() == XMLStreamConstants.CHARACTERS) {
                                            if(cogerTextoAhora){
                                                cadena += xsr.getText() + "#"; 
                                                cogerTextoAhora = false;
                                            } else {
                                                cogerTextoAhora = true;
                                            }
                                           
					} 
					xsr.next(); 
				} 
			} 
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
                
                
            return cadena;
	} 
}
