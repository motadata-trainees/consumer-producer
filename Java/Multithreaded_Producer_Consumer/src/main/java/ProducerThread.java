/**
 * Created by ravi on 27/3/20.
 */
    public class ProducerThread implements Runnable{

        private GlobalConfiguration globalConfiguration;
        private String name;

        public ProducerThread(String name,GlobalConfiguration globalConfiguration)
        {
            this.globalConfiguration = globalConfiguration;
            this.name = name;
        }


        public void run()
        {
            try
            {
                for (Integer i = 1; i <=10; ++i)
                {
                    System.out.println("Producer"+name+" produced: " + i);
                    //Thread.sleep(100);
                    globalConfiguration.put(i);
                }

                this.globalConfiguration.continueProducing = Boolean.FALSE;
                System.out.println("Producer "+name+" finished its job; terminating.");
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }

        }
    }
