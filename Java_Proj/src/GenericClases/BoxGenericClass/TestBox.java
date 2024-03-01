package GenericClases.BoxGenericClass;

import java.util.ArrayList;

public class TestBox {
    public static void main(String[] args) {

        Box<Book> boxOfBooks = new Box<>(null);
        Box<Fruit> boxOfFruits = new Box<>(null);

        Book b1 = new Book("Alicia en el pais de las maravillas",
                "Pedro Perez", 0.5);

        boxOfBooks.addItems(b1);
        boxOfBooks.addItems(new Book("a", "a", 0.5));
        boxOfBooks.addItems(new Book("b", "b", 0.8));
        System.out.println(boxOfBooks);
        System.out.println(boxOfBooks.getTheLatestItem());
        System.out.println(boxOfBooks.getcountOfItems(boxOfBooks));
        System.out.println(GenericMethod.countOfItemsGenericClass(boxOfBooks));
        System.out.println("--------------------------");

        boxOfFruits.addItems(new Fruit("Fresa", "Mexico", "red", 0.5));
        boxOfFruits.addItems(new Fruit("Melocoton", "Mexico", "red", 0.5));
        System.out.println(boxOfFruits);
        System.out.println(boxOfFruits.getcountOfItems(boxOfFruits));
        System.out.println(GenericMethod.countOfItemsGenericClass(boxOfFruits));
    }

}
