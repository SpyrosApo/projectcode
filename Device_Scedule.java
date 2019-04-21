

public class Device_Scedule
{
    int entries;
    int day;
    int time;
    String device_name;
    boolean bypassDevice_Scedule = false;
   
    public Device_Scedule()
    {
       
    }

    
  
    public int getentries()
    {
        return  entries;
    }
    public void setentries(int entries)
    {
        this.entries = entries;
    } 
    public int getday()
    {
        return  day;
    }
    public void setday(int day)
    {
        this.day = day;
    }
    public int gettime()
    {
        return  time;
    }
    public void settime(int time)
    {
        this.time = time;
    }
    public String getdevice_name()
    {
        return  device_name;
    }
    public void setdevice_name(String device_name)
    {
        this.device_name = device_name;
    } 
    public void createEvent(int time, int day, String device_name)
    {
        
    }
    public void deleteEvent(int time, int day, String device_name)
    {
        
    }
    public boolean getbypassDevice_Scedule()
    {
        return  bypassDevice_Scedule;
    }
    public void setbypassDevice_SceduleON()
    {
        bypassDevice_Scedule = true;
    }
    public void setbypassDevice_SceduleOFF()
    {
        bypassDevice_Scedule = false;
    }
}
