import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int savings;
        int debt;
        int years;
        boolean b;
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        b=scan.nextBoolean();
        if(b){
        System.out.println("\nGreat! In one line" +
                 "\nHow much money do you have in your savings?" +
                 "\nAnd, how much do you owe in credit card debt?");
        savings=scan.nextInt();
        debt=scan.nextInt();
        System.out.println("\nHow many years have you worked for?");
        years=scan.nextInt();
        System.out.println("What is your name?");
        name=scan.next();
        if(savings>=10000&&debt<5000&&years>2){
        System.out.println("Congratulations" +name+", you have been approved!");
        }
        else{
             System.out.println("Sorry, you are not eligible for a mortgage");
        }
    }
    else
    {
        System.out.println("\nOK. Have a nice day!");
    }
    scan.close();
    }
}
