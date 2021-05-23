public class Main {
    public static String name = "Melissa";

    static  void sayHello(){
        System.out.println("Hello, my name is " +name);
    }

    public static void main(String[] args) {
        sayHello();
        sayHelloBack();


    }

    static void sayHelloBack(){

        System.out.println("Hi Melissa, this is Andrew!");

    }
}
