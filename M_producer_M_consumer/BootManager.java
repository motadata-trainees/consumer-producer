package com.M_producer_M_consumer;

import java.util.PriorityQueue;

public class BootManager {
    public static void main(String args[]) {
        for(int i=0;i<10;i++){
            new Producer().start();
        }
        for(int i=0;i<10;i++) {
            new Consumer().start();
        }
    }
}
