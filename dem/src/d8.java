
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
public class d8 {
     public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          for(int i=1;i<=n+1;i++,System.out.println()){
          
              
          
          
              
          for(int j=1;j<=i-1;j++)
                  
              System.out.printf(" ");
          System.out.printf("*");
          if(i==n+1)
              continue;
          
          for(int j=1;j<=2*(n-i)+1;j++)
          
              System.out.printf(" ");
              System.out.printf("*");
          
             
          
          }
           for(int i=n;i>1;i--,System.out.println()){
        for(int j=1;j<=i-1;j++)
                  
              System.out.printf(" ");
          System.out.printf("*");
          if(i==n+1)
              continue;
          
          for(int j=1;j<=2*(n-i)+1;j++)
          
              System.out.printf(" ");
              System.out.printf("*");
          
             
          
          }
       
              
          }
}
          
              
    

