
import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int i=1;i<=n;i++)
          {
              for(int j=4;j>=i;j--)
                  System.out.printf(" ");
              System.out.printf("*");
              for(int k=1;k<i;k++)
              {
                  System.out.printf(" ");
              System.out.printf("*");
              }
              System.out.println();
              
          }
    
}
}
