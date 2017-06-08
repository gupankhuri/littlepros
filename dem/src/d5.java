
import java.util.Scanner;


public class d5 {
     public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int y=-n;y<=n;y++)
          {
              for(int x=-n;x<=n;x++)
              {
               System.out.print((Math.abs(x)+Math.abs(y)<=n)?"*":"");
               System.out.println();
              }
          }
}
}
