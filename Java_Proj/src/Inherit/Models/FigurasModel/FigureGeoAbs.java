package Java_Proj.src.Inherit.Models.FigurasModel;

public abstract class FigureGeoAbs {

    // ATRIBUTO
    protected String tipoFigura;

    // CONSTRUCTOR
    public FigureGeoAbs(String tipoFigura) {
        this.tipoFigura = tipoFigura;

    }

    // abstract method
    public abstract void dibujar();

    // EL NO VOID TIENE QUE RRETORNAR ALGO
    // SETS AND GETS
    public String getTipoFigura() {
        return tipoFigura;
    }

    // VOID NO RETORNA NADA
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FigureGeo [tipoFigura=" + tipoFigura + "]";
    }

}
