import java.util.Scanner;


public class Eleitores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos eleitores existem em uma cidade? ");
        int eleitores = leitor.nextInt();

        System.out.print("Quantos votaram Validamente? ");
        int Validos = leitor.nextInt();

        System.out.print("Quantos votaram em Branco? ");
        int Branco = leitor.nextInt();

        System.out.print("Quantos votaram Nulo? ");
        int Nulo = leitor.nextInt();

        double PorcentagemValido = Validos * 100 / eleitores; 
        double PorcentagemBranco = Branco * 100 / eleitores; 
        double PorcentagemNulo = Nulo * 100 / eleitores; 

        System.out.printf("A quantidade de votos foram: %d\n", eleitores);
        System.out.printf("A quantidade de votos Válidos foram: %d [%.2f%%]\n", Validos, PorcentagemValido);
        System.out.printf("A quantidade de votos Válidos foram: %d [%.2f%%]\n", Branco, PorcentagemBranco);
        System.out.printf("A quantidade de votos Válidos foram: %d [%.2f%%]\n", Nulo, PorcentagemNulo);

        leitor.close();
    }   
}
