package br.com.javaestudo.javacore.introducaoclasses.test;

import br.com.javaestudo.javacore.introducaoclasses.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        calcular.primeiroNumero = 5;
        calcular.segundoNumero = 2;

        calcular.subtrairNumeros();

        calcular.multiplicarNumeros(9, 5);

        int resultado = calcular.dividirNumeros(6, 3);
        System.out.print(resultado);
    }
}
