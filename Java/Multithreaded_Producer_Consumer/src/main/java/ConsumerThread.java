/**
 * Created by ravi on 27/3/20.
 */
public class ConsumerThread implements Runnable{
    private String name;
    private GlobalConfiguration globalConfiguration;
    private Integer data;


    public ConsumerThread(String name, GlobalConfiguration globalConfiguration)
    {
        this.name = name;
        this.globalConfiguration = globalConfiguration;
    }


    public void run()
    {
        try
        {
            data = globalConfiguration.get();
            System.out.println("Consumer " + this.name + " processed data from queue: " + data);
            System.out.println("Comsumer " + this.name + " finished its job; terminating.");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
