
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
public class d12 {
     public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          int d=97;
          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=n-i;j++)
                  System.out.printf(" ");
           
              System.out.printf("%c",d);
              
              for(int k=1;k<i;k++)
              {
                  System.out.printf(" ");
                  d++;
              System.out.printf("%c",d);
              
              }
              d++;
             
            
              System.out.println(); 
          }
          
             
    
}
}
    

