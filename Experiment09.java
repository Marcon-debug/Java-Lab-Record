class ReservationThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[ReservationThread] Processing ticket reservation step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class StatusThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t[StatusThread] Verifying ticket confirmation step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Ex09_Multithreading {
    public static void main(String[] args) {
        ReservationThread t1 = new ReservationThread();
        Runnable target = new StatusThread();
        Thread t2 = new Thread(target);

        t1.start();
        t2.start();
    }
}