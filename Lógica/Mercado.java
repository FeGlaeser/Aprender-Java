import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float margemLucro = 0; String categoria;


        System.out.print("Digite o preço de um produto: ");
        float preco = leitor.nextFloat();

        do {
        System.out.print("Qual o código do produto: ");
        int codigo = leitor.nextInt();

        switch (codigo) {
            case 1:
            categoria = "Hortifruti";
            margemLucro = 0.80f;
                break;
            case 2:
            categoria = "Laticíneos";
            margemLucro = 0.80f;
                break;
            case 3:
            categoria = "Carnes";
            margemLucro = 1.0f;
                break;
            case 4:
            categoria = "Peixes";
            margemLucro = 1.0f;
                break;
            case 5:
            categoria = "Aves";
            margemLucro = 0.90f;
                break;
            case 6:
            categoria = "Ovos";
            margemLucro = 0.90f;
                break;
            default:
                categoria = "Erro";
                break; 
            }} while (categoria.equals("Erro"));
        
        preco += (preco * margemLucro);
        System.out.printf("A classe é: (%s) e o Preço é: %.2f R$", categoria, preco);
    
        leitor.close();
    } 
}
