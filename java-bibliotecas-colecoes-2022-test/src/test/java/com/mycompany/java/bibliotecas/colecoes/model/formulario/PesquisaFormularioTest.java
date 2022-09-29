package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class PesquisaFormularioTest {

    private PesquisaFormulario pesquisaFormulario;
    private EntradaTeclado entradaNomeEmail = Mockito.mock(EntradaTeclado.class);

    @Test
    public void testeDePesquisaDeFormulario() {

        pesquisaFormulario = new PesquisaFormulario(entradaNomeEmail);
        Mockito.when(entradaNomeEmail.retornaListaPesquisa()).thenReturn(listaDePesquisa());

        assertTrue(pesquisaFormulario.pesquisaFormulario(retornaLista()));

    }

    public List<List<String>> retornaLista() {
        List<List<String>> listaDeListas = new ArrayList<>();
        List<String> lista = new ArrayList<>();

        lista.add("Teste40");
        lista.add("teste40@senac.com.br");
        listaDeListas.add(lista);

        lista = new ArrayList<>();

        lista.add("Teste50");
        lista.add("teste50@senac.com.br");
        listaDeListas.add(lista);

        return listaDeListas;

    }

    public String[] listaDePesquisa() {

        String[] lista = {"Teste40", "teste40@senac.com.br"};
        return lista;

    }

}
