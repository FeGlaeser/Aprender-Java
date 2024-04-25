import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Lula = 0; int Fernando = 0; int Bolsonaro = 0;
        String Ganhador; 

        System.out.print("Luis Inácio Lula da Silva - 13\nJair Messias Bolsonaro - 17\nFernando Glaeser - 77\n");

        while (true) {
            System.out.print("Em qual candidado você vota (-1 Break): ");
            int Voto = Leitor.nextInt();
        
            if (Voto == -1) {
                break;}
            if (Voto == 13) {
                Lula += 1;}
            else if (Voto == 17) {
                Bolsonaro += 1;}
            else if (Voto == 77) {
                Fernando += 1;}}
        
        if (Lula > Bolsonaro & Lula > Fernando) {
            Ganhador = "Luis Inácio Lula da Silva";}
        else if (Bolsonaro > Lula & Bolsonaro > Fernando) {
            Ganhador = "Jair Messias Bolsonaro";}
        else {
            Ganhador = "Fernando Glaeser da Silva";}

        System.out.print("Quantos votos em Branco: ");
        int Branco = Leitor.nextInt();
        
        System.out.print("Quantos votos nulos: ");
        int Nulos = Leitor.nextInt();

        int TotalVotos = Fernando + Bolsonaro + Lula + Nulos + Branco;

        System.out.printf("O novo presidente da republica é: %s\n", Ganhador);
        System.out.printf("O total de votos foi %d e %d Votos foram Nulos e %d foram em Branco",
        TotalVotos, Nulos, Branco);

        Leitor.close();
    }
}