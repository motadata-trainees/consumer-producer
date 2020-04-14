package SingleProducerMultipleConsumer;

public class BootManager {
    public static void main(String args[]){


        Thread producer = new Thread(new ProducerThread());
        try{
        producer.start();
        for(int i=1;i<=4;i++) {
            Configuration.executor.submit(new MultiConsumerThread));
        }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
