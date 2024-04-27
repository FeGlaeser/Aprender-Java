import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float azuleijoTamanho = 1.5f;

        System.out.print("Informe a Largura da cozinha: ");
        float largura = leitor.nextFloat();

        System.out.print("Informe a Altura da cozinha: ");
        float altura = leitor.nextFloat();

        System.out.print("Informe o comprimento da cozinha: ");
        float comprimento = leitor.nextFloat();

        float paredesLargura = (altura * largura) * 2;
        float paredesComprimento = (altura * comprimento) * 2;

        float areaTotal = paredesComprimento + paredesLargura;
        float quantidadeCaixas = areaTotal / azuleijoTamanho;


        System.out.printf("O total de caixas de azuleijo a se comprar é: %.1f", quantidadeCaixas);
        

        leitor.close();
    } 
}
