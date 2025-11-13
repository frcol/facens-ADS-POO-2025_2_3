package Aula_10;

public class Main_Pessoa {
    public static void main(String[] args) {
        Professor p1 = new Professor("Fabio");
        Professor p2 = new Professor("Joao");
        Professor p3 = new Professor("Maria");

        System.out.println(p1.getNome());
        Pessoa.mostraTotalPessoa();
    }
}
