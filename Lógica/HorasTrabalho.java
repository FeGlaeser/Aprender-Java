import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        float SalarioHora = leitor.nextFloat();

        System.out.print("Quantas horas você trabalha por mês? ");
        int HorasTrabalho = leitor.nextInt();

        System.out.print("Quantos % é descontado de imposto? ");
        float imposto = leitor.nextFloat();

        float SalárioBruto = HorasTrabalho * SalarioHora;
        float SalárioTotal = SalárioBruto * (1.00f - imposto / 100);

        System.out.printf("%.2f X %d = [%.2f R$] esse é o seu salário bruto.\n", SalarioHora, 
        HorasTrabalho, SalárioBruto);

        System.out.printf("%.2f - %.2f%% =[ %.2f R$] esse é o seu salário liquido.", SalárioBruto,
         imposto, SalárioTotal);



        leitor.close();
    }   
}
