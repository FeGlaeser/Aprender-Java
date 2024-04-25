import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\tCalculadora do Evento: ");

        System.out.print("Quanto vale cada ingresso: ");
        double preco = leitor.nextDouble();

        System.out.print("Quantos Sócios ao clube irão: ");
        int socio = leitor.nextInt();

        System.out.println("Quantos visitantes são menores de dez anos? ");
        int menores = leitor.nextInt();

        System.out.print("Quantos visitantes comuns: ");
        int comum = leitor.nextInt();

        int publico = comum + menores + socio;
        double renda = (socio * preco / 100 * 70) + comum * preco;
        double perdida = socio * preco + comum * preco + menores * preco - renda;

        System.out.println("\tPor fim:");
        System.out.printf("Irão no total: %d\nLucro: %f\nDescontos: %f", publico, renda, perdida);

        leitor.close();
    }
}
