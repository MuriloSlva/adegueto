package Model;

import java.time.LocalDateTime;

public class Venda {

    private int id;
    private LocalDateTime data;
    private double valorTotal;

    public Venda(int id, LocalDateTime data, double valorTotal) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adItem() {
        // Sem implementação ainda
    }

    public double calcTotal() {
        // Sem implementação ainda
        return 0.0;
    }

    public void finalizar() {
        // Sem implementação ainda
    }

}
