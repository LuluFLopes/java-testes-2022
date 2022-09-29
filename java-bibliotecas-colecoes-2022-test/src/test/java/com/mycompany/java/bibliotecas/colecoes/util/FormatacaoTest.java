package com.mycompany.java.bibliotecas.colecoes.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucme
 */
public class FormatacaoTest {

    private Formatacao formata;

    @Test
    public void testaFormatacaoDoCaminho() {
        formata = new Formatacao();
        List<String> lista = new ArrayList<>();
        lista = retornaFormulario();
        String retorno = formata.formataString(lista);

        assertEquals("7-TESTE40", retorno);

    }

    @Test
    public void testaRetiradaDeDuplicacao() {
        formata = new Formatacao();

        List<List<String>> listaSemDuplicidade = formata.retiraDuplicado(retornaListaDuplicada());

        assertTrue(validaDuplicidade(listaSemDuplicidade));

    }

    // Mock de lista.
    List<String> retornaFormulario() {
        List<String> lista = new ArrayList<>();

        lista.add("Teste40");
        lista.add("teste40@senac.com.br");
        lista.add("33");
        lista.add("(11)91111-1111");

        return lista;
    }

    // Mock de lista.
    List<List<String>> retornaListaDuplicada() {
        List<List<String>> listaDeListas = new ArrayList<>();
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            lista.add("Teste40");
            lista.add("teste40@senac.com.br");
            lista.add("33");
            lista.add("(11)91111-1111");

            listaDeListas.add(lista);

        }

        return listaDeListas;
    }

    public boolean validaDuplicidade(List<List<String>> lista) {
        for (List<String> elemento1 : lista) {
            int contador = 0;
            for (List<String> elemento2 : lista) {
                if (elemento1.get(0).equals(elemento2.get(0)) && elemento1.get(1).equals(elemento2.get(1))) {
                    contador++;
                }

                if (contador >= 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
