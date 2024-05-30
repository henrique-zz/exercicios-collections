package map.operacoes.dicionario;

public class MainDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Carro","Veículo automotivo");
        dicionario.adicionarPalavra("Cadeira","Objeto de madeira para sentar");
        dicionario.adicionarPalavra("Celular","Aparelho eletrônico multifuncional");
        dicionario.adicionarPalavra("Moto","Veículo de duas rodas");

        dicionario.removerPalavra("Moto");

        System.out.println("Definição da palavra pesquisada: "+dicionario.pesquisarPorPalavra("Carro"));

        dicionario.exibirPalavras();

    }
}
