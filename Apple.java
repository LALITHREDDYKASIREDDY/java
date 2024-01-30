public class Apple {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
         numOfApples+=500;
         numOfCustomers++;
         numOfApples-=4;
         profit+=4*(0.40);
         numOfApples-=20;
         profit+=20*(0.40);
         numOfCustomers++;
         numOfCustomers++;
         profit+=200*(0.40);
         numOfApples-=200;
         System.out.println("Wow! So far, you made: " + profit);
         System.out.println(numOfCustomers + " customers love our apples");
         System.out.println("You have " + numOfApples + " apples left.");

    }
}
