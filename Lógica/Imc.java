import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int abaixoPeso = 0; int normalPeso = 0; int sobrePeso = 0;
        int obesoUm = 0; int obesoDois = 0; int obesoTres = 0;

        while (true) {
            System.out.print("\nDigite Altura: ");
            float altura = leitor.nextFloat();

            if (altura == 0) {break;}

            System.out.print("Digite o peso agora: ");
            float peso = leitor.nextFloat();

            float imc = peso / (altura * altura);

            if (imc < 18.5) {abaixoPeso += 1;}
            else if (imc < 24.9) {normalPeso += 1;}
            else if (imc < 29.9) {sobrePeso += 1;}
            else if (imc < 34.9) {obesoUm += 1;}
            else if (imc < 39.9) {obesoDois += 1;}
            else {obesoTres += 1;}
        }
        System.out.printf("\nO total de Pessoas em sobre peso 1: %d\n",abaixoPeso);
        System.out.printf("O total de Pessoas em sobre peso 1: %d\n",normalPeso);
        System.out.printf("O total de Pessoas em sobre peso 1: %d\n",sobrePeso);
        System.out.printf("O total de Pessoas em obesidade 1: %d\n",obesoUm);
        System.out.printf("O total de Pessoas em obesidade 1: %d\n",obesoDois);
        System.out.printf("O total de Pessoas em obesidade 1: %d\n",obesoTres);


        leitor.close();
    }
}
