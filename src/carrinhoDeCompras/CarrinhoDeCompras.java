package carrinhoDeCompras;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cliente.Cliente;
import produto.Produto;

public class CarrinhoDeCompras{
    
    private List<Produto> listaProdutosCarrinho;
    private double total;
    private Cliente cliente;
    
    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.listaProdutosCarrinho = new LinkedList<>();
        this.total = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutosCarrinho() {
        return listaProdutosCarrinho;
    }

    public void setListaProdutosCarrinho(List<Produto> listaProdutosCarrinho) {
        this.listaProdutosCarrinho = listaProdutosCarrinho;
    }
    
    public void adicionarAoCarrinho(Produto p) {
        this.listaProdutosCarrinho.add(p);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public boolean removerDoCarrinho(int item){
        Collections.sort(listaProdutosCarrinho);
        
        if(item >= listaProdutosCarrinho.size()){
            System.out.println("\nNumero do intem invalido!\n");
            return false;
        }
        
        this.listaProdutosCarrinho.remove(item);
        setTotal(obterValorTotal());
        
        return true;
    }

    public void listarProdutosCarrinho(){
        Collections.sort(listaProdutosCarrinho);
        
        int i = 0;
        for (Produto p : listaProdutosCarrinho){
            System.out.println("---------------------");
            System.out.println("\nItem: " + i);
            System.out.println(p);
            System.out.println("---------------------");
            i++;
        }
    }

    public double obterValorTotal(){  
        this.total = 0;
        for (Produto p : listaProdutosCarrinho){
            this.total += p.getPreco();
        }
        return this.total;
    }

    public void pagamento(){
        if (this.total != 0){
            if (this.cliente.getSaldo() >= this.total){
                this.cliente.setSaldo(this.cliente.getSaldo() - total);
                this.listaProdutosCarrinho = null;
                System.out.println("\npagamento Realizado com Sucesso!\n");
            } else {
                System.out.println("\nSaldo Insuficiente!\n");
            }
        }
    }
}
