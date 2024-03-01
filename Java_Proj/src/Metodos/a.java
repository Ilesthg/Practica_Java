package Metodos;

import Metodos.*;

public class a {

    public static void main(String[] args) {
        MetodoStirngs.metodoStrings("a", "b");

        int matriz1[][] = new int[3][2];

        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[1][0] = 3;
        matriz1[1][1] = 4;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {

                System.out.println(matriz1[i][j]);
            }
        }

    }

}