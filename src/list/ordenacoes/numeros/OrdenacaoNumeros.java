package list.ordenacoes.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }

    public void setNumerosList(List<Integer> numerosList) {
        this.numerosList = numerosList;
    }

    public void adicionarNumero(int num) {
        numerosList.add(num);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()) {
            Collections.sort(listaAscendente);
            return listaAscendente;
        } else{
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()) {
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        } else{
            throw new RuntimeException("\nERRO\nA lista está vazia.");
        }
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }
}
