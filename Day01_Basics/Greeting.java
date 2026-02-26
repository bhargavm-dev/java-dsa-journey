import java.util.Scanner;
public class Greeting {
public static void main(String[] args) {
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name");
    name=sc.next();
    System.out.println("Hello "+name);
}
    
}
