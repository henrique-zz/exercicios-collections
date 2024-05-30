package map.operacoes.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {

        if (!dicionarioMap.isEmpty() && dicionarioMap.containsKey(palavra)) {
            dicionarioMap.remove(palavra);
            System.out.println("Palavra: " + palavra + " removida do dicionário.");
        } else if (!dicionarioMap.containsKey(palavra) && !dicionarioMap.isEmpty()) {
            System.out.println("A palavra não está no Map");
        } else {
            throw new RuntimeException("\nErro\nLista Vazia.");
        }
    }

    public String pesquisarPorPalavra(String palavra){

        if (!dicionarioMap.isEmpty() && dicionarioMap.containsKey(palavra)) {
            return dicionarioMap.get(palavra);
        } else if (!dicionarioMap.containsKey(palavra) && !dicionarioMap.isEmpty()) {
            System.out.println("A palavra não está no Map");
            return null;
        } else {
            throw new RuntimeException("\nErro\nLista Vazia.");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
}
