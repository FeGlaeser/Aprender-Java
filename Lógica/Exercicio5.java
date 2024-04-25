import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String conceito;

        System.out.print("Quanto o aluno tirou na primeira prova: ");
        float notaUm = leitor.nextFloat();

        System.out.print("Quanto o aluno tirou na primeira prova: ");
        float notaDois = leitor.nextFloat();

        System.out.print("Quanto o aluno tirou na primeira prova: ");
        float notaTres = leitor.nextFloat();

        float media = (notaUm + notaDois + notaTres) / 3;

        if (media >= 9) {conceito = "A";}
        else if (media >= 7.5) {conceito = "B";}
        else if (media >= 6.0) {conceito = "C";}
        else {conceito = "D";}

        System.out.printf("A nota do aluno foi: (%.1f)\n Conceito: (%S)\n", media, conceito);

        leitor.close();
    }
    
}
