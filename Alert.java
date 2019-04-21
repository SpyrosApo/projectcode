

public class Alert extends Notification
{
   
    private boolean alarm = false;

   
    public Alert()
    {
        // initialise instance variables
        
    }

  
    public boolean getalarmstate()
    {
        return  alarm;
    }
    public void setalarmON()
    {
        alarm = true;
    }
    public void setalarmOFF()
    {
        alarm = false;
    }
}
