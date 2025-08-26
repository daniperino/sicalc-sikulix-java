package com.example;

import org.sikuli.script.*;

public class Sical {
    // Caminho das imagens
    private static final String IMG_PATH = "C:\\Dani\\Java-exercicios\\SiCalc\\receita-demo\\src\\main\\resources\\images\\";
    public static void main(String[] args) {
        Screen tela = new Screen();

        try {
            Pattern botaoAbertura = new Pattern(IMG_PATH + "image-botao-abertura.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(botaoAbertura, 10);
            tela.click(botaoAbertura);

            Pattern botaoContinuar = new Pattern(IMG_PATH + "botao-continuar.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(botaoContinuar, 10);
            tela.click(botaoContinuar);

            Pattern botaoFuncoes = new Pattern(IMG_PATH + "botao-funcoes.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(botaoFuncoes, 10);
            tela.click(botaoFuncoes);

            Pattern botaoPreencherDarf = new Pattern(IMG_PATH + "botao-preencher-darf.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(botaoPreencherDarf, 10);
            tela.click(botaoPreencherDarf);

            Pattern digitarNome = new Pattern(IMG_PATH + "digitar-nome.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(digitarNome, 10);
            tela.type(digitarNome,"Daniella Perino");

        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }
}