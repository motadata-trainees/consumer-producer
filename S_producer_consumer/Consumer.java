package com.S_producer_consumer;

public class Consumer extends Thread {
    public void run(){
        try {
            while (!Config.getisShutDown()) {
                int n1 = Config.takeValue();
                int n2 = n1 * n1;
                System.out.println("Consumer result : " + n2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
