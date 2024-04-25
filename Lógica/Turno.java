import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Em qual periodo você estuda: ");
        System.out.print("[M]atutino, [V]éspertino, [N]oturno: ");
        String periodoEscolha = leitor.next();

        if (periodoEscolha.equalsIgnoreCase("V")) {System.out.print("Boa tarde");}
        else if (periodoEscolha.equalsIgnoreCase("M")) {System.out.print("Bom dia");}
        else if (periodoEscolha.equalsIgnoreCase("N")) {System.out.print("Boa noite.");}
        else {System.out.print("Opção inválida");}
        
        leitor.close();
    }
}
