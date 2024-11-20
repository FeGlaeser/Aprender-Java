public class App {
    public static void main(String[] args)  {
        Produto produto = new Produto();
        produto.setNome("Tv");
        produto.setPreco(-4);
        produto.setEstoque(10);

        System.out.print(produto.toString());

        produto.setPreco(444);

        System.out.print(produto.toString());


    }
}
