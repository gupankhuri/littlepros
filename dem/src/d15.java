
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
public class d15 {
    
     public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
       
          for(int i=1;i<=n;i++)
          {
              for(int j=n-i;j>=1;j--)
               System.out.printf(" ");
              System.out.printf("/");
             for(int k=1;k<=i-1;k++)
             {
                  
             
                System.out.printf("\\");
               
                    
                        System.out.print("/");
              
                  }
                System.out.printf("\\");
             
                  
          
              System.out.println();
          }
     }
             
              
         
             
              
}
    

