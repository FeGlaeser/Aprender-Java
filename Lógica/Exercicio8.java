import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas pessoas Votaram? ");
        int eleitores = leitor.nextInt();

        System.out.printf("Das %d quantas pessoas Votaram Branco? ", eleitores);
        int branco = leitor.nextInt();
        double branco_porcento = branco * 100 / eleitores;

        System.out.printf("Das %d quantas pessoas Votaram Nulo? ", eleitores);
        int nulo = leitor.nextInt();
        double nulo_porcento = nulo * 100 / eleitores;

        System.out.printf("Das %d quantas pessoas tiveram seu voto válido? ", eleitores);
        int valido = leitor.nextInt();
        double valido_porcento = valido * 100 / eleitores;

        System.out.printf("\n\tResultado Final da votação:\nDos %d Eleitores\n", eleitores);
        System.out.printf("Votos validos: %f\nVotos em Branco: %f\nVotos Inválidos: %f", valido_porcento, branco_porcento, nulo_porcento);
     
        leitor.close();
    }
}
