package Contato;

public class Contato {
    private String nome;
    private String telefone;
    private Contato prox;


    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contato getProx() {
        return prox;
    }

    public void setProx(Contato prox) {
        this.prox = prox;
    }

    public boolean equals(Object o) {
        Contato outro = (Contato) o;
        return  this.nome.equals(outro.nome);
    }
}
