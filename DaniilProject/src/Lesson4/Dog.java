package Lesson4;

public class Dog {
    String color;
    int size;

    public Dog(String color, int size){
        this.color = color;
        this.size = size;
    }

    public void bark(){
        System.out.println("Собака с размером " + size + " гавкнула");
    }
}
