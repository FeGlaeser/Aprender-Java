import java.util.Scanner;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class MainLancheria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LinkedList<Cliente> pedidos = new LinkedList<>();

        while (true) {
            int opcao = opcoesInicio(leitor);
            if (opcao == 5) break;

            switch (opcao) {
                case 1:
                    LinkedList<HashMap<String, Float>> pedido = new LinkedList<>();
                    pedido = criarPedido(leitor);
                    Exibir(pedido);
                    if (confirmar("pedido", leitor)){
                        System.out.print("Qual o nome do cliente: ");
                        leitor.nextLine();
                        String nome = leitor.nextLine();

                        Cliente cliente = new Cliente(nome, pedido);
                        pedidos.add(cliente);}
                    break;

                case 2:
                    limparTela();
                    mostrar(pedidos);
                    System.out.print("Digite algo para continuar: ");
                    leitor.next();
                    break;
                
                case 3:
                    limparTela();
                    mostrar(pedidos);
                    if (confirmar("Exclusão", leitor)) {
                        pedidos = Excluir(pedidos, leitor);}
                    System.out.print("aperte algo para continuar: ");
                    leitor.next();
                    break;
                
                case 4:
                    break;
            }
        }
        System.out.print(pedidos);

    leitor.close();
    }

    public static int opcoesInicio(Scanner leitor) {
        int escolha;
        while (true) {
            limparTela();
            System.out.println("[1] Inserir Pedido ");
            System.out.println("[2] Ver A fila de Pedidos Atual");
            System.out.println("[3] Excluir Pedido");
            System.out.println("[4] Concluir Pedido");
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
    public static LinkedList<HashMap<String, Float>> criarPedido(Scanner leitor) {
        LinkedList<HashMap<String, Float>> pedido = new LinkedList<>();
        while (true) {
            HashMap<String, Float> comida = new HashMap<>();
            limparTela();

            System.out.println("Qual o nome do produto? [S]air");
            leitor.nextLine();
            String produto = leitor.nextLine();

            if (produto.equalsIgnoreCase("S"))
                break;

            System.out.print("Qual o preço: ");
            float preco = leitor.nextFloat();

            System.out.print("Quantos: ");
            preco *= leitor.nextInt();

            comida.put(produto, preco);
            pedido.add(comida);
        }
        return pedido;}
    public static void Exibir(LinkedList<HashMap<String, Float>> pedido) {
        float total = 0;
        for (HashMap<String, Float> map : pedido) {
            for (Map.Entry<String, Float> entrada : map.entrySet()) {
                System.out.printf("%s:\t\t%.2f R$\n", entrada.getKey(), entrada.getValue());
                total += entrada.getValue();}}
                System.out.printf("Total:\t\t%.2f R$\n", total);
    }
    public static boolean confirmar(String mensagem, Scanner leitor) {
        while (true) {
            
        System.out.println("Confirmar " + mensagem);
        System.out.print("[S]im ou [N]ão: ");
        char escolha = leitor.next().charAt(0);

        if (escolha == 'S' || escolha == 's')
            return true;
        else if (escolha == 'N' || escolha == 'n')
            return false;
        else {
            System.out.println("Selecione S ou N");
            continue;}}}
    public static LinkedList<Cliente> Excluir(LinkedList<Cliente> listaclientes, Scanner leitor) {
        System.out.print("Qual o número do pedido para cancelar: ");
        int numeroExclusao = leitor.nextInt();
        boolean Encontrou = false;
        for (Cliente pessoa : listaclientes) {
            if(pessoa.verificarNumero(numeroExclusao)) {
                Encontrou = true;
                listaclientes.remove(numeroExclusao - 1);
                break;}}

        if (!Encontrou)
            System.out.print("Não existe um pedido com esse número");
        return listaclientes;
    }
    public static void mostrar(LinkedList<Cliente> lista) {
        for (Cliente pessoa : lista) {
            pessoa.infoCliente();
            System.out.print("\n\n");}}
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();}}
