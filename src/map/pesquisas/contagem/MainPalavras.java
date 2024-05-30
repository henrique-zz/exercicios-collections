package map.pesquisas.contagem;

public class MainPalavras {
    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Java" ,3);
        palavras.adicionarPalavra("JavaScript" ,8);
        palavras.adicionarPalavra("C++" ,1);
        palavras.adicionarPalavra("Python" ,4);

        palavras.exibirPalavras();
        System.out.println("A contagem total foi de: "+palavras.exibirContagemPalavras());
        System.out.println("A palavra mais frequente foi: "+palavras.encontrarPalavraMaisFrequente());

        palavras.removerPalavra("Java");
        palavras.exibirPalavras();
    }
}
