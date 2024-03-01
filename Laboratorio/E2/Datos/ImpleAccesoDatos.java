package Laboratorio.E2.Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Laboratorio.E2.Excepciones.AccesstoDataEx;
import Laboratorio.E2.Excepciones.EscrituraEx;
import Laboratorio.E2.Excepciones.LecturaEx;
import Laboratorio.E2.doamin.Pelicula;

public class ImpleAccesoDatos implements IAccesoDatos {

    @Override
    public boolean existe(String nombrearchivo) throws AccesstoDataEx {
        File archivo = new File(nombrearchivo);
        //archivo.exists();
        return archivo.exists();
    }

    @Override
    public void escribirPelicula(Pelicula pelicula, String nombrearchivo, boolean anexar) throws EscrituraEx {
        File archivo = new File(nombrearchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, anexar));
            pw.println(pelicula.toString());
            pw.close();
            System.out.println("Se ha escrito lo siguiente" + pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraEx("Excepcion al escrbir peliculas" + e.getMessage());
        }

    }

    @Override
    public List<Pelicula> listar_Peliculas(String nombrearchivo) throws LecturaEx {
        File archivo = new File(nombrearchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        //Leer archivo, cada linea del archivo contiene un string, usar buffer reader y file reader 
        try {

            BufferedReader bf = new BufferedReader(new FileReader(archivo));
            String lineas = null;
            lineas = bf.readLine();

            while (lineas != null) {
                Pelicula pelicula = new Pelicula(lineas);
                peliculas.add(pelicula);
                lineas = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaEx("Excepcion al listar peliculas" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaEx("Excepcion al listar peliculas" + e.getMessage());
        }

        return peliculas;
    }

    @Override
    public String buscarPelicula(String nombrearchivo, String peliculaToSearch) throws LecturaEx {
        File archivo = new File(nombrearchivo);
        String resultado = null;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(archivo));
            String lineas = null;
            lineas = bf.readLine();
            int indice = 1;
            while (lineas != null) {
                if (peliculaToSearch != null && peliculaToSearch.equalsIgnoreCase(lineas)) {
                    resultado = "Pelicula ;" + lineas + " index; " + indice;
                    //*************************** down here  */
                    // lineas = bf.readLine();
                    break;
                }
                lineas = bf.readLine();
                indice++;

            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaEx("Excepcion al buscar peliculas" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaEx("Excepcion al buscar peliculas" + e.getMessage());
        }

        return resultado;
    }

    @Override
    public void crearArchivo(String nombrearchivo) throws AccesstoDataEx {
        File archivo = new File(nombrearchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo));
            pw.close();
            System.out.println("Se ha creado un archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraEx("Excepcion al escrbir archivo" + e.getMessage());
        }
    }

    @Override
    public void borrarArchivo(String nombrearchivo) throws AccesstoDataEx {
        File archivo = new File(nombrearchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Exito, borrada");
        } else {
            System.out.println("No existe el archivo");
        }

    }

}
