package MultiProducerMultiConsumer;

public class ConsumerThread extends Thread {
    public void run(){
        String threadId = "Consumer Thread-" + Thread.currentThread().getId();
        try{

                int n1 = Configuration.takeValue();
                int n2 = n1 * n1;
                System.out.println(threadId + " consumed : " + n2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
