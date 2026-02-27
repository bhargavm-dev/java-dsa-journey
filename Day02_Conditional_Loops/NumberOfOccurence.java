package Day02_Conditional_Loops;

import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the search number");
        int s=sc.nextInt();
        int count=0;
        while(num>0)
        {
            int a=num%10;
            if(a==s){
                count+=1;
            }
            num=num/10;

        }
        System.out.println(s+" has ouccured "+count+" time(s)");

    }
    
}
