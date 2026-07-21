package multithreading.mini_project.hareandtortoiserace;

public class Tortoise extends Thread {

    public Tortoise() {
        setName("Tortoise");
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + " ran " + i + " meters");
        }

        System.out.println(getName() + " finished the race.");
    }
}