package Day02_Conditional_Loops;
import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to continue, 0 to exit");
        int n;
        int max=0;
        while(true)
        {
            n=sc.nextInt();
            if(n==0)
                break;
            if(n>max)
            {
                max=n;
                
            }
            System.out.println("max = "+max);



        }
    }
    
}
