package Laboratorio.E2.Presentacion;

import java.util.Scanner;

import Laboratorio.E2.Negocio.CatalogoPeliImple;
import Laboratorio.E2.Negocio.ICatalogoPeli;

public class CatalogoP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = -1;

        ICatalogoPeli catalogoP = new CatalogoPeliImple();

        while (opcion != 0) {
            System.out.println("Seleciona ima opcion: \n"
                    + "1. Iniciar catalogo de peliculas\n"
                    + "2 Agregar Peliculas\n"
                    + "3 Listar Peliculas\n"
                    + "4 Buscar Peliclas\n"
                    + "0 Salir ");
            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    catalogoP.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Que nombre tiene la pelicula: ");
                    String pelicula = leer.nextLine();
                    catalogoP.agregarPelicula(pelicula);
                    break;
                case 3:
                    catalogoP.listar_Peliculas();
                    break;
                case 4:
                    System.out.println("Nombre de la pelicula a buscar: ");
                    String buscador = leer.nextLine();
                    catalogoP.buscarPelicula(buscador);
                    break;
                case 0:
                    System.out.println("BYE");
                    break;

                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}
