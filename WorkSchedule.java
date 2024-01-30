import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day = sc.nextInt();
        boolean holiday =sc.nextBoolean();
       if(holiday){
        System.out.println("Woohoo, no work");
       }
       else if(day==6||day==7){
        System.out.println("It's the weekend, no work!");
       }
       else
       {
        System.out.println("Wake up at 7:00 :(");
       }
    }
}
