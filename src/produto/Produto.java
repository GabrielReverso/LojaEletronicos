package produto;

public class Produto {
    
    protected String marca;
    protected String modelo; 
    protected double preço;
    
    public Produto(String marca, String modelo, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.preço = preço;
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
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    
}
