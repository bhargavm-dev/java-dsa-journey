package Day02_Conditional_Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int f=1;
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.println("Factorial is "+f);
    }
}
