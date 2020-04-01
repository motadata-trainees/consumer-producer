package com.M_producer_M_consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Config {
    private static BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
    private static Random ran = new Random();
    private static AtomicBoolean isShutDown = new AtomicBoolean(false);

    public static void putValue(Integer value){
        try{
            queue.put(value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Integer takeValue(){
        try {
            return queue.poll(5,TimeUnit.SECONDS);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static int random(){
        int number = ran.nextInt(10);
        //System.out.println("Produced number : " + number);
        return number;
    }

    public static Boolean getisShutDown() {
        return isShutDown.get();
    }

    public static void setisShutDown(Boolean value){
        isShutDown.set(value);
    }
}
