import java.util.Scanner;

public class Saude {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float precoBase = 100; float precoIdade;

        System.out.print("Quantos anos você tem: ");
        int idade = leitor.nextInt();

        if (idade < 10) {precoIdade = 80;}
        else if (idade < 39) {precoIdade = 50;}
        else if (idade < 60) {precoIdade = 95;}
        else {precoIdade = 130;}

        float precoTotal = precoBase + precoIdade;
        System.out.printf("O preço total a ser pago é de %.2f R$", precoTotal);

        leitor.close();
    } 
}
