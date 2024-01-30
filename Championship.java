import java.util.Scanner;

public class Championship {


    public static void main(String[] args) {
 
           Scanner sc=new Scanner(System.in);
         int gryffindor;
         gryffindor=sc.nextInt();    
         int ravenclaw; 
         ravenclaw=sc.nextInt();   
 
          if(gryffindor-ravenclaw>=300)
          {
            System.out.println("Gryffindor takes the house cup!");

          }
          else if(gryffindor-ravenclaw>=0){
            System.out.println("In second place, Gryffindor!");
          }
          else if(ravenclaw-gryffindor<100){
          System.out.println("In third place, Gryffindor!");

          }
          else{
            System.out.println("In fourth place, Gryffindor!");
          }
    
    }
 
 
 }
 