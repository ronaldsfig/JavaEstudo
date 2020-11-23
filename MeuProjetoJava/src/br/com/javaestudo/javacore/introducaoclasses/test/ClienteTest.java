package br.com.javaestudo.javacore.introducaoclasses.test;

import br.com.javaestudo.javacore.introducaoclasses.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Ronaldo da Silva Figueiredo";
        cliente.cpf = "0745821963";
        cliente.rg = "224551665";
        cliente.telefone = "21973717970";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Rafael da Silva Azevedo";
        cliente2.cpf = "54632987";
        cliente2.rg = "87513652299";
        cliente2.telefone = "554421589962";

        System.out.println(cliente.nome);
        System.out.println(cliente.cpf);
        System.out.println(cliente.rg);
        System.out.println(cliente.telefone);

        System.out.println("-------------------------------------");

        System.out.println(cliente2.nome);
        System.out.println(cliente2.cpf);
        System.out.println(cliente2.rg);
        System.out.println(cliente2.telefone);
    }
}
