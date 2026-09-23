package Model;

public class Gin extends Produto {
    
    private String estilo;
    private String origem;

    public Gin(String estilo, String origem, int id, String nome, double preco, Estoque estoque) {
        super(id, nome, preco, estoque);
        this.estilo = estilo;
        this.origem = origem;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
}
