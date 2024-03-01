package Laboratorio.E1.mundoPC;

public class Raton extends Dispositivo_entrada {
    private final int idRton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idRton + ", " + super.toString() + "]";
    }

}
