package methods;


import java.util.ArrayList;
import generic.*;

public class Vaga {
    
    private int id;
    private Chave<String, Integer> numero;
    private String tipo;
    private String tamanho;
    private double preco;
    private ArrayList<Locacao> locacaos;

    public static ArrayList<Vaga> vagas = new ArrayList<Vaga>();

    public Vaga(int id, String numeroLetra, int numeroNumero, String tipo, String tamanho, double preco) {
        this.setId(id);
        this.setNumero(numeroLetra, numeroNumero);
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setPreco(preco);
        this.locacaos = new ArrayList<Locacao>();
        vagas.add(this);
    }

    private void setId(int id) {
        this.id = id;
    }
    private void setNumero(String numeroLetra, int numeroNumero) {
        this.numero = new Chave<String,Integer>(numeroLetra, numeroNumero);
    }
    private void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    private void setPreco(double preco) {
        this.preco = preco;
    }
    public void setLocacaos(Locacao locacao) {
        this.locacaos.add(locacao);
    }

    private double getPrecos() {
        return this.locacaos.size() * getPreco();
    }
   
    public int getId() {
        return id;
    }
    public Chave<String,Integer> getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTamanho() {
        return tamanho;
    }
    public double getPreco() {
        return preco;
    }
    public ArrayList<Locacao> getLocacaos() {
        return locacaos;
    }

    @Override
    public String toString() {
        return ("Id da vaga: " + this.getId() + "\n" +
        "Numero: " + this.getNumero() + "\n" +
        "Tipo: " + this.getTipo() + "\n" +
        "Tamanho: " + this.getTamanho() + "\n" +
        "Preço: " + this.getPreco() + "\n" + 
        "Rendimento: " + this.getPrecos());
    }

    public static boolean removeVaga(int id) {
        for (Vaga vaga: Vaga.vagas) {
            if (vaga.getId() == id) {
                Vaga.vagas.remove(vaga);
                return true;
            }
        }
        return false;
    }

    public static Vaga verificaId(int id) throws Exception {
        for (Vaga vaga : vagas) {
            if (vaga.getId() == id) {
                return vaga;
            }
        }

        throw new Exception("Vaga não encontrada");
    }

    public static boolean verificaNumero(Chave<String, Integer> numero) {
        for (Vaga vaga : vagas) {
            if (vaga.getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
}
