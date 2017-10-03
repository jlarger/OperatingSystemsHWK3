/**
 * Created by jameslarger on 9/29/17.
 */
public class BThreads implements Runnable
{

    Resource resource = new Resource();

    public BThreads(Resource i)
    {
        super();
        resource = i;
    }

    @Override
    public void run()
    {

        int i = 0;
        int fetchedValue = resource.getValue();

        while(i < 10) {


            System.out.println("Value before B changing: " + fetchedValue);
            resource.setValue(fetchedValue - 1);

            try {
                Thread.sleep((((long) (Math.random() * 200 - 10)) + 10));
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Value after B changing: " + resource.getValue());
            i++;

        }

    }


}

