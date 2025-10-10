package Aula_7;

public class Main_Socio {
    public static void main(String[] args) {
        Socio s1 = new Socio("Fabio");
               
        s1.addDependente("Igor");
        s1.addDependente(new Dependente("Ana Livia"));
        
        s1.imprimir();
        
        s1 = null;
    }
}
