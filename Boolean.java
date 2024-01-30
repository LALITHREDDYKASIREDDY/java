import java.util.*;
public class Boolean {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2)
        {
            System.out.println("num1 and num2 are equal");
        }
        else if(num1>num2)
        {
            System.out.println("num1 is greater than num2");
        }
        else if(num1<num2)
        {
            System.out.println("num2 is greater than num1");
        }
        else
        {
            System.out.println("Please provide right inputs");
        }
    }
    
}