# Requisitos

Após compreender a aplicação prática dos padrões de arquitetura DAO (Data Access Object) e MVC (Model-View-Controller) em Java.
Considere um sistema simples de gerenciamento de tarefas (To-Do List), que permite:

> - Cadastrar tarefas (com título, descrição e status);  
> - Listar tarefas;  
> - Marcar tarefas como concluídas.
> - separando claramente:
> - Classe Task.java com atributos e métodos.
> - Interface de entrada simples (console ou GUI).
> - Classe que gerencia a lógica entre a view e o model. para manipulação de tarefas:
> - Criar a interface TaskDAO e uma implementação TaskDAOImpl com persistência em memória (usar ArrayList, por exemplo).
> - Métodos esperados: addTask(), listTasks(), markAsDone().
> Código-fonte em Java;
> - Diagrama simples (UML ou esboço) mostrando a separação das camadas;
> - Pequeno texto explicando como o uso dos padrões DAO e MVC ajuda na organização e manutenção do código.

---
## Resumo
<p>Por meio do uso dos padrões DAO (Data Access Object) e MVC (Model-View-Controller), na arquitetura deste projeto, foi possível o tornar de certa forma mais organizado, visto que, é notória uma separação de responsabilidades, tornando o código mais fácil de entender e facilitando a manuntenção do mesmo. Essa divisão realizada pelo padrão MVC permite que alterações em uma camada não afetem diretamente as outras, o que favorece a flexibilidade e a escalabilidade do sistema.<br>
Quanto o DAO, foi um modelo que se fez igualmente crucial, pois foi essencial para isolar a lógica de acesso ao banco de dados. Centralizando as operações do CRUD (Create-Read-Update-Delete), o que tornou possível a reutilização de código como também torna o sistema mais robusto a eventuais mudanças.<br>
Deste modo, a combinação desses dois padrões trouxe maior clareza estrutural ao projeto, tornando-o mais modular, testável e preparado para evoluções futuras.

---
## Diagrama de Classes 

![alt text](<Captura de tela de 2025-05-26 14-44-16.png>)  
 [_Diagrama de classes do código_](https://app.diagrams.net/?splash=0#G12dSaowZg8tLPew6c92YOc4NNV4Wk3co4#%7B%22pageId%22%3A%22RZpE8nyr-ppUinjQtbNc%22%7D "link para o draw.io")
 
---
### Grupo Provas

- Caio Vinicius Marinho
- Dayvson da Silva Farias
- Josue Costa da Silva
- Matheus Aroxa Teixeira de Souza
