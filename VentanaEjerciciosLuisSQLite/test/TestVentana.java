/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejandronieto
 */
public class TestVentana {
    
    public TestVentana() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  /*  @Test
    public void pruebaInsercioPersonaYLoComprobamosConElTamanioDelVector() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        Ventana ventana = new Ventana();
        
        ventana.crearNuevaPersona("antonio", 1.0, Float.NaN, 1);
        int result1 = 1;
        int result2 = ventana.getPersonasDim();
        
        
        Assert.assertEquals(result1, result2);
        
        
    }*/
    
    @Test
    public void pruebaInsercionCorrectaPersona() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        
        Ventana ventana = new Ventana();
        
        ventana.crearNuevaPersona("antonio", 1.0, Float.NaN, 1);
         
        String nombre = "antonio";
        int pos = ventana.getPersonasDim() - 1;
        
        Persona aux = ventana.getPersona(pos);
        
        Assert.assertEquals(nombre, aux.getNombre());
        
    }
    
   /* @Test 
    public void pruebaInsercioGrupoYLoComprobamosConElTamanioDelVector() throws IOException, FileNotFoundException, ClassNotFoundException{
        Ventana ventana = new Ventana();
        
        ventana.crearNuevoGrupo("grupo", "director", 10, "horario", "antonio");
        int result1 = 1;
        int result2 = ventana.getGruposDim();
        
        
        Assert.assertEquals(result1, result2);
    }*/
    
    @Test
    public void pruebaInsercionCorrectaGrupo() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        Ventana ventana = new Ventana();
        
        ventana.crearNuevoGrupo("grupo", "director", 10, "horario", "antonio");
        
        String nombre = "grupo";
        int pos = ventana.getGruposDim() - 1;
        
        Grupo aux = ventana.getGrupo(pos);
        
        Assert.assertEquals(nombre, aux.getNombre());
        
    }
    
   /* @Test 
    public void pruebaInsercioLugaroYLoComprobamosConElTamanioDelVector() throws IOException, FileNotFoundException, ClassNotFoundException{
        Ventana ventana = new Ventana();
        
        ventana.crearNuevoLugar("lugar", "direccion", 10, "horario", "grupo");
        int result1 = 1;
        int result2 = ventana.getLugaresDim();
        
        
        Assert.assertEquals(result1, result2);
    }*/
    
    @Test
    public void pruebaInsercionCorrectaLugar() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        Ventana ventana = new Ventana();
        
        ventana.crearNuevoLugar("lugar", "direccion", 10, "horario", "grupo");
        
        String nombre = "lugar";
        int pos = ventana.getLugaresDim() - 1;
        
        Lugar aux = ventana.getLugar(pos);
        
        Assert.assertEquals(nombre, aux.getNombre());
        
    }
    
    
    @Test
    public void pruebaInsercionCorrectaCiudad() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        Ventana ventana = new Ventana();
        
        ventana.crearNuevaCiudad("ciudad", "pais", "provincia", "edificioEmblematico", "lugar");
        
        String nombre = "ciudad";
        int pos = ventana.getCiudadesDim() - 1;
        
        Ciudad aux = ventana.getCiudad(pos);
        
        Assert.assertEquals(nombre, aux.getNombre());
        
    }
}
