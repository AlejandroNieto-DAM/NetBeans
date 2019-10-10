
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
    
            
            Class.forName("com.mysql.jdbc.Driver");  

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","cristorey");

            stmt= con.createStatement();  
            String query = "select * from alumnos";
  
            
            ResultSet rs= stmt.executeQuery(query); 
      
            while (rs.next()) {
                
                int dni = rs.getInt("DNI");
                String nombre = rs.getString("nom_alum");

                System.out.println(dni + "\t" + nombre);
            
            }
           
     
        con.close();  

        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
            System.out.println("YEYE");
        } finally {
            if (stmt != null) { stmt.close(); }
        }
    }  
}  
