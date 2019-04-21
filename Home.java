import java.io.*; 
import java.util.*;

public class Home
{
    int devicesnum = 0;
    int sensorsnum = 0;
    int camerasnum = 0;
    int doors_windowsnum = 0;
    int roomsnum = 0;
    private List<Device> Devices2;
    private List<Room> Rooms;
    Personal_Data Personal_Data1=new Personal_Data();
    Device_Scedule Device_Scedule1=new Device_Scedule();
    Day_Scedule Day_Scedule1=new Day_Scedule();
    Security Security1=new Security();
    private List<Notification> Notifications;
  
    public Home()
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
    public int getroomsnum()
    {
        return  roomsnum;
    }
    public void setroomsnum(int roomsnum)
    {
        this.roomsnum = roomsnum;
    }
}
