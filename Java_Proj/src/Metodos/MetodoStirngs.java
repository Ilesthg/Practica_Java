package Metodos;

public class MetodoStirngs {

    public static void main(String[] args) {

        metodoStrings("asd", "asdasdw");
        System.out.println(metodoStrings("Hola", "Bebe"));
        String resultadoMetodo = metodoStrings("Hola", "Bebe");
        System.out.println(resultadoMetodo);
    }

    public static String metodoStrings(String st1, String st2) {

        String concatenacion = st1 + " " + st2;

        return concatenacion;

    };

}
