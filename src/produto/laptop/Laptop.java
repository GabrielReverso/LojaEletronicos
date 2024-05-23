package produto.laptop;

import produto.Produto;

public class Laptop extends Produto{

    private String cpu;
    private String gpu;
    private String ram;
    private String armazenamento;

    public Laptop(String tipo, String marca, String modelo, double preço, String cpu, String gpu, String ram, String armazenamento) {
        super(tipo, marca, modelo, preço);
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCPU: " + this.cpu + "\nGPU: " + this.gpu + "\nMemoria RAM: " + this.ram + "\nArmazenamento: " + this.armazenamento + "\n";
    }
    
}
