package com.mycompany.java.bibliotecas.colecoes.main.io;

import com.mycompany.java.bibliotecas.colecoes.main.io.RetornaPrintWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author lucme
 */
public class EscritorDeArquivo {

    private RetornaPrintWriter retornoPw;

    public EscritorDeArquivo() {
        this.retornoPw = new RetornaPrintWriter();
    }

    public EscritorDeArquivo(RetornaPrintWriter retornoPw) {
        this.retornoPw = retornoPw;
    }

    /**
     * Preenche a lista de String com as informações lidas.
     *
     * @param List<String>
     * @return List<String>
     */
    public List<String> escrevePergunta(List<String> perguntas) {

        PrintWriter pw = retornoPw.retornaParaPergunta();

        perguntas.forEach(pergunta -> pw.println(pergunta));

        pw.close();

        return perguntas;
    }

    /**
     * Preenche
     *
     * @param List<String>, String
     */
    public boolean escreveFormulario(List<String> lista, String nomeArquivo) {

        PrintWriter pw = retornoPw.retornaParaFormulario(nomeArquivo);

        lista.forEach(formulario -> pw.println(formulario));

        pw.close();

        if (!lista.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
