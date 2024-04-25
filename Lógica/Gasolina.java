import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final float GasolinaPreco = 4.30f;
        final float AlcoolPreco = 3.90f;
        final int LitrosParaDesconto = 20;
        int litros;
        String nome;
        float precoTotal, Desconto, PrecoIncompleto;

        System.out.print("[G]asolina ou [A]lcool? ");
        String escolha = leitor.next();

        boolean RespostaValida = escolha.equalsIgnoreCase("G") || escolha.equalsIgnoreCase("A");

        while (!RespostaValida) {
            System.out.print("Digite uma resposta válida \n[G]asolina ou [A]lcool: ");
            escolha = leitor.next();

            RespostaValida = escolha.equalsIgnoreCase("G") || escolha.equalsIgnoreCase("A");
        }

        boolean Gasolina = escolha.equalsIgnoreCase("G");
        if (Gasolina) {
            nome = "Gasolina"; 

            System.out.print("Quantos litros você comprou de Gasolina? ");
            litros = leitor.nextInt();

            if (litros > LitrosParaDesconto) {
                Desconto = 0.06f;
            } else {
                Desconto = 0.04f;
            }

            PrecoIncompleto = (litros * GasolinaPreco);
            precoTotal = PrecoIncompleto - PrecoIncompleto * Desconto;
        } else {
            nome = "Álcool";

            System.out.print("Quantos litros você comprou de Álcool? ");
            litros = leitor.nextInt();

            if (litros > LitrosParaDesconto) {
                Desconto = 0.05f;
            } else {
                Desconto = 0.03f;
            }

            PrecoIncompleto = (litros * AlcoolPreco);
            precoTotal = PrecoIncompleto - PrecoIncompleto * Desconto;
        }

        System.out.printf("\nO preço de: %d Litros de %s será %.2f R$\n", litros, nome, PrecoIncompleto);
        System.out.printf("Você tem %.0f%% de desconto Totalizando: %.2f R$", Desconto * 100, precoTotal);

        leitor.close();
    }
}
