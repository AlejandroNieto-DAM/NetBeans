


import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class ConnectToBD {
    
    private String conector;
    private String port;
    private String ip;
    private String dbName;
    private String database;
    
    private String user;
    private String passwd;
    
    private String directory;
    
    ConnectToBD(){
        conector = "jdbc";
        
        database = "sqlite";
        
        directory = "/Users/alejandronieto/Desktop/EjercicioVentanaLuis.db";
    }
    
    
    //******** SETS ********//
    
    public void setConector(String conector){
        this.conector = conector;
    }
    
    public void setPort(String port){
        this.port = port;
    }
    
    public void setIP(String ip){
        this.ip = ip;
    }
    
    public void setDBName(String dbname){
        this.dbName = dbname;
    }
    
    public void setDatabase(String database){
        this.database = database;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPasswd(String passwd){
        this.passwd = passwd;
    }
    
    public void setDirectory(String directory){
        this.directory = directory;
    }
    
    
    //******** GETS ********//
    
    public String getConectorName(){
        return conector;
    }
    
    public String getPort(){
        return port;
    }
    
    public String getIP(){
        return ip;
    }
    
    public String getDBName(){
        return dbName;
    }
    
    public String getDataBase(){
        return database;
    }
    
    public String getDBUser(){
        return user;
    }
    
    public String getDBPasswd(){
        return passwd;
    }
    
    public String getDirectory(){
        return directory;
    }
    
    public ObjectContainer getConnector() throws SQLException {

        ObjectContainer db = Db4o.openFile("bdDatosVentanaLuis");
        
        
        return db;
    }
        
}

    

