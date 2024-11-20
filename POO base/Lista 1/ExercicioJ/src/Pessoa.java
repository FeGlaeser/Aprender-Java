public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return this.idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    float getAltura() {
        return altura;
    }

    void setAltura(float altura) {
        this.altura = altura;
    }


}