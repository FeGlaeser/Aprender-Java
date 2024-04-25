import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        final float AprovadoNota = 6.0f;
        final Float ReprovarNota = 3.0f;

        float MediaAluno;
        Float NotaOptativa = -1f;
        String SituacaoAluno;

        System.out.println("Digite a primeira nota: ");
        float Nota1 = Leitor.nextFloat();

        System.out.println("Digite a Segunda nota: ");
        float Nota2 = Leitor.nextFloat();

        System.out.print("Você fez a avaliação Optativa [S]im ou [N]ão: ");
        String FezProva = Leitor.next();

        if (FezProva.equalsIgnoreCase("S")) {
            System.out.print("E quanto Você tirou nela? ");   
            NotaOptativa = Leitor.nextFloat();

            if (Nota1 > Nota2 & Nota2 < NotaOptativa) {
                Nota2 = NotaOptativa;
            } else if (Nota1 < Nota2 & Nota1 < NotaOptativa) {
                Nota1 = NotaOptativa;
            }
        }
        MediaAluno = (Nota1 + Nota2) / 2;
        if (MediaAluno >= AprovadoNota) {
            SituacaoAluno = "Aprovado";
        } else if (MediaAluno <= ReprovarNota) {
            SituacaoAluno = "Reprovado";
        } else {
            SituacaoAluno = "Exame";
        }
        System.out.printf("O Aluno está com a media de %.1f\nSituação: %s\n", MediaAluno, SituacaoAluno);
        Leitor.close();
    }  
}
