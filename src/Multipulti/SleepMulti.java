package Multipulti;

public class SleepMulti {

    public static void main(String[] args) throws InterruptedException {
//        Если implemets Runnable

        Thread thread = new Thread(new SleepTwho());
        thread.start();
        Thread thread1 = new Thread(new SleepTwho());
        thread1.start();

//        если переопределять Tread

//        SleepTwho sleepTwho = new SleepTwho();
//        sleepTwho.start();
//        SleepTwho sleepTwho1 = new SleepTwho();
//        sleepTwho1.start();

//        если лямбда
//    Thread a = new Thread(() -> {
//        for (int i = 0; i < 10000 ; i++) {
//        System.out.println(i);
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//    }
//    });
//    a.start();


    }
}