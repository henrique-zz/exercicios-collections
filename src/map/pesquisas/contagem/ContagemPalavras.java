package map.pesquisas.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (contagemMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        if (contagemMap.containsKey(palavra)) {
            contagemMap.remove(palavra);
            System.out.println(palavra + " removido(a) do Set.");
        } else {
            System.out.println("A palavra: " + palavra + " não existe no Map.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        if (contagemMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> mapEntry : contagemMap.entrySet()) {
            if (mapEntry.getValue() > maiorContagem) {
                maiorContagem = mapEntry.getValue();
                palavraMaisFrequente = mapEntry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(Integer i : contagemMap.values()){
            contagemTotal += i;
        }
        return contagemTotal;
    }

    public void exibirPalavras(){
        System.out.println(contagemMap);
    }
}
