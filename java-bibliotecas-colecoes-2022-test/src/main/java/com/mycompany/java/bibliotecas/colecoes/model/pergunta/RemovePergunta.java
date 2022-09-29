package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.main.io.EscritorDeArquivo;
import com.mycompany.java.bibliotecas.colecoes.model.ImpressoraDeLista;
import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class RemovePergunta {

    private List<String> perguntas;
    private EntradaTeclado entrada;
    private RetornaPergunta retorno;
    private ImpressoraDeLista impressoraDeLista;
    private EscritorDeArquivo escritor;

    public RemovePergunta() {
        this.entrada = new EntradaTeclado();
        this.retorno = new RetornaPergunta();
        this.impressoraDeLista = new ImpressoraDeLista();
        this.escritor = new EscritorDeArquivo();
    }

    public RemovePergunta(EntradaTeclado entrada, RetornaPergunta retorno, ImpressoraDeLista impressoraDeLista, EscritorDeArquivo escritor) {
        this.entrada = entrada;
        this.retorno = retorno;
        this.impressoraDeLista = impressoraDeLista;
        this.escritor = escritor;
    }
    
    public boolean removePergunta() {

        perguntas = retorno.retornaPergunta(new ArrayList<>());
        impressoraDeLista.imprimePergunta(perguntas);

        System.out.print("Por favor, selecione a pergunta a ser removida: ");
        int opcao = entrada.retornaInt();

        if (opcao > 4) {
            perguntas.remove(opcao - 1);
            perguntas = escritor.escrevePergunta(perguntas);
            System.out.println("Pergunta removida com sucesso!");
            return true;
        } else {
            System.out.println("\nNão é possível remover perguntas padrão do sistema!");
            return false;
        }

    }

}
