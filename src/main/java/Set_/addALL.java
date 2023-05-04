package Set_;

import java.util.*;

public class addALL {
    public static void main(String[] args) {

        Integer arr1[]={1,2,3,4,5,6,7};
        Integer arr2[]={1,2,3,8,9,10,11,12} ;

        Set<Integer> data1=new LinkedHashSet<>(Arrays.asList(arr1));
        Set<Integer> data2=new LinkedHashSet<>(Arrays.asList(arr2));
        Set<Integer> AllData =new LinkedHashSet<>(data1);

        AllData.addAll(data2);
        System.out.println(AllData);

        Integer arr3[]={1,2,3,4,5,6,7,10,20,30,0};
        Integer arr4[]={1,2,3,8,9,10,11,12,100,220,300} ;
        Set <Integer> newData=new LinkedHashSet<>();
        newData.addAll(AddFunction(arr3,arr4));
        System.out.println(newData);

        ArrayList <Integer> sort= new ArrayList<Integer>(newData);
        Collections.sort(sort);
        System.out.println(sort);

        Collections.sort(sort,Collections.reverseOrder());
        System.out.println(sort);




    }

    public static Set<Integer> AddFunction(Integer [] arr1 , Integer [] arr2 )
    {
        Set<Integer> data1=new LinkedHashSet<>(Arrays.asList(arr1));
        Set<Integer> data2=new LinkedHashSet<>(Arrays.asList(arr2));
        Set<Integer> AllData =new LinkedHashSet<>(data1);
        AllData.addAll(data2);
       return  AllData ;
    }
}
