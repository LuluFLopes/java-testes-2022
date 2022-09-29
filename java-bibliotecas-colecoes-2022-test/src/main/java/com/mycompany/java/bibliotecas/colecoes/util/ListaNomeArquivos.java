package com.mycompany.java.bibliotecas.colecoes.util;

import java.io.File;

/**
 *
 * @author lucme
 */
public class ListaNomeArquivos {

    /**
     *
     * @return
     */
    public String[] listaDeArquivos(File file) {

        File caminho = file;
        String[] forms = caminho.list();
        return forms;

    }

}
