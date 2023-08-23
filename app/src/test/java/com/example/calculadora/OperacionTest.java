package com.example.calculadora;

import junit.framework.TestCase;

import org.junit.Before;

public class OperacionTest extends TestCase {

    private Operacion mOperacion;

    @Before        /*Esta etiqueta nos sirbe para iniacializar clase*/
    public void setUp(){
        mOperacion = new Operacion();
    }

    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    public void testSuma() throws Exception {
        assertEquals("7", mOperacion.suma("2" , "4"));
    }

    public void testResta() throws Exception {
        assertEquals("-1", mOperacion.resta("1" , "4"));
    }

    public void testDivision() throws Exception {
        assertEquals("10", mOperacion.division("80" , "10"));
    }

    public void testMultiplicacion() throws Exception {
        assertEquals("9", mOperacion.multiplicacion("2" , "3"));
    }
}