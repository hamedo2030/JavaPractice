package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortingArrayList {
    public static void main(String[] args) {

        ArrayList <Integer> num =new ArrayList<>(Arrays.asList(1,5,9,7,5,3,6,5,4,8,5,2,0));
        System.out.println("before sorting");
        System.out.println(num);
        //----------------------------------
        //ascending sort
        Collections.sort(num);
        //----------------------------------
        System.out.println("after sorting");
        System.out.println(num);
        ///**********************************************************************

        System.out.println("descending sort");

        //----------------------------------
        // descending sort
        Collections.sort(num,Collections.reverseOrder());
        //----------------------------------
        System.out.println(num);


        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));





    }
}
