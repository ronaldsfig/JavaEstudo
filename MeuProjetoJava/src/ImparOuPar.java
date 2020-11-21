public class ImparOuPar {
    public static void main(String[] args) {
        int primeiroValor = 11;
        int segundoValor = 5;
        int resto = primeiroValor%segundoValor;

        System.out.println("O resto é "+ resto);
        
        if (resto >= 1) {
            System.out.println("O número é ímpar");
        }else{
            System.out.println("O número é par");
        };
    }
}
