import java.util.*;
public class ChatBot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey Hi , what's your name? ");
        String name = sc.next();

        System.out.println("Oh Nice to meet you " + name + "So where are you from? ");

        String place = sc.next();

        System.out.println("You are also from " + place + "? I also used to stay in " + place + " 10 years ago");

        System.out.println("Okay then it was very nice talking to you Bye!!!");

    }
    
}
