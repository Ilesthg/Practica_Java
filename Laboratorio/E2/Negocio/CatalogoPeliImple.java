package Laboratorio.E2.Negocio;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Inheritance.Models.Peliculas_Model.Peliculas;
import Laboratorio.E2.Datos.IAccesoDatos;
import Laboratorio.E2.Datos.ImpleAccesoDatos;
import Laboratorio.E2.Excepciones.AccesstoDataEx;
import Laboratorio.E2.Excepciones.LecturaEx;
import Laboratorio.E2.doamin.Pelicula;

public class CatalogoPeliImple implements ICatalogoPeli {

    //DEPENDENCIAS QUE SE VEN EN SPRING
    private IAccesoDatos datos;

    public CatalogoPeliImple() {
        this.datos = new ImpleAccesoDatos();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBREARCHIVO);
            datos.escribirPelicula(pelicula, NOMBREARCHIVO, anexar);
        } catch (AccesstoDataEx e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listar_Peliculas() {

        try {
            List<Pelicula> peliculas = this.datos.listar_Peliculas(NOMBREARCHIVO);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }

            peliculas.stream().forEach(item -> System.out.println(item));

        } catch (AccesstoDataEx e) {
            System.out.println("Error de acceso a datos ");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        try {
            resultado = this.datos.buscarPelicula(NOMBREARCHIVO, nombrePelicula);
        } catch (LecturaEx e) {
            e.printStackTrace();
        }
        System.out.println("Resultado; " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {

        try {
            if (this.datos.existe(NOMBREARCHIVO)) {
                datos.borrarArchivo(NOMBREARCHIVO);
                datos.crearArchivo(NOMBREARCHIVO);
            } else {
                datos.crearArchivo(NOMBREARCHIVO);
            }
        } catch (AccesstoDataEx e) {
            e.printStackTrace();
        }
    }

}
