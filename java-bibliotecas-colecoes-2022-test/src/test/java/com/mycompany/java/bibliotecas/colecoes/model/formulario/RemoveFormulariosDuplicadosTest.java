package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.util.Conversor;
import com.mycompany.java.bibliotecas.colecoes.util.Formatacao;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

/**
 *
 * @author lucme
 */
public class RemoveFormulariosDuplicadosTest {

    private RemoveFormulariosDuplicados removeDuplicado;
    private Conversor conversor = Mockito.mock(Conversor.class);
    private Formatacao formatacao = Mockito.mock(Formatacao.class);

    ;

    @Test
    public void testSomeMethod() {
    }

    List<List<String>> retornaLista() {

        List<List<String>> listaDeLista = new ArrayList<>();
        List<String> lista = new ArrayList<>();

        lista.add("Teste5");
        lista.add("teste5@senac.com.br");
        lista.add("33");
        lista.add("(11)91111-1111");

        listaDeLista.add(lista);

        lista = new ArrayList<>();

        lista.add("Teste5");
        lista.add("teste5@senac.com.br");
        lista.add("33");
        lista.add("(11)91111-1111");

        listaDeLista.add(lista);

        return listaDeLista;
    }

}
