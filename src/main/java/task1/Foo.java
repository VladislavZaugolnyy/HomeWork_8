package task1;

import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore semaphore1;
    private Semaphore semaphore2;

    public Foo() {
        try {
            semaphore1 = new Semaphore(1);
            semaphore2 = new Semaphore(1);
            semaphore1.acquire();
            semaphore2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void first() {
        try {
            System.out.println("first");
            semaphore1.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void second() {
        try {
            semaphore1.acquire();
            System.out.println("second");
            semaphore1.release();
            semaphore2.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void third() {
        try {
            semaphore2.acquire();
            System.out.println("third");
            semaphore2.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
