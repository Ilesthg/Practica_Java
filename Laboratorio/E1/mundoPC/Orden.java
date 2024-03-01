package Laboratorio.E1.mundoPC;

public class Orden {
    private int idOrden;
    private static int contadorOrdenes;

    private Computador computadoras[];
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computador[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computador computador) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computador;
        } else {
            System.out.println("array lleno");
        }
    }

    public void mostrarOrden() {
        System.out.println("ID Orden; " + idOrden);
        System.out.println("Computadores dentro de la Orden; " + contadorComputadoras);
        System.out.println(computadoras);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }

}