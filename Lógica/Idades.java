import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Pessoas = 0; int SomaIdade = 0;
        int MaiorIdade = 0; int MenorIdade = 0;
        while (true) {
            System.out.printf("Quantos anos tem a %dº pessoa? [Zero para Sair]", Pessoas + 1);
            int Idade = Leitor.nextInt();

            if (Idade == 0) {
                break;
            }
            Pessoas += 1;
            if (Pessoas != 1) {
                if (Idade < MenorIdade) {
                    MenorIdade = Idade;
                }
            } else {
                MenorIdade = Idade;
            }
            if (Idade > MaiorIdade) {
                MaiorIdade = Idade;
            }
            SomaIdade += Idade;
        }
        float MediaIdade = SomaIdade / Pessoas;
        System.out.printf("A Maior idade é: %d\n", MaiorIdade);
        System.out.printf("A Menor idade é: %d\n", MenorIdade);
        System.out.printf("A Média idade é: %.1f\n", MediaIdade);
        System.out.printf("A Quantia de pessoas Foram: %d\n", Pessoas);
        
        Leitor.close();
    }
    
}
