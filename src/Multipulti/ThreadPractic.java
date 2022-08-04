package Multipulti;

public  class ThreadPractic{

    public static void main(String[] args){
        for (long i = 10000; i>0 ; i--) {
            System.out.println(i);
        }

        Thread a = new Thread(() -> {
         for (int i = 0; i <10000 ; i++) {
             System.out.println("Это 0 поток");
         }
     });
        a.start();
        Thread b = new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                System.out.println("Это 1 поток");
            }
        });
        b.start();
        Thread c = new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                System.out.println("Это 2 поток");
            }
        });
        c.start();
        Thread d = new Thread(() -> {
            for (int i = 0; i <10000 ; i++) {
                System.out.println("Это 3 поток");
            }
        });
        d.start();

        System.out.println("Main говорит привет");

        for (int i = 0; i < 10000 ; i++) {
            System.out.println("соси");

        }
    }
    }




























