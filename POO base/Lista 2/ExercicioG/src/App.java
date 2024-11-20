import java.util.Scanner;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();
        Scanner leitor = new Scanner(System.in);
        boolean ligado = true;

        int escolha;
        while(ligado) {
            System.out.println("1) Adicionar Funcionário.");
            System.out.println("2) Aumentar salário.");
            System.out.println("3) Transferir Funcionários");
            System.out.println("4) Listar Funcionários.");
            System.out.println("5) Sair.");

            escolha = leitor.nextInt();
            leitor.nextLine();
            
            String nome, departamento; double salario;
            switch (escolha) {
                case 1:
                    System.out.println("Qual o nome dele: ");
                    nome = leitor.nextLine();

                    System.out.println("Qual departamento dele: ");
                    departamento = leitor.nextLine();

                    System.out.println("Qual o salário incial: ");
                    salario = leitor.nextFloat();

                    listaFuncionarios.add(new Funcionario(nome, departamento, salario));
                    break;

                case 2:
                    System.out.println("Qual o nome do Funcionário(A): ");
                    nome = leitor.nextLine();

                    System.out.println("Quanto será o aumento: ");
                    int aumento = leitor.nextInt();

                    for (Funcionario funcionario : listaFuncionarios)
                        if (funcionario.getNome().equals(nome)) {
                            funcionario.aumentarSalario(aumento);
                            break;
                        }
                    break;

                case 3:
                    System.out.println("Qual o nome do Funcionário(A): ");
                    nome = leitor.nextLine();

                    System.out.println("Para onde ele vai: ");
                    departamento = leitor.nextLine();

                    for (Funcionario funcionario : listaFuncionarios)
                        if (funcionario.getNome().equals(nome)) {
                            funcionario.transferir(departamento);
                            break;}
                    break;

                case 4:
                    for (Funcionario funcionario : listaFuncionarios) { 
                        System.out.println(funcionario.getNome());
                        System.out.println(funcionario.getDepartamento());
                        System.out.println(funcionario.getSalario());
                    }
                        
                    break;

                case 5:
                    ligado = false;
                    break;
            
                default:
                    System.out.println("Escolha de 1 a 5");
                    break;
            }
        }
        leitor.close();
    }
}
