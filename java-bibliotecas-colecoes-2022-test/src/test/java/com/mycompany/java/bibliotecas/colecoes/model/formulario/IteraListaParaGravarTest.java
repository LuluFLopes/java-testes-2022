package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class IteraListaParaGravarTest {
    
    private IteraListaParaGravar iteraLista;
    private PreencheFormulario preencheFormulario = Mockito.mock(PreencheFormulario.class);
    
    @Test
    public void testaSeResultadoDaNulo() {
        iteraLista = new IteraListaParaGravar(preencheFormulario);
        
        try {
            Mockito.when(preencheFormulario.preencheFormulario(null)).thenReturn(null);
            assertNull(iteraLista.iteraListaParaGravacao(new ArrayList<>()));
        } catch (Exception ex) {
            fail();
        }
        
    }
    
}
