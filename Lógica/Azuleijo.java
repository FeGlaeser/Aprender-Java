import java.util.Scanner;

public class Azuleijo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a largura da cozinha? ");
        float largura = leitor.nextFloat();

        System.out.print("Qual a altura das paredes? ");
        float altura = leitor.nextFloat();

        System.out.print("Qual o comprimento da cozinha? ");
        float comprimento = leitor.nextFloat();

        float ParedesLargura = (largura * altura) * 2;
        float ParedesComprimento = (comprimento * altura) * 2;
        int CaixasTotais = (int) ((ParedesLargura + ParedesComprimento) / 1.5);

        System.out.println(CaixasTotais + " Sera o tanto de caixas a ser comprada.");
        leitor.close();
    } 
}
