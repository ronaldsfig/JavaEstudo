package br.com.javaestudo.javacore.introducaoclasses.classes;

public class Calculadora {
    public int primeiroNumero;
    public int segundoNumero;

    public void somarNumeros(){
        System.out.println(primeiroNumero+segundoNumero);
    }

    public void subtrairNumeros(){
        System.out.println(primeiroNumero-segundoNumero);
    }

    public void multiplicarNumeros(int primeiroValor, int segundoValor){
        System.out.println(primeiroValor*segundoValor);
    }

    public int dividirNumeros(int primeiroValor, int segundoValor){
        return primeiroValor/segundoValor;
    }
}
