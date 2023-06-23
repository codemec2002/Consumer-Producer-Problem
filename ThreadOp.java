public class ThreadOp {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Program started");
        int x = 56 + 25;
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("current thread is " + tname);

        t.setName("Sanu");
        System.out.println("Now updated current thread is " + t.getName());

        // Thread.sleep(5000);

        System.out.println(t.getId());
        System.out.println("Sum is " + x);
        System.out.println("Program ended");

    }
}
