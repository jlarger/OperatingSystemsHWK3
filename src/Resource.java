/**
 * Created by jameslarger on 9/29/17.
 */
public class Resource
{
    private volatile int value;

    public int getValue()
    {
        return value;
    }

    // Value should only be changed by 1
    public void setValue(int v)
    {
        if(Math.abs(value - v) != 1)
        {

            System.out.println("Mismatch: " + value +" " + v);
        }
        value = v;
    }
}

