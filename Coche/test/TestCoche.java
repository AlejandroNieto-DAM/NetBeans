/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coche.Coche;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author alejandronieto
 */
public class TestCoche {
    
    public TestCoche() {
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
    
    @Test
    public void yeyeye_kebab_del_wenisimo_jejeje(){
        
        Coche elDelCarlos = new Coche("yeyo en mi iphone", "3864 JDK");
        Assert.assertEquals("yeyo en mi iphone", elDelCarlos.getMarca());
        Assert.assertEquals("3864 JDK", elDelCarlos.getMatricula());
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
