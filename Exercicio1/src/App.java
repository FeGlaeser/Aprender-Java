import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LinkedList<Carro> carros = new LinkedList<>();
        Random randomizer = new Random();

        int contadorCarros = 1;
        while (true) {
            limparTela();
            System.out.printf("Qual a marca do %dº carro: ", contadorCarros);
            String marca = leitor.next();
            System.out.printf("Qual o modelo do %dº carro: ", contadorCarros);
            String modelo = leitor.next();
            System.out.printf("Qual o ano do %s: ", marca);
            int ano = leitor.nextInt();
            System.out.printf("Qual a velocidade inicial do %s: ", marca);
            double velocidadeInicio = leitor.nextFloat();
            
            Carro carro = new Carro();
            carro.criarCarro(marca, modelo, ano, velocidadeInicio);
            carros.add(carro);

            if (!continuar(leitor, "Deseja continuar? "))
                break;

            contadorCarros ++;}

        while (true) {
            limparTela();
            for (Carro carro : carros) {
                System.out.printf("%d) ", carros.indexOf(carro));
                System.out.printf("%s %s %d\n", carro.getMarca(), carro.getModelo(), carro.getAno());}

            if (!continuar(leitor, "Deseja mudar algo de algum dos carros: "))
                break;
            System.out.println("Qual deles: ");
            System.out.print("[Número na lista] ");
            int numeroCarroAlterar = leitor.nextInt();
            
            alterarCarro(carros.get(numeroCarroAlterar), leitor);}
        
        
        
    
        
        leitor.close();
}
    public static boolean continuar(Scanner leitor, String mensagem) {
        leitor.nextLine();
        while (true) {
            System.out.println(mensagem);
            System.out.print("[S]im ou [N]ão: ");
            String escolha = leitor.next();

            if (escolha.equalsIgnoreCase("S"))
                return true;
            else if (escolha.equalsIgnoreCase("N"))
                return false;
            limparTela();
            System.out.println("Erro, selecione uma opção válida.");
        }
    }
    public static void alterarCarro(Carro carro, Scanner leitor) {
            while (true) {
                System.out.println("1) Modelo: "+ carro.getModelo());
                System.out.println("2) Marca: "+ carro.getMarca());
                System.out.println("3) Ano: "+ carro.getAno());
                System.out.printf("4) Velocidade inicial %.1f Km/h", carro.getVelocidade());
                System.out.println("Qual das informações você deseja alterar: ");
                int operacao = leitor.nextInt();

                switch (operacao) {
                    case 1: 
                        System.out.println("Qual o novo modelo: ");
                        carro.setModelo(leitor.next());
                        break;
                    case 2:
                        System.out.println("Qual a nova marca: ");
                        carro.setMarca(leitor.next());
                        break;
                    case 3:
                        System.out.println("qual o novo ano: ");
                        carro.setAno(leitor.nextInt());
                        break;
                    case 4:
                        System.out.print("Qual a nova velociade inicial: ");
                        carro.setVelocidade(leitor.nextFloat());
                        break;
                    default:
                        break;}
                    if (!continuar(leitor, "Deseja alterar mais alguma coisa"))
                        break;
                    limparTela();}
    }
    public static void limparTela() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}
