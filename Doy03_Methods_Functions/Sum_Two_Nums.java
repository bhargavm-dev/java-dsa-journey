package Doy03_Methods_Functions;
import java.util.*;

public class Sum_Two_Nums {
    static int sum(int a, int b)
    {
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));

    }

    
}
