public class Main {
    public static void main(String args[]) {
        company comp = new company();
        producer prod = new producer(comp);
        consumer cons = new consumer(comp);

        prod.start();
        cons.start();
    }
    

}
