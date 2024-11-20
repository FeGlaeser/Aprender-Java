public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tem: "+ altura);
    }

    void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}
