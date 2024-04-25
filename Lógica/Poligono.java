import java.util.Scanner;

public class Poligono {
    public static void main(String[] args) {
        String Forma;

        Scanner Leitor = new Scanner(System.in);

        System.out.print("Quantos Lados tem um poligono: ");
        int Lados = Leitor.nextInt();
        System.out.print("Quantos (Cm) mede Esses lados: ");
        Float Mede = Leitor.nextFloat(); 

        if (Lados == 3) {
            Forma = "Triangulo";
            float Perimetro = (Mede * Lados);
            System.out.printf("A forma %s tem %.2f (cm) de perimetro", Forma, Perimetro);

        } else if (Lados == 4) {
            Forma = "Quadrado";
            float Area = (Mede * Mede);
            System.out.printf("A forma %s tem area de %.2f", Forma, Area);
        } else if (Lados == 5){
            Forma = "Pentagono";
            System.out.printf("A forma %s", Forma);
        } else {
            if (Lados > 5) {
                System.out.print("Poligono não identificado");
            } else {
                System.out.print("Poligono não Existe");
            }
        }
        Leitor.close();
    }
}
