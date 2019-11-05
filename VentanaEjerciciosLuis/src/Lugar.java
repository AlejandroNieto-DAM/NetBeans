
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
public class Lugar {
    private int id;
    private String nombre;
    private String direccion;
    private int numeroEdif;
    private String horario;
    
    

    public Lugar(int id, String nombre, String direccion, int numeroEdif, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEdif = numeroEdif;
        this.horario = horario;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroEdif(int numeroEdif) {
        this.numeroEdif = numeroEdif;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroEdif() {
        return numeroEdif;
    }

    public String getHorario() {
        return horario;
    }
    
}
