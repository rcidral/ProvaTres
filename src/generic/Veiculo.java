package generic;

public class Veiculo {
    
    private int id;
    private String nome;

    public Veiculo(int id, String nome) {
        this.setId(id);
        this.setNome(nome);    
    }

    protected void setId(int id) {
        this.id = id;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}
