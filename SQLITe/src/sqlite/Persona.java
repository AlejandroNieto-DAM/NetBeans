
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class Persona implements Serializable{
    
    private String nombre;
    private Double altura;
    private float peso;
    private int edad;
    private int id;


    public Persona() {
        this.nombre = "";
        this.altura = 0.0;
        this.peso = 0;
        this.edad = 0;
        this.id = 0;
    }
    
    public Persona(String nombre, Double altura, float peso, int edad, int id) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.id = id;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
  
}
