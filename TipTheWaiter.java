import java.util.Scanner;

public class TipTheWaiter {
    public static double tip(double bill){
        return bill*0.15;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble();
        double tip=tip(bill);
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        System.out.println("Your service was wonderful! Please, accept this tip: " + tip);

    }
}
