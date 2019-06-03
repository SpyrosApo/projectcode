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
     String act= null;
     Object[] options ={"Edit", "Delete"};
     JPanel panel = new JPanel();
     JTextField userin = new JTextField(100);
     int num;
     
     int activity = JOptionPane.showOptionDialog(null, panel, 
     "Manage your activities:",JOptionPane.YES_NO_OPTION,
     JOptionPane.PLAIN_MESSAGE,null,
     options, null);
     //εμφάνιση παραθύρου με επιλογές Edit, Delete
      if (activity == JOptionPane.YES_OPTION){
          //επιλογή Edit 
        JPanel panel_2 = new JPanel();
        panel_2.add(new JLabel("Insert Activity"));
        
        panel_2.add(userin); 
        
        
        
        
        Object[] options_2 = {"Yes" , "Cancel"};
        
        panel_2.add(new JLabel("Do you want to make this activity a reminder?"));
        int activity_2 = JOptionPane.showOptionDialog(null, panel_2,
        "Set As Reminder", JOptionPane.YES_NO_OPTION, 
        JOptionPane.PLAIN_MESSAGE, null, options_2, null);
        //εμφανίσε νέο παράθυρο για εισαγωγή δράσης
        //με μήνυμα για δημιουργία reminder και επιλογές yes, cancel
       
        act= userin.getText();    
        table.setValueAt(act, row, col);
        //αποθήκευση δράσης στον πίνακα
         if( activity_2 == JOptionPane.NO_OPTION){
        //επιλογή no 
        }else if(activity == JOptionPane.YES_OPTION){
        //επιλογή yes
        JPanel panel_3 = new JPanel();
        JTextField day = new JTextField(2);
        JTextField time = new JTextField(5); 
       
        panel_3.add(new JLabel("Date:"));
        panel_3.add(day);
        panel_3.add(Box.createHorizontalStrut(20));
        panel_3.add(new JLabel("Time:"));
        panel_3.add(time);
        
        int activity_3 = JOptionPane.showConfirmDialog(null, panel_3,
        "Insert Date and Time", JOptionPane.OK_CANCEL_OPTION);
        if( activity_3 == JOptionPane.OK_OPTION){
        System.out.println("Date:"+ day.getText()+"/06/2019");
        System.out.println("Time:"+ time.getText());
        num = Integer.parseInt(day.getText());
        if (num < 7){
        System.out.println("This is a calendar not a time machine");
        }else{
        System.out.println("Your activity: " + userin.getText() + " has been"
        + " scheduled for: " + day.getText()+"/06/2019 "+ " at " + time.getText());
        }
     
        
    }
        
        
        }
      } 
      else if (activity == JOptionPane.NO_OPTION){
          //επιλογή Delete
         act= userin.getText(); 
        if (userin.getText().trim().equals("")){
           //αν δεν έχει εισάγει δράση ο χρήστης εμφάνισε μήνυμα σφάλματος 
        System.out.println("There is nothing here to delete");
        
        //μήνυμα σφάλματος όταν επιλέγεται διαγραφή κενού κελιού
        }
          //αν έχει εισάγει κάτι ο χρήστης τότε θέσε το act null
          //δηλαδή διαγραφή δράσης
        table.setValueAt(null, row, col);
         
        
     
     
    
    
    }

}
}




