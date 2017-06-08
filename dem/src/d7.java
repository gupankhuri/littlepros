
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
public class d7 {
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              
                  System.out.printf(" ");
             
                  System.out.printf("*");
              System.out.println();
                  
              
          }
          for(int i=1;i<=2*n+1;i++)
          {
              System.out.printf("*");
      
              
          }
          System.out.println();
           for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              
                  System.out.printf(" ");
             
                  System.out.printf("*");
              System.out.println();
                  
              
          }
    
}
}
