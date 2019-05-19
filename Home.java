import java.io.*; 
import java.util.*;

public class Home
{
    public static int contin = 1;
    public static ArrayList<Door_Window> exdoors = new ArrayList<Door_Window>();
    public static ArrayList<Door_Window> indoors = new ArrayList<Door_Window>();
    public static ArrayList<Door_Window> windows = new ArrayList<Door_Window>();
    
    
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
  
    public static void main()
    {
       Door_Window d1 = new Door_Window (false, false, false);
       Door_Window d2 = new Door_Window (false, false, true);
       Door_Window w1 = new Door_Window (false, false);
       
       Security ASF = new Security();
       
       do {
       System.out.println("Dwste to senario (0,1,2,3,4)");
       Security epipedo = new Security(Security.active_senario = readInt());
       System.out.println("porta1 kleisti? " + d1.closed);
       System.out.println("porta1 kleidomeni? " + d1.locked);
       System.out.println("porta1 eksoteriki? " + d1.external);
       System.out.println("porta2 kleisti? " + d2.closed);
       System.out.println("porta2 kleidomeni? " + d2.locked);
       System.out.println("porta2 eksoteriki? " + d2.external);
       System.out.println("parathiro kleisto? " + w1.closed);
       System.out.println("parathiro kleidomeno? " + w1.locked);
       System.out.println("Thelete na ksanadosete senario? (0:oxi, 1:nai)");
       contin = readInt();
      } while (contin == 1);
    }

    
    public static int readInt() {
       byte b[] = new byte[16];
       String str;

       try {
          System.in.read(b); 
          str = (new String(b)).trim();
          return Integer.parseInt(str);
       } catch (IOException e) {
          System.out.println("Exception: " + e.toString());
          return 0;
       } catch (NumberFormatException e) {
          System.out.println("Exception: " + e.toString() + "\nReturned value: -1");
          return -1;
       }
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
