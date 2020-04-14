package SingleProducerMultipleConsumer;

public class ProducerThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 23; i++) {
                Config.putValue(Config.random());
                Thread.sleep(100);
            }
            Config.putValue(-1);
            System.out.println("Producer Stopped Here");

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}

