public class BootManager {
    public static void main(String args[])
    {
        try
        {
            GlobalConfiguration globalConfiguration = new GlobalConfiguration();
            Producer producer = new Producer(globalConfiguration);
            Consumer consumer = new Consumer(globalConfiguration);
            Thread t1 = new Thread(producer);
            t1.start();
            Thread t2 = new Thread(consumer);
            t2.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

