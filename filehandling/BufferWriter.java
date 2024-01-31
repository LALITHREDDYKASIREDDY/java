package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class BufferWriter {
       public static void main(String[] args)
    {
 
        try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
         BufferedWriter f=new BufferedWriter(new FileWriter(Obj));
         f.write("hello");
         f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
    }
     
}
