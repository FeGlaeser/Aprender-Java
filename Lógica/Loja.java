import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    final float clienteNormal = 0, funcionarioDesconto = 0.10f, clienteVip = 0.05f;
    float total = 0; boolean invalido = false;

    System.out.print("Quanto custa o produto em R$: ");
    float preco = leitor.nextFloat();

    do {
    System.out.println("(1) Cliente comum, (2) Funcinário, (3) Cliente VIP.");
    System.out.println("Quem é você: ");
    int escolhaDesconto = leitor.nextInt();

    switch (escolhaDesconto) {
        case 1:
            total = preco - (preco * clienteNormal);
            invalido = false;
            break;
        case 2:
            total = preco - (preco * funcionarioDesconto);
            invalido = false;
            break;
        case 3:
            total = preco - (preco * clienteVip);
            invalido = false;
            break;
        default:
            invalido = true;
            break;
    }} while (invalido);
    
    System.out.printf("O total a se pagar será: %.2f R$", total);

    leitor.close();
    }
}
