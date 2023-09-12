package Trabalho2;

import java.util.Scanner;

public class Cliente extends Pessoa{
    //queria utilizar id mas não faço ideia de como fazer
    private int id;
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public void emprestarLivro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro que deseja pegar emprestado: ");
        String titulo = scanner.nextLine();
        boolean emprestadoComSucesso = biblioteca.emprestarLivro();
        if (emprestadoComSucesso) {
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }
    }

    @Override
    public void devolverLivro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro que deseja devolver: ");
        String titulo = scanner.nextLine();
        boolean devolvidoComSucesso = biblioteca.devolverLivro();
        if (devolvidoComSucesso) {
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Não foi possível devolver o livro.");
        }
    }
}

