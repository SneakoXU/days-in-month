
/**
 *
 * @author Sneako
 */
import java.util.Scanner;
public class DaysinMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the month 1-12: ");
        int month=in.nextInt();
    
    switch(month){
       /*
         case 4:
            System.out.println("30 days");
            break;
         case 6:
            System.out.println("30 days");   
            break;
         case 9:
            System.out.println("30 days"); 
            break;
         case 11:
            System.out.println("30 days"); 
            break;
         case 2:
            System.out.println("28 or 29 days"); 
            break;
         default:
            System.out.println("31 days");
      */
       case 4:
        case 6:
        case 9:
        case 11:        
            System.out.println("30 days");
            break;
       case 2:
            System.out.println("28 or 29 days"); 
            break;
         default:
            System.out.println("31 days");     
            
    }    
    
    }
    
}
