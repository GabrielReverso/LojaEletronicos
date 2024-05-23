package produto.smartphone;

import produto.Produto;

public class Smartphone extends Produto {

    private String armazenamento;
    private String camera;
    private String ram;

    public Smartphone(String tipo, String marca, String modelo, double preço, String armazenamento, String camera, String ram) {
        super(tipo, marca, modelo, preço);
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

    @Override
    public String toString() {
        return super.toString() + "\nArmazenamento: " + this.armazenamento + "\nCamera: " + this.camera + "\nMemoria RAM: " + this.ram + "\n";
    }
    
    
}
