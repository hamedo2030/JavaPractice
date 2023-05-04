package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMinAndMix {
    public static void main(String[] args) {

        ArrayList<Integer> num =new ArrayList<>(Arrays.asList(1,5,9,7,5,3,6,5,4,8,5,2,0));

        Collections.sort(num);
        System.out.println(num);
        System.out.println("minimum number is "+Collections.min(num));
        System.out.println("maximum number is "+Collections.max(num));




    }
}
