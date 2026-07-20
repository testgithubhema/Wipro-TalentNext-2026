package multithreading.thread_creation;

public class Shaggy extends Thread {

    public Shaggy() {
        setName("Shaggy");
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}