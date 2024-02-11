package Trabalho_final_prog1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Login {
    public static boolean login(String nomeDoUsuario, String senha){
        Arquivo arq = new Arquivo ("nomeDoUsuario.txt");
        String retorno = arq.ler();
        String vetor [] = retorno.split("\n");
        boolean us = false;
        int us1 = 0;
        boolean pin = false;
        int pin1= 0;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(nomeDoUsuario)){
                us = true;
                us1 = i + 1;
            }
            if(vetor[i].equals(senha)){
                pin = true;
                pin1 = i;
            }
        }
        if((us == true)&&(pin == true)&&(us1 == pin1)){
            return true;
        }else return false;  
    }
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        System.out.println("Digite o Usuário: ");
        String us = e.next();
        System.out.println("Digite a senha: ");
        String pin = e.next();
        boolean v = login(us, pin);
        Calendar c = Calendar.getInstance();
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        if (v){
            System.out.println("Olá " + us +". Hoje é dia" + f.format(c.getTime()) + ". Seja bem vindo à disciplina de Programação II!!");
        }else{
            System.out.println("Usuário ou Senha Incorretos");
        }
    }
}

