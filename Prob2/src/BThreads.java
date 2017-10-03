/**
 * Created by jameslarger on 10/3/17.
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

        while(i < 1000) {


            System.out.println("Value before B changing: " + fetchedValue);
            resource.setValue(fetchedValue - 1);

            System.out.println("Value after B changing: " + resource.getValue());
            i++;

        }

    }

}
