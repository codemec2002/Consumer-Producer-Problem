


/**
 * ThreadUsingExtension
 */
public class ThreadUsingExtension extends Thread {

    @Override
    public void run () {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Print using extend i = " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}