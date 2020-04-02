package MultiProducerMultiConsumer;

public class ProducerThread extends Thread {
    public void run(){
        String threadId = "Producer Thread-" + Thread.currentThread().getId();
        try {

                int n1 = Configuration.random();
                System.out.println(threadId  + " produced : " + n1);
                Configuration.putValue(n1);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
