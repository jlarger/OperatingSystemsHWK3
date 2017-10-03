/**
 * Created by jameslarger on 10/3/17.
 */
public class Resource
{
    private volatile int value;


    public synchronized int getValue()
    {
        return value;
    }

    // Value should only be changed by 1
    public synchronized void setValue(int v)
    {
        if(Math.abs(value - v) != 1)
        {

            System.out.println("Mismatch: " + value +" " + v);
        }
        value = v;
    }

}
