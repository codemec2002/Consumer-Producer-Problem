public class consumer extends Thread {
    
    company c;
    consumer(company c) {
        this.c = c;
    }

    public void run() {
    
        while (true) {
            try {
                this.c.consumed_item();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
