public class App {
    public static void main(String[] args) throws Exception {
        Funcionario a = new Funcionario("Luis", 5000);
        Funcionario b = new Funcionario("Jorge", 5500);

        System.out.println(a.toString());
        System.out.println(b.toString());

        a.setSalario(5.55);
        System.out.println(a.toString());

    }
}
