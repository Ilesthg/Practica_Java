package Java_Proj.src.Inherit.Models.Banco_Herencia;

import java.util.Scanner;

public class Transacciones extends Banco {

    Scanner leer = new Scanner(System.in);

    @Override
    public void consultasaldo() {

    }

    @Override
    public void ingresar_dinero() {
        System.out.println("cuanto deseas ingresar");

    }

    @Override
    public void retirar_dinero() {
        System.out.println("Cuanto deseas retirar");
        int retiro = leer.nextInt();
        if (retiro > saldo_inicial) {
            System.out.println("Error no tiene el balance suficiente");
        } else {
            saldo_inicial = saldo_inicial - retiro;
        }
        System.out.println(saldo_inicial);
    }

}
