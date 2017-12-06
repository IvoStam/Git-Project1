public class HelloApp {
    public static void main(String[] args) {
        Hello hello1 = new Hello("World");
        Hello hello2 = new Hello();
        hello2.setToWho("Gert");
        Hello hello3 = new Hello();

        hello1.sayHello();
        hello2.sayHello();
        hello3.sayHello();




        
    }
}
