package adam.lpa;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main Thread Running");

        try {
            System.out.println("Main Thread paused for one second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " should take 10 dots to run.");
            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("\nWhoops!! " + tName + " interrupted.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("\n" + tName + " completed.");
        });

        Thread installThread = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(250);
                    System.out.println("Installation Step " + (i + 1) + " is completed.");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }, "InstallThread");


        Thread threadMonitor = new Thread(() -> {
            long now = System.currentTimeMillis();

            while (thread.isAlive()) {
                try {
                    Thread.sleep(1000);

                    if (System.currentTimeMillis() - now > 8000) {
                        thread.interrupt();
                    }
                }  catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println(thread.getName() + " starting");
        thread.start();
        threadMonitor.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!thread.isInterrupted()) {
            installThread.start();
        } else {
            System.out.println("Previous thread was interrupted, " + installThread.getName() + " can't run.");
        }
    }
}
