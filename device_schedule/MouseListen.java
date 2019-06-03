import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class MouseListen extends MouseAdapter{
  private JTable table;
     
     public MouseListen(JTable table){
      this.table=table;
        }
    public void mouseClicked(MouseEvent event){
    Point point=event.getPoint();
    int row = table.rowAtPoint(point);
    int col = table.columnAtPoint(point);
    String devis = null;
    Object[] options = {"Edit", "Delete"};
    JPanel panel = new JPanel();
    int activity = JOptionPane.showOptionDialog(null, panel, 
    "Manage your devices:", JOptionPane.YES_NO_OPTION, 
    JOptionPane.PLAIN_MESSAGE, null, options, null);
    if (activity ==JOptionPane.YES_OPTION){
     JPanel panel_2 = new JPanel();
     panel_2.add(new JLabel("Select Devices"));
      Vector<String> devices = new Vector<String>();
      devices.addElement("Oven");
      devices.addElement("Espresso Machine");
      devices.addElement("Stereo");
      devices.addElement("Clock");
      devices.addElement("TV");
      devices.addElement("Air-condition 1");
      devices.addElement("Air- condition 2");
      //δημιουργία λίστας συσκευών
     Object[] options_2={"Ok", "Cancel"};
        
      JComboBox<String> dev = new JComboBox<String>(devices);
      panel_2.add(dev);
      int activity_2 = JOptionPane.showOptionDialog(null, panel_2,
      "Select Devices", JOptionPane.YES_NO_OPTION,
      JOptionPane.PLAIN_MESSAGE, null, options_2, null);
      
      devis = (String)dev.getSelectedItem();
      table.setValueAt(devis, row, col);
      
       //προσθήκη επιλεγμένης συσκευής στον πίνακα     
    
    }
    else if(activity== JOptionPane.NO_OPTION){
     if (table.getValueAt(row,col)==null){
     System.out.println("There is nothing here to delete");
    //αν επιλεγεί διαγραφή και το κελί είναι κενό εμφάνισε μήνυμα σφάλματος
    //δεν δουλεύει πάντα, μερικές φορές δεν εμφανίζεται το μήνυμα και
    //όταν ξανατρέχει η κλάση εμφανίζεται
     }else{
      JPanel panel_3= new JPanel();
      panel_3.add(new JLabel("Attention"));
      Object[] options_3 ={"Yes", "No"};
      panel_3.add(new JLabel("Are you sure you want to delete this?"));
      int activity_3= JOptionPane.showOptionDialog(null, panel_3,
      "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
      null, options_3, null);
      if(activity_3==JOptionPane.YES_OPTION){
      
     table.setValueAt(null, row, col);
     //αν δεν είναι κενό διέγραψε την συσκευή
     }
      } 
    }




  }
}