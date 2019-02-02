public class HelloApp {
    public static void main(String[] args) {
        Hello hello1 = new Hello("World");
        Hello hello2 = new Hello();
        hello2.setToWho("Ivo");
        Hello hello3 = new Hello();
        hello3.setToWho("Dinko");
        hello1.sayHello();
        hello2.sayHello();
        hello3.sayHello();
        
    }
}
