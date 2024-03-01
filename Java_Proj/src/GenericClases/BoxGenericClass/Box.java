package GenericClases.BoxGenericClass;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {

    private final List<T> items;

    //constructor 
    public Box(List<T> items) {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box [items=" + items + "]";
    }

    //AGREGA LO QUE SEA QUE ESTAS AGREGANDO DENTRO DE LA CAJA 
    public void addItems(T t) {
        this.items.add(t); //AGREGAMOS EL OBJETO AL ARRAY DE BOX 
    }

    public T getTheLatestItem() {
        return this.items.get(items.size() - 1);
    }

    public int getcountOfItems(Box<T> box) {
        return box.getItems().size();
    }

}
