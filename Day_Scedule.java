import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Day_Scedule extends JPanel
{
    private boolean CLIC = false;
    String activity;
    private int entries;
    private int day;
    private int time;

   
    public Day_Scedule()
    {
        String[] weekdays = {"Sunday", "Monday","Tuesday","Wednesday", "Thursday",
           "Friday", "Saturday"
           };
       
       Object[][] days = {
       {"6:00","  ","  ","  ","  ","  ","  "},    
       {"7:00","  ","  ","  ","  ","  ","  "},
       {"8:00","  ","  ","  ","  ","  ","  "},
       {"9:00","  ","  ","  ","  ","  ","  "},
       {"10:00","  ","  ","  ","  ","  ","  "},
       {"11:00","  ","  ","  ","  ","  ","  "},
       {"12:00","  ","  ","  ","  ","  ","  "},
       {"13:00","  ","  ","  ","  ","  ","  "},
       {"14:00","  ","  ","  ","  ","  ","  "},
       {"15:00","  ","  ","  ","  ","  ","  "},
       {"16:00","  ","  ","  ","  ","  ","  "},
       {"17:00","  ","  ","  ","  ","  ","  "},
       {"18:00","  ","  ","  ","  ","  ","  "},
       {"19:00","  ","  ","  ","  ","  ","  "},
       {"20:00","  ","  ","  ","  ","  ","  "},
       {"21:00","  ","  ","  ","  ","  ","  "},
       {"22:00","  ","  ","  ","  ","  ","  "},
       {"23:00","  ","  ","  ","  ","  ","  "},
       {"24:00","  ","  ","  ","  ","  ","  "},
        };
    
        final JTable table = new JTable(days, weekdays);
        table.setPreferredScrollableViewportSize(new Dimension(700, 700));
        table.setFillsViewportHeight(true);
        table.addMouseListener(new MouseListen(table));
        add(new JScrollPane(table));
        
    }
    
    private void click(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    
    private static void click() {
        
        JFrame frame = new JFrame("Day Schedule");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Day_schedule newContentPane = new Day_schedule();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                click();
            }
        });
    }

   
    public String getactivity()
    {
        return  activity;
    }
    public void setactivity(String activity)
    {
        this.activity = activity;
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
    public void createEvent(int time, int day, String activity)
    {
        
    }
    public void deleteEvent(int time, int day, String activity)
    {
        
    }
    public void snooze(int snooze_time)
    {
        
    }
}
