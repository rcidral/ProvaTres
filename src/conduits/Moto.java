package conduits;

import java.util.ArrayList;
import generic.*;

public class Moto extends Veiculo{
    
    private Chave<String, Integer> placa;
    private String cilindrada;

    public static ArrayList<Moto> motos = new ArrayList<Moto>();

    public Moto(int id, String nome, String placaLetra, int placaNumero, String cilindrada) {
        super(id, nome);
        this.setPlaca(placaLetra, placaNumero);
        this.setCilindrada(cilindrada);
        motos.add(this);
    }

    private void setPlaca(String placaLetra, int placaNumero) {
        this.placa = new Chave<String,Integer>(placaLetra, placaNumero);
    }
    private void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Chave<String,Integer> getPlaca() {
        return placa;
    }
    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return ("Id da moto: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Placa: " + this.getPlaca() + "\n" +
        "Cilindrada: " + this.getCilindrada());
    }

    public static boolean removeMoto(int id) {
        for (Moto moto: Moto.motos) {
            if (moto.getId() == id) {
                Moto.motos.remove(moto);
                return true;
            }
        }
        return false;
    }

    public static Moto verificaId(int id) throws Exception {
        for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
        }

        throw new Exception("Moto não encontrada");
    }

    public static Boolean verificaPlaca(Chave<String, Integer> placa) {
        for (Moto moto : motos) {
            if (moto.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }
}
