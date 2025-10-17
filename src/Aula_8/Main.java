package Aula_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana Luisa", "1111", "A1");
        a1.setNota1(8.5);
        a1.setNota2(5.7);
        //System.out.println(a1.imprimir());
        
        Professor prof1 = new Professor("Fabio", "123", "P1");
        prof1.setTipoVinculo('H');
        prof1.setSalario(35000);
        //System.out.println(prof1.imprimir());
        
        
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(a1);
        lstPessoas.add(prof1);
        
        for (Pessoa p : lstPessoas) {
            p.andar();
        }
        
        //CAST
        ((Aluno)lstPessoas.get(0)).getRa();     // aluno
        
        // filtrar a lista por Aluno
        /*for (Pessoa p : lstPessoas) {
            if (p instanceof Aluno) {
                ((Aluno) p).getRa();
            } 
        }*/
    }
}
