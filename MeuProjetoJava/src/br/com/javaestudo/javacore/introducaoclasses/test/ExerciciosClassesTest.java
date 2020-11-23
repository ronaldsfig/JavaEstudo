package br.com.javaestudo.javacore.introducaoclasses.test;

import br.com.javaestudo.javacore.introducaoclasses.classes.ExercicioClasses;

public class ExerciciosClassesTest {
    public static void main(String[] args) {

        String[][] integrantes = new String[3][];
        integrantes[0] = new String[3];
            integrantes[0][0] = "Ronaldo";
            integrantes[0][1] = "Brasil";
            integrantes[0][2] = "10";
        integrantes[1] = new String[]{"Maria", "Alemanha", "16"};
        integrantes[2] = new String[]{"Pedro", "Japão", "25"};

        for (String[] keys : integrantes) {
            ExercicioClasses integrante = new ExercicioClasses();
            integrante.integrante[0] = keys[0];
            integrante.integrante[1] = keys[1];
            integrante.integrante[2] = keys[2];

            String resultado = integrante.entrarNoClube();
            System.out.println(resultado);
        }

    }
}
