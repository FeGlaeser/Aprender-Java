import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Quantos anos você tem: ");
        int Idade = Leitor.nextInt();

        while (Idade > 150 || Idade < 1) {
            System.out.print("Por favor insira uma idade válida: ");
            Idade = Leitor.nextInt();
        }
        System.out.printf("você tem %d anos", Idade);

        Leitor.close();
    } 
}
