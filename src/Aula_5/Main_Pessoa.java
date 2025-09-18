package Aula_5;


public class Main_Pessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Fabio", 52);
        Livro l = new Livro("Desventura", "12312", "Lenom");
        p.emprestar(l);
        
        p.imprimir();
    }

}
