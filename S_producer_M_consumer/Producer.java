package com.S_producer_M_consumer;

public class Producer implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Config.putValue(Config.random());
                Thread.sleep(500);
            }
            Config.putValue(-1);
            System.out.println("PRODUCER STOPPED");

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}


