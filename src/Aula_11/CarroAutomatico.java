package Aula_11;

public class CarroAutomatico extends Carro implements IAutomatico{

    public CarroAutomatico(String marca, String placa, int numPortas) {
        super(marca, placa, numPortas);
    }

    @Override
    public void mudaMarchaAutomatico() {
        System.out.println("Carro muda marcha auto...");
    }
}
