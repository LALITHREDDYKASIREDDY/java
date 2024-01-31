package filehandling;

import java.io.File;
import java.io.FileInputStream;

public class FileRead {
    public static void main(String[] args) {
        
    
     try {
            File Obj = new File("C:\\Users\\Dell\\Desktop\\java\\filehandling\\textfile.txt");
           FileInputStream f=new FileInputStream(Obj);
           //System.out.println(char)f.read());
           int asc;
            while((asc=f.read())!=-1){
                System.out.print((char)asc);
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("An error has occurred.");
           
        }
}

}
