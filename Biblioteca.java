package Trabalho2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca implements GerenciamentoLivros{
    private List<Livro> biblioteca = new ArrayList<>();

    //acho q poderia ter colocado essas funçoes no bibliotecario
    public void adicionarLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Título do Livro");
        String titulo = scanner.nextLine();
        System.out.println("Informe o Autor do livro ");
        String autor = scanner.nextLine();
        System.out.println("Informe a editora do livro");
        String editora = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, editora);
        biblioteca.add(livro);
    }

    public void removerLivro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o título do livro que deseja remover: ");
        String removerLivro = scanner.next();

        Livro livroExcluir = null;

        // Procurando o livro com o título informado
        for (Livro livro : biblioteca) {
            if (livro.getTitulo().equalsIgnoreCase(removerLivro)) {
                livroExcluir = livro;
                break;
            }
        }

        if (livroExcluir != null) {
            biblioteca.remove(livroExcluir);
            System.out.println("O livro " + livroExcluir.getTitulo() + " foi removido da biblioteca.");
        } else {
            System.out.println("Informe livros que existem na biblioteca");
        }
    }

    public boolean verificarLivro(Livro livro){
        return biblioteca.contains(livro);
    }

    public void listarLivros(){
        System.out.println("Esses são os livros disponiveis");
        for (Livro livro: biblioteca) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println();
        }
    }


    public boolean verificarLivro() {
        return false;
    }

}
