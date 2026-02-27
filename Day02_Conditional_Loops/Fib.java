package Day02_Conditional_Loops;

import java.util.*;
class Fib
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int first=0;
        int sec=1;
        int count;
        for(count =2;count<=n;count++)
        {
            int next=first+sec;
            first=sec;
            sec=next;
        }
        System.out.println(sec);
    }
}