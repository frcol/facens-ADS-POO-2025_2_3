package Aula_6;

import java.util.ArrayList;

public class Main_Pessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        
        Pessoa p1 = new Pessoa("Fabio", 52);
        Pessoa p2 = new Pessoa("Joao", 33);
        Pessoa p3 = new Pessoa("Carlos", 23);
        
        lstPessoas.add(p1);
        lstPessoas.add(p2);
        lstPessoas.add(p3);
        
        for (Pessoa p : lstPessoas) {
            p.imprimir();
        }
    }
}
