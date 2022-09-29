
package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.main.io.LeitorDeArquivo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class RetornaPergunta {
    
    private LeitorDeArquivo leitor;

    public RetornaPergunta() {
        this.leitor = new LeitorDeArquivo();
    }
    
    public RetornaPergunta(LeitorDeArquivo leitor) {
        this.leitor = leitor;
    }
    
     /**
     * 
     *
     * @param perguntas
     * @return
     */
    public List<String> retornaPergunta(List<String> perguntas) {

        perguntas = new ArrayList<>();

        perguntas = leitor.lerPergunta(perguntas);
        
        return perguntas;
    }
    
}
