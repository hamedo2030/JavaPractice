package Set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class clear {
    public static void main(String[] args) {
        // clear mothed use to clear the set from  any element

        Set<Integer> data= new LinkedHashSet<>();
        data.add(1);
        data.add(2);
        data.add(3 );
        System.out.println(data);
        data.clear();
        System.out.println(data);
        System.out.println(data.isEmpty());

    }



}
