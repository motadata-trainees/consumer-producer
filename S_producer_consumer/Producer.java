package com.S_producer_consumer;

import java.util.Scanner;

public class Producer extends Thread {
    public void run(){
        Scanner s1 = new Scanner(System.in);
        try {
            while (!Config.getisShutDown()) {
                System.out.print("enter number : ");
                int n1 = s1.nextInt();
                System.out.println("Producer produced : " + n1);
                Config.putValue(n1);
                Thread.sleep(10);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    }

