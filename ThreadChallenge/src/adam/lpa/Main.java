package adam.lpa;

class oddThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i+=2) {
            System.out.println("OddThread: " + i);

            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                System.out.println("OddThread Interrupted!");
                break;
            }
        }
    }
}

class evenRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 2; i <= 10; i+=2) {
            System.out.println("EvenRunnable: " + i);

            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                System.out.println("OddThread Interrupted!");
                break;
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        oddThread oddThread = new oddThread();

        Runnable runnable =() -> {
            for (int i = 2; i <= 10; i+=2) {
                System.out.println("EvenRunnable: " + i);

                try {
                    Thread.sleep(1000);
                }  catch (InterruptedException e) {
                    System.out.println("OddThread Interrupted!");
                    break;
                }
            }
        };

        Thread evenThread = new Thread(runnable);
        oddThread.start();
        evenThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oddThread.interrupt();
    }
}
