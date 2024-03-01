package Laboratorio.E1.mundoPC;

public class Teclado extends Dispositivo_entrada {
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + ", " + super.toString() + "]";
    }

}
