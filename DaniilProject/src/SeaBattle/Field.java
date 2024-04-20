package SeaBattle;

public class Field {
    int[] field;
    int size;

    public Field(int size){
        this.size = size;
        field = new int[size];
        for (int i: field) {
            i = 0;
        }
    }
    public static Field GenerateField(int size){
        Field field = new Field(size);
        field.placeShip(5);
        return field;
    }
    public void placeShip(int size){
        int place = (int) (Math.random() * (this.size - (size - 1)));
        for (int i = place; i < place + size; i++) {
            field[i] = 1;
        }
    }
    public void printField(){
        for (int p : field) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
    public void shoot(int place){
        place -= 1;
        try{
            if(field[place] == 1) System.out.println("Попал!");
            else if(field[place] == 0) System.out.println("Не попал!");
            else System.out.println("Вы сюда уже стреляли!");
            field[place] = 2;
        }
        catch (Exception ex){
            System.out.println("Введите корректную позицию!");
        }
    }
    public boolean gameEnded(){
        for (int p : field) {
            if(p == 1){
                return false;
            }
        }
        return true;
    }
}
