package Aula_7;

public class Main_Func {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Patricia");
        Funcionario f2 = new Funcionario("Wilson");
        Funcionario f3 = new Funcionario("Maria Luisa");
        
        f3.setChefe(f2);
        f1.addSubordinado(f2);
        f2.addSubordinado(f3);
        
        f3.imprimirSubordinados();
    }
}

