package com.S_producer_consumer;

import java.util.concurrent.BlockingQueue;

public class BootManager {
    public static void main(String args[]){
        new Producer().start();
        new Consumer().start();

    }
}
