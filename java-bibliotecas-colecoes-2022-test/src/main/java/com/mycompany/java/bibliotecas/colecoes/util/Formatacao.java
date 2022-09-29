package com.mycompany.java.bibliotecas.colecoes.util;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author lucme
 */
public class Formatacao {

    /**
     * 
     * @param str
     * @return 
     */
    public String removerAcentos(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    /**
     * 
     * @param caminho
     * @param lista
     * @return 
     */
    public String formataString(List<String> lista) {
        RetornaCaminho caminho = new RetornaCaminho();
        String arquivoBruto = (caminho.retornaCaminhoPasta().list().length + 1) + " - " + removerAcentos(lista.get(0).toUpperCase());
        String arquivoFormatado = arquivoBruto.replaceAll(" ", "");
        return arquivoFormatado;

    }
    
    public List<List<String>> retiraDuplicado(List<List<String>> lista) {

        Set<List<String>> retiraDuplicado = new LinkedHashSet(lista);
        List<List<String>> listaFormatada = new ArrayList<>(retiraDuplicado);
        
        return listaFormatada;
    }

}
