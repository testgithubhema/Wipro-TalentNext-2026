package multithreading.threadcontrol_and_priorites;

public class Test3 {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("MAX");
        PriorityThread t2 = new PriorityThread("NORM");
        PriorityThread t3 = new PriorityThread("MIN");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}