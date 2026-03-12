package Day04_Arrays;

import java.util.*;
class SumOfNos
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<Integer>(1);
        System.out.println("Enter elements of array, enter 999 to stop");
        while(true)
        {
            int n=sc.nextInt();
            if(n==999)
                break;
            lst.add(n);
        }
        System.out.println("Array enterd is ");
        System.out.println(lst);
        int sum=0;
        for(int i : lst)
        {
            sum+=i;
        }
        System.out.println("Sum of elementis = "+sum);
        

    }
}