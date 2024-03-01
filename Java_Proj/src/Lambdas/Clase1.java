package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Clase1 {
    public static void main(String[] args) {
        Stream<String> lettersStream = Stream.of("a", "b", "c");//1

        Integer[] scores = new Integer[] { 80, 66, 73, 92, 43 };
        /*
        array1[0] = 1;
        array1[1] = 2;
        array1[3] = 4;
        */
        Stream<Integer> scoresStream = Arrays.stream(scores);//2

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();//2

        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(item -> System.out.println(item));
        //---------------------------------------------------------
        //We can use stream once 
        // shoppingListStream.forEach(item -> System.out.println(item));
        //---------------------------------------------------------
        //Aqui se crea una lista de string por ende podemos usar el stream de nuevo
        List<String> sortedList = shoppingList.stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(shoppingList);

        System.out.println("lasy");
        System.out.println(shoppingList.stream().sorted().collect(Collectors.toList()));

    }
}
