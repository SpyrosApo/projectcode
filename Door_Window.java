
public class Door_Window extends Device
{
 
    boolean locked;

    
        public Door_Window()
    {
        // initialise instance variables
        
    }

   public boolean getlocked()
    {
        return  locked;
    }
    public void setlocked()
    {
        locked = true;
    }
    public void setunlocked()
    {
        locked = false;
    }
}
