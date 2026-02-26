import java.util.*;
public class RuppeToUSD {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount in rupees");
        float INR=sc.nextFloat();
        System.out.println("Input thr current exchange rate");
        float er=sc.nextFloat();
        System.out.println((INR/er)+"$");

    }
}
