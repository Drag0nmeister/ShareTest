package Multipulti;

public class ThreadTest1 {

    public static void main(String[] args) {
Market market = new Market();
      Thread thread1 = new Thread(new Producer(market));
        Thread thread2 = new Thread(new Consumer(market));
        thread1.start();
        thread2.start();

    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("потребитель взял 1 хлеб");
        System.out.println("Остаток хлеба потребитлея = " + breadCount);
        System.out.println();
        notify();
    }

    public synchronized void putBread() {
        if (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Произвели 1 хлеб");
        System.out.println();
        notify();
        System.out.println("Остаток хлеба продюсера = " + breadCount);
        System.out.println();
    }
}

class Consumer implements Runnable {
    Market market;
    public Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }

    }
}

class Producer implements Runnable {
    Market market ;
    public Producer(Market market){
        this.market = market;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            market.putBread();
        }

    }
}

