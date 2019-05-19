import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseListen extends MouseAdapter{
 private JTable table;
 
    public MouseListen(JTable table){
     this.table=table;  
    }
    
    public void mouseClicked(MouseEvent event){
     Point point= event.getPoint();
     int row= table.rowAtPoint(point);
     int col= table.columnAtPoint(point);
     Object[] options ={"Edit", "Delete"};
     int n =JOptionPane.showOptionDialog(table, "Today's Activities:",
     options,
     options[1]
     );
     
    
    
    }





}
