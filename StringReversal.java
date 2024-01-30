import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j)
        {
            
              char temp=c[i];
              c[i]=c[j];
              c[j]=temp;

              i++;
              j--;
        }
        ans=new String(c);
        System.out.println(ans);
        sc.close();
    }
}
