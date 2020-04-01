package com.M_producer_M_consumer;

public class Consumer extends Thread {
    public void run(){
        String threadId = "Consumer-" + Thread.currentThread().getId();
        try{
         //   while(!Config.getisShutDown()){
                int n1 = Config.takeValue();
                int n2 = n1 * n1;
                System.out.println(threadId +  " : " + "Consumer consumed : " + n2);
             //   Thread.sleep(1000);

           // }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
