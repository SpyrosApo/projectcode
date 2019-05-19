

public class Alert extends Notification
{
   
   
    
   
    public Alert(String fromwhere ,float measurements)
    {
       super(fromwhere,measurements);
    
       if (super.fromwhere == "body temperature") {
        if(super.measurements < 35.00){
        System.out.println("Your body temperature is "+ measurements + "C and is very low" );
           } else if(super.measurements > 38.00){
              System.out.println("Your body temperature is "+ measurements + "C and is very high" );
           }
        System.out.println("if you want to see body temperature history write Istoriko thermokrasia somatos" );
        String s = readString();
        if (s == "Istoriko thermokrasia somatos")
        {System.out.println("Edw tha typonete to Istoriko thermokrasia somatos" );
        }
        } else if (fromwhere == "heart rate") {
         if(super.measurements < 60.00){
        System.out.println("Your heart rate is "+ measurements + "beats per minute and is very low" );
           } else if(super.measurements > 100.00){
              System.out.println("Your heart rate is "+ measurements + "beats per minute and is very high" );
           }
        System.out.println("if you want to see heart rate history write Istoriko palmon" );
        String s = readString();
        if (s == "Istoriko palmon")
        {System.out.println("Edw tha typonete to Istoriko palmon" );
        }
         }
    }
    public Alert(String fromwhere ,String room,int type)
    {
        super(fromwhere,room,type);
         if(super.type == 1){
          System.out.println("Possible security breach in " + room);
          System.out.println("If the alert is fasle write fasle alert");
          System.out.println("If you want to see the nearest camera live feed write nearest camera");
          String s = readString();
            if (s == "fasle alert")
            {
            System.out.println("The alart has been closed" );
            }
        
            else if (s == "nearest camera")
            { 
            System.out.println("You are now being redirected to the nearest camera" );
            }
         } else if (super.type == 2){
          System.out.println("Possibility of fire in " + room);
          System.out.println("If you want to see the nearest camera live feed write nearest camera");
          System.out.println("If you want open the fire fighting sprinklers write sprinklers");
          String s = readString();
            if (s == "sprinklers")
            {
            System.out.println("Fire fighting sprinklers are open" );
            }
        
            else if (s == "nearest camera")
            { 
            System.out.println("You are now being redirected to the nearest camera" );
            }  
     }
    }
    
}
