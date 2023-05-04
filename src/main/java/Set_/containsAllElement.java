package Set_;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class containsAllElement {
    public static void main(String[] args) {
        Integer [] arr ={1,2,3,4,5,6,7,8,9};
        Integer [] arr2={1,2,310} ;

        Set<Integer> data1= new LinkedHashSet<>(Arrays.asList(arr)) ;
        Set<Integer> data2= new LinkedHashSet<>(Arrays.asList(arr2)) ;
        boolean check =data1.containsAll(data2);
        System.out.println(check);





    }
}
