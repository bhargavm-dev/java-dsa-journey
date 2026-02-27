package Day02_Conditional_Loops;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int r=0;
        while(num>0){
            int temp=num%10;
            r=(r*10)+temp;
            num=num/10;

        }
        System.out.println(r);
    }
    
}
