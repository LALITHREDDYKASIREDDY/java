import java.util.*;
public class Callender {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        switch(day)
        {
            case "Monday":{
                System.out.println("Sorry,I have to stay at work late");
                break;
            }
            case "Tuesday":{
                System.out.println("It looks like I have meetings all the day");
                break; 
            }
            case "Wednesday":{
                System.out.println("I have a dentist appointment, some other time");
                break; 
            }
            case "Thursday":{
                System.out.println("Sorry thursday is date night");
                break; 
            }
            case "Friday":{
                System.out.println("I'm free");
                break; 
            }
            case "Saturday":{
                System.out.println("I'm free");
                break; 
            }
            case "Sunday":{
                System.out.println("I'm free");
                break;
            }
            default:
                System.out.println("That's not a day");


        }
    }
    
}
