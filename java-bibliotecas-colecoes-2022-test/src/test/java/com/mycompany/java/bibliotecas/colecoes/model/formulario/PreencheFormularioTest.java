package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.util.ValidaIdade;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class PreencheFormularioTest {

    private PreencheFormulario preencheFormulario;
    private EntradaTeclado entrada = Mockito.mock(EntradaTeclado.class);
    private ValidaIdade validador = Mockito.mock(ValidaIdade.class);

    @Test
    public void testaSeFormularioFicouNulo() {
        preencheFormulario = new PreencheFormulario(entrada, validador);

        try {
            Mockito.when(entrada.retornaString()).thenReturn("20");
            Mockito.when(validador.validaIdade("20")).thenReturn(true);
            assertEquals("20", preencheFormulario.preencheFormulario(new ArrayList<>()).get(0));
        } catch (Exception ex) {
            fail();
        }
       
    }

}
