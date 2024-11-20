public class App {''
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Ana", 7.5, 8.0);
        Aluno aluno2 = new Aluno("Pedro", 6.0, 5.5);
        Aluno aluno3 = new Aluno("Maria", 9.0, 8.5);
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno3.calcularMedia();
    }
}
