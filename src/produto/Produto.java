package produto;

public class Produto implements Comparable<Produto> {
    
    protected String tipo;
    protected String marca;
    protected String modelo; 
    protected double preco;
    
    public Produto(String tipo, String marca, String modelo, double preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    
    @Override
    public int compareTo(Produto p) {
        return this.tipo.compareTo(p.tipo);
    }

    @Override
    public String toString() {
        return "\n\nTipo: " + this.tipo + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\npreço: " + this.preco;
    }

}
