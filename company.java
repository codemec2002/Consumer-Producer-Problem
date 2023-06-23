public class company {

    int n;
    boolean chance = true;
    synchronized public void produced_item (int n) throws InterruptedException {
        if (!chance) wait();
        this.n = n;
        System.out.println("Produced item " + this.n);
        chance = false;
        notify();
    }

    synchronized public int consumed_item() throws InterruptedException {
        if (chance) wait();    
        System.out.println("consumed item " + this.n);
        chance = true;
        notify();
        return this.n;
    }
}
