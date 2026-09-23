package Model;

public class ItemVenda {
    
    private int quantidade;
    private int precoUnitario;
    private Produto produto;

    public ItemVenda(int quantidade, int precoUnitario, Produto produto) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public double calcSubTotal() {
        // Sem implementação ainda
        return 0.0;
    }
    
}
