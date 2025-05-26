package View;

import java.util.List;
import java.util.Scanner;
import Controllers.TaskController;
import models.Task;
import repository.TaskRepository;

public class View {
    private final int ADICIONAR = 1,LISTAR = 2,CONCLUIR = 3,SAIR = 0;
    private int opcao = SAIR;
    TaskRepository repositorio = new TaskRepository();
    TaskController controlador = new TaskController(repositorio);
    Scanner ler = new Scanner(System.in);

    public void start(){ //bloco de inicilização
        do {
            int num = repositorio.tasksDone("num");
            int done = repositorio.tasksDone("done");
            System.out.println(
                "--------------------------------" +
                "\n\tLista de tarefas\n" +
                "--------------------------------");
            //get das tarefas pendentes
            System.out.println(" · Tarefas Pendentes: " + num); //get das tarefas criadas - feitas
            System.out.println(" · Tarefas Concluídas: " + done); //get das tarefas feitas
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
                    
                    controlador.createTask(new Task(tempTitulo, tempDescricao, "Não Concluída"));
                    
                break;
                
                case LISTAR:
                    listarCompleto(repositorio);
                controlador.getAllTasks();
                break;
                case CONCLUIR:
                    listarNome(repositorio);
                    System.out.println("Dígite o título da tarefa para ser concluída : ");
                    ler.nextLine();
                    tempTitulo = ler.nextLine();
                    if (comparador(repositorio, tempTitulo))
                        System.out.println("Concluída com sucesso!");
                    else
                        System.out.println("Tarefa não encontrada!");
                    break;
                case SAIR:
                    System.out.println("\nAté logo!");
                break;
            }
        }while (opcao != SAIR);
    }

    public void listarCompleto(TaskRepository taskRepository){
        List<Task> tarefas = taskRepository.listTasks();
        for(Task tarefa: tarefas){
            System.out.println(tarefa);
        }
    }

    public void listarNome(TaskRepository taskRepository){
        List<Task> tarefas = taskRepository.listTasks();
        int indice = 1;
        for(Task tarefa: tarefas){
            System.out.println((indice++)+" - "+tarefa.getName());
        }
    }

    public boolean comparador(TaskRepository taskRepository,String titulo){
        List<Task> tarefas = taskRepository.listTasks();
        for(Task tarefa: tarefas){
            if (tarefa.getName().equals(titulo)){
                taskRepository.markAsDone(tarefa);
                return true;
            }
        }
        return false;
    }
}
