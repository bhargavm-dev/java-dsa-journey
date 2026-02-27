package Day02_Conditional_Loops;
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);
        int lcm = (n1 * n2) / gcd;

        System.out.println("LCM is: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}