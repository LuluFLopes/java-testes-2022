package com.mycompany.java.bibliotecas.colecoes.util;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucme
 */
public class RetornaCaminhoTest {
    
    private RetornaCaminho caminho;

    @Test
    public void testSomeMethod() {
        
        caminho = new RetornaCaminho();
        File retorno = caminho.retornaCaminhoPasta();
        
        assertEquals("C:\\Users\\lucme\\OneDrive\\Área de Trabalho\\Desafios Movimento Codar!\\java-testes-2022\\Formularios", retorno.getAbsolutePath());
        
    }
    
}
