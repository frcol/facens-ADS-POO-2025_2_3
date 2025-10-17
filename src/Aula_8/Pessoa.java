package Aula_8;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {}
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String imprimir() {
        String msg = "\nNome: "+getNome()
                    +"\nCPF: "+getCpf();
        
        return msg;
    }
    
    public void andar() {
        System.out.println("Andando padr�o...");
    }
}
