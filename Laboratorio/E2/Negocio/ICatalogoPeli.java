package Laboratorio.E2.Negocio;

public interface ICatalogoPeli {

    String NOMBREARCHIVO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listar_Peliculas();

    void buscarPelicula(String nombrePelicula);

    void iniciarCatalogoPeliculas();
}
