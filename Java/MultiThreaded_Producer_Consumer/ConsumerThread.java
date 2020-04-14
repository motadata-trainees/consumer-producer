package ProducerConsumer;

/**
 * Created by parth on 14/4/20.
 */
public class ConsumerThread implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            new Thread(new Consumer()).start();
        }
    }
}
