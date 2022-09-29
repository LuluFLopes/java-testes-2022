package com.mycompany.java.bibliotecas.colecoes.util;

/**
 *
 * @author lucme
 */
public class Conversor {

    /**
     *
     * @param resposta
     * @return
     */
    public int conversorDeStringParaInteiro(String resposta) {
        int idade;
        try {
            idade = Integer.parseInt(resposta);
        } catch (NumberFormatException ex) {
            return -1;
        }
        return idade;
    }

    public String conversorDeInteiroParaString(int resposta) {
        String texto;
        try {
            texto = Integer.toString(resposta);
        } catch (NumberFormatException ex) {
            return null;
        }
        return texto;
    }

}
