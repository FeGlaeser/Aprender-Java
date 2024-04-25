import java.util.Scanner;

public class TaxiCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final float precoGasolina = 4.599f;

        System.out.print("Quanto marca o carro no inicio do dia? ");
        int KmInicio = leitor.nextInt();

        System.out.print("Quanto marca o carro no fim do dia? ");
        int KmFinal = leitor.nextInt();

        System.out.print("Quantos Litros foram gastos hoje? ");
        float LitrosGastos = leitor.nextFloat();

        System.out.print("Qual o lucro de hoje? ");
        float LucroDia = leitor.nextFloat();

        int KmPercorridos = KmFinal - KmInicio;
        float KmLitro = KmPercorridos / LitrosGastos;
        float Despesa = LitrosGastos * precoGasolina;
        float TotalLucro = LucroDia - Despesa;

        System.out.printf("%.2f Km/L \n%.2f - %.2f = %.2f R$ De lucro",
         KmLitro,LucroDia, Despesa, TotalLucro);



    leitor.close();
    }  
}
