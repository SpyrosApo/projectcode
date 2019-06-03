import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;








public class Day_schedule extends JPanel
{
    private boolean CLIC = false;
    private int entries;
    private int day;
    private int date;
    String activity;
     
     
       public Day_schedule(){
           
       String[] weekdays = {"    ", "Sunday", "Monday","Tuesday","Wednesday", "Thursday",
           "Friday", "Saturday"
           };
       
       Object[][] days = {
       {"6:00","  ","  ","  ","  ","  ","  ", "  "},    
       {"7:00","  ","  ","  ","  ","  ","  ", "  "},
       {"8:00","  ","  ","  ","  ","  ","  ", "  "},
       {"9:00","  ","  ","  ","  ","  ","  ", "  "},
       {"10:00","  ","  ","  ","  ","  ","  ", "  "},
       {"11:00","  ","  ","  ","  ","  ","  ", "  "},
       {"12:00","  ","  ","  ","  ","  ","  ", "  "},
       {"13:00","  ","  ","  ","  ","  ","  ", "  "},
       {"14:00","  ","  ","  ","  ","  ","  ", "  "},
       {"15:00","  ","  ","  ","  ","  ","  ", "  "},
       {"16:00","  ","  ","  ","  ","  ","  ", "  "},
       {"17:00","  ","  ","  ","  ","  ","  ", "  "},
       {"18:00","  ","  ","  ","  ","  ","  ", "  "},
       {"19:00","  ","  ","  ","  ","  ","  ", "  "},
       {"20:00","  ","  ","  ","  ","  ","  ", "  "},
       {"21:00","  ","  ","  ","  ","  ","  ", "  "},
       {"22:00","  ","  ","  ","  ","  ","  ", "  "},
       {"23:00","  ","  ","  ","  ","  ","  ", "  "},
       {"24:00","  ","  ","  ","  ","  ","  ", "  "},
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
}