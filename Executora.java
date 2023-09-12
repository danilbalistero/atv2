package Trabalho2;

import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho máximo da biblioteca: ");
        int tamanhoMaximo = scanner.nextInt();
        Biblioteca biblioteca = new Biblioteca(tamanhoMaximo);

        int opcao;

        do {
            System.out.println("————————- » «» « ————————-");
            System.out.println("      MENU - BIBLIOTECA    ");
            System.out.println("    1 - Bibliotecario     ");
            System.out.println("    2 - Cliente           ");
            System.out.println("    3 - Sair              ");
            System.out.println("————————- » «» « ————————-");
            System.out.print("      Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                executarMenuBibliotecario(biblioteca);
            } else if (opcao == 2) {
                executarMenuCliente(biblioteca);
            }

        } while (opcao != 3);
    }

    private static void executarMenuBibliotecario(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("╔══━━━━━━━━━━━━━━── • ──━━━━━━━━━━━━━━══╗");
            System.out.println("             MENU BIBLIOTECARIO          ");
            System.out.println("     1 - Adicionar Livro                 ");
            System.out.println("     2 - Remover Livro                   ");
            System.out.println("     3 - Voltar ao menu principal...     ");
            System.out.println("╚══━━━━━━━━━━━━━━── • ──━━━━━━━━━━━━━━══╝");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> biblioteca.adicionarLivro();
                case 2 -> biblioteca.removerLivro();
                case 3 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Digite apenas opções que estão no menu");
            }
        } while (opcao != 3);
    }

    private static void executarMenuCliente(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("╔══━━━━━━━━━━━━━━── • ──━━━━━━━━━━━━━━══╗");
            System.out.println("               MENU - CLIENTE            ");
            System.out.println("        1 - Pesquisar Livro              ");
            System.out.println("        2 - Emprestar Livro              ");
            System.out.println("        3 - Devolver Livro               ");
            System.out.println("        4 - Voltar ao Menu Principal...  ");
            System.out.println("╚══━━━━━━━━━━━━━━── • ──━━━━━━━━━━━━━━══╝");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> biblioteca.listarLivros();
                case 2 -> biblioteca.emprestarLivro();
                case 3 -> biblioteca.devolverLivro();
                case 4 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Digite apenas opções que estão no menu");
            }
        } while (opcao != 4);
    }
}
