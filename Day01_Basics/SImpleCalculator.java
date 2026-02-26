import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class SImpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1=sc.nextInt();
        System.out.println("Enter number 2");
        int n2=sc.nextInt();
        System.out.println("Enter the operator");
        char s=sc.next().charAt(0);
        if(s=='+')
            System.out.println((n1+n2));
        else if (s=='-')
            System.out.println((n1-n2));
        else if(s=='*')
            System.out.println((n1*n2));
        else if(s=='/')
            System.out.println((n1/n2));
        else if(s=='%')
            System.out.println((n1%n2));
        else
            System.out.println("Invalid choice");
            
        
    }
}
