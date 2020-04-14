package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by parth on 2/3/20.
 */
public class BootManager {
    public static void main(String args[]) {
        try {

        Thread t1=new Thread(new Producer());
        Thread t2=new Thread(new Consumer());
        t1.start();
        t2.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
