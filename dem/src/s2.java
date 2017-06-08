
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
public class s2 {
       public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
    
          System.out.println("enter he value of n");
          int n=scan.nextInt();
          int sum=0;
          for(int i=0;i<n;i++)
              sum+=scan.nextInt();
           System.out.println(sum);
          
          
          
              
      }
    
}
