package com.mycompany.java.bibliotecas.colecoes.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class ValidaIdadeTest {

    private ValidaIdade validador;
    private Conversor conversor = Mockito.mock(Conversor.class);

    @Test
    public void testSomeMethod() {
        validador = new ValidaIdade(conversor);

        Mockito.when(conversor.conversorDeStringParaInteiro("20")).thenReturn(20);

        try {
            assertTrue(validador.validaIdade("20"));
        } catch (Exception ex) {
            fail();
        }

    }

}
