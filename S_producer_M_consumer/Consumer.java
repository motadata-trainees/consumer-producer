package com.S_producer_M_consumer;

public class Consumer implements Runnable {
    @Override
    public void run() {
        String threadId = "Consumer-" + Thread.currentThread().getId();
        try{
            while(!Config.getisShutDown()){
               Integer number =  Config.pollValue();
               if(number == null || number == -1)
                   break;
                System.out.println(threadId + " : " + "Consumed number : " + number);
                Thread.sleep(1000);
            }
            System.out.println("CONSUMER STOPPED");

        }catch(Exception e){
            e.printStackTrace();
        }
       /* finally {
            if (!Config.getisShutDown())
                run();*/


        }

    }
