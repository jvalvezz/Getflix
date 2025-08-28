import java.util.ArrayList;
import java.util.Scanner;

public class getflix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> filmes = new ArrayList<>();

        System.out.println("Bem Vindo Funcionário da Getflix.");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("(1) ADICIONAR FILME");
            System.out.println("(2) REMOVER FILME");
            System.out.println("(3) LISTAR FILMES");
            System.out.println("(4) SAIR");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarFilme(scanner, filmes);
                    break;
                case 2:
                    removerFilme(scanner, filmes);
                    break;
                case 3:
                    listarFilmes(filmes);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Método para adicionar filme
    public static void adicionarFilme(Scanner scanner, ArrayList<String> filmes) {
        System.out.println("Adicione o nome do filme:");
        String filme = scanner.nextLine();
        filmes.add(filme);
        System.out.println("Filme adicionado: " + filme);
    }

    // Método para remover filme
    public static void removerFilme(Scanner scanner, ArrayList<String> filmes) {
        System.out.println("Digite o nome do filme a ser removido:");
        String filme = scanner.nextLine();
        if (filmes.remove(filme)) {
            System.out.println("Filme removido: " + filme);
        } else {
            System.out.println("Filme não encontrado na lista.");
        }
    }

    // Método para listar filmes
    public static void listarFilmes(ArrayList<String> filmes) {
        System.out.println("Lista de filmes:");
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            for (int i = 0; i < filmes.size(); i++) {
                System.out.println((i + 1) + ". " + filmes.get(i));
            }
        }
    }
}
