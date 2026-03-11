package Day04_Arrays;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Elements entered");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();

        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[]arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
}
