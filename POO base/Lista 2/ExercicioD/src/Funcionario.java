public class Funcionario {
    private String nome;
    private double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    double getSalario() {
        return salario;
    }

    void setSalario(double salario) {
        if (salario >= 1412) this.salario = salario;
        else System.out.print("Nenhum salário pode ser abaixo do minimo");
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSalário: " + this.salario + " R$";
    }
}
