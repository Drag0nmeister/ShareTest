public interface Dad {
    static void sayHello(){
        System.out.println("Hi");
    }
    default  void printName(){
        sayHello();
    }
}
