package View;

import java.util.Scanner;

public class View {
    private final int ADICIONAR = 1,EDITAR = 2,CONCLUIR = 3,SAIR = 0;
    private int opcao = SAIR;
    Scanner ler = new Scanner(System.in);
    { //bloco de inicilização
        do {
            System.out.println("---------------------------------------" +
                                "\n\t\t\tLista de tarefas\n" +
                               "---------------------------------------");
            //get das tarefas pendentes
            System.out.println(" · Tarefas Pendentes: "); //get das tarefas criadas - feitas
            System.out.println(" · Tarefas Concluídas: "); //get das tarefas feitas
            System.out.println("\n ⟶ [ 1 ] Para Adicionar uma nova tarefa" +
                    "\n ⟶ [ 2 ] Para ADICIONAR uma tarefa" +
                    "\n ⟶ [ 3 ] Para EDITAR uma tarefa" +
                    "\n ⟶ [ 3 ] Para CONCLUIR uma tarefa " +
                    "\n ⟶ [ 0 ] Para SAIR" +
                    "\n ⟶ Sua opção: ");
            opcao = ler.nextInt();
            switch (opcao){
                case ADICIONAR: //adiciona uma task
                    break;
                case EDITAR:    //pode trocar para outra coisa, mas por enquanto edita título e descrição de uma tarefa
                    break;
                case CONCLUIR:
                    break;
                case SAIR:
                    System.out.println("\nAté logo!");
                    break;
            }

        }while (opcao != SAIR);
    }
}
