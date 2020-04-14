package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by parth on 2/3/20.
 */
public class BootManager {
    public static void main(String args[]) {

        Thread t1=new Thread(new ProducerThread());
        Thread t2=new Thread(new ConsumerThread());
        t1.start();
        t2.start();

    }
}
