package Java_Proj.src.Inherit.Test;

import Java_Proj.src.Inherit.Models.FigurasModel.FigureGeoAbs;
import Java_Proj.src.Inherit.Models.FigurasModel.RectanguloAbs;

public class TestABS {

    public static void main(String[] args) {
        FigureGeoAbs figura = new RectanguloAbs("Rectangulo ");

        System.out.println(figura);
        figura.dibujar();
    }
}