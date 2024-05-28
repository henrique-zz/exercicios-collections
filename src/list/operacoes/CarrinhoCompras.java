package list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        itemList.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome) throws ItemException {
        boolean encontrado = false;
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemList.remove(i);
                encontrado = true;
            }
        }

        if(!encontrado){
            throw new ItemException("\nERRO\nNome do item não existente.");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : itemList){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
