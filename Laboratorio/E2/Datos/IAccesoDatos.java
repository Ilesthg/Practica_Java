package Laboratorio.E2.Datos;

import java.util.List;

import Laboratorio.E2.Excepciones.AccesstoDataEx;
import Laboratorio.E2.Excepciones.EscrituraEx;
import Laboratorio.E2.Excepciones.LecturaEx;
import Laboratorio.E2.doamin.Pelicula;

public interface IAccesoDatos {

    boolean existe(String nombrearchivo) throws AccesstoDataEx;

    List<Pelicula> listar_Peliculas(String nombrearchivo) throws LecturaEx;

    void escribirPelicula(Pelicula pelicula, String nombrearchivo, boolean anexar) throws EscrituraEx;

    String buscarPelicula(String nombrearchivo, String peliculaToSearch) throws LecturaEx;

    void crearArchivo(String nombrearchivo) throws AccesstoDataEx;

    void borrarArchivo(String nombrearchivo) throws AccesstoDataEx;
}
