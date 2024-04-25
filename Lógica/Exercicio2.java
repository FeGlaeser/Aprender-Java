import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tempoJogo; final int horasDia = 24;

        System.out.print("Que horas começou o jogo: ");
        int horasComeco = leitor.nextInt();

        System.out.print("Que horas terminou: ");
        int horasFim = leitor.nextInt();

        if (horasFim < horasComeco) {
        tempoJogo = horasDia - horasComeco + horasFim;}

        else {tempoJogo = horasFim - horasComeco;}

        System.out.printf("O Jogo durou %d horas.", tempoJogo);
        
        leitor.close();
    } 
}
