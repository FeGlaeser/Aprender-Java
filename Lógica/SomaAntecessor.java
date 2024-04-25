import java.util.Scanner;

public class SomaAntecessor {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Qual o valor inteiro: ");
        int Valor = Leitor.nextInt();
        System.out.print("Qual o número de repetições: ");
        int Repeticoes = Leitor.nextInt();

        System.out.printf("\nDobro = %d Soma com o de Trás = %d", Valor, Valor);
        for (int x = 0; x != Repeticoes; x++) {
            int Soma = Valor;
            Valor = Valor * 2;
            Soma += Valor; 
            if (Soma > 100000 || Valor > 100000) {break;}
            System.out.printf("\nDobro = %d Soma com o de Trás = %d", Valor, Soma);   
        }

        Leitor.close();
    }
    
}
