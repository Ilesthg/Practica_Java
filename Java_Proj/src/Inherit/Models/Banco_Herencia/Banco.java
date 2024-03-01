package Java_Proj.src.Inherit.Models.Banco_Herencia;

import javax.swing.*;
import java.util.Scanner;

public abstract class Banco {

    protected static int saldo_inicial = 600;
    Scanner leer = new Scanner(System.in);

    public void menu() {

        Terminar: while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "1-CONSULTA SALDO\n"
                            + "2 -RETIRO DE EFECTIVO\n"
                            + "3-DEPOSITO DE EFECTIVO "
                            + "4- salir",
                    "Catalogo Pelicuals", 3);
            switch (opcion) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    break Terminar;

                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }

        }
    }

    public abstract void consultasaldo();

    public abstract void ingresar_dinero();

    public abstract void retirar_dinero();

    public static int getSaldo_inicial() {
        return saldo_inicial;
    }

    public static void setSaldo_inicial(int saldo_inicial) {
        Banco.saldo_inicial = saldo_inicial;
    }

}
