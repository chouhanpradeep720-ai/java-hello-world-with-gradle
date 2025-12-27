package hello;


public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("HelloWorld");
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
