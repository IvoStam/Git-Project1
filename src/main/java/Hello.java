public class Hello {
    private  String greeting = "Hello";
    private String toWho;

    public Hello(String word) {
        this.toWho = word;
    }

    public Hello() {
        this.toWho = new String();
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
    
    public void sayHello(){

        System.out.println(greeting +" "+ toWho);
    }
}
