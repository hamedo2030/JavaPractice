package Set_;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setAsDuplicated {
    public static void main(String[] args) {

        Integer arr[]={1,2,3,4,5,5,6,6,7,8,1,2,5,21,10,22,30};
        Set<Integer> data2=new LinkedHashSet<>();
        Collections.addAll(data2,arr);
        System.out.println(data2);

        int[] arr2 =new int[20];
        for(int i=0;i<20;i++)
        {
            arr2[i]=i+1;
        }

        Set<Integer> ss = new HashSet<Integer>();
          for(int i=0;i<arr2.length;i++)
        {
            ss.add(arr2[i]);
        }
        System.out.println(ss);

          int []a={1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,6,6,7,8,7,8,8,8,8,8,8,99,9,9,9,2,1,5,4,87,4,1,5,1,2,5,9,9,9,9,100,11,0,22,22222};
          Set<Integer> list= new HashSet<>();
          for (int i=0;i<a.length;i++)
          {
             list.add(a[i]);
          }
        System.out.println(list);












    }
}
