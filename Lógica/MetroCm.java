import java.util.Scanner;

public class MetroCm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor em Metros para virar Cm:");
        float Metros = leitor.nextFloat();

        float Centimetros = Metros * 100;

        System.out.printf("Com %.2f Metros você tem: %.2f Centimetros \n", Metros, Centimetros);
        leitor.close();
    }
}