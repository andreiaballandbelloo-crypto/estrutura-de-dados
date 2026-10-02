package Atividade5;

public class Pedido {
    public int numero;
    public String cliente;
    public String descricao;

    public Pedido(int numero, String cliente, String descricao) {
        this.numero = numero;
        this.cliente = cliente;
        this.descricao = descricao;
    }

    public void exibirDados() {
        System.out.println(
            "Pedido #" + this.numero +
            " | Cliente: " + this.cliente +
            " | Itens: " + this.descricao
        );
    }
}
