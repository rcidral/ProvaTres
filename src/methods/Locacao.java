package methods;

import generic.*;
import java.util.ArrayList;

public class Locacao {
    
    private int id;
    private String data;
    private Vaga vaga;
    private Veiculo veiculo;

    public static ArrayList<Locacao> locacaos = new ArrayList<Locacao>();

    public Locacao(int id, String data, Vaga vaga, Veiculo veiculo) {
        this.setId(id);
        this.setData(data);
        this.setVaga(vaga);
        this.setVeiculo(veiculo);
        vaga.setLocacaos(this);
        locacaos.add(this);
    }

    private void setId(int id) {
        this.id = id;
    }
    private void setData(String data) {
        this.data = data;
    }
    private void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
    private void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }
    public String getData() {
        return data;
    }
    public Vaga getVaga() {
        return vaga;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return ("Id da vaga: " + this.getId() + "\n" +
        "Data: " + this.getData() + "\n" + 
        "Veiculo: " + this.getVeiculo().getNome());
    }

    public static boolean removeLocacao(int id) {
        for (Locacao locacao: Locacao.locacaos) {
            if (locacao.getId() == id) {
                Locacao.locacaos.remove(locacao);
                return true;
            }
        }
        return false;
    }
    
    public static Locacao verificaId(int id) throws Exception {
        for (Locacao locacao : locacaos) {
            if (locacao.getId() == id) {
                return locacao;
            }
        }

        throw new Exception("Locação não encontrada");
    }

    public static boolean verificaData(String data) {
        for (Locacao locacao : locacaos) {
            if (locacao.getData().equals(data)) {
                return true;
            }
        }
        return false;
    }
}
