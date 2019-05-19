

public class Camera extends Device
{
    
    boolean live_feed = false;
    
    public Camera()
    {
        // initialise instance variables
        
    }

 
    public boolean getlive_feed()
    {
        return  live_feed;
    }
    public void setlive_feedON()
    {
        live_feed = true;
    }
    public void setlive_feedOFF()
    {
        live_feed = false;
    }
}
