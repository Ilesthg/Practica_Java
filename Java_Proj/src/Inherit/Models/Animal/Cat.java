package Java_Proj.src.Inherit.Models.Animal;


public class Cat extends Animal {

    private String preferedFoodCat;

    public Cat(String name, int age, char genre, String preferedFoodCat) {
        super(name, age, genre);
        this.preferedFoodCat = preferedFoodCat;
    }

    @Override
    public void eat() {// se sorbreescribe el metodo de la clase padre
        super.eat(); // se manda llamar al metodo eeat de lla clase padre sin modificar
        System.out.println("im eating cause im a cat");
        makeNoise();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("preferedFoodCat=").append(preferedFoodCat);
        sb.append(",").append(super.toString());
        return sb.toString();
    }

}
