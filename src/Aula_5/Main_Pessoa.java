package Aula_5;


public class Main_Pessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa("Fabio", 52);
        Pessoa p2 = new Pessoa("Joao", 33, "Star Wars", 50);
        
        p1.emprestar("Ensaio sobre a Cegueira");
        p2.emprestar("Desventuras em Série", 60);
        
        p.imprimir();
        p1.imprimir();
        p2.imprimir();
    }

}
