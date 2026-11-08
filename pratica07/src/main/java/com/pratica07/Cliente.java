package com.pratica07;
public class Cliente {

    private int id;
    private String nome;
    private int desconto;
    private String genero;

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = "nd";
    }
    public int getId() {
    return id;
}
public String getNome() {
    return nome;
}
}