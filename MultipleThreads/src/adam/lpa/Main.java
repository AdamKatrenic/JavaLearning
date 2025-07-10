package adam.lpa;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        stopWatch greenWatch = new stopWatch(TimeUnit.SECONDS);
        stopWatch purpleWatch = new stopWatch(TimeUnit.SECONDS);
        stopWatch redWatch = new stopWatch(TimeUnit.SECONDS);
        Thread green = new Thread(greenWatch::countDown,ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(() -> purpleWatch.countDown(),ThreadColor.ANSI_PURPLE.name());
        Thread red = new Thread(() -> redWatch.countDown(),ThreadColor.ANSI_RED.name());
        green.start();
        purple.start();
        red.start();
    }
}

class stopWatch{

    private TimeUnit timeUnit;
    private int i;

    public stopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown(){
        countDown(5);
    }

    public void countDown(int unitCount) {

        String threadName = Thread.currentThread().getName();

        ThreadColor threadColor = ThreadColor.ANSI_RESET;
        try {
            threadColor = ThreadColor.valueOf(threadName);
        } catch (IllegalArgumentException ignore) {

        }
        String color = threadColor.color();
        for (i = unitCount; i > 0; i--) {
            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s%s Thread : i = %d%n", color, threadName, i);
        }
    }
}
