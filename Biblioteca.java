package Trabalho2;

import java.util.Scanner;

public class Biblioteca implements GerenciamentoLivros {
    private Livro[] biblioteca;
    private int tamanhoMaximo;
    private int numeroLivros;

    public Biblioteca(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.biblioteca = new Livro[tamanhoMaximo];
        this.numeroLivros = 0;
    }

    public void adicionarLivro() {
        if (numeroLivros >= tamanhoMaximo) {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Título do Livro");
        String titulo = scanner.nextLine();
        System.out.println("Informe o Autor do livro ");
        String autor = scanner.nextLine();
        System.out.println("Informe a editora do livro");
        String editora = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, editora);
        biblioteca[numeroLivros] = livro;
        numeroLivros++;
        System.out.println("Livro adicionado com sucesso.");
    }

    public void removerLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o título do livro que deseja remover: ");
        String removerLivro = scanner.nextLine();

        boolean livroEncontrado = false;

        for (int i = 0; i < numeroLivros; i++) {
            if (biblioteca[i].getTitulo().equalsIgnoreCase(removerLivro)) {
                for (int j = i; j < numeroLivros - 1; j++) {
                    biblioteca[j] = biblioteca[j + 1];
                }
                biblioteca[numeroLivros - 1] = null;
                numeroLivros--;

                livroEncontrado = true;
                System.out.println("O livro '" + removerLivro + "' foi removido da biblioteca.");
                break;
            }
        }
        if (livroEncontrado) {
            System.out.println("O livro '" + removerLivro + "' não foi encontrado na biblioteca.");
        }
    }

    public void listarLivros() {
        if (numeroLivros == 0) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Esses são os livros disponíveis:");
            for (int i = 0; i < numeroLivros; i++) {
                System.out.println("Título: " + biblioteca[i].getTitulo());
                System.out.println("Autor: " + biblioteca[i].getAutor());
                System.out.println("Editora: " + biblioteca[i].getEditora());
                System.out.println();
            }
        }
    }

    public boolean verificarLivro(String titulo) {
        for (int i = 0; i < numeroLivros; i++) {
            if (biblioteca[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (biblioteca[i].isDisponivel()) {
                    System.out.println("O livro '" + titulo + "' está disponível na biblioteca.");
                    return true;
                } else {
                    System.out.println("O livro '" + titulo + "' não está disponível no momento.");
                    return false;
                }
            }
        }
        System.out.println("O livro '" + titulo + "' não foi encontrado na biblioteca.");
        return false;
    }

    public boolean emprestarLivro() {
        System.out.println("Esses são os livros disponíveis:");
        for (int i = 0; i < numeroLivros; i++) {
            if (biblioteca[i].isDisponivel()) {
                System.out.println("Título: " + biblioteca[i].getTitulo());
                System.out.println("Autor: " + biblioteca[i].getAutor());
                System.out.println("Editora: " + biblioteca[i].getEditora());
                System.out.println();
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o titulo do livro que deseja pegar emprestado: ");
        String titulo = scanner.nextLine();
        for (int i = 0; i < numeroLivros; i++) {
            if (biblioteca[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (biblioteca[i].isDisponivel()) {
                    System.out.println("O livro '" + titulo + "' foi emprestado com sucesso.");
                    biblioteca[i].setDisponivel(false);
                } else {
                    System.out.println("O livro '" + titulo + "' não esta disponivel para empréstimo.");
                }
                return false;
            }
        }
        System.out.println("O livro '" + titulo + "' não foi encontrado na biblioteca.");
        return false;
    }

    public boolean devolverLivro() {
        System.out.print("Digite o título do livro que deseja devolver: ");
        Scanner scanner = new Scanner(System.in);
        String titulo = scanner.nextLine();

        for (int i = 0; i < numeroLivros; i++) {
            if (biblioteca[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (!biblioteca[i].isDisponivel()) {
                    System.out.println("O livro '" + titulo + "' foi devolvido com sucesso.");
                    biblioteca[i].setDisponivel(true);
                } else {
                    System.out.println("Este livro já esta disponivel na biblioteca.");
                }
                return false;
            }
        }
        System.out.println("O livro '" + titulo + "' não foi encontrado na biblioteca.");
        return false;
    }
}

