package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class AdicionaPergunta {

    private List<String> perguntas;
    private EntradaTeclado entrada;
    private RetornaPergunta retorno;
    private EscritorDeArquivo escritor;
    private ValidaPerguntaRepetida validaRepetidas;

    public AdicionaPergunta() {
        this.entrada = new EntradaTeclado();
        this.retorno = new RetornaPergunta();
        this.escritor = new EscritorDeArquivo();
        this.validaRepetidas = new ValidaPerguntaRepetida();
    }

    public AdicionaPergunta(EntradaTeclado entrada, RetornaPergunta retorno, 
            EscritorDeArquivo escritor, ValidaPerguntaRepetida validaRepetidas) {
        this.entrada = entrada;
        this.retorno = retorno;
        this.escritor = escritor;
        this.validaRepetidas = validaRepetidas;
    }
    
    public boolean adicionaPergunta() {

        System.out.print("\nPor favor, digite a pergunta a ser adicionada: ");
        String pergunta = entrada.retornaString();
        perguntas = retorno.retornaPergunta(new ArrayList<>());

        if (validaRepetidas.validaRepetido(pergunta)) {
            perguntas.add("P" + (perguntas.size() + 1) + "|" + pergunta);
            perguntas = escritor.escrevePergunta(perguntas);
            System.out.println("\nPerguta incluída com sucesso!\n");
        } else {
            System.out.println("\nNão é possível adicionar uma pergunta já existente!\n");
            perguntas = null;
        }

        if (perguntas == null) {
            return false;
        } else {
            return true;
        }
    }

}
