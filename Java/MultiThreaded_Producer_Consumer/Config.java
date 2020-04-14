package ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by parth on 2/3/20.
 */
public class Config {
    private static BlockingQueue<Integer> sharedQueue=new LinkedBlockingDeque<>();
    private static AtomicBoolean shutdown = new AtomicBoolean(false);
    private static Random random = new Random();


    public static Integer getSharedQueue() {
        int j=0;
        try {
            j=sharedQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return j;
    }


    public static void setSharedQueue(Integer i)
    {
        try {
            sharedQueue.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Boolean shutDown() {

        return shutdown.get();
    }

    public static int getRandom()
    {

        return random.nextInt(1000);
    }

}
