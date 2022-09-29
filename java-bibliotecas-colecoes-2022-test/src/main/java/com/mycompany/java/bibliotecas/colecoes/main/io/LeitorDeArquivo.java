package com.mycompany.java.bibliotecas.colecoes.main.io;

import com.mycompany.java.bibliotecas.colecoes.main.io.RetornaBufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class LeitorDeArquivo {

    private RetornaBufferedReader rbr = new RetornaBufferedReader();

    /**
     *
     * @param String
     * @return List<String>
     * @throws IOException
     */
    public List<String> lerFormulario(String forms) {

        List<String> formulario;

        BufferedReader br = this.rbr.retornaParaFormulario(forms);
        formulario = new ArrayList<>();

        String linha = "";

        while (linha != null) {
            try {
                linha = br.readLine();
            } catch (IOException ex) {
                System.out.println("Não foi possível ler a linha!");
            }
            if (linha != null && !linha.equals("")) {
                formulario.add(linha);
            }
        }

        return formulario;

    }

    /**
     * Método recebe uma lista e a preenche com as informações lidas.
     * @param List<String>
     * @return List<String>
     * @throws IOException
     */
    public List<String> lerPergunta(List<String> perguntas)  {

        BufferedReader br = rbr.retornaParaPergunta();

        String linha = "";

        while (linha != null) {
            try {
                linha = br.readLine();
            } catch (IOException ex) {
                System.out.println("Não foi possível ler o arquivo!");
            }

            if (linha != null && !linha.equals("")) {
                perguntas.add(linha);
            }
        }
        return perguntas;
    }

}
