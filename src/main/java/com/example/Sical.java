package com.example;

import org.sikuli.script.*;

public class Sical {
    private static final String IMG_PATH = "C:\\Dani\\Java-exercicios\\SiCalc\\receita-demo\\src\\main\\resources\\images\\";
    public static void main(String[] args) {
        Screen tela = new Screen();

        try {
            // Cria um padrão com a imagem
            Pattern botaoAbertura = new Pattern(IMG_PATH + "image-botao-abertura.png");
            // Aguarda a imagem aparecer (até 10 segundos) e clica
            tela.wait(botaoAbertura, 10);
            tela.click(botaoAbertura);
            
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }
}