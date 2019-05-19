import java.io.*; 
import java.util.*;

public class Security
{
    private List<Visitor> Visitors;
    boolean alert = false;
    int visitorsnum;
    public static int active_senario;
    boolean bypassvisitor_password = false;

   
    public Security()
    {
        int active_senario = 0;
        
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
    
    
    
    
    public Security(int active_senario)
    {
        this.active_senario = active_senario;
        
        if (this.active_senario == 0) {
            System.out.println("Leptomeries Senariou 0");
            unlockexdoors();
            unlockindoors();
            unlockwindows();
            openexdoors();
            openindoors();
            openwindows();
            
        }
        
        if (this.active_senario == 1) {
            System.out.println("Leptomeries Senariou 1");
            unlockindoors();
            unlockwindows();
            openindoors();
            openwindows();
            closeexdoors();
            lockexdoors();
            
        }
        
        if (this.active_senario == 2) {
            System.out.println("Leptomeries Senariou 2");
            unlockindoors();
            openindoors();
            closeexdoors();
            closewindows();
            lockexdoors();           
            lockwindows();
        }
        
        if (this.active_senario == 3) {
            System.out.println("Leptomeries Senariou 3");
            unlockindoors();
            openindoors();
            closeexdoors();
            closewindows();
            lockexdoors();           
            lockwindows();
        }
        
        if (this.active_senario == 4) {
            System.out.println("Leptomeries Senariou 4");
            closeexdoors();
            closeindoors();
            closewindows();
            lockexdoors();
            lockindoors();
            lockwindows();
        }
        
    }
    
    public void closeexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.setclosed();
        }
    }
    
    public void closeindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.setclosed();
        }
    }
    
    public void closewindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.setclosed();
        }
    }
    
    public void lockexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.setlocked();
        }
    }
    
    public void lockindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.setlocked();
        }
    }
    
    public void lockwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.setlocked();
        }
    }
                        
    public void openexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.setopen();
        }
    }
    
    public void openindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.setopen();
        }
    }
    
    public void openwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.setopen();
        }
    }
    
    public void unlockexdoors()
    {
        for (Door_Window obj : Home.exdoors) {
            obj.setunlocked();
        }
    }
    
    public void unlockindoors()
    {
        for (Door_Window obj : Home.indoors) {
            obj.setunlocked();
        }
    }
    
    public void unlockwindows()
    {
        for (Door_Window obj : Home.windows) {
            obj.setunlocked();
        }
    }
}
