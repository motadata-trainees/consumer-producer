package SingleProducerMultipleConsumer;

public class MultiConsumerThread implements Runnable {
    @Override
    public void run() {
        String threadId = "Consumer-" + Thread.currentThread().getId();
        try{
            while(!Config.getisShutDown()){
               Integer number =  Config.pollValue();
               if(number == null || number == -1)
                   break;
                System.out.println(threadId + " : " + "Consumed item number : " + number);
                Thread.sleep(700);
            }
            System.out.println("Multi consumer Stopped Consuming");

        }catch(Exception e){
            e.printStackTrace();
        }
     
        }

    }
