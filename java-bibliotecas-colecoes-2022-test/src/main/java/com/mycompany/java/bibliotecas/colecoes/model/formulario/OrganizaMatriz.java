package com.mycompany.java.bibliotecas.colecoes.model.formulario;

import com.mycompany.java.bibliotecas.colecoes.model.ImpressoraDeLista;
import com.mycompany.java.bibliotecas.colecoes.util.Conversor;
import com.mycompany.java.bibliotecas.colecoes.util.PreencheListaFormulario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lucme
 */
public class OrganizaMatriz {
    
    private List<List<String>> listaFormulario;
    private Conversor conversor;
    private ImpressoraDeLista impressora;
    private Set<String> memoriaIdade;
    private PreencheListaFormulario preenche;
    
    public OrganizaMatriz() {
        this.listaFormulario = new ArrayList<>();
        this.conversor = new Conversor();
        this.impressora = new ImpressoraDeLista();
        this.memoriaIdade = new HashSet<>();
        this.preenche = new PreencheListaFormulario();
    }

    public OrganizaMatriz(List<List<String>> listaFormulario, Conversor conversor, ImpressoraDeLista impressora, 
            Set<String> memoriaIdade, PreencheListaFormulario preenche) {
        this.listaFormulario = listaFormulario;
        this.conversor = conversor;
        this.impressora = impressora;
        this.memoriaIdade = memoriaIdade;
        this.preenche = preenche;
    }

    /**
     * Organiza a lista de listas
     *
     */
    public List<List<String>> organizaMatriz() {
        
        listaFormulario = preenche.preencheListaFormulario();
        
        listaFormulario.sort((form1, form2) -> {
            return form1.get(2).compareTo(form2.get(2));
        });
        
        return listaFormulario;
        
    }

    /**
     * Imprime grupos de formulários por idade.
     */
    public void agrupaPorIdade() {
        
        listaFormulario = preenche.preencheListaFormulario();
        
        for (int i = 0; i < listaFormulario.size(); i++) {
            int contador = 0;
            int idadeAux = conversor.conversorDeStringParaInteiro(listaFormulario.get(i).get(2));
            for (int j = 0; j < listaFormulario.size(); j++) {
                
                if (idadeAux == Integer.parseInt(listaFormulario.get(j).get(2))) {
                    contador++;
                }
            }
           
            if (!memoriaIdade.contains(conversor.conversorDeInteiroParaString(idadeAux))) {
                impressora.imprimeListaAgrupada(idadeAux, contador);
            }
            memoriaIdade.add(conversor.conversorDeInteiroParaString(idadeAux));
        }
        System.out.println(" ");
    }
    
}
