package com.mycompany.java.bibliotecas.colecoes.main.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author lucme
 */
public class RetornaPrintWriter {

    public PrintWriter retornaParaFormulario(String nomeArquivo) {
        
        PrintWriter pw = null;

        try {
            pw = new PrintWriter("C:\\Users\\lucme\\OneDrive\\Área de Trabalho\\Desafios Movimento Codar!\\java-testes-2022\\Formularios\\" + nomeArquivo + ".txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi possível escrever o arquivo!");
        }

        return pw;
    }
    
    public PrintWriter retornaParaPergunta() {

        PrintWriter pw = null;
        
        try {
            pw = new PrintWriter("formulario.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi possível escrever o arquivo!");
        }
        
        return pw;
    }

}
