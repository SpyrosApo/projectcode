import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Health_status extends JPanel{
    
    static JFrame frame;
    static String agee = null;
    static String hei  = null;
    static String wei  = null;
    static int hr_low  = 60;
    static int hr_high = 100;
    static int heart_r = 0;
    static int step_low = 10;
    static int step_hig = 20000;
    static int step_c  = 0;
    static String targ = null;
    static int calories= 0;
    static int distance= 0;
    static double hours     = 0.0;
    static double hour_hig  = 15.0;
    static double hour_low  = 1.0;
    static double deep_s    = 0.0;
    static double light_s   = 0.0;
    static double awake     = 0.0;
    static double awake_hig = 15.0;
    static double awake_low = 0.0;
    static double temp      = 0.0;
    static double temp_hig  = 37.20;
    static double temp_low  = 36.90;
     public static void click(){
         
             Object[] options ={"Profile", "Heart Rate", "Step count", 
             "Sleep Schedule", "Temperature"};
             
             JPanel panel = new JPanel();
             int activity = JOptionPane.showOptionDialog(null, panel,
             "Health Status", JOptionPane.DEFAULT_OPTION, 
             JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
             if(activity==0){
                JPanel panel_2 = new JPanel();
                panel_2.add(new JLabel("Insert your age"));
                JTextField age = new JTextField(2);
                panel_2.add(age);
               
                Object[] options_2={"Ok","Cancel"};
                int activity_2= JOptionPane.showOptionDialog(null, panel_2,
                "Insert your age in years", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options_2, null);
                //εισαγωγή ηληκίας
                //αν επιλεγεί οκ τότε
                if(activity_2==JOptionPane.YES_OPTION){
                JPanel panel_3 = new JPanel();
                panel_3.add(new JLabel("Insert your height"));
                JTextField height = new JTextField(3);
                panel_3.add(height);
                
                Object[] options_3 = {"Ok","Cancel"};
                
                int activity_3 = JOptionPane.showOptionDialog(null, panel_3,
                "Insert your height in cm", JOptionPane.YES_NO_OPTION, 
                JOptionPane.PLAIN_MESSAGE, null, options_3, null);
                //εισαγωγή ύψους
                //αν επιλέγει οκ τότε
                if(activity_3==JOptionPane.YES_OPTION){
                JPanel panel_4 = new JPanel();
                JTextField weight = new JTextField(3);
                panel_4.add(weight);
                
                Object[] options_4={"Save","Cancel"};
                int activity_4 = JOptionPane.showOptionDialog(null, panel_4,
                "Insert your weight in kg", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options_4, null);
                //εισάγει βάρος
                //αν επιλέξει save τότε
                if(activity_4==JOptionPane.YES_OPTION){
                agee = age.getText();
                hei = height.getText();
                wei = weight.getText();    
                System.out.println("Changes have been saved succesfully");    
                System.out.println("Your age is: "+ agee);
                System.out.println("Your height is: " + hei);
                System.out.println("Your weight is: " + wei);
                //εκτύπωσε τιμές και επιβεβαίωση αποθήκευσης
                
                }
                }
                }
               
             
             }
             else if(activity==1){
                 //heart rate
                JPanel panel_5 = new JPanel();
                panel_5.add(new JLabel("Your current Heart Rate is:"));
                int heart_r = (int)(Math.random()*(hr_high - hr_low)) + hr_low;
                panel_5.add(new JLabel(String.valueOf(heart_r)));
                panel_5.add(new JLabel("bps"));
                panel_5.add(new JLabel("History"));
                JTextArea history = new JTextArea();
                history.setText(
                "\n06/06/2019: 79bps"+
                "\n05/06/2019: 80bps"+
                "\n04/06/2019: 95bps"+
                "\n03/06/2019: 70bps"+
                "\n02/06/2019: 100bps");
                history.setEditable(false);
                panel_5.add(history);
                Object[] options_5 ={"Ok","Cancel"};
                int activity_5 = JOptionPane.showOptionDialog(null, panel_5,
                "Heart rate", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options_5, null);
                
                 
            }
             
             else if(activity==2){
                 //step count
             JPanel panel_6 = new JPanel();
             panel_6.add(new JLabel("Step Count:"));
             int step_c =(int)(Math.random()*(step_hig- step_low))+ step_low;
             panel_6.add(new JLabel(String.valueOf(step_c)));
             panel_6.add(new JLabel("steps so far"));
             panel_6.add(new JLabel("Calories Burnt:"));
             
             //1 θερμίδα ανά 20 βήματα
             calories = step_c/20;
             panel_6.add(new JLabel(String.valueOf(calories)));
             panel_6.add(new JLabel("so far"));
             panel_6.add(new JLabel("Distance:"));
             //0,76 μέτρα ανά βήμα, στρογγυλοποίηση σε 1 μέτρο ανά βήμα
             distance = step_c;
             panel_6.add(new JLabel(String.valueOf(step_c)));
             panel_6.add(new JLabel("meters"));
             panel_6.add(new JLabel("History"));
                JTextArea history = new JTextArea();
                history.setText(
                "\n06/06/2019: 7003 steps"+
                "\n05/06/2019: 3290 steps"+
                "\n04/06/2019: 2343 steps"+
                "\n03/06/2019: 4000 steps "+
                "\n02/06/2019: 656  steps");
                history.setEditable(false);
                panel_6.add(history);
             Object[] options_6 ={"Target", "Cancel"};
             int activity_6= JOptionPane.showOptionDialog(null, panel_6,
             "Step Count", JOptionPane.YES_NO_OPTION,
             JOptionPane.PLAIN_MESSAGE, null, options_6, null);
             if(activity_6==JOptionPane.YES_OPTION){
                JPanel panel_7 = new JPanel();
                panel_7.add(new JLabel("Insert your target:"));
                JTextField target = new JTextField(5);
                panel_7.add(target);
                Object[] options_7={"Save","Cancel"};
                int activity_7 = JOptionPane.showOptionDialog(null, panel_7,
                "Target steps", JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options_7, null);
                if(activity_7==JOptionPane.YES_OPTION){
                targ = target.getText();    
                System.out.println("Changes have been saved succesfully");
                System.out.println("Your target steps are:"+ targ);
                }
                }
             
            }
             else if(activity==3){
                 //sleep track
             JPanel panel_8 = new JPanel();
             panel_8.add(new JLabel("Deep Sleep"));
             double hours =(double)(Math.random()*(hour_hig- hour_low))+ hour_low;
             if(hours>=2.0){
                deep_s  = hours/5.0;
                deep_s  = Math.round(deep_s*100)/100.0d;
                //ο βαθύς ύπνος αποτελεί περίπου το 20% του ύπνου
                light_s = hours/2.0; 
                light_s = Math.round(light_s*100)/100.0d;
                //ο ελαφρύς ύπνος αποτελεί περίπου το 50% του ύπνου
                }
             panel_8.add(new JLabel(String.valueOf(deep_s)));
             panel_8.add(new JLabel("hours"));
             panel_8.add(new JLabel("Light Sleep"));
             panel_8.add(new JLabel(String.valueOf(light_s)));
             panel_8.add(new JLabel("hours"));
             double awake = (double)(Math.random()*(awake_hig-awake_low))+awake_low;
             awake = Math.round(awake*100)/100.0d;
             panel_8.add(new JLabel("You have been awake for:"));
             panel_8.add(new JLabel(String.valueOf(awake)));
             panel_8.add(new JLabel("hours"));
             panel_8.add(new JLabel("History"));
                JTextArea history = new JTextArea();
                history.setText(
                "\n06/06/2019: 6,5 hours of sleep"+
                "\n05/06/2019: 8,4 hours of sleep"+
                "\n04/06/2019: 8,1 hours of sleep "+
                "\n03/06/2019: 2,3 hours of sleep"+
                "\n02/06/2019: 13 hours of sleep");
                history.setEditable(false);
                panel_8.add(history);
             Object[] options_8 = {"Ok", "Cancel"};
             int activity_8 = JOptionPane.showOptionDialog(null, panel_8,
             "Sleep Track", JOptionPane.YES_NO_OPTION,
             JOptionPane.PLAIN_MESSAGE, null, options_8, null);
             
            
            }
             else if(activity==4){
                 //temperature
             JPanel panel_9 = new JPanel();
             panel_9.add(new JLabel("Your current temperature is:"));
             double temp = (double)(Math.random()*(temp_hig-temp_low))+temp_low;
             temp = Math.round(temp*100)/100.0d;
             panel_9.add(new JLabel(String.valueOf(temp)));
             panel_9.add(new JLabel("History"));
             JTextArea history = new JTextArea();
             history.setText(
                "\n06/06/2019: 37,0"+
                "\n05/06/2019: 36,7"+
                "\n04/06/2019: 36,8"+
                "\n03/06/2019: 37,8"+
                "\n02/06/2019: 38,1");
                history.setEditable(false);
             panel_9.add(history);
             Object[] options_9 = {"Ok","Cancel"};
             int activity_9 = JOptionPane.showOptionDialog(null, panel_9,
             "Temperature", JOptionPane.YES_NO_OPTION, 
             JOptionPane.PLAIN_MESSAGE, null, options_9, null);
             
             
            }
         
       
        }
    
        public static void main(String[] args){
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            click();
        }
        
        
        });
    
       }
}