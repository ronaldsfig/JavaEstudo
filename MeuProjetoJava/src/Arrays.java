public class Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Ronaldo";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";

        for (String s : nomes) {
            System.out.println(s);
        }

        int[] numeros = {20, 15, 62};

        for (int i : numeros) {
            System.out.println(i);
        }

        boolean[] status = {true, false, true};

        for (boolean b : status) {
            System.out.println(b);
        }
    }
}
