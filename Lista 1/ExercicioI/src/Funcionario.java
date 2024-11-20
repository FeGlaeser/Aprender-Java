public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void aumentarSalario(double percentual) {
        this.salario = (salario * percentual / 100) + salario;
    }
}