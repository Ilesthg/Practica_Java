package Java_Proj.src.Inherit.Models.Interface_Base;

public class My_sql_inter implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("inserto");

    }

    @Override
    public void listar() {
        System.out.println("listo");

    }

    @Override
    public void actualizar() {
        System.out.println("actaulizo");
    }

    @Override
    public void elimianr() {
        System.out.println("elimino");
    }

}