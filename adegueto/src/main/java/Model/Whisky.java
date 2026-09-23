package Model;

public class Whisky extends Produto {

    private String tipo;
    private String origem;
    private int idade;

    public Whisky(String tipo, String origem, int idade, int id, String nome, double preco, Estoque estoque) {
        super(id, nome, preco, estoque);
        this.tipo = tipo;
        this.origem = origem;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
