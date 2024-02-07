package Lesson4;

public class Starter {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", "Big", "Default", "Male");

        System.out.println(cat.color + "\n" + cat.size + "\n" + cat.breed + "\n" + cat.gender);

        cat.meow();

        Dog dog = new Dog("Black", 10);
        dog.bark();
    }
}
