package GenericClases;

import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("JAVA");
        objects.add("JEE");
        objects.add("Python");
        // objects.add(123);
        //processLanguages(objects);

        objects.stream().sorted().map(String::toLowerCase).forEach(item -> System.out.println(item));

    }

    private static void processLanguages(List<String> data) {
        System.out.println(data.get(0));
    }
}
