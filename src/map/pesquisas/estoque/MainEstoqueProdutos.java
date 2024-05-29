package map.pesquisas.estoque;

public class MainEstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(111, "Maçã",2.5,8);
        estoqueProdutos.adicionarProduto(222, "Banana",5.5,2);
        estoqueProdutos.adicionarProduto(333, "Amora",7.5,3);
        estoqueProdutos.adicionarProduto(444, "Carne",10.5,1);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque é de: R$ "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto menos caro é: "+estoqueProdutos.obterProdutoMenosCaro());
    }
}
