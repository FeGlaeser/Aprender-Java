import java.util.Scanner;
import java.time.LocalDate;

public class MesAno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int mesValor;

        System.out.print("Insira um ano: ");
        int ano = leitor.nextInt();

        while (true) {
            System.out.print("Insira um mês de (1 a 12): ");
            mesValor = leitor.nextInt();
            if (mesValor >= 1 && mesValor <= 12) {break;}
            System.out.println("Erro, digite um dado válido.");}
        
        LocalDate data = LocalDate.of(ano, mesValor, 1);
        int mesDias = data.lengthOfMonth();

        System.out.printf("Ano: %d Mês: %d Tinha (%d) Dias.\n", ano, mesValor, mesDias);

        leitor.close();
    }
}