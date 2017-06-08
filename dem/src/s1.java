
import java.util.Scanner;


public class s1 {
    
        static StringBuilder modify(StringBuilder s)
        {
            char first=s.charAt(0);
            s.setCharAt(0,s.charAt(s.length()-1));
              s.setCharAt(s.length()-1,first);
              return s;
            
        }
    
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          StringBuilder s=new StringBuilder(scan.nextLine());
         
       System.out.println(modify(s));
    
}
}
