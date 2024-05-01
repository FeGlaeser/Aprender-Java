package EstruturaDeDados.Pilhas;

import java.util.Stack;
import java.util.ArrayList;

public class ComandosStack {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();
        ArrayList<String> Lista = new ArrayList<>();

        pilha.add("1"); //add adiciona um item na pilha.
        pilha.add("2"); //ultimo a ser posto na pilha.

        System.out.print(pilha.pop()); // primeiro a sair.
        System.out.print(pilha.pop()); // a pilha expulsa usando o pop();

        pilha.add("Alakazam");
        System.out.print(pilha.peek()); //retorna o objeto do top sem tira-lo.
        System.out.print(pilha.size()); // retorna 1 o tamanho da stack

        Lista.addAll(pilha); // interação lista pilha.

        System.out.print(Lista);
        
    }
}
