package Aula_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        Pessoa pessoa = null;
        int cont = 0;
        
        do {
            // cadastrar
            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            pessoa = new Pessoa(nome, idade);
            lstPessoas.add(pessoa);
            
            cont++;
        } while (cont < 3);
        
        // mostrar todos
        for (Pessoa p : lstPessoas) {
            p.imprimir();
        }
        
        // busca por nome
        System.out.println("Nome busca: ");
        String nome = sc.next();
        
        for (Pessoa p : lstPessoas) {
            if (p.getNome().equals(nome)) {
                p.imprimir();
            }
        }
    }
}
