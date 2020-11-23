package br.com.javaestudo.introducao;

public class ExercicioCondicao {
    public static void main(String[] args) {
        double capital = 500;
        double imposto;

        if (capital < 1000) {
            imposto = capital*0.05;
        }else if(capital >= 1000 && capital < 2000){
            imposto = capital*0.1;
        }else if(capital >= 2000 && capital < 4000){
            imposto = capital*0.15;
        }else{
            imposto = capital*0.2;
        };

        System.out.println("R$ "+imposto);
    }
}
