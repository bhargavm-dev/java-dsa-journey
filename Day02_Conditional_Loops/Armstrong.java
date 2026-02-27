package Day02_Conditional_Loops;
import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        int n1=n;
        while(n1>0)
        {
            count++;
            n1=n1/10;
        }
        // System.out.println(count);
        double res=0;
        int n2=n;
        while(n2>0)
        {
            res=res+(Math.pow(n2%10,count));
            n2=n2/10;

        }
        if(res==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
    
}
