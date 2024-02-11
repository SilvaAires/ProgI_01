package Trabalho_final_prog1;

import java.util.Scanner;

public class cadastro {
    public static void cadastro(String nomeDoUsuario, String senha){
        Arquivo arq = new Arquivo ("nomeDoUsuario.txt");
        arq.gravar(nomeDoUsuario);
        arq.gravar(senha);
    }
    public static void main(String [] args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite o nome do usuario: ");
        String us = e.next();
        System.out.println("Digite a senha do usuario: ");
        String pin = e.next();
        cadastro(us, pin);
    }
}
