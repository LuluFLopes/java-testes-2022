package com.mycompany.java.bibliotecas.colecoes.util;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucme
 */
public class ListaNomeArquivosTest {
    
    private ListaNomeArquivos lista;
    
    @Test
    public void testaRetornoListaDeArquivosNaPastaFormularios() {
        lista = new ListaNomeArquivos();
        File caminho = new File("C:\\Users\\lucme\\OneDrive\\Área de Trabalho\\Desafios Movimento Codar!\\java-testes-2022\\Formularios");
        
        String[] listaNomes = lista.listaDeArquivos(caminho);
        
        assertEquals("1-TESTE1.txt", listaNomes[0]);
        
    }
    
}
