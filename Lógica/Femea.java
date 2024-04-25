import java.util.Scanner;

public class Femea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite [F]eminino ou [M]asculino: ");
        String letraGenero = leitor.next();

        if (letraGenero.equalsIgnoreCase("F")) {System.out.print("Feminino.");}
        else if (letraGenero.equalsIgnoreCase("M")) {System.out.print("Maculino.");}
        else {System.out.print("Opção inválida.");}

        leitor.close();
    } 
}
