package Aula_3;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        alu.setRa("1111");
        alu.setNome("Fabio Colombini");
        alu.setCurso("ADS");
        alu.imprimir();
        
        Aluno a = new Aluno();
        a.setRa("2222");
        a.setNome("Maria Joaquina");
        a.setCurso("Jogos");
        a.imprimir();
    }
}
