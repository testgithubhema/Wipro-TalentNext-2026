package multithreading.mini_project.hareandtortoiserace;

public class RaceDemo {

    public static void main(String[] args) {

        Hare hare = new Hare();
        Tortoise tortoise = new Tortoise();

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Race Started...\n");

        hare.start();
        tortoise.start();

        try {
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRace Completed.");
    }
}