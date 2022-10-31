package conduits;

import java.util.ArrayList;
import generic.*;

public class Bicicleta extends Veiculo{
    private String marca;
    private String cor;

    public static ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    public Bicicleta(int id, String nome, String marca, String cor) {
        super(id, nome);
        this.setMarca(marca);
        this.setCor(cor);
        bicicletas.add(this);
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }
    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return ("Id da bicicleta: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Marca: " + this.getMarca() + "\n" +
        "Cor: " + this.getCor());
    }

    public static boolean removeBicicleta(int id) {
        for (Bicicleta bicicleta: Bicicleta.bicicletas) {
            if (bicicleta.getId() == id) {
                Bicicleta.bicicletas.remove(bicicleta);
                return true;
            }
        }
        return false;
    }

    public static Bicicleta verificaId(int id) throws Exception {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getId() == id) {
                return bicicleta;
            }
        }

        throw new Exception("Moto não encontrada");
    }
}
