package EstruturaDeDados.Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class QueueNavegador {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();
        Queue<String> historicoFuturo = new LinkedList<>();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            limparTela();

            if (historico.isEmpty())
                System.out.printf("[<] para voltar [>] para ir \tGoogle.com \t [x] fechar navegardor\n\n");
            else
                System.out.printf("[<] para voltar [>] para ir \t%s \t [x] fechar navegardor\n\n", historico.peek());

            System.out.println("Digite o site que você quer: ");
            String site = leitor.nextLine();

            if (site.equalsIgnoreCase("x")) break;

            switch (site) {
                case "<":
                    if (!historico.isEmpty()) 
                        historicoFuturo.add(historico.pop());
                    break;
                    
                case ">":
                    if (!historicoFuturo.isEmpty())
                        historico.add(historicoFuturo.poll());
                    break;

                default:
                    historico.add(site);
                    if (!historicoFuturo.isEmpty())
                        if (!historicoFuturo.peek().equals(site))
                            historicoFuturo.clear();
                    break;}
            }
       
        leitor.close();
    }
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
    
}
