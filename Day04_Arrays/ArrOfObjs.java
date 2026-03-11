package Day04_Arrays;
import java.util.*;


public class ArrOfObjs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] str = new String[5];
        // for (int i = 0; i < str.length; i++) {
        //     str[i]=sc.next();
        // }
        // str[3]="woow";
        // System.out.println(Arrays.toString(str));
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));

        //any changes made to the object will be reflected throughout


    }
    static void change(int[] arr)
    {
        arr[0]=999;
    }
    
}
