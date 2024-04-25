import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o seu salário: ");
        float salario = leitor.nextFloat();

        System.out.print("Qual o Valor do Empréstimo? ");
        float Emprestimo = leitor.nextFloat();

        System.out.print("Quantas prestações? ");
        int QntPrestacoes = leitor.nextInt(); 

        float ValorPrestacao = Emprestimo / QntPrestacoes;
        boolean aprovado = salario * 0.30 > ValorPrestacao;

        if (aprovado) {
            System.out.printf("O seu crédito foi aprovado no valor de: %.2f \n", Emprestimo);
            System.out.printf("Serão %d no valor de %.2f\n", QntPrestacoes, ValorPrestacao);
        } else {
            System.out.printf("O seu crédito foi negado %.2f * 0.3 <= %.2f\n", salario, ValorPrestacao);
        }


        leitor.close();
    }
}
