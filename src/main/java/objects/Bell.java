package objects;

public class Bell {
    private int size;
    private String sound;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Bell(int size, String sound) {
        this.size = size;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}
