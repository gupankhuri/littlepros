
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASD
 */
public class d11 {
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int i=1;i<=n;i++)
          {
              for(int j=4;j>=i;j--)
                      System.out.printf(" ");
              for(int k=1;k<=i;k++)
                  System.out.printf("%d",k);
                          System.out.printf(" ");
                          for(int k=i;k>1;k--)
                              System.out.printf("%d",k);
                          System.out.println();
                              
                          
          }
    
}
}
