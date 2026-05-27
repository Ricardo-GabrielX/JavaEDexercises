import Contato.Contato;

import java.util.ArrayList;
import java.util.List;

public class TestaArrayList {
    public static void main(String[] args) {
        List<Contato> listaTelefonica = new ArrayList<>();
        Contato item = new Contato("joao", "15 91234-9292");

        listaTelefonica.add(item);

        System.out.println("A lista tem " + listaTelefonica.size() + " itens");

        listaTelefonica.remove(0);

        System.out.println("A lista tem " + listaTelefonica.size() + " itens");
    }


}
