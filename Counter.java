import java.util.Scanner;

public class Counter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        for(int i = 0;i<=userInput;i++)
        {
            System.out.print(i + " ");
        }
    }
}

