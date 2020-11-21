public class Condicao {
    public static void main(String[] args) {
        // até os 10 = não pode entrar no clube
        // 17 para baixo = clube juvenil
        // 18 para cima = clube adulto
        int idade = 17;
        String clube;

        if (idade < 10) {
            clube = "Nenhum";
        }else if (idade <= 17) {
            clube = "Clube juvenil";
        }else {
            clube = "Clube adulto";
        }

        System.out.println(clube);

    }
}
