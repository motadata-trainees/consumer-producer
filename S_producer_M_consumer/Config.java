package com.S_producer_M_consumer;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Config {
    private static BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
    private static Random ran = new Random();
    private static AtomicBoolean isShutDown = new AtomicBoolean(false);
    public static ExecutorService executor = Executors.newFixedThreadPool(4);

   /* public static void submit(){
        for(int i=1;i<=4;i++) {
            executor.submit(new Consumer());
    }*/
    public static void putValue(Integer value){
        try{
        queue.put(value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Integer pollValue(){
        try {
            return queue.poll(5,TimeUnit.SECONDS);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static int random(){
        int number = ran.nextInt(1000);
        System.out.println("Produced number : " + number);
        return number;
    }

    public static Boolean getisShutDown() {
        return isShutDown.get();
    }

    public static void setisShutDown(Boolean value){
        isShutDown.set(value);
    }



}
