package Day04_Arrays;
import java.util.*;

public class TwoDArr {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];
        //column no need nod to be mentioned, it is not mandatory
        int[][] mat1={
            {1,2,3},
            {4,5,6}};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<mat.length;i++)//np of rows
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }

        }

        // for(int i=0;i<mat.length;i++)//np of rows
        // {
        //     for(int j=0;j<mat[i].length;j++)
        //     {
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        for(int[] i: mat){
            System.out.println(Arrays.toString(i));
        }
        //row = arr.length
        //column = arr[row].length

        }
            
    }
    

