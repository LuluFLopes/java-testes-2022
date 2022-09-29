package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import com.mycompany.java.bibliotecas.colecoes.model.ImpressoraDeLista;
import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;

/**
 *
 * @author lucme
 */
public class RemovePerguntaTest {

    private RemovePergunta removePergunta;
    private EntradaTeclado entrada = Mockito.mock(EntradaTeclado.class);
    private RetornaPergunta retorno = Mockito.mock(RetornaPergunta.class);
    private ImpressoraDeLista impressoraDeLista = Mockito.mock(ImpressoraDeLista.class);
    private EscritorDeArquivo escritor = Mockito.mock(EscritorDeArquivo.class);
//    private ArgumentCaptor<List<String>> captura;

    @Test
    public void testaRemocaoDePergunta() {
        
        removePergunta = new RemovePergunta(entrada, retorno, impressoraDeLista, escritor);

//        Class<ArrayList<String>> listClass =
//              (Class<ArrayList<String>>)(Class)ArrayList.class;
//        
//        captura = ArgumentCaptor.forClass(listClass);
        
        Mockito.when(retorno.retornaPergunta(new ArrayList<>())).thenReturn(retornaListaDePergunta());
        Mockito.when(entrada.retornaInt()).thenReturn(5);
        Mockito.when(escritor.escrevePergunta(retornaListaDePergunta())).thenCallRealMethod();
        
//        Mockito.verify(escritor, times(1)).escrevePergunta(captura.capture());
//        List<String> listaCapturada = captura.getValue();
//        assertEquals(4, listaCapturada.size());

        assertTrue(removePergunta.removePergunta());
        
    }

    public List<String> retornaListaDePergunta() {
        List<String> lista = new ArrayList<>();

        lista.add("P1|Qual o seu nome completo?");
        lista.add("P2|Qual seu e-mail?");
        lista.add("P3|Qual sua idade?");
        lista.add("P4|Qual seu whatsapp ou celular?");
        lista.add("P5|Qual a sua principal linguagem de programação?");
        
        return lista;
    }

}
