package Java_Proj.src.Inherit.Models.Herencia;

public class Clase_Hija extends Clase_Padre {

    private String humano;

    public Clase_Hija(String nombre, int edad, char genero, String humano) {
        super(nombre, edad, genero);
        this.humano = humano;
    }

    public String getHumano() {
        return humano;
    }

    public void setHumano(String humano) {
        this.humano = humano;
    }

    @Override
    public void saludar() {
        System.out.println("Hola desde la clase hija");
        super.saludar();
    }

}
