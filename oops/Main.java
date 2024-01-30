package oops;

class Superclass {
    static int staticField = 10;
    
    static void staticMethod() {
        System.out.println("Superclass static method");
    }
}

class Subclass extends Superclass {
    
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Subclass.staticField); 
        System.out.println(Superclass.staticField); 
        Subclass.staticField=50;
        System.out.println(Subclass.staticField); 
        System.out.println(Superclass.staticField); 
        
    }
        
       
}
