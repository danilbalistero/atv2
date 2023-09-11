package Trabalho2;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("MENU - BIBLIOTECA");
            System.out.println("1 - Bibliotecario");
            System.out.println("2 - Cliente      ");
            System.out.println("3 - Sair         ");
            System.out.print("Escolha uma opção: ");
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
            System.out.println("MENU BIBLIOTECARIO");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Verificar Livro");
            System.out.println("4 - Voltar ao menu principal...");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.adicionarLivro();
                    break;
                case 2:
                    biblioteca.removerLivro();
                    break;
                case 3:
                    biblioteca.verificarLivro();
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal");
                    break;
                default:
                    System.out.println("Digite apenas opçoes que estão no menu");
            }
        } while (opcao != 4);
    }

    private static void executarMenuCliente(Biblioteca biblioteca) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU - CLIENTE");
            System.out.println("1 - Pesquisar Livro");
            System.out.println("2 - Pegar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Voltar ao Menu Principal...");
            System.out.println("Escolha uma opçao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal");
                    break;
                default:
                    System.out.println("Digite apenas opçoes que estão no menu");
            }
        } while (opcao != 4);
    }
}




    /*public static void main(String[] args) {
                Biblioteca biblioteca = new Biblioteca();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1. Adicionar Livro");
                    System.out.println("2. Pesquisar Livro");
                    System.out.println("3. Remover Livro ");

                    System.out.println("5. Cliente - Pegar Livro");
                    System.out.println("6. Cliente - Devolver Livro");
                    System.out.println("7. Bibliotecário - Gerenciar Empréstimos");
                    System.out.println("8. Sair");
                    System.out.print("Escolha uma opção: ");

                    int escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            biblioteca.adicionarLivro();
                            break;
                        case 2:
                            biblioteca.listarLivros();
                            break;
                        case 3:
                            biblioteca.removerLivro();
                            break;
                        case 4:
                            // Lógica para o cliente pegar um livro
                            break;
                        case 5:
                            // Lógica para o cliente devolver um livro
                            break;
                        case 6:
                            // Lógica para o bibliotecário gerenciar empréstimos
                            break;
                        case 7:
                            System.out.println("Saindo do programa.");
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            }
        }*/


