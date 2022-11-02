package conduits;

import java.util.ArrayList;
import generic.*;

public class Carro extends Veiculo{
    private Chave<String, Integer> placa;
    private String cor;

    public static ArrayList<Carro> carros = new ArrayList<Carro>();

    public Carro(int id, String nome, String placaLetra, int placaNumero, String cor) {
        super(id, nome);
        this.setPlaca(placaLetra, placaNumero);
        this.setCor(cor);
        carros.add(this);
    }

    private void setPlaca(String placaLetra, int placaNumero) {
        this.placa = new Chave<String,Integer>(placaLetra, placaNumero);
    }
    private void setCor(String cor) {
        this.cor = cor;
    }

    public Chave<String,Integer> getPlaca() {
        return placa;
    }
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return ("Id do carro: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Placa: " + this.getPlaca() + "\n" +
        "Cor: " + this.getCor());
    }

    public static boolean removeCarro(int id) {
        for (Carro carro: Carro.carros) {
            if (carro.getId() == id) {
                Carro.carros.remove(carro);
                return true;
            }
        }
        return false;
    }

    public static Carro verificaId(int id) throws Exception {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }

        throw new Exception("Carro não encontrado");
    }

    public static Boolean verificaPlaca(Chave<String, Integer> placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }
}
