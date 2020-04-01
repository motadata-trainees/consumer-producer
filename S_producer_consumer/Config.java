package com.S_producer_consumer;

import javax.management.openmbean.TabularData;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Config {
    private static BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
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
            return queue.take();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Boolean getisShutDown() {
        return isShutDown.get();
    }

    public static void setisShutDown(Boolean value){
        isShutDown.set(value);
    }


}
