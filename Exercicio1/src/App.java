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
            System.out.printf("Qual o ano do %s: ", modelo);
            int ano = leitor.nextInt();
            System.out.printf("Qual a velocidade inicial do %s: ", modelo);
            double velocidadeInicio = leitor.nextFloat();
            
            Carro carro = new Carro();
            carro.criarCarro(marca, modelo, ano, velocidadeInicio);
            carros.add(carro);
            contadorCarros ++;

            if (continuar(leitor, "Deseja continuar? "))
                break;

            contadorCarros ++;}

        while (true) {
            limparTela();
            for (Carro carro : carros) {
                System.out.printf("%d) %s\n", carros.indexOf(carro), carro.getModelo());}

            if (!continuar(leitor, "Deseja mudar algo de algum dos carros: "))
                break;
            System.out.println("Qual deles: ");
            System.out.print("[Número na lista] ");
            int numeroCarroAlterar = leitor.nextInt();
            
            alterarCarro(carros.get(numeroCarroAlterar), leitor);}
        
        

        leitor.close();
}
    public static boolean continuar(Scanner leitor, String mensagem) {
        while (true) {
            System.out.println("Deseja continuar? ");
            System.out.println("[S]im ou [N]ão: ");
            if (leitor.next().equalsIgnoreCase("S"))
                return true;
            else if (leitor.next().equalsIgnoreCase("N"))
                return false;
            System.out.println("Erro, selecione uma opção válida.");
        }
    }
    public static void alterarCarro(Carro carro, Scanner leitor) {
            while (true) {
                System.out.println("1) Modelo: "+ carro.getModelo());
                System.out.println("2) Marca: "+ carro.getMarca());
                System.out.println("3) Ano: "+ carro.getAno());
                System.out.println("4) Velocidade inicial " + carro.getVelocidade() + "Km/h");

                System.out.print("Qual das informações você deseja alterar: ");
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
                        System.out.println("qual a nova");
                }
        }
    }
    public static void limparTela() {
        System.out.print("\033[M\033[J");
        System.out.flush();
    }
}
