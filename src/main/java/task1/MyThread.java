package task1;

public class MyThread extends Thread {
    private Foo foo;
    private String methodToCall;

    public MyThread(Foo foo, String name) {
        this.foo = foo;
        this.methodToCall = name;
    }

    public void run() {
        if ("first".equals(methodToCall)) {
            foo.first();
        } else if ("second".equals(methodToCall)) {
            foo.second();
        } else if ("third".equals(methodToCall)) {
            foo.third();
        }
    }
}
