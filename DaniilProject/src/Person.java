public class Person {
    private String name = "Иван";
    int age = 20;
    float height = 1.9f;

    public void talk(){
        System.out.println(name + " сказал: " + "\"Привет\"");
    }
    public void walk(){
        System.out.println(name + " пошел");
    }
    public void jump(){
        System.out.println(name + " прыгнул");
    }
    public void printAge(){
        System.out.println(age);
    }
    public void printHeight(){
        System.out.println(height);
    }
    public void setName(String name){
        this.name = name;
    }
}