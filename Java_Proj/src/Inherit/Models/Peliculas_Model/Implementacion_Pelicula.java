package Java_Proj.src.Inherit.Models.Peliculas_Model;

import javax.swing.*;
import java.util.ArrayList;

public class Implementacion_Pelicula implements ICatalogo_Peliculas {

    private final ArrayList<String> listaPeliculas;

    /*
    public Implementacion_Pelicula(ArrayList<String> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    */
    public Implementacion_Pelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void buscar_peliculas(String nomPelicula) {
        String resultado = null;

        for (String pelicula : this.listaPeliculas) {
            if (pelicula.equals(nomPelicula)) {
                resultado = pelicula;
                break;
            }
        }
        if (nomPelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(null, "El resultado " + resultado, "Buscar Pelicula", 2);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la pelicula " + nomPelicula, "Error", 3);
        }

    }

    @Override
    public void listar_peliculas() {
        JOptionPane.showMessageDialog(null, this.listaPeliculas, "ListaPeliculas", 1);
    }

    @Override
    public void insertar_peliculas(Peliculas nomPelicula) {
        this.listaPeliculas.add(nomPelicula.toString());
    }

}
