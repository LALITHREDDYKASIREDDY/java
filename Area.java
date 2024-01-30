import java.util.*;

public class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side of square: ");
        double squareLength = sc.nextDouble();
        double areaSquare1 = areaSquare(squareLength);

        System.out.println("Enter the length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double areaRectangle1 = areaRectangle(length, breadth);

        System.out.println("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaTriangle1 = areaTriangle(base, height);

        printArea(areaSquare1, areaRectangle1, areaTriangle1);
    }

    public static double areaSquare(double side) {
        return side * side;
    }

    public static double areaRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double areaTriangle(double base, double height) {
        return  (base * height)/2;
    }

    public static void printArea(double areaSquare1, double areaRectangle1, double areaTriangle1) {
        System.out.println("Area of Square: " + areaSquare1);
        System.out.println("Area of Rectangle: " + areaRectangle1);
        System.out.println("Area of Triangle: " + areaTriangle1);
    }
}
