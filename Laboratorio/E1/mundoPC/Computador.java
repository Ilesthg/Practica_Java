package Laboratorio.E1.mundoPC;

public class Computador {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadoridComputadoras;

    private Computador() {
        this.idComputadora = ++Computador.contadoridComputadoras;
    }

    public Computador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computador [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
                + ", teclado=" + teclado + ", raton=" + raton + "]";
    }

}
