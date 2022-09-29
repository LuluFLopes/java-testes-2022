package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import java.util.List;

/**
 *
 * @author lucme
 */
public class PesquisaFormulario {
    
    private EntradaTeclado entradaNomeEmail;

    public PesquisaFormulario() {
        this.entradaNomeEmail = new EntradaTeclado();
    }

    public PesquisaFormulario(EntradaTeclado entradaNomeEmail) {
        this.entradaNomeEmail = entradaNomeEmail;
    }
   
    /**
     * Verifica se existe um formulário com as informações capturadas.
     * @return 
     */
    public boolean pesquisaFormulario(List<List<String>> listaFormulario) {
        
        String lista[] = entradaNomeEmail.retornaListaPesquisa();

        for (List<String> form : listaFormulario) {
            if (form.get(0).equals(lista[0]) && form.get(1).equals(lista[1])) {
                return true;
            }
        }

        return false;

    }
    
}
