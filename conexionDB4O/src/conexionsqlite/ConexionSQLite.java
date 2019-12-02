/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionsqlite;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author alejandronieto
 */
public class ConexionSQLite {

    
    
        
        Pers a = new Pers(null, 0, null, 0f, 0);
        
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ObjectContainer db = Db4o.openFile("personas.db");
        Pers examplePlayer = new Pers(null, 0, null);
        
        
        Pers p1=new Pers("Noelia",20, "M");
        Pers p2=new Pers("Pepe",20, "H");
        Pers p3=new Pers("Maria",39, "M");
        Pers p4=new Pers("Antonio",70, "H");
        
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.commit();
        
        Query q = db.query();
        q.constrain(Pers.class);
        ObjectSet result1 = q.execute();
        System.out.println(result1.size());
        while(result1.hasNext()) {
            System.out.println(result1.next());
        }
        db.close();
        
        
    }
    
}
