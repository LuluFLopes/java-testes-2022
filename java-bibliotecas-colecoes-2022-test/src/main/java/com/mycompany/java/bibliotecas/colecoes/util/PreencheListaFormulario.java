package com.mycompany.java.bibliotecas.colecoes.util;

import com.mycompany.java.bibliotecas.colecoes.main.io.LeitorDeArquivo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class PreencheListaFormulario {
    
    private LeitorDeArquivo leitor;
    private RetornaCaminho caminho;
    private ListaNomeArquivos listaNomes;

    public PreencheListaFormulario() {
        this.leitor = new LeitorDeArquivo();
        this.caminho = new RetornaCaminho();
        this.listaNomes = new ListaNomeArquivos();
    }

    public PreencheListaFormulario(LeitorDeArquivo leitor, RetornaCaminho caminho, ListaNomeArquivos listaNomes) {
        this.leitor = leitor;
        this.caminho = caminho;
        this.listaNomes = listaNomes;
    }
    
    /**
     *
     * @return
     */
    public List<List<String>> preencheListaFormulario() {

        List<List<String>> listaFormulario = new ArrayList<>();
        List<String> formulario;
        
        String[] forms = listaNomes.listaDeArquivos(caminho.retornaCaminhoPasta());

        for (int i = 0; i < forms.length; i++) {
            formulario = leitor.lerFormulario(forms[i]);
            listaFormulario.add(formulario);
        }

        return listaFormulario;
    }
    
}
