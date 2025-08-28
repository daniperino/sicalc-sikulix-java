package com.example.steps;

import org.sikuli.script.*;

import io.cucumber.java.an.E;
//import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Dado;
import static org.junit.Assert.*;

public class SicalcStepDefinition {
    private Screen tela;

    private static final String IMG_PATH = "C:\\Dani\\Java-exercicios\\SiCalc\\receita-demo\\src\\main\\resources\\images\\";

    public SicalcStepDefinition() {
        this.tela = new Screen();
        System.out.println("Iniciando um novo cenário de teste e preparando a tela");
    }
    @Dado("que a tela inicial do Sicalc é exibida")
    public void que_a_tela_inicial_do_Sicalc_é_exibida() throws FindFailed{
        Pattern botaoAbertura = new Pattern(IMG_PATH + "image-botao-abertura.png");
        tela.wait(botaoAbertura, 10);
        tela.click(botaoAbertura);
        System.out.println("Passo: 'Dado' Tela inicial do Sicalc exibida");
    }

    @Quando("eu clico no botão de continuar")
    public void eu_clico_no_botão_de_continuar() throws FindFailed {
        Pattern botaoContinuar = new Pattern(IMG_PATH + "botao-continuar.png");
        tela.wait(botaoContinuar, 10);
        tela.click(botaoContinuar);
        System.out.println("Passo: 'Quando' Botão de continuar clicado");
    }

    @E("clico no menu de funções")
    public void clico_no_menu_de_funções() throws FindFailed {
        Pattern menuFuncoes = new Pattern(IMG_PATH + "botao-funcoes.png");
        tela.wait(menuFuncoes, 10);
        tela.click(menuFuncoes);
        System.out.println("Passo: 'E' Menu de funções clicado");
    }

    @E("seleciono a opção de preenchimento de DARF")
    public void seleciono_a_opção_de_preenchimento_de_DARF() throws FindFailed {
        Pattern opcaoPreenchimentoDARF = new Pattern(IMG_PATH + "botao-preencher-darf.png");
        tela.wait(opcaoPreenchimentoDARF, 10);
        tela.click(opcaoPreenchimentoDARF);
        System.out.println("Passo: 'E' Opção de preenchimento de DARF selecionada");
    }   

    @E("preencho o nome com {string}")
    public void preencho_o_nome_com(String nome) throws FindFailed {
        Pattern campoNome = new Pattern(IMG_PATH + "digitar-nome.png");
        tela.wait(campoNome, 10);
        tela.type(campoNome, nome);
        System.out.println("Passo: 'E' Campo de nome preenchido com: " + nome);
    }

    @Então("deve abrir o modal para {string}")
    public void deve_abrir_o_modal_para(String modalEsperado) throws FindFailed {
        Pattern modal = new Pattern(IMG_PATH + "preenchimento-de-darf.png");
        if (tela.exists(modal, 10) != null) {
            System.out.println("Passo: 'Então' Modal verificado com sucesso: " + modalEsperado);
        } else {
            throw new AssertionError("O modal não foi encontrado: " + modalEsperado);
        }
    }

    @Dado("que o modal de preenchimento de DARF está aberto")
    public void que_o_modal_de_preenchimento_de_DARF_está_aberto() throws FindFailed {
        Pattern modal = new Pattern(IMG_PATH + "preenchimento-de-darf.png");
        tela.wait(modal, 10);
        if (tela.exists(modal) != null) {
            System.out.println("Passo: 'Dado' Modal de preenchimento de DARF está aberto");
        } else {
            throw new AssertionError("O modal de preenchimento de DARF não foi encontrado");
        }
    }

    @Quando("eu preencho o campo Cod Receita com {string}")
    public void eu_preencho_o_campo_Cod_Receita_com(String valor) throws FindFailed {
        Pattern campoPattern = new Pattern(IMG_PATH + "campo-cod-receita.png");
        tela.wait(campoPattern, 10);
        tela.type(campoPattern, valor);
        if (tela.exists(campoPattern, 10) != null) {
            System.out.println("Passo: 'Quando' Campo Cod Receita preenchido com: " + valor);
        } else {
            throw new AssertionError("O campo Cod Receita não foi encontrado");
        }
    }

    @E("clico no próximo campo")
    public void clico_no_próximo_campo() throws FindFailed {
        Pattern proximoCampo = new Pattern(IMG_PATH + "digitar-nome.png");
        tela.wait(proximoCampo, 10);
        tela.click(proximoCampo);
        System.out.println("Passo: 'E' Próximo campo clicado");
    }

    @Então("o modal de calculo para pagamento é aberto")
    public void o_modal_de_calculo_para_pagamento_é_aberto() throws FindFailed {
        Pattern modalCalculo = new Pattern(IMG_PATH + "modal-para-calculo.png");
        if (tela.exists(modalCalculo, 10) != null) {
            System.out.println("Passo: 'Então' Modal de cálculo para pagamento verificado com sucesso");
        } else {
            throw new AssertionError("O modal de cálculo para pagamento não foi encontrado");
        }
    }


}   


