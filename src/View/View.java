package View;

public class View {
    { //bloco de inicilização
        System.out.println("-------------------------------------" +
                            "\tLista de tarefas\n" +
                            "-------------------------------------");
        //get das tarefas pendentes
        System.out.println(" · Tarefas Pendentes: "); //get das tarefas criadas - feitas
        System.out.println(" · Tarefas Concluídas: "); //get das tarefas feitas
        System.out.println("\n ⟶ [ 1 ] Para Adicionar uma nova tarefa" +
                "\n ⟶ [ 2 ] Para ADICIONAR uma tarefa" +
                "\n ⟶ [ 3 ] Para EDITAR uma tarefa" +
                "\n ⟶ [ 3 ] Para CONCLUIR uma tarefa " +
                "\n ⟶ [ 0 ] Para SAIR" +
                "\n ⟶ Sua opção: ");

    }
}
