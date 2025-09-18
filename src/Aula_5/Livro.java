package Aula_5;

public class Livro {
    private String nome;
    private String isbn;
    private String autor;

    public Livro(String nome, String isbn, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String imprimir() {
        String msg = nome+" ("+autor+") - "+isbn;
        return msg;
    }
}
