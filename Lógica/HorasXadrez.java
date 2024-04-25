import java.util.Scanner;

public class HorasXadrez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Que o horas o jogo de xadrez começou [Inteiro]: ");
        int HrsComecou = leitor.nextInt(); 

        System.out.print("Que o horas o jogo de xadrez acabou [Inteiro]: ");
        int HrsAcabou = leitor.nextInt(); 

        int TempoDeJogo = 24 - HrsComecou + HrsAcabou; 
        if (TempoDeJogo > 24) {
            TempoDeJogo -= 24;
        }
        System.out.printf("o Jogo durou %d Horas.\n", TempoDeJogo);
        
        leitor.close();
    }
}
