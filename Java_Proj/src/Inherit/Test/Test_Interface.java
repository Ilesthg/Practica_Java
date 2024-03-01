package Java_Proj.src.Inherit.Test;

import Java_Proj.src.Inherit.Models.Interface_Base.BaseDatos;
import Java_Proj.src.Inherit.Models.Interface_Base.My_sql_inter;

public class Test_Interface {
    public static void main(String[] args) {
        BaseDatos obj = new My_sql_inter();
        obj.actualizar();
    }
}
