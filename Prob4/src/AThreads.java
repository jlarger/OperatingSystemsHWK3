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




        while(i < 10) {


            try {
                Thread.sleep(((long) ((Math.random() * 200 - 10)) + 10));
            } catch (Exception e) {
                System.out.println(e);
            }


            resource.set_GetValue(1);
            //System.out.println("Value after A change value: " + fetchedValue);
            i++;
        }




        //System.out.println("Current value before A Thread changes value: " + fetchedValue);

        //System.out.println("Value after A Thread changed the value: " + fetchedValue);



        /*changedValue = fetchedValue + 1;
        System.out.println(changedValue);
        */
    }

}

