package Multipulti;

import java.util.concurrent.Future;

public class kuku {
    static Jopa2 jopa2 = new Jopa2();
    public static void main(String[] args) {

Thread a = new Thread(()->{
    try {
        jopa2.sosi();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
});
        Thread b = new Thread(()->{
            jopa2.otsos();
        });
        a.start();
        b.start();

    }

}
class Jopa2{
    public synchronized void sosi() throws InterruptedException {
        System.out.println("sosi");
        wait();
        System.out.println("sosy");
        notify();
        System.out.println("otsosal");
    }

    public synchronized  void otsos(){
        System.out.println("vremya sosat");
        notify();
        System.out.println("S dobrim ytrom");

    }
}

