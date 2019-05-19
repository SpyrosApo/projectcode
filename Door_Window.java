
public class Door_Window extends Device
{
 
    boolean closed;
    boolean locked;
    boolean external;

    
        public Door_Window(boolean closed, boolean locked, boolean external)
    {
        this.closed = closed;
        this.locked = locked;
        this.external = external;
        
        if (this.external == true){
            Home.exdoors.add(this);
        }
        else {
            Home.indoors.add(this);
        }
    }
    
    public Door_Window(boolean closed, boolean locked)
    {
        this.closed = closed;
        this.locked = locked;
         
        Home.windows.add(this);
    }

   public void setlocked()
    {
        locked = true;
    }
    
    public void setunlocked()
    {
        locked = false;
    }
    
    public void setclosed()
    {
        closed = true;
    }
    
    public void setopen()
    {
        closed = false;
    }
}

