package Set_;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Difference {
    public static void main(String[] args) {
        Integer[]a={1,2,3,4,5,6,7};
        Integer []b={1,2,3,8,9,10,11,12};
        Set<Integer> set1= new LinkedHashSet<>();
        Set<Integer> set2= new LinkedHashSet<>();

        set1.addAll(Arrays.asList(a));
        set2.addAll(Arrays.asList(b));

        System.out.println(set1);
        System.out.println(set2);
        // Difference method at set1
        Set<Integer> difference_data=new LinkedHashSet<>(set1);
        difference_data.removeAll(set2);
        System.out.println("difference at set1: "+difference_data);



        // Difference method at set1
        Set<Integer> difference_data1=new LinkedHashSet<>(set2);
        difference_data1.removeAll(set1);
        System.out.println("difference at set2: "+difference_data1);


        System.out.println("/*******************************************");
        System.out.println(set1);
        Object[] array_data = set1.toArray();
        System.out.println("The array is:");
        for (int i = 0; i < array_data.length; i++)
            System.out.println(array_data[i]);











    }
}
