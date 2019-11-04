/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Grupo {
    private int id;
    private String nombre;
    private String nombreDirector;
    private int edadMinima;
    private String horario;

    public Grupo(int id, String nombre, String nombreDirector, int edadMinima, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDirector = nombreDirector;
        this.edadMinima = edadMinima;
        this.horario = horario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
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

    public String getNombreDirector() {
        return nombreDirector;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getHorario() {
        return horario;
    }
    
    
}
