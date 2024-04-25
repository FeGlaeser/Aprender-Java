import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual será a distancia do percurso? (em km) \n");
        Double distancia = leitor.nextDouble();
        System.out.print("Qual a velocidade media? (em km) \n");
        Double velocidade = leitor.nextDouble();

        Double tempo = distancia / velocidade;
        System.out.printf("Você chegará em: %f horas", tempo);

        leitor.close();
    }
}
