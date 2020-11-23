package br.com.javaestudo.introducao;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 1000;
        salario += 800;
        salario -= 300;

        int dezPorcentoSalario = salario + (int)(salario*0.1); 

        System.out.println(dezPorcentoSalario);

    }
}
