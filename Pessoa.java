package Trabalho2;

abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void pegarLivro (Livro livro);

    public abstract void devolverLivro (Livro livro);

    public String getNome() {
        return nome;
    }

}
