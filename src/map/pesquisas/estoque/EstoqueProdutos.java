package map.pesquisas.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long,Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo,String nome, double preco, int quantidade){
        produtosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public double calcularValorTotalEstoque(){
        double total = 0;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){ //retorna apenas os valores (que são os Produtos), e percorremos para calcular o valor total
                total += p.getPreco() * p.getQuantidade();
            }
            return total;
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            return produtoMaisCaro;
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public Produto obterProdutoMenosCaro(){
        Produto produtoMenosCaro = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMenosCaro = p;
                }
            }
            return produtoMenosCaro;
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }
}
