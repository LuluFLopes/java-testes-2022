package com.mycompany.java.bibliotecas.colecoes.main.io;

import java.util.Scanner;

/**
 *
 * @author lucme
 */
public class EntradaTeclado {

    RetornaScanner retornoScanner = new RetornaScanner();
    Scanner entrada = retornoScanner.retornaScanner();

    public String[] retornaListaPesquisa() {

        String[] lista = new String[2];

        System.out.print("\nPor favor, digite o nome: ");
        lista[0] = entrada.nextLine();

        System.out.print("\nPor favor, digite o email: ");
        lista[1] = entrada.nextLine();

        return lista;
    }

    public String retornaString() {

        String resposta = entrada.nextLine();
        return resposta;
    }

    public int retornaInt() {

        int resposta = entrada.nextInt();
        return resposta;
    }

}
