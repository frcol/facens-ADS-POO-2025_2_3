package Aula_1;

import java.util.Scanner;

public class Main_demo2 {

    public static void main(String[] args) {
         final double pi = 3.1444;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("[1]- Cadastro\n[2]- Busca\n[3]- Sair");
//        int opt = scan.nextInt();
//        
//        switch (opt) {
//            case 1:
//                System.out.println("Cadastrando");
//                break;
//            case 2:
//                System.out.println("Buscandp...");
//                break;
//            case 3:
//                System.out.println("Tchau!");
//                break;
//            default:
//                System.out.println("Opcao invalida");
//        }

//        for (int i = 1; i < 100; i=+2) {
//            System.out.println(i);
//        }
//        int num;
//        do {
//            System.out.println("Numero: ");
//            num = scan.nextInt();
//        } while (num >= 0);
        
        int vet[] = {4,5,7,8,9};
        vet[0] = 10;
        System.out.println(vet[0]);
        
        int vet2[] = new int[5];
        
        for (int i = 0; i < vet.length; i++ ) {
            System.out.println(vet[i]);
        }
    }
}
