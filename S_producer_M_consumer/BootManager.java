package com.S_producer_M_consumer;

public class BootManager {
    public static void main(String args[]){


        Thread producer = new Thread(new Producer());
        try{
        producer.start();
        for(int i=1;i<=4;i++) {
            Config.executor.submit(new Consumer());
        }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
