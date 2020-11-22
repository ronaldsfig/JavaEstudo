public class ExercicioFor2 {
    public static void main(String[] args) {
        double valorCarro = 15000;
        for (int parcelas = 0; parcelas < valorCarro; parcelas++) {
            double valorParcela = valorCarro / parcelas;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+parcelas+" R$ "+valorParcela);
        };
    }
}
