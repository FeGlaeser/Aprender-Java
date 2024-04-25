import java.util.Scanner;


public class CarrosFuncinario {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    final float LucroValorVendido = 5; 

        System.out.print("Qual o seu salário? ");
        float salario = leitor.nextFloat();

        System.out.print("Quantos carros você vendeu esse MÊS? ");
        int carrosVendidos = leitor.nextInt();

        System.out.print("Quanto você recebe por carro vendido? ");
        float ValorPorCarro = leitor.nextFloat();

        System.out.print("Quanto você vendeu esse Mês? ");
        float ValorVendido = leitor.nextFloat();

        float TotalCarros = ValorPorCarro * carrosVendidos;
        float Totalcomissao = ValorVendido * (LucroValorVendido / 100);
        float TotalSalario = TotalCarros + Totalcomissao + salario;

        System.out.printf("Dos %d carros vendido você recebe %.2f por cada ou seja: %.2f no total.\n",
         carrosVendidos, ValorPorCarro, TotalCarros);
        System.out.printf("você vendeu: %.2f recebe %.1f de comissão ou seja: %.2f no total.\n",
        ValorVendido, LucroValorVendido, Totalcomissao);
        System.out.printf("Você recebe: %.2f de salário mais a comissão e os carros %.2f R$ Totais.\n",
        salario, TotalSalario);

    leitor.close();
    }    
}
