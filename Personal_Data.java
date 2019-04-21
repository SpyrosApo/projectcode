import java.io.*; 
import java.util.*;

public class Personal_Data
{
String name;
String surname;
float height;
float weight;
String password;
String username;
boolean alert = false;
int heartrate;
int stepcount;
int bodytemperature;
  
    public Personal_Data()
    {
        // initialise instance variables
        
    }
    public String getname()
    {
        return  name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getsurname()
    {
        return  surname;
    }
    public void setsurname(String surname)
    {
        this.surname = surname;
    }
     public float getheight()
    {
        return  height;
    }
    public void setheight(float height)
    {
        this.height = height;
    }
     public float getweight()
    {
        return  weight;
    }
    public void setweight(float weight)
    {
        this.weight = weight;
    }
    public String getpassword()
    {
        return  password;
    }
    public void setpassword(String password)
    {
        this.password = password;
    }
    public String getusername()
    {
        return  username;
    }
    public void setusername(String username)
    {
        this.username = username;
    }
    public boolean getalert()
    {
        return  alert;
    }
    public void setalertON()
    {
        alert = true;
    }
    public void setalertOFF()
    {
        alert = false;
    }
    public int getheartrate()
    {
        return  heartrate;
    }
    public void setheartrate(int heartrate)
    {
        this.heartrate = heartrate;
    }
     public int getstepcount()
    {
        return  stepcount;
    }
    public void setstepcount(int stepcount)
    {
        this.stepcount = stepcount;
    }
     public int getbodytemperature()
    {
        return  bodytemperature;
    }
    public void setbodytemperature(int bodytemperature)
    {
        this.bodytemperature = bodytemperature;
    }
   
}
