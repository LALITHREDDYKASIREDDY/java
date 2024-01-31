package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args)
    {
 
        try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
           Scanner f=new Scanner(Obj);
           //System.out.println(char)f.read());
          
            while(f.hasNext()){
                System.out.print(f.next());
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
    }
}
