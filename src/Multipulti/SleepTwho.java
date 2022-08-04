package Multipulti;

public class SleepTwho implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++) {
        System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//    @Override
//    public void run() {
//        for (int i = 0; i < 10000 ; i++) {
//        System.out.println(i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
}
