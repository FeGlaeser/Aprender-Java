import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número Real: ");

        Double numero = leitor.nextDouble();
        Double vinte_porcento = numero * 0.20;

        System.out.printf("Os de %2f .20 são: %2f", numero, vinte_porcento);

        leitor.close();
    }
}
