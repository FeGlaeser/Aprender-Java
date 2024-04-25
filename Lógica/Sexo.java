import java.util.Scanner;

public class Sexo {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        Float Altura, PesoIdeal = 0.0f;
        int HomemMulher;

        System.out.print("Digite sua Altura: ");
        Altura = Leitor.nextFloat();

        System.out.print("Você é Homem (1) ou Mulher (2):  ");
        HomemMulher = Leitor.nextInt();

        while (HomemMulher != 2 && HomemMulher != 1) {
            System.out.print("Você é Homem (1) ou Mulher (2):  ");
            HomemMulher = Leitor.nextInt();
        }
            
        if (HomemMulher == 1) {
            PesoIdeal = 72.7f * Altura - 58;
        } else if (HomemMulher == 2) {
            PesoIdeal= 62.1f * Altura - 44.7f;
        }

        System.out.printf("Você deveria pesar: %.2f", PesoIdeal);
        Leitor.close();
    }
}