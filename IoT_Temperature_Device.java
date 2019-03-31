

public class IoT_Temperature_Device extends IoT_Device
{
 
    private int x;


    public IoT_Temperature_Device()
    {
        // initialise instance variables
        x = 0;
    }


    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
