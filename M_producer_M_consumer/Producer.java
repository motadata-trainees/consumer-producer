package com.M_producer_M_consumer;

import java.util.Collections;

public class Producer extends Thread {
    public void run(){
        String threadId = "Producer-" + Thread.currentThread().getId();
        try {
           // while(!Config.getisShutDown()) {
                int n1 = Config.random();
                System.out.println(threadId +  " : " + "Producer produced : " + n1);
                Config.putValue(n1);
                //Thread.sleep(500);
          //  }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
