package br.com.javaestudo.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 14;
        String status;

        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";

        System.out.println(status);
 
    }
}
