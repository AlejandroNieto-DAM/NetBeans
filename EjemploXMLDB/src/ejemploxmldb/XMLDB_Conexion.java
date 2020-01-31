/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploxmldb;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQMetaData;
import org.xmldb.api.base.Collection; 
import org.xmldb.api.base.Database; 
import org.xmldb.api.base.Service; 
import org.xmldb.api.base.XMLDBException; 
import org.xmldb.api.DatabaseManager; 

public class XMLDB_Conexion {
    
        public static String nomClaseDS = "net.xqj.exist.ExistXQDataSource";

        private static XQConnection obtenConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, XQException{
            XQDataSource xqs = (XQDataSource) Class.forName(nomClaseDS).newInstance();
            xqs.setProperty("serverName", "localhost");
            xqs.setProperty("port", "8069");
            xqs.setProperty("user", "admin");
            xqs.setProperty("password", "");
            return xqs.getConnection();
        }

        private static void muestraErrorQuery(XQException e){
            System.err.println("XQuery ERROR mensaje: " + e.getMessage());
            System.err.println("XQuery ERROR causa: " + e.getCause());
            System.err.println("XQuery ERROR código: " + e.getVendorCode());
        }
    
	private static Collection obtenColeccion(String nomCol) throws Exception { 
		Database dbDriver; 
		Collection col; 
		dbDriver = (Database) Class.forName("org.exist.xmldb.DatabaseImpl").newInstance(); 
		DatabaseManager.registerDatabase(dbDriver); 
		col = DatabaseManager.getCollection("xmldb:exist://localhost:8080/exist/xmlrpc/db" + nomCol, "admin", ""); 
		return col; 
	} 
        
        public void prueba1(){
            Collection col = null;
		try { 
			col = obtenColeccion("/prueba1/ColeccionGimnasio/"); 
			System.out.println("Colección actual: " + col.getName()); 
			int numHijas = col.getChildCollectionCount(); 
			System.out.println(numHijas + " colecciones hijas."); 
			if (numHijas > 0) { 
				String nomHijas[] = col.listChildCollections(); 
				for (int i = 0; i < numHijas; i++) { 
					System.out.println("\t" + nomHijas[i]); 
				} 
			} 
			int numDocs = col.getResourceCount(); 
			System.out.println(numDocs + " documentos."); 
			if (numDocs > 0) { 
				String nomDocs[] = col.listResources(); 
				for (int i = 0; i < numDocs; i++) { 
					System.out.println("\t" + nomDocs[i]); 
				} 
			} 
			Service servicios[] = col.getServices(); 
			System.out.println("Servicios proporcionados por colección " + col.getName() + ":"); 
			for (int i = 0; i < servicios.length; i++) { 
				System.out.println("\t" + servicios[i].getName() + "  Versión:  " + servicios[i].getVersion()); 
			} 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		finally { 
			try { 
                            if (col != null) { 
                                    col.close(); 
                            } 
                        } 
                        catch (XMLDBException e) { 
                                e.printStackTrace(); 
                        } 
                }
        }

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, XQException { 
		XQConnection c = null;
                try {
                    c = obtenConexion();
                    XQMetaData xqmd = c.getMetaData();
                    System.out.println("Conexion establecida como: " + xqmd.getUserName() + ".");
                    System.out.println("Transacciones: " + (xqmd.isTransactionSupported() ? "Si" : "No") + ".\n");
                   
                
                } catch (XQException e) {
                    muestraErrorQuery(e);
                } catch (Exception e){
                    e.printStackTrace();
                } finally {
                    try {
                        if (c != null){
                            c.close();
                        }
                    } catch (XQException xe){
                        xe.printStackTrace();
                    }
                }
	} 
}   
