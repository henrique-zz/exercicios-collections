package map.operacoes.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        boolean encontrado = false;
        if (!contatosMap.isEmpty() && contatosMap.containsKey(nome)) {
            System.out.println("Telefone: " + contatosMap.get(nome) + " removido do Map");
            contatosMap.remove(nome); //como as chaves são únicas no nosso map, não precisamos do laço for-each e percorrer, basta passar a chave por parâmetro no remove()
            encontrado = true;
        } else if (!encontrado && !contatosMap.isEmpty()) {
            System.out.println("Nome não encontrado no Map");
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) { //pesquisa pelo nome e retornamos o número de telefone
        Integer pesquisarNome = null;
        if (!contatosMap.isEmpty()) {
            pesquisarNome = contatosMap.get(nome); //o parâmetro do get() é a chave
            return pesquisarNome;
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public void exibirContato() {
        System.out.println(contatosMap);
    }
}

