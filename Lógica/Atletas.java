import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int Atletas = 0; float Peso; float Altura; String Nome; String Sexo;
        int SomaIdade = 0; float MaisAlto = 0; float MaisPesada = 0; float MediaIdade;

        while (true) {
            System.out.println("\nQual o seu nome?");
            Nome = Leitor.next();
            if (Nome.equals("@")) {
                break;}

            System.out.println("Qual o seu Sexo [M] ou [F]?");
            Sexo = Leitor.next();
            while (!Sexo.equalsIgnoreCase("M") & !Sexo.equalsIgnoreCase("F")) {
                System.out.println("Selecione uma opção válida: [F] ou [M] ");
                Sexo = Leitor.next();}

            System.out.printf("Quantos anos você tem %s? ", Nome);
            SomaIdade += Leitor.nextInt();
            Atletas += 1;

            System.out.printf("Quanto você mede %s? ", Nome);
            Altura = Leitor.nextFloat();
            if (Sexo.equalsIgnoreCase("M") & MaisAlto < Altura) {
                MaisAlto = Altura;}

            System.out.printf("%s, quanto você pesa em (Kgs): ", Nome);
            Peso = Leitor.nextFloat();
            if (Sexo.equalsIgnoreCase("F") & MaisPesada < Peso) {
                MaisPesada = Peso;}

        }
        MediaIdade = SomaIdade / Atletas;

        System.out.printf("A media de Idade é: %.0f Anos\n", MediaIdade);
        System.out.printf("A Atleta mais Pesada pesa: %.2f KGs\n", MaisPesada);
        System.out.printf("O Atleta mais Alto mede: %.1f Metros\n", MaisAlto);
        
        Leitor.close();
    } 
}
