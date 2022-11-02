package generic;


public class Chave<S, N extends Number> {

    private S texto;
    private N numero;

    public Chave(S texto, N numero) {
        this.texto = texto;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return texto + "-" + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Chave<S, N> chave = (Chave<S, N>) o;
        if(this.numero.equals(chave.numero) && this.texto.equals(chave.texto)){
            return true;
        }
        return false;
    }
    
}
