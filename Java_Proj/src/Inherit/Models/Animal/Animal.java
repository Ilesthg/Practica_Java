package Java_Proj.src.Inherit.Models.Animal;

public class Animal {
    private String name;
    private int age;
    private char genre;

    public Animal() {
    }

    public Animal(String name, int age, char genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void makeNoise() {
        System.out.println("Hello, i'm an animal");
    }

    public void eat() {
        System.out.println("im eating");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenre() {
        return this.genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", genre=" + genre + ", name=" + name + "]";
    }

}
