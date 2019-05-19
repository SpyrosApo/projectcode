public class Light extends Device
{
    int red;
    int green;
    int blue;
    int dimmer;
    
    public Light()
    {
        //initialise instance variables
        
    }
    
    public int getred()
    {
        return red;
    }
    
    public void setred(int red)
    {
        this.red=red;
    }
    
    public int getgreen()
    {
        return green;
    }
    
    public void setgreen(int green)
    {
        this.green=green;
    }
    
    public int getblue()
    {
        return blue;
    }
    
    public void setblue(int blue)
    {
        this.blue=blue;
    }
    
    public int getdimmer()
    {
        return dimmer;
    }
    
    public void setdimmer(int dimmer)
    {
        this.dimmer=dimmer;
    }
}