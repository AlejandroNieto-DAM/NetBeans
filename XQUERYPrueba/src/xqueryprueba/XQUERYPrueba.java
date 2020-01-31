/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xqueryprueba;
import javax.*;

/**
 *
 * @author alejandronieto
 */
public class XQUERYPrueba {

    public static String nomClaseDS = "net.xqj.exist.ExistXQDataSource";
    
    private static XQConnection obtenConexion(){
        XQDataSource xqs = (XQDataSource) Class.forName(nomClaseDS).newInstance();
        xqs.setProperty("serverName", "localhost");
        xqs.setProperty("port", "(puerto)");
        xqs.setProperty("user", "(usuario)");
        xqs.setProperty("password", "");
        return xqs.getConnection();
    }
    
    private static void muestraErrorQuery(XQException e){
        System.out.println("XQuery ERROR mensaje: " + e.message());
        System.out.println("XQuery ERROR causa: " + e.getCause());
        System.out.println("XQuery ERROR código: " + e.getVendorCode());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
