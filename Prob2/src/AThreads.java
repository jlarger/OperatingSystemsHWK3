/**
 * Created by jameslarger on 10/3/17.
 */
public class AThreads implements Runnable
{
    Resource resource = new Resource();


    public AThreads(Resource i)
    {
        super();
        resource = i;

    }

    @Override
    public void run() {

        int i = 0;

        int fetchedValue = resource.getValue();


        while(i < 1000)
        {
            System.out.println("Value before A change value: " + fetchedValue);

            resource.setValue(fetchedValue + 1);
            System.out.println("Value after A change value: " + fetchedValue);
            i++;
        }




        //System.out.println("Current value before A Thread changes value: " + fetchedValue);

        //System.out.println("Value after A Thread changed the value: " + fetchedValue);



        /*changedValue = fetchedValue + 1;
        System.out.println(changedValue);
        */
    }

}
