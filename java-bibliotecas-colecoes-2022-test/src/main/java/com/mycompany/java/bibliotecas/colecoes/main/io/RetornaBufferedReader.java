package com.mycompany.java.bibliotecas.colecoes.main.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author lucme
 */
public class RetornaBufferedReader {

    public BufferedReader retornaParaFormulario(String forms) {
        
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\lucme\\OneDrive\\Área de Trabalho\\Desafios Movimento Codar!\\java-testes-2022\\Formularios\\" + forms));
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi possível ler o arquivo!");
        }

        return br;

    }
    
    public BufferedReader retornaParaPergunta() {
        
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("formulario.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi possível ler o arquivo!");
        }

        return br;

    }
    

}
