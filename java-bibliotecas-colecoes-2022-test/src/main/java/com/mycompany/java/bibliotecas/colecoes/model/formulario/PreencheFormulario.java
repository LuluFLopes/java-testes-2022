package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.util.ValidaIdade;
import java.util.List;

/**
 *
 * @author lucme
 */
public class PreencheFormulario {

    private EntradaTeclado entrada;
    private ValidaIdade validador;

    public PreencheFormulario() {
        this.entrada = new EntradaTeclado();
        this.validador = new ValidaIdade();
    }

    public PreencheFormulario(EntradaTeclado entrada, ValidaIdade validaIdade) {
        this.entrada = entrada;
        this.validador = validaIdade;
    }

    /**
     * Gravando as respostas em lista.
     *
     * @param formulario
     * @return
     * @throws Exception
     */
    public List<String> preencheFormulario(List<String> formulario) throws Exception {
        String resposta = entrada.retornaString();
        if (validador.validaIdade(resposta)) {
            formulario.add(resposta);
        }

        return formulario;
    }

}
