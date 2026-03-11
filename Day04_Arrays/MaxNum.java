package Day04_Arrays;
import java.util.*;


public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum elem = "+max(arr));
    }
    static int max(int[]arr)
    {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=max)
                max=arr[i];
            
        }
        return max;
    }

    
}
