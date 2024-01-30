import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class TimeConverter2 {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateTime=LocalDateTime.parse(input, dt);
       LocalDateTime addOneDay= localDateTime.plusDays(1);
        LocalDateTime sub10Days=localDateTime.minusDays(10);
       LocalDateTime  add1Hour=localDateTime.plusHours(1);
       LocalDateTime sub5Hours30Minutes=localDateTime.minusHours(5).minusMinutes(30);

       System.out.println("after adding one day to current time "+addOneDay);
       System.out.println("after subtracting 10 day to current time "+sub10Days);
       System.out.println("after adding one hour to current time "+add1Hour);
       System.out.println("after subtracting 5 hours and 30 minutes to current time "+sub5Hours30Minutes);
    
       List<LocalDateTime> dates = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter date in format dd/MM/yyyy HH:mm:");
            String input1 = sc.nextLine();
            DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime localDateTime1 = LocalDateTime.parse(input1, dt1);
            dates.add(localDateTime1);
        }

      
        Collections.sort(dates);
        System.out.println(dates);

    }

}
