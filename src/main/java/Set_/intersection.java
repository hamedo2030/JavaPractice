package Set_;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class intersection {
    public static void main(String[] args) {
        Integer[]a={1,2,3,4,5,6,7};
        Integer []b={1,2,3,11,22,33,44,55,};
        Set<Integer> set1= new LinkedHashSet<>();
        Set<Integer> set2= new LinkedHashSet<>();

        set1.addAll(Arrays.asList(a));
        set2.addAll(Arrays.asList(b));

        System.out.println(set1);
        System.out.println(set2);
        // intersection method
        Set<Integer> intersection_data= new LinkedHashSet<>(set1);
        intersection_data.retainAll(set2);
        System.out.println(intersection_data);
        System.out.println("number of intersection element : "+intersection_data.size());


    }
}
