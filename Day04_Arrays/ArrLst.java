package Day04_Arrays;

import java.util.ArrayList;

public class ArrLst {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        
        System.out.println(list.contains(3));//checks whether the elem is in list


        list.set(0,0);//updates the arrlist with index,elem
        System.out.println(list);


        list.remove(2);//removes elem at index
        System.out.println(list);


        // there is no need to use.toString() in ArrayList

        //printing through iterative method
        for (int index = 0; index < 10; index++) {
            System.out.print(list.get(index));//use get method t retrieve rlrm
            
        }

    }
    
}
