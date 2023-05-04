package Set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class contains {
    public static void main(String[] args) {
        Set<Integer> data= new LinkedHashSet<>();
        data.add(1);
        data.add(2);
        data.add(3 );
        System.out.println(data);
        System.out.println(data.contains(1));
        System.out.println(data.contains(5));
    }
}
