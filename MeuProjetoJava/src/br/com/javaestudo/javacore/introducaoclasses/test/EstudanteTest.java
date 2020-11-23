package br.com.javaestudo.javacore.introducaoclasses.test;

import br.com.javaestudo.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante ronaldo = new Estudante();
            ronaldo.nome = "Ronaldo da Silva Figueiredo";
            ronaldo.matricula = 15;

            System.out.println(ronaldo.matricula);
            System.out.print(ronaldo.nome);
    }
}
