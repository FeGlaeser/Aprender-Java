import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento da pista (em metros): ");
        double comprimentoPista = scanner.nextDouble();

        System.out.println("Informe o número total de voltas a serem percorridas no grande prêmio: ");
        int totalVoltas = scanner.nextInt();

        System.out.println("Informe o número de reabastecimentos desejados: ");
        int numReabastecimentos = scanner.nextInt();

        System.out.println("Informe o consumo de combustível do carro (em Km/L): ");
        double consumoCombustivel = scanner.nextDouble();

        // Calculando o número de voltas entre os reabastecimentos
        int voltasEntreReabastecimentos = totalVoltas / (numReabastecimentos + 1);

        // Calculando a distância percorrida até o primeiro reabastecimento
        double distanciaAteReabastecimento = (comprimentoPista * voltasEntreReabastecimentos) / 1000.0;

        // Calculando o número mínimo de litros necessários até o primeiro reabastecimento
        double litrosNecessarios = distanciaAteReabastecimento / consumoCombustivel;

        System.out.println("Número mínimo de litros necessários até o primeiro reabastecimento: " + litrosNecessarios + " litros");

        scanner.close();
    }
}