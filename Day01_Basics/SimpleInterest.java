import java.util.Scanner;
public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount");
        float p=sc.nextFloat();
        System.out.println("Enter the Rate of Interest in %");
        float r=sc.nextFloat();
        System.out.println("Enter the total number of years");
        float t=sc.nextFloat();
        System.out.println("The Simple Interest is : "+((p*t*r)/100));
    }
}
