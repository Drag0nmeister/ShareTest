package Multipulti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class FutereTest {
    public static void main(String[] args) {
        WorkFromThreed workFromThreed = new WorkFromThreed();
        Thread thread = new Thread(() -> {
            try {
                workFromThreed.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                workFromThreed.add2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main is end");
    }
}

class WorkFromThreed {

    public synchronized void add() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            System.out.println("1 метод " + i);
        }
        wait();
        System.out.println("add end");
    }

    public  synchronized void add2() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 1000; i > 0; i--) {
            System.out.println("2 метод " + i);
        }
        notify();
        System.out.println("add2 end");
    }
}




