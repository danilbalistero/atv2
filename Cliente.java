package Trabalho2;

public class Cliente extends Pessoa{
    //queria utilizar id mas não faço ideia de como fazer
    private int id;
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public void pegarLivro(Livro livro) {
        System.out.println(getNome() + " pegou o livro: " + livro.getTitulo());
    }

    @Override
    public void devolverLivro(Livro livro) {
        System.out.println(getNome() + " devolveu o livro: " + livro.getTitulo());
    }
}
