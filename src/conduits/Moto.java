package conduits;

import java.util.ArrayList;
import generic.*;

public class Moto extends Veiculo{
    
    private String placa;
    private String cilindrada;

    public static ArrayList<Moto> motos = new ArrayList<Moto>();

    public Moto(int id, String nome, String placa, String cilindrada) {
        super(id, nome);
        this.setPlaca(placa);
        this.setCilindrada(cilindrada);
        motos.add(this);
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }
    private void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPlaca() {
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
}
