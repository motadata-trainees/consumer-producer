package SingleProducerSingleConsumer;

import java.util.concurrent.BlockingQueue;

public class BootManager {
    public static void main(String args[]){
        new ProducerThread().start();
        new ConsumerThread().start();

    }
}
