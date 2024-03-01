package Laboratorio.E1.mundoPC;

public class Dispositivo_entrada {

    private String tipoEntrada;
    private String marca;

    public Dispositivo_entrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Dispositivo_entrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
    }

}
