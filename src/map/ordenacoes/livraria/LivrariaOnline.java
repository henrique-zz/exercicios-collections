package map.ordenacoes.livraria;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livroMap.put(link, livro);
    }

    public void removeLivro(String titulo) {
        if (livroMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        boolean encontrado = false;
        for(Map.Entry<String,Livro> entry : livroMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                encontrado = true;
                livroMap.remove(entry.getKey());
                System.out.println(titulo + " removido(a) do Set.");
                break;
            }
        }
        if(!encontrado){
            System.out.println("O livro com titulo: " + titulo + " não existe no Map.");
        }

    }

    public Map<String, Livro> exibirLivrosPorPreco() {
        List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(livroMap.entrySet());
        Collections.sort(livrosPorPreco, new ComparatorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livroMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarPorAutor(String autor) {
        if (livroMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }

        Map<String, Livro> autorMap = new HashMap<>();
        boolean encontrado = false;

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                autorMap.put(entry.getKey(), entry.getValue());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("O livro com autor: " + autor + " não existe no Map.");
            return null;
        }
        return autorMap;
    }

    public Livro obterLivroMaisCaro() {
        if (livroMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        Livro livroMaisCaro = null;
        double maisCaro = Integer.MIN_VALUE;
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() > maisCaro) {
                maisCaro = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue();
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        if (livroMap.isEmpty()) {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        Livro livroMaisBarato = null;
        double maisBarato = Integer.MAX_VALUE;
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() < maisBarato) {
                maisBarato = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue();
            }
        }
        return livroMaisBarato;
    }

    public void livros() {
        System.out.println(livroMap);
    }
}
