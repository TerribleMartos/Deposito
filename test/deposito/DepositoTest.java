/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eric_
 */
public class DepositoTest {
    
    public DepositoTest() {
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

    /**
     * Test of setValoresDeposito method, of class Deposito.
     */
    @Test
    public void testSetValoresDeposito() {
        System.out.println("setValoresDeposito");
        String valor_idDeposito = "";
        float valor_diametro = 0.0F;
        float valor_altura = 0.0F;
        Deposito instance = new Deposito();
        instance.setValoresDeposito(valor_idDeposito, valor_diametro, valor_altura);
        // TODO review the generated test code and remove the default call to fail.
        
        fail("The test case is a prototype.");
        
    }

    /**
     * Test of getDiametro method, of class Deposito.
     */
    @Test
    public void testGetDiametro() {
        System.out.println("getDiametro");
        Deposito instance = new Deposito();
        float expResult = 0.0F;
        float result = instance.getDiametro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getAltura method, of class Deposito.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Deposito instance = new Deposito();
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getIdDeposito method, of class Deposito.
     */
    @Test
    public void testGetIdDeposito() {
        System.out.println("getIdDeposito");
        Deposito instance = new Deposito();
        String expResult = "";
        String result = instance.getIdDeposito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of valorCapacidad method, of class Deposito.
     */
    @Test
    public void testValorCapacidad() {
        System.out.println("valorCapacidad");
        Deposito instance = new Deposito();
        float expResult = 0.0F;
        float result = instance.valorCapacidad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
