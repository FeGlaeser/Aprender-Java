import java.util.Scanner;

public class MaiorPar{
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Numero = 0; int Contador = 0;
        int SomaPar = 0; int SomaImpar = 0;
        int ContaPar = 0; int ContaImpar = 0;
        int Menor = 0; int Maior = 0;

        while (true) {
        System.out.println("Digite um número inteiro ou (Negativo para sair): ");
        Numero = Leitor.nextInt();
        if (Numero < 0) {
            break;
        }

        if (Numero % 2 == 0) {
            SomaPar += Numero;
            ContaPar += 1;
            if (Numero > Maior) {
                Maior = Numero;
            }

        } else {
            SomaImpar += Numero;
            ContaImpar += 1;
            if (Contador == 0) {
                Menor = Numero;
            } else if (Menor > Numero) {
                Menor = Numero;
            }
        }
        Contador += 1;}

        Float MediaPar = (float) (SomaPar / ContaPar);  
        Float MediaImpar = (float) (SomaImpar / ContaImpar);  

        if (ContaImpar != 0 & ContaPar != 0) {
            System.out.printf("Maior Par: %d | Menor Impar: %d\n", Maior, Menor);
            System.out.printf("Media Par: %d | Media Impar: %d", MediaPar, MediaImpar);
        } else {
            System.out.print("Faltou com informção");
        }


        
        Leitor.close();
    }
}
