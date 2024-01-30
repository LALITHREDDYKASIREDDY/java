public class Temperature {

 static  double celsius (double f){
        return  (f - 32) * 5/9;
 }
 public static void PrintTemp(double temp,double convtemp)
 {
     System.out.println("Temperature in Fahrenheit: " + temp);
     System.out.println("Temperature in Celsius: "+ convtemp);
 }

    public static void main(String[] args) {
        double noon = 77;         
    double evening = 61;     
    double midnight = 55;  
    PrintTemp(noon, celsius(noon));
    PrintTemp(evening, celsius(evening));
    PrintTemp(midnight, celsius(midnight));
    
      
    }
}
