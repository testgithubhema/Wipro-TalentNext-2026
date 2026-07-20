package multithreading.thread_creation;

public class Test2 {

    public static void main(String[] args) {

        Thread t = new Thread(new ColourThread());
        t.start();
    }
}