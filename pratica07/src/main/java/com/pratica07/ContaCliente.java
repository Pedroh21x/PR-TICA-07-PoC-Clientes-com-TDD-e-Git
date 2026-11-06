package com.pratica07;

public class ContaCliente {
    private int Id;
    private Cliente cliente;
    private double saldo = 0.0;

    public ContaCliente(int id, Cliente cliente, double saldo) {
        Id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int id, Cliente cliente) {
        Id = id;
        this.cliente = cliente;
    }

    public ContaCliente(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCliente{" +
            "cliente=" + cliente +
            ", saldo=" + saldo +
            ", Id=" + Id +
            '}';
    }

    public double addDeposito(double saldo){
        return this.saldo += saldo;
    }

    public double subSaldo(double deposito){
        if(saldo == 0){
            System.out.println("Saldo insuficiente");
        }
        return this.saldo -= deposito;
    }

}
