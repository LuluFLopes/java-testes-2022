package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.util.Conversor;

/**
 *
 * @author lucme
 */
public class ValidaIdade {

    private Conversor conversor;

    public ValidaIdade() {
        this.conversor = new Conversor();
    }

    public ValidaIdade(Conversor conversor) {
        this.conversor = conversor;
    }

    /**
     * Validando a idade do candidato.
     *
     * @param resposta
     * @return
     * @throws Exception
     */
    public boolean validaIdade(String resposta) throws Exception {

        int idade = conversor.conversorDeStringParaInteiro(resposta);

        if (idade > 0 && idade < 16) {
            System.out.println("\nMuito obrigado por seu interesse de estar com a gente!");
            System.out.println("Infelizmente, você não tem a idade mínima de 16 anos para participar.");
            System.out.println("Tente novamente quando chegar na idade permitida.\n");
            throw new Exception("Idade minima não alcançada!");
        } else {
            return true;
        }
    }

}
