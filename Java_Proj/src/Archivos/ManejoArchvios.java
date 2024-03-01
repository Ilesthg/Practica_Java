package Archivos;

import java.io.*;

import javax.xml.stream.events.EntityDeclaration;

public class ManejoArchvios {

    public static void crearArchivo(String nombrearchivo) {
        //SE CREA UN OBJETO DE TIPO FILE LLAMADO ARCHVO
        File archivo = new File(nombrearchivo);
        //clase para crear un archivo 
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchvio(String nombrearchivo, String contenido) {
        //SE CREA UN OBJETO DE TIPO FILE LLAMADO ARCHVO
        File archivo = new File(nombrearchivo);
        //clase para crear un archivo 
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombrearchivo) {
        //SE CREA UN OBJETO DE TIPO FILE LLAMADO ARCHVO
        File archivo = new File(nombrearchivo);

        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String lectura = leer.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = leer.readLine();

            }
            leer.close();
            System.out.println("Se leyo el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void eliminarArchivo(String nombrearchivo) {
        //SE CREA UN OBJETO DE TIPO FILE LLAMADO ARCHVO
        File archivo = new File(nombrearchivo);

        System.out.println(archivo.exists());
        archivo.delete();
        System.out.println("Se elimio el archivo");

    }
}
