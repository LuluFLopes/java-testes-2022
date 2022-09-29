package com.mycompany.java.bibliotecas.colecoes.model;

import java.util.List;

/**
 *
 * @author lucme
 */
public class ImpressoraDeLista {

    public void imprimeLista(List<List<String>> lista) {
        lista.forEach(System.out::println);
    }

    public void imprimeListaAgrupada(int idadeAux, int contador) {
        System.out.printf("\nIdade: %d - Registros: %d", idadeAux, contador);
    }

    public void imprimePergunta(List<String> perguntas) {
        int i = 1;
        for (String form : perguntas) {
            System.out.println(i++ + " - " + form);
        }
    }

}
