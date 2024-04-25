import java.util.Scanner;

public class SalarioEmpresa {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        float SalarioPorHora; float SalarioBruto; float SalarioHoraExtra = 0; float SalarioSemHora;
        int Funcionarios; int Horas; int HorasExtras = 0;

        System.out.print("Quantos Funcionários trabalham ali: ");
        Funcionarios = Leitor.nextInt();
        String[] ListaFuncionarios = new String[Funcionarios];

        for (int x = 0; Funcionarios != x; x++) {
        System.out.printf("Quanto o %dº Funcionário recebe por hora: ", x + 1);
        SalarioPorHora = Leitor.nextFloat();

        System.out.printf("Quantas horas ele trabalhou essa Semana: ");
        Horas = Leitor.nextInt();

        HorasExtras = 0; SalarioHoraExtra = 0;

        if (Horas >= 41) {
        HorasExtras = (Horas - 40);
        SalarioHoraExtra = HorasExtras * (SalarioPorHora * 1.5f);
        Horas = Horas - HorasExtras;}
        
        SalarioSemHora = Horas * SalarioPorHora;
        SalarioBruto = SalarioSemHora + SalarioHoraExtra;

        if (HorasExtras != 0) {
        ListaFuncionarios[x] = "\nO Trabalhador " + (x + 1) + " Recebe: " + SalarioBruto +" R$ " + 
        "\nEssa Semana Trabalhou: " + Horas + " Horas. Recebendo: " + SalarioPorHora + "R$" + " = " + SalarioSemHora + " R$" +
        "\nRecebeu: " + SalarioHoraExtra + "R$ de Horas Extras por " + HorasExtras + " Horas Extras Trabalhadas"; 
        } else {
            ListaFuncionarios[x] = "\nO Trabalhador " + (x + 1) + " Recebe: " + SalarioBruto +" R$ " + 
        "\nEssa Semana Trabalhou: " + Horas + " Horas. Recebendo: " + SalarioPorHora + "R$" + " = " + SalarioSemHora + " R$" +
        "\nEsse Funcinário não fez horas extras essa Semana."; 
        }
    }
        for (int x = 0; x != ListaFuncionarios.length; x++) {
            System.out.println(ListaFuncionarios[x]);
        }
        Leitor.close();
    } 
}
