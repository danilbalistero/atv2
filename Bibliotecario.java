package Trabalho2;

public class Bibliotecario extends Pessoa{
    // queria usar o crb mas também não faço ideia de como posso adicionar
    private int crb;
    public Bibliotecario(String nome) {
        super(nome);
    }

    @Override
    public void pegarLivro(Livro livro) {
        System.out.println(getNome() + " registrou o empréstimo do livro: " + livro.getTitulo());
    }
    @Override
    public void devolverLivro(Livro livro) {
        System.out.println(getNome() + " registrou a devolução do livro: " + livro.getTitulo());
    }
}
