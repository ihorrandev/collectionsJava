package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //criando uma lista de Item chamada de item
    private List<Item> item;

    //construtor, ele assim que cria ja cria um novo array dentro da lista de itens.
    public CarrinhoCompras() {
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade){
        //pegamos a lista do tipo item adicionamos a ela um novo item que tem as caracteristicas passadas pelo parametro
        item.add(new Item(nome,preco,quantidade));
    }

    public boolean removerItem(String nome){
        List<Item> itensRemove = new ArrayList<>();
        //criamos um objeto pra guardar os itens que serão removidos
        //riamos um laço para ver quais itens serão remopvidos
        //ele pega o item salva em uma instancia quando tiver valores no item, por isso da criação do construtor de um array vazio, pra vir true aqui.
        for(Item e: item){
            //se o e nome for igual ao nome q passamos
            if(e.getNome().equalsIgnoreCase(nome)) {
                //remove item e returna true
                itensRemove.add(e);
            }
        }
        //retorna true caso apagou caso contrario volta false
        return item.removeAll(itensRemove);

    }

    public int calcularValorTotal(){
        int valorTotal = 0;
        for(Item e: item){
           valorTotal += e.getPreco() * e.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(item);
    }

    public static void main(String[] args){
        CarrinhoCompras item = new CarrinhoCompras();
        item.exibirItens();
        item.adicionarItem("batata", 10, 9);
        item.adicionarItem("feijao", 1, 10);
        System.out.println(item.calcularValorTotal());
        item.exibirItens();
        item.removerItem("batata");
        System.out.println(item.calcularValorTotal());

    }


}
