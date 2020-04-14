package SingleProducerSingleConsumer;

import java.util.Scanner;

public class ProducerThread extends Thread {
    public void run(){
        Scanner sc = new Scanner(System.in);
        try {
            while (!Config.getisShutDown()) {
                System.out.print("enter number : ");
                int number1 = sc.nextInt();
                System.out.println("Producer produced : " + number1);
                Config.putValue(number1);
                Thread.sleep(10);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    }

