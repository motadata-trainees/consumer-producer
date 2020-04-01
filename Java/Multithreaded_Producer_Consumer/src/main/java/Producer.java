/**
 * Created by ravi on 27/3/20.
 */
public class Producer implements Runnable{
    private GlobalConfiguration globalConfiguration;

    public Producer(GlobalConfiguration globalConfiguration)
    {
        this.globalConfiguration = globalConfiguration;
    }
    public void run()
    {
        try
        {
            for(int i =1;i<=5;i++) {
                new Thread(new ProducerThread(""+i+"",globalConfiguration)).start();
            }
            this.globalConfiguration.continueProducing = Boolean.FALSE;
            System.out.println("Producer finished its job; terminating.");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
