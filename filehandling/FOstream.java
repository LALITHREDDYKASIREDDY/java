package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FOstream {
    
    public static void main(String[] args)
    {
 
        try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
          
            FileOutputStream f=new FileOutputStream(Obj);
           f.write(68);
            f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
    }
}
