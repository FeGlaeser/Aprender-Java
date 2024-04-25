import java.util.Scanner;

public class Multa {
    public static void main(String[] args ){
       Scanner leitor = new Scanner(System.in);
       final float valorMultaMes = 0.05f; int mesNumero;

        System.out.print("Quanto vale a Anuidade: ");
        float valorTotal = leitor.nextFloat();

        while (true) {
        System.out.print("Em que mês do ano foi paga a mensalidade: ");
        mesNumero = leitor.nextInt();
        if (mesNumero <= 12 && mesNumero >= 1) {break;}
        System.out.println("Digite um valor válido.");}

        for (int x = mesNumero; x != 1; x --) {valorTotal += (valorTotal * valorMultaMes);}

        System.out.printf("O valor total a se pagar é: %.2f R$",valorTotal );

        leitor.close();
    }
}
