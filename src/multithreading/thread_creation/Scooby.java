package multithreading.thread_creation;

public class Scooby extends Thread {

    public Scooby() {
        setName("Scooby");
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}