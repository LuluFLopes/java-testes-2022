package com.mycompany.java.bibliotecas.colecoes.model.pergunta;

import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class ValidaPerguntaRepetida {

    private RetornaPergunta retorno;

    public ValidaPerguntaRepetida() {
        this.retorno = new RetornaPergunta();
    }

    public ValidaPerguntaRepetida(RetornaPergunta retorno) {
        this.retorno = retorno;
    }
    
    public boolean validaRepetido(String novaPergunta) {

        List<String> perguntas = new ArrayList<>();
        
        perguntas = retorno.retornaPergunta(perguntas);

        int contador = 1;
        for (String pergunta : perguntas) {
            if (novaPergunta.equals(pergunta.replace("P" + contador, "").replace("|", ""))) {
                return false;
            }
            contador++;
        }
        return true;
    }

}
