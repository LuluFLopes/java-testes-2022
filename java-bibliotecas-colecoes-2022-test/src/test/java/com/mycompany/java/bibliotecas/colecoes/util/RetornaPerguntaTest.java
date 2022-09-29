package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.main.io.LeitorDeArquivo;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class RetornaPerguntaTest {
    
    private RetornaPergunta pergunta;
    
    private LeitorDeArquivo leitor = Mockito.mock(LeitorDeArquivo.class);
    
    @Test
    public void testaRetornoDeMetodo() {
        pergunta = new RetornaPergunta(leitor);
        List<String> perguntas = retornaPergunta();
        
        Mockito.when(pergunta.retornaPergunta(null)).thenReturn(perguntas);
        
        List<String> retorno = pergunta.retornaPergunta(perguntas);
        
        assertNotNull(retorno);
        
    }
    
    List<String> retornaPergunta(){
        List<String> lista = new ArrayList<>();
        
        lista.add("P1|Qual o seu nome completo?");
        lista.add("P2|Qual seu e-mail?");
        lista.add("P3|Qual sua idade?");
        lista.add("P4|Qual seu whatsapp ou celular?");
        
        return lista;
    }
}
