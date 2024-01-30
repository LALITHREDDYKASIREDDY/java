import java.util.Scanner;

public class JavaGram {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        int age;
        String userName;
        String city;
        String country;
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your first name?");
        firstName=sc.nextLine();
        System.out.println("What is your last name?");
        lastName=sc.nextLine();
        System.out.println("How old are you?");
        age=sc.nextInt();
        System.out.println("Make a username");
        userName=sc.nextLine();
        System.out.println("What city do you live in?");
        city=sc.nextLine();
        System.out.println("What country is that?");
        country=sc.nextLine();
       System.out.println("Thank you for joining the javagram");
       System.out.println("Here is your information you entered:");
       System.out.println("first name: "+firstName);
       System.out.println("last name:"+lastName);
       System.out.println("Age "+age);
       System.out.println("Username "+userName);
       System.out.println("city "+city );
       System.out.println("country "+country);
    }
}
