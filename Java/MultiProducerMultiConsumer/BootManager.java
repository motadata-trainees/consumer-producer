package MultiProducerMultiConsumer;

public class BootManager {
    public static void main(String args[]) {
        for(int i=0;i<100;i++){
            new ProducerThread().start();
        }
        for(int i=0;i<100;i++) {
            new ConsumerThread().start();
        }
    }
}
