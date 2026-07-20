package multithreading.threadcontrol_and_priorites;

public class Test2 {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();

        try {
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        odd.start();
    }
}