package com.pratica07;

public class fatura_cliente{
    private int id;
    private double valor;
    private Cliente cliente;

   

    public fatura_cliente(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorComDesconto() {
    return valor - (valor * 0.10);
    }

    public String toString() {
        return "fatura_cliente{" +
            "id=" + id +
            ", valor=" + valor +
            ", cliente=" + cliente +
            '}';
}
}