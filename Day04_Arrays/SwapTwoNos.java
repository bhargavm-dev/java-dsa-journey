package Day04_Arrays;
import java.util.*;

public class SwapTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter swap pos");
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<Integer>(1);
        System.out.println("Enter 0 to stop");
        while(true)
        {
            int num = sc.nextInt();
            if(num==0)
                break;
            lst.add(num);

        }
        swap(lst,pos1,pos2);
    }
    static void swap(ArrayList<Integer>a,int i, int j )
    {
        int temp=a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
        System.out.println(a);
    }
}




    
    
    
    

