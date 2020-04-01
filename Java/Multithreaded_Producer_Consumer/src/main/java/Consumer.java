/**
 * Created by ravi on 27/3/20.
 */
public class Consumer implements Runnable{
    private GlobalConfiguration globalConfiguration;
    public Consumer(GlobalConfiguration globalConfiguration){
        this.globalConfiguration = globalConfiguration;

    }
    public void run(){
        try {
            int count = 1;
            while (globalConfiguration.continueProducing || !globalConfiguration.isEmpty())
            {
                if(!globalConfiguration.isEmpty()) {
                    new Thread(new ConsumerThread("" + count + "", globalConfiguration)).start();
                    count = count + 1;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
