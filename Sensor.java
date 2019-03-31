

public class Sensor extends Device
{
 
    private int x;

   
    public Sensor()
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
