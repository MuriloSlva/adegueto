package Model;

public class Vinho extends Produto {

    private String tipo;
    private String origem;
    private String uva;
    private int safra;

    public Vinho(String tipo, String origem, String uva, int safra, int id, String nome, double preco, Estoque estoque) {
        super(id, nome, preco, estoque);
        this.tipo = tipo;
        this.origem = origem;
        this.uva = uva;
        this.safra = safra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

}
