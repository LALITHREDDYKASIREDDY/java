package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class FIleWriter1 {
      public static void main(String[] args)
    {
 
        try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
            FileWriter f=new FileWriter(Obj);
        f.write("something");
            f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
    }
}
