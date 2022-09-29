package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.model.ImpressoraDeLista;
import com.mycompany.java.bibliotecas.colecoes.util.Conversor;
import com.mycompany.java.bibliotecas.colecoes.util.PreencheListaFormulario;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class OrganizaMatrizTest {

    private OrganizaMatriz organiza;
    private List<List<String>> listaFormulario;
    private Set<String> memoriaIdade;
    private Conversor conversor = Mockito.mock(Conversor.class);
    private ImpressoraDeLista impressora = Mockito.mock(ImpressoraDeLista.class);
    private PreencheListaFormulario preenche = Mockito.mock(PreencheListaFormulario.class);

    @Test
    public void testaOrganizacaoDeListaPorNumeros() {

        organiza = new OrganizaMatriz(new ArrayList<>(), conversor, impressora, memoriaIdade, preenche);
        List<List<String>> lista = retornaListaDesorganizada();
        Mockito.when(preenche.preencheListaFormulario()).thenReturn(lista);
        List<List<String>> listaOrganizada = organiza.organizaMatriz();

        assertEquals("29", listaOrganizada.get(0).get(2));

    }

    public List<List<String>> retornaListaDesorganizada() {
        List<List<String>> listaDeListas = new ArrayList<>();
        List<String> lista = new ArrayList<>();

        lista.add("Teste40");
        lista.add("teste40@senac.com.br");
        lista.add("33");
        listaDeListas.add(lista);

        lista = new ArrayList<>();

        lista.add("Teste50");
        lista.add("teste50@senac.com.br");
        lista.add("29");
        listaDeListas.add(lista);

        return listaDeListas;

    }

}
