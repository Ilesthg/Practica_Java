package GenericClases.BoxGenericClass;

public class GenericMethod {

    //Generic method of count of items, el cual esta afuera de la clase Box
    //Se nesesita contar cuantos objetos estan contenidos en el array pero diferenciando de objetos

    public static <T extends Boxable> int countOfItemsGenericClass(Box<T> box) {
        return box.getItems().size();
    }
}
