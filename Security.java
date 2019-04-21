import java.io.*; 
import java.util.*;

public class Security
{
    private List<Visitor> Visitors;
    boolean alert = false;
    int visitorsnum;
    int active_senario = 0;
    boolean bypassvisitor_password = false;

   
    public Security()
    {
        // initialise instance variables
        
    }

    public boolean getalert()
    {
        return  alert;
    }
    public void setalert(boolean alert)
    {
        this.alert = alert;
    }
    public int getvisitorsnum()
    {
        return  visitorsnum;
    }
    public void setvisitorsnum(int visitorsnum)
    {
        this.visitorsnum = visitorsnum;
    }
    public int getactive_senario()
    {
        return  active_senario;
    }
    public void setactive_senario(int active_senario)
    {
        this.active_senario = active_senario;
    }
    public boolean getbypassvisitor_password()
    {
        return  bypassvisitor_password;
    }
    public void setbypassvisitor_passwordON()
    {
        bypassvisitor_password = true;
    }
    public void setbypassvisitor_passwordOFF()
    {
        bypassvisitor_password = false;
    }
}
