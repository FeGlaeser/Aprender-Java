import java.util.Scanner;

public class SomaTodos {
    public static void main(String[] args){
        Scanner Leitor = new Scanner(System.in); 
        int Soma = 0;

        System.out.print("Digite um valor inteiro: ");
        int Valor = Leitor.nextInt();
        
        for (int c = 0; c != Valor + 1; c++) {
            Soma += c;
        }
        System.out.printf("A soma de todos os valores de %d é %d ", Valor, Soma);

        Leitor.close();
    }
}