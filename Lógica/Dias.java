import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia; final int DiaSemana = 7;

        while (true) {
        System.out.print("Selecione um dia do mês: ");
        dia = leitor.nextInt();
        if (dia >= 1 && dia <= 31) {break;}
        System.out.println("Selecione uma data válida (1 a 31)");}
        
        int restoDia = dia % DiaSemana;

        if (restoDia == 1 || restoDia == 0) {System.out.print("Fim de semana.");}
        else {System.out.print("Dia útil.");}

        leitor.close();
    }
}