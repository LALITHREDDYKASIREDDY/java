package filehandling;

import java.io.*;

public class Buffer {
     public static void main(String[] args)
    {
 
        try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
           BufferedReader f=new BufferedReader(new FileReader(Obj));
        
             String asc;
            while((asc=f.readLine())!=null){
                System.out.println(asc);
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
    }
}
