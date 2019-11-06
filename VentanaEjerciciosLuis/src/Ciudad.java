
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Ciudad implements Serializable{
    
    private String nombre;
    private String pais;
    private String provincia;
    private String edificioEmblematico;
    private int id;
    private String lugar;
    
    
    

    public Ciudad(String nombre, String pais, String provincia, String edificioEmblematico, int id, String lugar) {
        this.nombre = nombre;
        this.pais = pais;
        this.provincia = provincia;
        this.edificioEmblematico = edificioEmblematico;
        this.id = id;
        this.lugar = lugar;
       
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEdificioEmblematico(String edificioEmblematico) {
        this.edificioEmblematico = edificioEmblematico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEdificioEmblematico() {
        return edificioEmblematico;
    }

    public int getId() {
        return id;
    }
    
  
 
}
