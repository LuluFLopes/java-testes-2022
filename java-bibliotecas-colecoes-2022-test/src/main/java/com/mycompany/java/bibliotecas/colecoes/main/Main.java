package com.mycompany.java.bibliotecas.colecoes.main;

import com.mycompany.java.bibliotecas.colecoes.main.io.EntradaTeclado;
import com.mycompany.java.bibliotecas.colecoes.model.pergunta.RemovePergunta;
import com.mycompany.java.bibliotecas.colecoes.model.formulario.RemoveFormulariosDuplicados;
import com.mycompany.java.bibliotecas.colecoes.model.ImpressoraDeLista;
import com.mycompany.java.bibliotecas.colecoes.model.formulario.IteraListaParaGravar;
import com.mycompany.java.bibliotecas.colecoes.model.formulario.OrganizaMatriz;
import com.mycompany.java.bibliotecas.colecoes.model.formulario.PesquisaFormulario;
import com.mycompany.java.bibliotecas.colecoes.model.pergunta.AdicionaPergunta;
import com.mycompany.java.bibliotecas.colecoes.util.AuxiliarDeEscrita;
import com.mycompany.java.bibliotecas.colecoes.util.PreencheListaFormulario;
import com.mycompany.java.bibliotecas.colecoes.util.RetornaPergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucme
 */
public class Main {

    public static void main(String[] args) {

        RemovePergunta pergunta = new RemovePergunta();
        RemoveFormulariosDuplicados formulario = new RemoveFormulariosDuplicados();
        List<String> questoes = new ArrayList<>();
        AuxiliarDeEscrita auxEscrita = new AuxiliarDeEscrita();
        PesquisaFormulario pesquisaForm = new PesquisaFormulario();
        PreencheListaFormulario preencheLista = new PreencheListaFormulario();
        ImpressoraDeLista impressoraDeListas = new ImpressoraDeLista();
        OrganizaMatriz organizador = new OrganizaMatriz();
        IteraListaParaGravar iteraLista = new IteraListaParaGravar();
        AdicionaPergunta adicionaPergunta = new AdicionaPergunta();
        RetornaPergunta retorno = new RetornaPergunta();
        EntradaTeclado entrada = new EntradaTeclado();

        boolean itera = true;

        while (itera) {
            System.out.println("\n1 - Candidatar-se.");
            System.out.println("2 - Adicionar pergunta ao formulário.");
            System.out.println("3 - Remover pergunta do formulário.");
            System.out.println("4 - Listar formulários cadastrados.");
            System.out.println("5 - Pesquisar repetições.");
            System.out.println("6 - Pesquisar cadastro.");
            System.out.println("7 - Sair");

            System.out.print("\nPor favor, selecione uma opção: ");
            int opcao = entrada.retornaInt();

            System.out.println("");

            switch (opcao) {
                case 1:

                    questoes = retorno.retornaPergunta(questoes);

                    List<String> respostas = iteraLista.iteraListaParaGravacao(questoes);

                    if (auxEscrita.auxiliarEscritaFormulario(respostas)) {
                        System.out.println("\nFormulário inserido com sucesso!\n");
                    } else {
                        System.out.println("\nErro ao cadastrar!\n");
                    }

                    break;
                case 2:

                    adicionaPergunta.adicionaPergunta();

                    break;
                case 3:

                    pergunta.removePergunta();

                    break;
                case 4:

                    boolean iteraSub = true;

                    while (iteraSub) {

                        System.out.println("\n1 - Listar organizando por idade.");
                        System.out.println("2 - Listar agrupando por idade.");
                        System.out.println("3 - Retornar ao menu principal.");

                        System.out.print("\nPor favor, seleciona a opção desejada: ");
                        int exibeListas = entrada.retornaInt();

                        switch (exibeListas) {

                            case 1:
                                List<List<String>> lista = organizador.organizaMatriz();
                                impressoraDeListas.imprimeLista(lista);
                                iteraSub = false;
                                break;
                            case 2:
                                organizador.organizaMatriz();
                                organizador.agrupaPorIdade();
                                iteraSub = false;
                                break;
                            case 3:
                                iteraSub = false;
                                break;
                            default:
                                System.out.print("\nValor inválido!");
                        }
                    }

                    break;
                case 5:

                    System.out.println("\nFormulários repetidos: \n");

                    List<List<String>> listaOrganizada = organizador.organizaMatriz();
                    List<List<String>> listaDeDuplicidade = formulario.buscaDuplicado(preencheLista.preencheListaFormulario());
                    impressoraDeListas.imprimeLista(listaDeDuplicidade);

                    break;
                case 6:

                    if (pesquisaForm.pesquisaFormulario(preencheLista.preencheListaFormulario())) {
                        System.out.println("\nCadastro existente!");
                    } else {
                        System.out.println("\nNão cadastrado!");
                    }

                    break;
                case 7:
                    System.out.println("Obrigado por utilizar o nosso sistema! Volte Sempre!");
                    itera = false;
                    break;
                default:
                    System.out.println("\nValor inválido!\n");
            }

        }

    }

}
