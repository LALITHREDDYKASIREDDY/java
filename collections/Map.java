package collections;


import java.util.*;
public class Map {
    public static void main(String[] args) {
        
    
    HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println(map.get("vishal"));
          //removes a element based on key value
        map.remove("vaibhav");
        //clears a map
        // map.clear =={}
        //System.out.println(map.remove("vishal")); removes that key pair and returns value for that key
        //ie 10

        //for iterating over map
        for(String i:map.keySet()){
            System.out.println(map.get(i));
        }
        // printing keys
        for(String i:map.keySet()){
            System.out.println(i);
        }
      
    }
    
}
