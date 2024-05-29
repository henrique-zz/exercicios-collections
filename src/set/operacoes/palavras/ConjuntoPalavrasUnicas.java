package set.operacoes.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasSet; //quando criamos um Set com algum tipo que já existe (String,Integer...) ele já faz automaticamente a verificação e remoção de palavras (ou números) repetidos, sem precisarmos implementar o método equals() e hashCode()

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        boolean encontrado = false;
        if(!palavrasSet.isEmpty()) {
            for (String s : palavrasSet) {
                if (s.equalsIgnoreCase(palavra)) {
                    palavrasSet.remove(s);
                    System.out.println("Palavra "+s+ " removida.");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("A palavra "+palavra+" não existe no Set.");
            }
        } else {
            throw new RuntimeException("\nA lista está vazia");
        }
    }

    public void verificarPalavra(String palavra){
        if(!palavrasSet.isEmpty()) {
            if (palavrasSet.contains(palavra)) {
                System.out.println("A palavra " + palavra + " está presente no Set.");
            } else {
                System.out.println("A palavra "+palavra+" não está presente no Set.");
            }
        } else {
            throw new RuntimeException("\nA lista está vazia");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
}
