import java.util.Scanner;


public class MediaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float Media = 6.0f;

        System.out.print("Quanto o aluno tirou na primeira prova? ");
        float PrimeiraNota = leitor.nextFloat();

        System.out.print("Quanto o aluno tirou na primeira prova? ");
        float SegundaNota = leitor.nextFloat();

        float MediaAluno = (PrimeiraNota + SegundaNota) / 2;
        Boolean aprovado = MediaAluno >= Media;

        System.out.printf("A nota do aluno na primeira prova: [%.1f], na Segunda: [%.1f]\n", PrimeiraNota, SegundaNota);
        System.out.printf("A Média do aluno nos dois exames foi: %.1f.\n", MediaAluno);
        if (aprovado) {
            System.out.printf("Foi Aprovado\n");
        } else {
            System.out.printf("Não foi Aprovado\n");
        }


        leitor.close();
    }
}
