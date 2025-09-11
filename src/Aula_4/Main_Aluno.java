package Aula_4;

import java.util.Scanner;

public class Main_Aluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;
        Aluno aluno = null;

        do {
            System.out.println("[1]- Cadastrar");
            System.out.println("[2]- Imprimir");
            System.out.println("[3]- Sair");
            opt = scan.nextInt();

            switch (opt) {
                case 1: // cadastrar
                    System.out.print("Nome: ");
                    String nome = scan.next();
                    System.out.print("RA: ");
                    String ra = scan.next();
                    System.out.print("Curso: ");
                    String curso = scan.next();

                    aluno = new Aluno(nome, ra, curso);
                    break;
                case 2:
                    if (aluno != null) {
                       aluno.imprimir(); 
                    }
                    else {
                        System.out.println("Cadastre um ALUNO primeiro [1]");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar o nosso App");
                    break;
                default:
                    System.out.println("## OPCAO INVALIDA ##");

            }
        } while(opt != 3);
    }
}
