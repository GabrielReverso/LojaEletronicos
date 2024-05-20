package produto.smartphone;

import produto.Produto;

public class Smartphone extends Produto {

    private String armazenamento;
    private String camera;
    private String ram;

    public Smartphone(String marca, String modelo, double preço, String armazenamento, String camera, String ram) {
        super(marca, modelo, preço);
        this.armazenamento = armazenamento;
        this.camera = camera;
        this.ram = ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    
    
}
