
import java.util.Scanner;


public class d14 {
     public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int i=1;i<=n;i++)
          {
              for(int j=n-i;j>=1;j--)
              
              
                  System.out.printf(" ");
              System.out.printf("/");
              for(int k=2*i-2;k>=1;k--)
              
                  System.out.print("*");
         System.out.printf("\\");
              System.out.println();
              
}
             for(int i=1;i<=n;i++)
          {
              for(int j=1;j<i;j++)
              
              
                  System.out.printf(" ");
              
              System.out.printf("\\");
              for(int k=i;k<2*n-i;k++)
              System.out.printf("*");
              
              System.out.print("/");
              System.out.println();
              
              
              
    
}
}
}
