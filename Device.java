
public class Device
{

    String device_name;
    String status;
    String type;
    int id;
    boolean activated;
    public Device()
    {
        // initialise instance variables
       
    }

   
    public String getdevice_name()
    {
        return  device_name;
    }
    public void setdevice_name(String device_name)
    {
        this.device_name = device_name;
    }
    public String getstatus()
    {
        return  status;
    }
    public void setstatus(String status)
    {
        this.status = status;
    }
    public boolean getactivated()
    {
        return  activated;
    }
    public void setactivated()
    {
        activated = true;
    }
    public void setdeactivated()
    {
        this.activated = false;
    }
    public String gettype()
    {
        return  type;
    }
    public void settype(String type)
    {
        this.type = type;
    }
    public int getid()
    {
        return  id;
    }
    public void setid(int id)
    {
        this.id = id;
    }
}
