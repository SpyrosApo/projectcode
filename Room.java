import java.io.*; 
import java.util.*; 

public class Room
{
    int devicesnum = 0;
    int sensorsnum = 0;
    int camerasnum = 0;
    int doors_windowsnum = 0;
    String room_name;
    private List<Device> Devices;
 
    public Room()
    {
       
    }


    public int getdevicesnum()
    {
        return  devicesnum;
    }
    public void setdevicesnum(int devicesnum)
    {
        this.devicesnum = devicesnum;
    } 
    public int getsensorsnum()
    {
        return  sensorsnum;
    }
     public void setsensorsnum(int sensorsnum)
    {
        this.sensorsnum = sensorsnum;
    }
    public int getcamerasnum()
    {
        return  camerasnum;
    }
    public void setcamerasnum(int camerasnum)
    {
        this.camerasnum = camerasnum;
    }
    public int getdoors_windowsnum()
    {
        return  doors_windowsnum;
    }
    public void setdoors_windowsnum(int doors_windowsnum)
    {
        this.doors_windowsnum = doors_windowsnum;
    }
    public String getroom_name()
    {
        return  room_name;
    }
    public void setroom_name(String room_name)
    {
        this.room_name = room_name;
    }
}

