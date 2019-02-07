package objects;

public class Stol {

    String color;
    int witgh;
    boolean oblegalka;
    boolean sgyvaem;
    String material;



    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Stol stol1 = new Stol();
        stol1.setColor("red");
        Bell bell = new Bell(3,"дрън-дрън");
        bell.makeSound();
        bell.setSound("дцън-дзън");
        bell.makeSound();
    }


}
