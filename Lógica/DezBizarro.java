import java.util.Scanner;

public class DezBizarro {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int EntreDez = 0; int ForaDez = 0;
        float Soma = 0f; float Multiplicar = 1f;

        for (int c = 0; c != 10; c++) {
            System.out.printf("Digite o %dº número: ", c + 1);
            Float Valor = Leitor.nextFloat();
            if (Valor >= 11 || Valor <= 0) {
                Soma += Valor;
                ForaDez += 1;
            } else {
                Multiplicar = Multiplicar * Valor;
                EntreDez += 1;
            }}
            System.out.printf("Os valores dentro um a dez foram: %d sua Multiplicação deu: %.2f\n",EntreDez, Multiplicar);
            System.out.printf("Os valores fora de um a dez foram: %d sua Soma deu: %.2f\n",ForaDez, Soma);
            
            Leitor.close();
    }
}