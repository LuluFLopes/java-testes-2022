package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import java.util.List;

/**
 *
 * @author lucme
 */
public class AuxiliarDeEscrita {

    private Formatacao formata;
    private EscritorDeArquivo escritor;

    public AuxiliarDeEscrita() {
        this.formata = new Formatacao();
        this.escritor = new EscritorDeArquivo();
    }

    public AuxiliarDeEscrita(Formatacao formata, EscritorDeArquivo escritor) {
        this.formata = formata;
        this.escritor = escritor;
    }

    /**
     * Veio da classe formulário.
     *
     * @param lista
     */
    public boolean auxiliarEscritaFormulario(List<String> lista) {

        String nomeArquivo = formata.formataString(lista);

        if (escritor.escreveFormulario(lista, nomeArquivo)) {
            return true;
        } else {
            return false;
        }

    }

}
