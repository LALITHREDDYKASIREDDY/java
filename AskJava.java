public class AskJava {
    public static void main(String args[])
    {
        double money = 30.86;
        double price = 30.1;

        System.out.println("Hi Java do I have enough money to buy chips: ");
        System.out.println((money>=price));

        int elevatorCapacity = 6000;

        int totalWeight = 8000;

        System.out.println("Java can you tell if elevator can hold everyone?");
        System.out.println(elevatorCapacity>=totalWeight);
    }
}
