package Aula_11;

public class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(String marca, String placa, int numPortas) {
        super(marca, placa);
        this.numPortas = numPortas;
    }

}
