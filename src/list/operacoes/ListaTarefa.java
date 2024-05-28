package list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaRemover.add(t);
            }
        }
        listaTarefas.removeAll(listaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
}
