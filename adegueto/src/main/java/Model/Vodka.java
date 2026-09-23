package Model;

public class Vodka extends Produto {
    
    private String origem;

    public Vodka(String origem, int id, String nome, double preco, Estoque estoque) {
        super(id, nome, preco, estoque);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
}
