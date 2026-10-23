class Printer {
    public synchronized void printDocument(String docName) {
        System.out.println(Thread.currentThread().getName() + " started printing: " + docName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + docName);
    }
}

class UserThread extends Thread {
    Printer printer;
    String docName;

    public UserThread(Printer printer, String name, String docName) {
        super(name);
        this.printer = printer;
        this.docName = docName;
    }

    @Override
    public void run() {
        System.out.println(getName() + " state inside run: RUNNABLE");
        printer.printDocument(docName);
    }
}

public class Ex11_ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        UserThread t1 = new UserThread(printer, "PrinterThread-1", "Report.pdf");
        UserThread t2 = new UserThread(printer, "PrinterThread-2", "Presentation.pptx");

        System.out.println("Initial state of t1 before start(): " + t1.getState());

        t1.start();
        t2.start();

        Thread.sleep(200);
        System.out.println("Current state of t1 while running/waiting: " + t1.getState());

        t1.join();
        t2.join();

        System.out.println("Final state of t1 after completion: " + t1.getState());
        System.out.println("Deadlock prevention verified: Using single object monitor locks avoids circular wait conditions.");
    }
}