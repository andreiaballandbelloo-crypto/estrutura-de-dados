package Atividade5;

import java.util.Scanner;

public class Lanchonete {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        FilaPedidos fila = new FilaPedidos();

        int escolha = 0;
        int proximoNumero = 1;

        do {
            System.out.println(" === MENU ===");
            System.out.println("(1) Adicionar pedido");
            System.out.println("(2) Processar pedido");
            System.out.println("(3) Exibir pedidos na fila");
            System.out.println("(4) Sair");
            System.out.println("Escolha uma opção: ");

            try {
                // nextLine + parseInt evita sobrar "enter" no buffer
                escolha = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, informe um número.");
                escolha = -1;
            }

            switch (escolha) {

                case 1: {
                    System.out.println("Informe o nome do cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.println("Informe os itens do pedido: ");
                    String descricao = scanner.nextLine();

                    Pedido pedido = new Pedido(proximoNumero, cliente, descricao);
                    fila.enqueue(pedido);
                    proximoNumero++;

                    System.out.println("Pedido #" + pedido.numero + " adicionado à fila");
                break;
                }

                case 2: {
                    Pedido processado = fila.dequeue();

                    if (processado == null) {
                        System.out.println("Não há pedidos para processar.");
                    } else {
                        System.out.println("Pedido processado:");
                        processado.exibirDados();
                    }
                break;
                }

                case 3: {
                    System.out.println("Pedidos na fila: " + fila.tamanho());
                    fila.exibir();
                break;
                }

                case 4: {
                    System.out.println("Saindo...!");
                break;
                }

                default:
                    System.out.println("Entrada inválida");
                break;
            }

        } while (escolha != 4);

        scanner.close();
    }
}
