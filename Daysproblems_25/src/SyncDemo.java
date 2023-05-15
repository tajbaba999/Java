class Counter{
    int count;

    public void increment(){
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
//        c.increment();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000 ; i++) {
                    c.increment();
                }
            }
        });

      t1.start();

      t1.join();

        System.out.println("Count = "+c.count);
    }
}
