import java.io.*;
import java.util.*;


public class Notification
{
   
    
    String fromwhere;
    String room;
    int type;
    float measurements;
    String Text;
   
    public Notification(String fromwhere, String room,int type)
    {
    this.fromwhere = fromwhere;
    this.room = room;
    this.type = type;
    if (type == 1) {
        System.out.println("HAPPY BIRTHDATY!!!"); 
        } else if (type == 2) {
           System.out.println("A visitor entered the house"); 
            } else if (type == 3){
                System.out.println( fromwhere + " is open" );
                } else if (type == 4){
                    System.out.println("The device " + fromwhere + " in room " + room + " is out of order");
                               }
    }
    
    public Notification(String fromwhere ,float measurements)
    {
    this.fromwhere = fromwhere;
    this.measurements = measurements;
    if (fromwhere == "stepcount") {
        System.out.println("You have takken "+ measurements + " steps today." );
        System.out.println("if you want to see stepcount history write Istoriko bimaton" );
        String s = readString();
        if (s == "Istoriko bimaton"){System.out.println("Edw tha typonete to Istoriko bimaton" );}
        } else if (fromwhere == "sleeptrack") {
        System.out.println("The sleeptrack measurements is "+ measurements);
        System.out.println("if you want to see sleeptrack history write Istoriko upnou" );
        String s = readString();
        if (s == "Istoriko upnou"){System.out.println("Edw tha typonete to Istoriko upnou" );}
    }
    }
    public Notification(String Text)
    {
        this.Text = Text;
        java.util.Date date = new java.util.Date();
        System.out.println(Text + date);
        System.out.println("If you want to see the notification again in 10 minutes write snooze else write ingnore" );
        String s = readString();
         if (s == "snooze"){
             try {
                  Thread.sleep(600000);                 //1000 milliseconds is one second.
                  } catch(InterruptedException ex) {
                   Thread.currentThread().interrupt();
                  }
             Notification myNotification = new Notification(Text);
            }
    }
    
    public static String readString() {
 byte b[] = new byte[32];
 String str;

 try {
 System.in.read(b);
 str = (new String(b)).trim();
 return str;
 } catch (IOException e) {
 System.out.println("Exception: " + e.toString());
 return "";
 }
 }

    public String getfromwhere()
    {
        return  fromwhere;
    }
    public void setfromwhere(String fromwhere)
    {
        this.fromwhere = fromwhere;
    }
    public String getroom()
    {
        return  room;
    }
    public void setroom(String room)
    {
        this.room = room;
    }

}
