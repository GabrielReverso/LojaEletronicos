package cliente;

import carrinhoDeCompras.CarrinhoDeCompras;

public class Cliente {
    
    private String nome;
    private String cpf;
    private double saldo;
    private CarrinhoDeCompras carrinhoDeCompras;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.carrinhoDeCompras = null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    @Override
    public String toString() {
        return "\n\nNome: " + nome + "\nCPF: " + cpf + "\nSaldo: " + saldo + "\n";
    }


}
