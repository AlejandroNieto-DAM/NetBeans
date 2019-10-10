
import java.sql.*;  


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
class MysqlCon{  
    
    public static void main(String args[]) throws SQLException{  
        
        Statement stmt= null;
        
        try{  

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insti","root","cristorey");

            stmt= con.createStatement();  
            String query = "select DNI, nom_alum from insti.alumnos";
  
            
            ResultSet rs= stmt.executeQuery(query); 
      
            while (rs.next()) {
                
                String dni = rs.getString("DNI");
                String nombre = rs.getString("nom_alum");

                System.out.println(dni + "\t" + nombre);
            
            }
           
     
        con.close();  

        }catch(SQLException e){ 
            System.out.println(e);
        } finally {
            if (stmt != null) { stmt.close(); }
        }
    }  
}  

