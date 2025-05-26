package View;

import java.util.List;
import java.util.Scanner;
import Controllers.TaskController;
import models.Task;
import repository.TaskRepository;

public class View {
    private final int ADICIONAR = 1,LISTAR = 2,CONCLUIR = 3,SAIR = 0;
    private int opcao = SAIR;

    TaskController controlador = new TaskController(new TaskRepository());
    Scanner ler = new Scanner(System.in);

    public void start(){ //bloco de inicilização
        do {
            System.out.println(
                "--------------------------------" +
                "\n\tLista de tarefas\n" +
                "--------------------------------");
            //get das tarefas pendentes
            System.out.println(" · Tarefas Pendentes: "); //get das tarefas criadas - feitas
            System.out.println(controlador.getUndoneTasks());
            System.out.println("--------------------------------");
            System.out.println(" · Tarefas Concluídas: "); //get das tarefas feitas
            System.out.println(controlador.getDoneTasks());
            System.out.println("--------------------------------");
            System.out.println(
                "\n ⟶ [ 1 ] Para Adicionar uma nova tarefa" +
                "\n ⟶ [ 2 ] Para LISTAR as tarefas" +
                "\n ⟶ [ 3 ] Para CONCLUIR uma tarefa " +
                "\n ⟶ [ 0 ] Para SAIR\n");
                System.out.print("Opção: ");
            opcao = ler.nextInt();

            switch (opcao){
                case ADICIONAR: //adiciona uma task
                    System.out.print("Título da tarefa: ");
                    ler.nextLine(); //limpa o buffer evitando que o '\n' seja a entrada do título (sei que ta feio)
                    String tempTitulo = ler.nextLine();

                    System.out.print("Descrição da tarefa: ");
                    String tempDescricao = ler.nextLine();

                    controlador.createTask(new Task(tempTitulo, tempDescricao));

                break;

                case LISTAR:

                    System.out.println(
                            "--------------------------------" +
                                    "\n\tTodas as tarefas\n" +
                                    "--------------------------------");
                    System.out.println("--------------------------------");

                    List<Task> allTasks = controlador.getAllTasks();
                    for (Task task : allTasks) {
                        System.out.println(task);
                    }
                    break;

                case CONCLUIR:
                    System.out.println("Dígite o ID da tarefa para ser concluída : ");
                    ler.nextLine();
                    var id = ler.nextLong();
                    controlador.markAsDone(id);
                        System.out.println("Concluída com sucesso!");
                    break;
                case SAIR:
                    System.out.println("\nAté logo!");
                break;
            }
        }while (opcao != SAIR);
    }
}
