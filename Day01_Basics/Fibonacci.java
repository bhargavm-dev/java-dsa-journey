import java.util.*;
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Fibonnaci Series is");
        int first=0;
        int sec=1;
        int next;
        System.out.print("0,1,");
        for(int i=0;i<n-2;i++)
        {
            next=first+sec;
            System.out.print(next+",");
            first=sec;
            sec=next;
            
        }
    }
}
