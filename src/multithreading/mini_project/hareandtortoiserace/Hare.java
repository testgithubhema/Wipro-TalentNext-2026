package multithreading.mini_project.hareandtortoiserace;

public class Hare extends Thread {

    public Hare() {
        setName("Hare");
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            System.out.println(getName() + " ran " + i + " meters");

            if (i == 60) {
                try {
                    System.out.println(getName() + " is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(getName() + " finished the race.");
    }
}