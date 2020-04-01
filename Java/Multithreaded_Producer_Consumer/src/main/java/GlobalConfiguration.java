import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by ravi on 27/3/20.
 */
public class GlobalConfiguration {
    public ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
    public Boolean continueProducing = Boolean.TRUE;

    public void put(Integer data) throws InterruptedException
    {
        this.queue.put(data);
    }

    public Integer get() throws InterruptedException
    {
        return this.queue.poll();
    }
    public boolean isEmpty()
    {
        return this.queue.isEmpty();
    }
}
