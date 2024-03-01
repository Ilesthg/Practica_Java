package Java_Proj.src.GenericClases.NumbersGenericClass;

import java.util.ArrayList;
import java.util.List;

public class TestNumbers {

    public static void main(String[] args) {
        List<Integer> listint = new ArrayList<>();
        listint.add(5);
        listint.add(3);
        listint.add(65);
        listint.add(75);

        Numbers<Integer> ng = new Numbers<>(listint);
        System.out.println(ng.sortNumbers());
        System.out.println(ng.getMax(listint));
    }
}
