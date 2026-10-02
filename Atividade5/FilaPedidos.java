package Atividade5;

import java.util.LinkedList;

public class FilaPedidos {
    private LinkedList<Pedido> pedidos = new LinkedList<>();

    // Insere no final da fila
    public void enqueue(Pedido pedido) {
        pedidos.addLast(pedido);
    }

    // Remove e retorna o pedido mais antigo (início da fila)
    public Pedido dequeue() {
        if (estaVazia()) {
            return null;
        }
        return pedidos.removeFirst();
    }

    public boolean estaVazia() {
        return pedidos.isEmpty();
    }

    public int tamanho() {
        return pedidos.size();
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Nenhum pedido na fila.");
            return;
        }

        for (Pedido pedido : pedidos) {
            pedido.exibirDados();
        }
    }
}
