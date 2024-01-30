import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp =sc.nextInt();
        String forecast;
        if(temp<=-1){
            forecast="The forecast is FREEZING! Stay home!";

        }
        else if(temp<=10){
            forecast="The forecast is Chilly. Wear a coat!";
        }
        else{
            forecast="It's warm. Go outside!";
        }

        System.out.println(forecast);

    }
}
