package produto.tv;

import produto.Produto;

public class Tv extends Produto{

    private String resolucao;
    private String polegadas;

    public Tv(String tipo, String marca, String modelo, double preço, String resolucao, String polegadas) {
        super(tipo, marca, modelo, preço);
        this.resolucao = resolucao;
        this.polegadas = polegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nResolucao: " + this.resolucao + "\nPolegadas: " + this.polegadas + "\n";
    }
    
}
