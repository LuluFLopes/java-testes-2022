package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class ValidaPerguntaRepetidaTest {

    private ValidaPerguntaRepetida validaRepetida;
    private RetornaPergunta retorno = Mockito.mock(RetornaPergunta.class);

    @Test
    public void testaValidacaoDeRepeticao() {
        
        validaRepetida = new ValidaPerguntaRepetida(retorno);
        Mockito.when(retorno.retornaPergunta(new ArrayList<>())).thenReturn(retornaListaDePergunta());

        assertTrue(validaRepetida.validaRepetido("Qual seu whatsapp ou celular?"));
    }

    public List<String> retornaListaDePergunta() {
        List<String> lista = new ArrayList<>();

        lista.add("P1|Qual o seu nome completo?");

        return lista;
    }
}
