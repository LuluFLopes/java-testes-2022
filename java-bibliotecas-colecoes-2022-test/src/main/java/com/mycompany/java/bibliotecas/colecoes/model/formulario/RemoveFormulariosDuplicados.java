package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.util.Conversor;
import com.mycompany.java.bibliotecas.colecoes.util.Formatacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class RemoveFormulariosDuplicados {

    private Conversor conversor;
    private Formatacao formatacao;
    private List<List<String>> listaAuxiliar;
    private List<List<String>> listaDuplicada;

    public RemoveFormulariosDuplicados() {
        this.conversor = new Conversor();
        this.formatacao =  new Formatacao();
        this.listaAuxiliar = new ArrayList<>();
        this.listaDuplicada = new ArrayList<>();
    }

    public RemoveFormulariosDuplicados(Conversor conversor, Formatacao formatacao, 
            List<List<String>> listaAuxiliar, List<List<String>> listaDuplicada) {
        this.conversor = conversor;
        this.formatacao = formatacao;
        this.listaAuxiliar = listaAuxiliar;
        this.listaDuplicada = listaDuplicada;
    }

    /**
     * Método que aponta formulários duplicados.
     *
     */
    public List<List<String>> buscaDuplicado(List<List<String>> listaFormulario) {

        for (List<String> forms : listaFormulario) {

            List<String> formDuplicado = new ArrayList();

            formDuplicado.add(forms.get(0));
            formDuplicado.add(forms.get(1));
            formDuplicado.add(forms.get(2));
            formDuplicado.add(forms.get(3));
            formDuplicado.add("0");

            int contador = 0;

            for (List<String> form : listaFormulario) {
                if (!form.get(1).equals(listaFormulario.get(contador))) {
                    listaAuxiliar.add(formDuplicado);
                }
                contador++;
                break;
            }
        }

        for (int i = 0; i < listaAuxiliar.size(); i++) {
            String email = listaAuxiliar.get(i).get(1);
            for (List<String> lista : listaAuxiliar) {
                if (email.equals(lista.get(1))) {
                    lista.set(4, conversor.conversorDeInteiroParaString(conversor
                            .conversorDeStringParaInteiro(lista.get(4)) + 1));
                }
            }
        }

        for (List<String> lista : listaAuxiliar) {
            if (conversor.conversorDeStringParaInteiro(lista.get(4)) >= 2) {
                lista.remove(4);
                listaDuplicada.add(lista);
            }
        }

        List<List<String>> listaFormatada = formatacao.retiraDuplicado(listaDuplicada);

        return listaFormatada;

    }

}
