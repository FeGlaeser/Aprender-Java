import java.util.LinkedList;
import java.util.Iterator;

public class BancoDeDadosSimples {
    private LinkedList<Pessoa> listaPessoas;

    public BancoDeDadosSimples() {
        listaPessoas = new LinkedList<>();
    }

    public void exibirPessoas() {
        for (Pessoa pessoa : listaPessoas) {
            pessoa.mostrarInfo();
            System.out.println();
        }
    }

    public void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public void removerPessoa(String nome) {
        Iterator<Pessoa> iter = listaPessoas.iterator();

        while(iter.hasNext()) {
            Pessoa pessoa = iter.next();
            if (nome.equals(pessoa.getNome())) {
                iter.remove();
                break;
            }
        }
    }

    
}