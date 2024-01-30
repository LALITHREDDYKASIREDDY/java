
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TimeConverter{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     String input = sc.nextLine();
     DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(input, dt);
        
      
        long unixTimestamp = localDateTime.atZone(ZoneId.of("Asia/Kolkata")).toEpochSecond();
        LocalDateTime utcTimeStamp=localDateTime.atZone(ZoneId.of("Asia/Kolkata"))
        .withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime();
        LocalDateTime localTimeStamp=localDateTime.atZone(ZoneId.of("UTC"))
        .withZoneSameInstant(ZoneId.of("Asia/Kolkata")).toLocalDateTime();
        System.out.println("IST- Unix: " + unixTimestamp);
        System.out.println("IST - UTC: " + utcTimeStamp);
        System.out.println("UST- IST : " + localTimeStamp);
  }
}