package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class AdicionaPerguntaTest {

    private AdicionaPergunta addPergunta;
    private EntradaTeclado entrada = Mockito.mock(EntradaTeclado.class);
    private RetornaPergunta retorno = Mockito.mock(RetornaPergunta.class);
    private EscritorDeArquivo escritor = Mockito.mock(EscritorDeArquivo.class);
    private ValidaPerguntaRepetida validaRepetidas = Mockito.mock(ValidaPerguntaRepetida.class);

    @Test
    public void testaSeGravaNoFormatoCorreto() {

        addPergunta = new AdicionaPergunta(entrada, retorno, escritor, validaRepetidas);

        Mockito.when(entrada.retornaString()).thenReturn("Qual o seu nome completo?");
        Mockito.when(retorno.retornaPergunta(new ArrayList<>())).thenReturn(new ArrayList<>());
        Mockito.when(validaRepetidas.validaRepetido("Qual o seu nome completo?")).thenReturn(true);
        
        assertTrue(addPergunta.adicionaPergunta());
       
    }

}
