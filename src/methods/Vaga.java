package methods;

import java.util.ArrayList;

public class Vaga {
    
    private int id;
    private int numero;
    private String tipo;
    private String tamanho;
    private double preco;
    private ArrayList<Locacao> locacaos;

    public static ArrayList<Vaga> vagas = new ArrayList<Vaga>();

    public Vaga(int id, int numero, String tipo, String tamanho, double preco) {
        this.setId(id);
        this.setNumero(numero);
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setPreco(preco);
        this.locacaos = new ArrayList<Locacao>();
        vagas.add(this);
    }

    private void setId(int id) {
        this.id = id;
    }
    private void setNumero(int numero) {
        this.numero = numero;
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
    public int getNumero() {
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

}
