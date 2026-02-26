import java.util.*;
public class LargestOfTwo {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater");
        else if(a<b)
            System.out.println(b+" is greater");
        else
            System.out.println("Both are equal");

        
    }
}
