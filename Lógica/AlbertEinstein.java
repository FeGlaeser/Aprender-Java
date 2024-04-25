import java.util.Scanner;

public class AlbertEinstein {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Float PerdaMassa = 0.25f;
        int SegundosPassados = 0; int SegundosPorPerda = 30;

        System.out.print("Quanto pesa o Material (Gramas) (Float): ");
        Float Peso = Leitor.nextFloat();

        while (Peso > 0.10) {
            SegundosPassados += SegundosPorPerda;
            Peso -= (Peso * PerdaMassa);
        }
        System.out.printf("Vai demorar %d Segundos para o Material chegar a 0.10", SegundosPassados);
        Leitor.close();
    } 
}
