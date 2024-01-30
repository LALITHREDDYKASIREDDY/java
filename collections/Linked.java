package collections;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        cars.addFirst("audi");
        cars.addLast("lastcar");
        System.out.println(cars);
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
    }
}
