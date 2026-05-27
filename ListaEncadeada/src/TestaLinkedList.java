import Contato.Contato;
import java.util.LinkedList;
import java.util.List;

public class TestaLinkedList {
    public static void main(String[] args) {
        List<Contato> listaTelefonica = new LinkedList<Contato>();
        Contato item = new Contato("Ricardo", "15 99513-1234");

        listaTelefonica.add(item);

        System.out.println("A lista tem " + listaTelefonica.size() + " itens");

        listaTelefonica.remove(0);

        System.out.println("A lista tem " + listaTelefonica.size() + " itens");

    }

}
