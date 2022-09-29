package com.mycompany.java.bibliotecas.colecoes.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucme
 */
public class ConversorTest {
    
    private Conversor conversor;

    @Test
    public void testaCoversaoDeStringEmInteiro() {
        
        conversor = new Conversor();
        
        assertEquals(20, conversor.conversorDeStringParaInteiro("20"));
        
    }
    
    @Test
    public void testaCoversaoDeInteiroEmString() {
        
        conversor = new Conversor();
        
        assertEquals("20", conversor.conversorDeInteiroParaString(20));
        
    }
    
}
