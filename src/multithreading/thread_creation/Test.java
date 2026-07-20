package multithreading.thread_creation;

public class Test {

    public static void main(String[] args) {

        Scooby t1 = new Scooby();
        Shaggy t2 = new Shaggy();

        t1.start();
        t2.start();
    }
}