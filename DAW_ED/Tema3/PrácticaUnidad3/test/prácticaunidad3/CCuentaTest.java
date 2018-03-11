/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author robert
 */
public class CCuentaTest extends TestCase {
    
    public CCuentaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of asignarNombre method, of class CCuenta.
     */
    public void testAsignarNombre() {
        System.out.println("asignarNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.asignarNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombre method, of class CCuenta.
     */
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estado method, of class CCuenta.
     */
    public void testEstado() {
        System.out.println("estado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.estado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta. Comprobar excepcion de ingresar cantidad negativa
     * @throws java.lang.Exception
     */
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = -1.1;
        
        CCuenta instance = new CCuenta();
        try{
            instance.ingresar(cantidad);
            fail("Se esperaba excepcion de metodo Ingresar");
        }catch(Exception e){
            System.out.println(" --" + e + "--- Excepcion comprobada con exito");
        }
    }
    
    /**
     * Test of retirar method, of class CCuenta. Comprobar excepciones del metodo retirar, cantidad negativa y saldo insuficiente
     * @throws java.lang.Exception
     */
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        final double cantidadNegativa = -1.0;
        final double cantidadFueraDeSaldo = 3000.0;
        
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        
        try{
            instance.retirar(cantidadNegativa);
            fail("Se esperaba excepcion de metodo Ingresar");
        }catch(Exception e){
            System.out.println(" --" + e + "--- Excepcion comprobada con exito");
        }
        try{
            instance.retirar(cantidadFueraDeSaldo);
            fail("Se esperaba excepcion de metodo Ingresar");
        }catch(Exception e){
            System.out.println(" --" + e + "--- Excepcion comprobada con exito");
        }
            
    }
      /**
     * Test of Ingresar Y retirar method, of class CCuenta. Pruebas aleatorias de cajana negra
     */
    public void testIngresarYretirar() throws Exception {
        System.out.println("Ingresar y Retirar");
        double cantidad = 0;
        final int CANT_PRUEBAS = 3;
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",0,0);
        
        for (int i = 0; i < CANT_PRUEBAS; i++) { //realizar la prueba con 3 numeros enteroas aleatorios
            cantidad = Math.random();
            
            instance.ingresar(cantidad);
            assertTrue(instance.estado() == cantidad); // comprobar si se ha ingreaso la cantidad
            
            instance.retirar(cantidad);
            assertTrue(instance.estado() == 0 ); //comprobar que la cantidad despues de retirar vuelve a ser 0
        }
    }

    /**
     * Test of obtenerCuenta method, of class CCuenta.
     */
    public void testObtenerCuenta() {
        System.out.println("obtenerCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
