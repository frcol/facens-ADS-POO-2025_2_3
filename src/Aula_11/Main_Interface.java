package Aula_11;

import java.util.ArrayList;

public class Main_Interface {
    public static void main(String[] args) {
        MotoAutomatica m1 = new MotoAutomatica("Honda", "asda");
        CarroAutomatico c1 = new CarroAutomatico("Wolks", "asdasd", 2);
        Patinete p1 = new Patinete();
        
        ArrayList<IAutomatico> lstAutomaticos = new ArrayList<>();
        lstAutomaticos.add(m1);
        lstAutomaticos.add(c1);
        lstAutomaticos.add(p1);
        
        for (IAutomatico a : lstAutomaticos) {
            a.mudaMarchaAutomatico();
        }
    }
}