package br.com.javaestudo.javacore.introducaoclasses.test;

import br.com.javaestudo.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Onix";
        carro.placa = "123F2N";
        carro.velocidadeMaxima = 180f;
        System.out.println(carro.velocidadeMaxima);
    }
}
