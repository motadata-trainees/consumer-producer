package ProducerConsumer;

/**
 * Created by parth on 14/4/20.
 */
public class ProducerThread implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            new Thread(new Producer()).start();
        }
    }
}
