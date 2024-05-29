package set.pesquisas.listaTarefas;

public class MainListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Comer");
        listaTarefas.adicionarTarefa("Lavar a Louça");
        listaTarefas.adicionarTarefa("Banho");

        listaTarefas.exibirTarefas();
        System.out.println("A quantidade de tarefas é de: "+listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("Comer");

        System.out.println("Tarefas concluídas: "+listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: "+listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Comer");
        listaTarefas.exibirTarefas();

    }
}
