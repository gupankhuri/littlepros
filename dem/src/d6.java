
import java.util.Scanner;


public class d6 {
     public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
   for(int y=-n;y<=n;y++)
   {
       for(int x=-n;x<=n;x++)
           System.out.print((x*x+y*y<=n*n)?"**":" ");
       System.out.println();
   }
   }
}
