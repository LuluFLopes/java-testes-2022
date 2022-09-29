package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class AuxiliarDeEscritaTest {

    private AuxiliarDeEscrita auxEscrita;

    private Formatacao formata = Mockito.mock(Formatacao.class);
    private EscritorDeArquivo escritor = Mockito.mock(EscritorDeArquivo.class);

    @Test
    public void testaConclusaoDaEscrita() {
        auxEscrita = new AuxiliarDeEscrita(formata, escritor);
        List<String> lista = new ArrayList<>();
        lista = retornaLista(lista);

        Mockito.when(formata.formataString(lista)).thenReturn("1-TESTE1.txt");
        Mockito.when(escritor.escreveFormulario(lista, "1-TESTE1.txt")).thenReturn(true);

        assertTrue(auxEscrita.auxiliarEscritaFormulario(lista));

    }

    List<String> retornaLista(List<String> lista) {

        lista.add("Teste5");
        lista.add("teste5@senac.com.br");
        lista.add("33");
        lista.add("(11)91111-1111");

        return lista;
    }

}
