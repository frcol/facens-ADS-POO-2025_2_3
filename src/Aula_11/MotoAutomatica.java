package Aula_11;

public class MotoAutomatica extends Moto implements IAutomatico{

    public MotoAutomatica(String marca, String placa) {
        super(marca, placa);
    }

    @Override
    public void mudaMarchaAutomatico() {
        System.out.println("Moto muda marcha auto...");
    }
}
