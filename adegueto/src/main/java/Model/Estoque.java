package Model;

public class Estoque {
    
    private int id;
    private int quantidade;
    private int estoqueMin;

    public Estoque(int id, int quantidade, int estoqueMin) {
        this.id = id;
        this.quantidade = quantidade;
        this.estoqueMin = estoqueMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    
    public void adicionar() {
        quantidade++;
    }

    public void remover() {
        if (quantidade > 0){
            quantidade --;
        }
    }

    public boolean checaMin() {
        return quantidade <= estoqueMin;
    }
    
}
