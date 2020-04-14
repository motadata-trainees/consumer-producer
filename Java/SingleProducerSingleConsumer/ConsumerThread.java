package SingleProducerSingleConsumer;

public class ConsumerThread extends Thread {
    public void run(){
        try {
            while (!Config.getisShutDown()) {
                int number1 = Config.takeValue();
                int number2 = number1 * number1;
                System.out.println("Consumer result : " + number2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
