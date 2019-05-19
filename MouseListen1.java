
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListen1 extends MouseAdapter{
  private JTable table;
     
     public MouseListen1(JTable table){
        Point point= event.getPoint();
        int row= table.rowAtPoint(point);
        int col= table.columnAtPoint(point);
        Object[] possibilities= {"Oven","Air_conditionLiv","Air_conditionKit",
        "Air_conditionBed", "Air_conditionGeu", "Stereo", "Alarm",
        "Espresso_machine"};
        Object[] options = {"Edit", "Delete"};
        JOptionPane.showOptionDialog( table, "Select Devices",
        "Costumized Dialog", JOptionPane.PLAIN_MESSAGE, possibilities, 
        possibilities[0],options, options[0]);
        
       
        
        
        }





}
