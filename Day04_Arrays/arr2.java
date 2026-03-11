package Day04_Arrays;
import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i : arr)//here num represent element of the array
            {
            System.out.print(i);
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
