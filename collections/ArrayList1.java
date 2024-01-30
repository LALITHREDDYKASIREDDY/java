package collections;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //updating element
        cars.set(0, "audi");
        System.out.println(cars);

        // getting element
        System.out.println(cars.get(0));

        //removing an element at a particular index
        cars.remove(0);

        //printing using loops
        //for loop
        for (int i = 0; i < cars.size(); i++) {
          System.out.println(cars.get(i));
        }
        //range based loop
        for (String i : cars) {
          System.out.println(i);
        }
      }

}
