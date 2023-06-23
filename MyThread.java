

class MyThread implements Runnable {

    @Override
    public void run() {
         for (int i = 1; i <= 10; i++) {
            System.out.println("value of i " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");

        // task for thread...
       
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);

        // object of extended class
        ThreadUsingExtension t2 = new ThreadUsingExtension();

        th.start();    
        t2.start(); 
    }

}


