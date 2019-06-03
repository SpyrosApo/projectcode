import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Mood_scenarios extends JPanel
{
    static JFrame frame; 
    static JLabel title;
    static int lights = 1;
    static Boolean lightidle = false;
    static int stereo = 1;
    static Boolean stereoidle = false;
    static int air_condition =1;
    static Boolean air_conditionidle = false;
    static int oven = 1;
    static Boolean ovenidle= false;
    static String restaurant ="2610000000";
    static boolean callres = false;
    static String new_moo = null;
    static String new_dev = null;
    static boolean new_devidle = false;
    static String new_lig = null;
    static boolean new_ligidle = false;
    static String new_phon = null;
    static boolean et_phon = false;
    //το σύστημα κανονικά θα ήταν σε θέση να ελέγχει αν οι συσκευές
    //είναι χαλασμένες και να ρυθμίζει την λειτουργία τους. 
    //Αυτο δεν γίνεται σε αυτή τη φάση οπότε γίνεται
    //η παραδοχή πως οι συσκευές δεν είναι χαλασμένες και η ενεργοποίηση
    //τους παρουσιάζεται με εκτύπωση μηνυμάτων
        public static void click(){
           
           
           
           Object[] options = {"Dinner Party","Create a new one"};
           //στο use case έχουν αναφερθεί δύο ακόμα σενάρια αλλά επειδή 
           //αναλύθηκε μόνο το ένα από αυτά υλοποιήθηκαν μόνο
           //το σενάριο αυτό και η επιλογή δημιουργίας νέου.
           JPanel panel = new JPanel();
           int activity = JOptionPane.showOptionDialog(null, panel,
           "Select one:", JOptionPane.YES_NO_OPTION, 
           JOptionPane.PLAIN_MESSAGE, null, options, null);
           if(activity == JOptionPane.YES_OPTION){
               //επιλογή Dinner Party
            JPanel panel_2 = new JPanel();
            
            panel_2.add(new JLabel("Live the ultimate enjoyment experience"));
            panel_2.add(new JLabel("with your guests. The light settings creates"));
            panel_2.add(new JLabel("a warm atmosphere while the music guides your"));
            panel_2.add(new JLabel("senses. The room temperature drops to level the"));
            panel_2.add(new JLabel("warm atmosphere."));
            Object[] options_2 = {"Turn on", "Turn off"};
            int activity_2 = JOptionPane.showOptionDialog(null, panel_2,
            "Dinner Party", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options_2, null);
            //εμφάνιση λεπτομερειών και επιλογών turn on, turn off
               if(activity_2==JOptionPane.YES_OPTION){
                //επιλογή ενεργοποίησης
                 if(lights==1){
                     //έλεγχος κατάστασης φωτών
                    lightidle=true;
                    //ρύθμιση φωτών
                    System.out.println("The lights are dimmed");
                    
                    }
                 if(stereo==1){
                     //έλεγχος κατάστασης στέρεο
                    stereoidle=true;
                    //ενεργοποίηση στέρεο
                    System.out.println("Stereo is turned on");
                    
                    }
                 if(air_condition==1){
                     //έλεγχος κατάστασης air condition
                    air_conditionidle= true;
                    //ρύθμιση air condition
                    System.out.println("Temperature is lowered");
                    
                    }
                 JPanel panel_3 = new JPanel();
                 panel_3.add(new JLabel("Do you want to preheat the oven?"));
                 Object[] options_3 = {"Yes", "No"};
                 //δημιουργία νέου παραθύρου για την εμφάνιση διαλόγου που
                 //αφορά την προθέρμανση φούνρου
                 int activity_3 = JOptionPane.showOptionDialog(null, panel_3,
                 null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                 null, options_3, null);
                   if(activity_3==JOptionPane.YES_OPTION){
                       //επιλογή ναι
                    if(oven==1){
                        //έλεγχος φούρνου
                    ovenidle=true;
                    //ρύθμιση φούρνου
                    System.out.println("Oven is turned on");
                    }
                    }
                   else if(activity_3==JOptionPane.NO_OPTION){
                       //επιλογή οχι
                    JPanel panel_4 = new JPanel();
                    panel_4.add(new JLabel("Do you want to order in?"));
                    Object[] options_4={"Yes", "No"};
                    //δημιουργία νέου παραθύρου για την εμφάνιση διαλόγου 
                    //παραγγελίας
                    int activity_4 = JOptionPane.showOptionDialog(null,
                    panel_4, null, JOptionPane.YES_NO_OPTION, 
                    JOptionPane.PLAIN_MESSAGE, null, options_4, null);
                     if(activity_4==JOptionPane.YES_OPTION){
                        //αν επιλέξει ναι κάλεσε εστιατόριο
                        callres=true;
                        System.out.println("Dialing..."+restaurant);
                        }
                    }
                }
            }
            if(activity==JOptionPane.NO_OPTION){
                //επιλογή δημιουργίας νέου σεναρίου
            JPanel panel_5 = new JPanel();
            panel_5.add(new JLabel("Select Device:"));
            Vector<String> devices = new Vector<String>();
            devices.addElement("Oven");
            devices.addElement("Espresso Machine");
            devices.addElement("Stereo");
            devices.addElement("Clock");
            devices.addElement("TV");
            devices.addElement("Air-condition");
      
            JComboBox<String> dev = new JComboBox<String>(devices);
            panel_5.add(dev);
            //δημιουργία λίστας συσκευών και προσθήκη σε νέο παράθυρο
            //ο χρήστης επιλέγει μία συσκευή κάθε φορά οπότε δεν έχει
            //νόημα η προσθήκη όλων των συσκευών στο Vector
            panel_5.add(new JLabel("Control Lights:"));
            Vector<String> lights = new Vector<String>();
            lights.addElement("Ceiling Light:Living Room");
            lights.addElement("Floor Light:Living Room");
            lights.addElement("Porch Light");
            lights.addElement("Hallway Light");
            lights.addElement("Ceiling Light:Bedroom");
            lights.addElement("Floor Light:Bedroom");
            JComboBox<String> lig = new JComboBox<String>(lights);
            panel_5.add(lig);
            //δημιουργία λίστας φωτών και προσθήκη στο νέο παράθυρο
            //ο χρήστης επιλέγει ένα φως κάθε φορά οπότε δεν έχει
            //νόημα η προσθήκη όλων των φωτών στο Vector
            panel_5.add(new JLabel("Insert phone number"));
            JTextField phone =  new JTextField(10);
            panel_5.add(phone);
            //εισαγωγή αριθμού τηλεφώνου
            Object[] options_5={"Ok","Cancel"};
            
            int activity_5= JOptionPane.showOptionDialog(null, panel_5,
            "Create your own scenario", JOptionPane.YES_NO_OPTION, 
            JOptionPane.PLAIN_MESSAGE, null, options_5, null);
            //δημιουργία παραθύρου που περιέχει τις συσκευές, τα φώτα
            //και το τηλέφωνο
            if(activity_5==JOptionPane.YES_OPTION){
            //επιλογή οκ
            JPanel panel_6 =new JPanel();
            panel_6.add(new JLabel("Insert a title for your scenario"));
            JTextField title= new JTextField(20);
            panel_6.add(title);
            //εισαγωγή τίτλου για το σενάριο
            Object[] options_6={"Save","Cancel"};
            
            int activity_6 = JOptionPane.showOptionDialog(null, panel_6,
            "Create your own scenario", JOptionPane.YES_NO_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options_6, null);
            //δημιουργία παραθύρου επιβεβαίωσης δημιουργίας σεναρίου
            if(activity_6==JOptionPane.YES_OPTION){
                //επιλογή αποθήκευσης
            new_moo = title.getText();
            //διαβάζει τον τίτλο που εισώρησε ο χρήστης
            JPanel panel_7 = new JPanel();
            
            Object[] options_7 = {"Dinner Party", new_moo, 
            "Create a new one"};
            //φτίαχνει νέο παράθυρο το οποίο είναι το αρχικό παράθυρο σύν
            //το νέο σενάριο.
            //Ουσιαστικά αντί να προσθέτει το σενάριο στο υπάρχον παράθυρο
            //φτίαχνει νέο(αντίγραφο) και το τοποθετεί εκεί.
            //στο αντίγραφο έχει προστεθεί η λειτουργηκότητα μόνο για το
            //νέο σενάριο ώστε να μην βαρύνει περαιτέρω ο κώδικας
            int activity_7= JOptionPane.showOptionDialog(null, panel_7,
            "Select one:", JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options_7, null);
            if(activity_7==JOptionPane.NO_OPTION){
                //επιλογή του νέου σεναρίου
            new_dev = (String)dev.getSelectedItem();
            //διαβάζει ποια συσκευή επέλεξε ο χρήστης
            new_lig = (String)lig.getSelectedItem();
            //διαβάζει ποιο φως επέλεξε ο χρήστης
            new_phon = phone.getText();
             
            //διαβάζει το τήλεφωνο που πληκτρολόγησε ο χρήστης
            JPanel panel_8 = new JPanel();
            panel_8.add(new JLabel("Your customized scenario"));
            Object[] options_8 = {"Turn on", "Turn of"};
            int activity_8 = JOptionPane.showOptionDialog(null, panel_8,
            new_moo, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options_8, null);
            //δημιουργία νέου παραθύρου για ενεργοποίηση ή απενεργοποίση 
            //σεναρίου
             if(activity_8==JOptionPane.YES_OPTION){
                 //επιλογή ενεργοποίησης
                new_devidle = true;
                System.out.println(new_dev +" is turned on.");
                //ενεργοποίηση συσκευής
                new_ligidle = true;
                System.out.println(new_lig +" is dimmed.");
                //ρύθμιση φωτός
                if(phone.getText().trim().equals("")){
                et_phon = false;}else{
                et_phon = true;    
                System.out.println("Dialing..."+new_phon); 
                //κλήση τηλεφώνου
                }
            }
            }
            
           }
            
           }
            
            
            }
           
         
        }
        
        
        public static void main(String[] args)
        {
          
           javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
               click();
            }
            
            
            });
           
           
       
        
        }
            
  
}
