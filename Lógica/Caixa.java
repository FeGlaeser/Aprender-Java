import java.util.Scanner;

public class Caixa {
    public static void main(String[] arg) {
        Scanner Leitor = new Scanner(System.in);

        float Desconto;
        float PrecoDesconto;

        System.out.print("Qual o nome do produto: ");
        String Nome = Leitor.next();

        System.out.printf("Quantas unidades de %s você comprou: ", Nome);
        int Quantia = Leitor.nextInt();

        System.out.printf("Quanto custa cada unidade de %s: ",Nome);
        float Preco = Leitor.nextFloat();

        Float PrecoBruto = Preco * Quantia;
        if (Quantia > 10) {
            Desconto = 0.05f;
            PrecoDesconto = PrecoBruto - (PrecoBruto * Desconto);
        } else if (Quantia <= 5) {
            Desconto = 0.02f;
            PrecoDesconto = PrecoBruto - (PrecoBruto * Desconto);
        } else {
            Desconto = 0.03f;
            PrecoDesconto = PrecoBruto - (PrecoBruto * Desconto);
        }
        System.out.printf("O preço das (%d unidades) de %s\n", Quantia, Nome);
        System.out.printf("Vai sair por %.2f R$ - %.0f%% de Desconto = %.2f R$\n", PrecoBruto,
        Desconto*100, PrecoDesconto );

        Leitor.close();
    }  
}
