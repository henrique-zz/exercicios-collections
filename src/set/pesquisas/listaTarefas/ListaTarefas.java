package set.pesquisas.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!tarefasSet.isEmpty()) {
            for(Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasSet.remove(t);
                    System.out.println(t + " removida.");
                    break;
                }
            }
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    break;
                }
            }
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    break;
                }
            }
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }

    }

    public void limparListaTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public void exibirTarefas(){
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
