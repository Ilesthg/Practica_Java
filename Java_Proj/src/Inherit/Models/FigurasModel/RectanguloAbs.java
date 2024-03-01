package Java_Proj.src.Inherit.Models.FigurasModel;

public class RectanguloAbs extends FigureGeoAbs {

    public RectanguloAbs(String tipoFigura) {
        super(tipoFigura);

    }

    @Override
    public void dibujar() {
        System.out.println("Soy el metodo abstracto dibujar en la clase rectangulo" + getClass().getSimpleName());

    }

}
