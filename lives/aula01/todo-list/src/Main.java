import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in); // inicializa o Scanner

    public static void main(String[] args) {

        boolean executando = true;

        System.out.println("Todo List");

        while (executando) {
            System.out.println("------MENU------");
            System.out.println("1 . Cadastrar tarefa");
            System.out.println("2 . Listar tarefas pendentes");
            System.out.println("3 . Buscar tarefa por título");
            System.out.println("4 . Marcar tarefa como concluída");
            System.out.println("5 . Remover uma tarefa");
            System.out.println("6 . Sair");
            System.out.println();

            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // consome o enter

            System.out.println("A opção escolhida foi " + opcao);

            //switch expression | swich-case versões mais recentes do Java
            executando = switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite a descrição: ");
                    String descricao = sc.nextLine();
                    System.out.print("Digite a data de entrega (yyyy-mm-dd): ");
                    LocalDate dataEntrega = LocalDate.parse(sc.nextLine());

                    Tarefa novaTarefa = new Tarefa(titulo, descricao, dataEntrega);
                    System.out.println("Tarefa cadastrada com sucesso: " + novaTarefa);

                    yield true; //yield - utilizado para retorno
                }
                case 2 -> {
                    System.out.println("Listando tarefas pendentes...");
                    yield true;
                }
                case 3 -> {
                    System.out.println("Buscando tarefa por título...");
                    yield true;
                }
                case 4 -> {
                    System.out.println("Marcando tarefa como concluída...");
                    yield true;
                }
                case 5 -> {
                    System.out.println("Removendo tarefa...");
                    yield true;
                }
                case 6 -> {
                    System.out.println("Saindo...");
                    yield false;
                }
                default -> {
                    System.out.println("Opção inválida");
                    yield true;
                }
            };
        }

        sc.close();
    }
}
