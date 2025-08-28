package Aula_1;

import java.util.Scanner;

public class Main_demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nome = scan.next();
        
        System.out.println("Idade: ");
        int idade = scan.nextInt();
        
        if (idade >= 18) {
            System.out.println("O "+nome+" tem "+idade+" anos");
        }
        else {
            System.out.println("ACESSO NEGADO!!!!");
        }
        
        
        float valor = 33.5f;
        double saldo = 554.99;
        boolean isValid = true;
        char genero = 'm';
        
                
        System.out.println("Minha idade e "+idade);
        
    }
}
