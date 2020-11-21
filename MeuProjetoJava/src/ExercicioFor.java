public class ExercicioFor {
    public static void main(String[] args) {
        // mostrar todos os números ímpares até x

        int numero = 10;

        for(int contador = 0; contador <= numero; contador++){
            if (contador%2 >= 1) {
                System.out.println("O número "+contador+" é ímpar");
            };
        };
    }
}
