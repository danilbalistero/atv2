package Trabalho2;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private boolean disponivel;

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.disponivel = true; // Todos os livros são inicializados como disponíveis
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public String getEditora() {
        return editora;
    }


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
