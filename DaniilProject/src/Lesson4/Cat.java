package Lesson4;

public class Cat {
    String color;
    String size;
    String breed;
    String gender;

    public Cat(String color, String size, String breed, String gender){
        this.color = color;
        this.size = size;
        this.breed = breed;
        this.gender = gender;
    }

    public void meow(){
        System.out.println("Кошка " + this.size + " размера мяукнула");
    }
}
