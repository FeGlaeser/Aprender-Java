import java.util.Scanner;

public class MainLancheria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int opcao = opcoesInicio(leitor);
            if (opcao == 5) break;
        }

    leitor.close();
    }

    public static int opcoesInicio(Scanner leitor) {
        int escolha;
        while (true) {
            limparTela();
            System.out.println("[1] Inserir Pedido ");
            System.out.println("[2] Ver A fila de Pedidos Atual");
            System.out.println("[3] Excluir Pedido");
            System.out.println("[4] Finalizar Pedido");
            System.out.println("[5] Fechar Sistema");

        String escolhaTexto = leitor.next();

        try {
            escolha = Integer.parseInt(escolhaTexto);
        } catch (NumberFormatException e) {
            System.out.print("Erro, informe um valor númerico.");

            try {Thread.sleep(2000);}
            catch (InterruptedException i) {i.printStackTrace();}
            continue;}

        if (escolha > 0 && escolha < 6)
            break;}
        
        return escolha;
    
    }

    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}
