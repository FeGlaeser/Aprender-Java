public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;


    Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void transferir(String departamento) {
        this.departamento = departamento;
    }

    public void aumentarSalario(int porcentagem) {
        this.salario = salario + (porcentagem * salario / 100);
    }

}
