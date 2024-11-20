public class Produto {
    private String nome;
    private double preco;

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco >= 0)
            this.preco = preco;
        else
            System.out.println("Diga um preço válido");
    }

    public void setPreco(double preco) {
        if (preco >= 0)
            this.preco = preco;
        else
            System.out.println("Coloque um valor válido");
    }

    public void exibirInfo() {
        System.out.println(preco);
        System.out.println(nome);
    }
}
