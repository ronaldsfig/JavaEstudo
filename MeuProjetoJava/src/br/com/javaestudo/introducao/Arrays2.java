package br.com.javaestudo.introducao;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];
        dias[0] = new int[]{9, 19, 29};
        dias[1] = new int[]{8, 18, 28};
        dias[2] = new int[3];

        for (int[] key : dias) {
            for (int i : key) {
                System.out.println(i);
            }
        }

        String[][] clientes = new String[3][];
        clientes[0] = new String[3];
            clientes[0][0] = "Ronaldo";
            clientes[0][1] = "973717970";
            clientes[0][2] = "ronaldo@123.com";
        clientes[1] = new String[]{"Maria", "0123456", "maria@123.com"};
        clientes[2] = new String[]{"João", "9876543", "joao@123.com"};

        for (String[] key : clientes) {
            System.out.println("O cliente "+key[0]+" possui o telefone "+key[1]+" e o e-mail "+key[2]);
        }




    }
}
