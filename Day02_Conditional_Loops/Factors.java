package Day02_Conditional_Loops;
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The factors of the number are");
        System.out.print("1 ");
        if(n%2==0)
            System.out.print("2 ");
        if(n%3==0)
            System.out.print("3 ");
        if(n%5==0)
            System.out.print("5 ");
        if(n%7==0)
            System.out.print("7 ");
        System.out.println("and "+n);
        
        
    }
    
}
