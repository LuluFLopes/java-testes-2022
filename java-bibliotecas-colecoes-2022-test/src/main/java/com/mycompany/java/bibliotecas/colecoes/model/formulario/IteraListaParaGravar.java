package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class IteraListaParaGravar {

    private PreencheFormulario preencheFormulario;
    private List<String> formulario;

    public IteraListaParaGravar() {
        this.preencheFormulario = new PreencheFormulario();
        this.formulario = new ArrayList<>();
    }

    public IteraListaParaGravar(PreencheFormulario preencheFormulario) {
        this.preencheFormulario = preencheFormulario;
    }

    /**
     * Percorre a lista.
     *
     * @param lista
     * @return
     */
    public List<String> iteraListaParaGravacao(List<String> lista) {

        for (String posicao : lista) {
            System.out.print(posicao + " ");
            try {
                formulario = preencheFormulario.preencheFormulario(formulario);
            } catch (Exception ex) {
                formulario = null;
                break;
            }
        }

        return formulario;

    }

}
