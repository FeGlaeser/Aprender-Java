import java.util.Scanner;

public class SalarioValido {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite um salário válido: ");
        float Salario = Leitor.nextFloat();

        while (Salario < 1320) {
            System.out.print("Você não pode receber menos que o minimo\n");
            System.out.print("Digite um salário válido: ");
            Salario = Leitor.nextFloat();
        }    
        System.out.printf("Seu salário é: %.2f R$", Salario);
        Leitor.close();
    }
}
