public class Cliente {

    private int id;
    private String nome;
    private int desconto;
    private String genero;

    // Construtor
    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = "nd";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDesconto() {
        return desconto;
    }

    // Setter
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    // toString
    @Override
    public String toString() {
        return nome + "(" + id + ")(" + desconto + "%)";
    }
}