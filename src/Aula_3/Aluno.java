package Aula_3;

public class Aluno {
    // Atributos
    private String ra;
    private String nome;
    private String curso;
    
    // Metodos
    public String getRa(){
        return ra;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //================================
    public void imprimir() {
        System.out.println("\n\nNome: "+nome);
        System.out.println("RA: "+ra);
        System.out.println("Curso: "+curso);
    }
}
