package main;

public class Pedido {
    private double precoBurguer;
    private double quantidade;
    private double taxaEntrega;

    public double getPrecoBurguer() {
        return precoBurguer;
    }

    public void setPrecoBurguer(double precoBurguer) {
        this.precoBurguer = precoBurguer;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public double calcularTotal() {
        return Hamburgueria.calcularTotal(this.precoBurguer, this.quantidade, this.taxaEntrega);
    }
}