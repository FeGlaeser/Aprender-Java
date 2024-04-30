package EstruturaDeDados.Queue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Queue<Map<String, Map<String, Integer>>> filaCliente = new LinkedList<>();

        while (true) {
            limparTela();
            if (filaCliente.isEmpty())
                System.out.println("Sem pedidos");
            else
                System.out.printf("Existem %d pedidos\n", filaCliente.size());
            System.out.println("[1] Adicionar Pedido");
            System.out.println("[2] Retirar Pedido");
            System.out.println("[3] Encerra Espediente");
            int lobby = leitor.nextInt();

            if (lobby < 1 || lobby > 3) {
                System.out.print("Escolha uma opção válida.");
                continue;}

            if (lobby == 1) {
                Map<String, Integer> pedido = new LinkedHashMap<>();
                while (true) {
                    leitor.nextLine();
                    System.out.print("Qual o nome do produto ('Q' para sair): ");
                    String nomeProduto = leitor.nextLine();

                    if (nomeProduto.equalsIgnoreCase("Q")) {
                        for (Map.Entry<String, Integer> entrada : pedido.entrySet()) {
                            System.out.printf("%s:\t\t\t%d\n", entrada.getKey(), entrada.getValue());}

                        System.out.print("Está certo [S]im [N]ão: ");
                        String certo = leitor.next();

                        if (certo.equalsIgnoreCase("N")) {
                            pedido.clear();
                            continue;
                        } else if (certo.equalsIgnoreCase("S"))
                            break;
                        else
                            continue;}

                    System.out.printf("Quantos %s: ", nomeProduto);
                    int quantia = leitor.nextInt();

                    pedido.put(nomeProduto, quantia);

                    limparTela();
                }

                System.out.print("Qual o nome do cliente: ");
                String clienteNome = leitor.next();
                Map<String, Integer> novoPedido = new LinkedHashMap<>(pedido);
                Map<String, Map<String, Integer>> cliente = new LinkedHashMap<>();
                cliente.put(clienteNome, novoPedido);
                filaCliente.add(cliente);
            } else if (lobby == 2) {
                if (filaCliente.isEmpty()) {
                    System.out.println("Não há pedidos na fila.");
                    continue;
                }
                Map<String, Map<String, Integer>> nextPedido = filaCliente.peek();
                System.out.println("O pedido do cliente " + nextPedido.keySet().iterator().next() + " é: ");

                for (Map.Entry<String, Integer> entrada : nextPedido.values().iterator().next().entrySet()) {
                    System.out.println(entrada.getKey() + ": " + entrada.getValue());}

                System.out.print("Está pronto [S]im [N]ão: ");
                String escolha = leitor.next();

                if (escolha.equalsIgnoreCase("n")) {
                    continue;}

                else if (escolha.equalsIgnoreCase("S")) {
                    filaCliente.poll();}

                else {
                    System.out.println("Escolha inválida. Tente novamente.");
                    continue;}

            } else if (lobby == 3) {
                break;}
        }

        leitor.close();
    }

    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}