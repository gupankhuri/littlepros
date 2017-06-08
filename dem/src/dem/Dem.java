

package dem;
import java.util.*;

public class Dem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j>=1;j--)
            {
            
                System.out.printf("#");
            }
            System.out.println();
            
        }
        
        // TODO code application logic here
    }
    
}
