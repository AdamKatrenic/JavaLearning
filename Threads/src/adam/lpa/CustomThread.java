package adam.lpa;

public class CustomThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.print(" 1 ");
            try {
                Thread.sleep(500); //1 sekundova pauza kazdy count
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
