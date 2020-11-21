public class EntendendoBoolean {
    public static void main(String[] args) {
        String password = "123";
        String confirmPassword = "123";
        boolean verificarSenha = password == confirmPassword;
        
        System.out.println(verificarSenha);
    
        int primeiroValor = 10;
        int segundoValor = 20;
        boolean menorIgualQue = primeiroValor<=segundoValor;

        System.out.println(menorIgualQue);
    }
}
