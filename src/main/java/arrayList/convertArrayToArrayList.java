package arrayList;

import java.util.*;

public class convertArrayToArrayList {
    public static void main(String[] args) {

        /// convert Array to  ArrayList
        int [] arr={1,2,3,4,5,6,7,8,9};

       ArrayList<Integer> list=new ArrayList<Integer>();
       for(int i:arr)
       {
           list.add(i);
       }
        System.out.println(list);
       /// convert ArrayList to array
        int [] arr2 =new int[list.size()] ;
        for (int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }

        for(int i=0;i<list.size();i++)
        {
            System.out.println(arr[i]);
        }














    }
}
