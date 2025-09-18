package Aula_5;

public class Pessoa {
    private String nome;
    private int idade;
    private Livro livro;
    private int diasDevolucao;
    
    public Pessoa() {
        System.out.println("Objeto instanciado...");
    }
    
    public Pessoa(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, Livro livro, int diasDevolucao) {
        this(nome, idade);
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    public String getLivro() {
        if (this.livro == null) {
            return "***";
        }
        else {
            return livro.getNome();
        }
    }
    
    public void emprestar(Livro livro) {
        this.livro = livro;
        this.diasDevolucao = 20;
    }
    
    public void emprestar(Livro livro, int dias) {
        this.livro = livro;
        this.diasDevolucao = dias;
    }
    
    public void imprimir() {
        String msg = "\n==================="
                    +"\nNome: "+nome
                    +"\nIdade: "+idade
                    +"\nLivro: "+livro.imprimir()
                    +"\nDias Devolucao: "+diasDevolucao
                    +"\n===================";
        System.out.println(msg);
        
    }
}
