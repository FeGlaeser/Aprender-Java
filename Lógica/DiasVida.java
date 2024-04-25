import java.util.Scanner;
import java.time.LocalDate;

public class DiasVida {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Em que Dia (Número) você nasceu? ");
        int DiaNascimento = leitor.nextInt();

        System.out.print("Em que Mês (Número) você nasceu? ");
        int MesNascimento = leitor.nextInt();
        
        System.out.print("Em que dia você nasceu? ");
        int AnoNascimento = leitor.nextInt();

        LocalDate Nascimento = LocalDate.of(AnoNascimento, MesNascimento, DiaNascimento);
        LocalDate DataAtual = LocalDate.now();

        LocalDate TempoVivo = DataAtual.minusYears(AnoNascimento);
        TempoVivo = TempoVivo.minusMonths(MesNascimento);
        TempoVivo = TempoVivo.minusDays(DiaNascimento);

        int AnosVivo = TempoVivo.getYear();
        int MesesVivo = TempoVivo.getMonthValue();
        int DiasVivo = TempoVivo.getDayOfMonth();

        System.out.printf("\nVocê nasceu em: %s e Hoje é: %s\n", Nascimento, DataAtual);
        System.out.printf("Você viveu: %s Anos, %s Meses ", AnosVivo, MesesVivo);
        System.out.printf("e %s Dias.", DiasVivo);
        leitor.close();
    }
}
