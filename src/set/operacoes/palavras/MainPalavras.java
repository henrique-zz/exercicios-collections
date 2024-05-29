package set.operacoes.palavras;

public class MainPalavras {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("JavaScript");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("C++");
        conjunto.adicionarPalavra("C#");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("C++");
        conjunto.verificarPalavra("Python");
        conjunto.verificarPalavra("Node");

        conjunto.removerPalavra("Python");
        conjunto.removerPalavra("Node");

        conjunto.exibirPalavrasUnicas();

    }
}
