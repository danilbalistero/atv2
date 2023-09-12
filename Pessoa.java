package Trabalho2;

abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }


    public abstract void emprestarLivro(Biblioteca biblioteca);


    public abstract void devolverLivro (Biblioteca biblioteca);

    public String getNome() {
        return nome;
    }

}
