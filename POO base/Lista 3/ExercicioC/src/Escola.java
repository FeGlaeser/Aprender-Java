import java.util.ArrayList;


public class Escola {
    ArrayList<Professor> listaProfessores;

    public Escola() {
        listaProfessores = new ArrayList<>();
    }

    public void adicioanarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void listarProfessor() {
        for (Professor professor : listaProfessores) {
            System.out.println(professor.toString());
        }
    }
}
