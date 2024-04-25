import java.util.Scanner;

public class VetorFloat {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float media = 0;

        float[] vetorMedias = new float[10];
        System.out.println("Digite dez valores: ");

        for (int index = 0; index != 10; index ++) {
            System.out.printf("Digite o valor º%d: ", index + 1);
            vetorMedias[index] = leitor.nextFloat();}

        for (int index = 0; index != 10; index ++) {
            media += vetorMedias[index];}
        
        media /= 10;
        System.out.printf("a media é: %.1f", media);

        leitor.close();
    }
}