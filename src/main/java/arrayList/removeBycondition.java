package arrayList;


import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;

public class removeBycondition {
    public static void main(String[] args) {

        ArrayList<String> arraylist_1 = new ArrayList<String>(
                Arrays.asList("apple", "banana", "mango", "orange", "papaya", "plum"));

        arraylist_1.removeIf(element -> (element.endsWith("a")));// endsWith("a"): condition
        System.out.println(arraylist_1);
        arraylist_1.forEach(element -> {
            System.out.println(element);
        });


        ArrayList<Integer> num= new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            num.add(i+1);
        }
        System.out.println(num);
        num.add(-1);
        num.add(-10);
        num.add(-20);
        num.add(-30);
        num.add(-40);
        System.out.println(num);
        //-------------------------------------------------------------------
        // remove by condition

        num.removeIf(even ->((even%2==1)||even<0));

        //-------------------------------------------------------------------
        System.out.println(num);
        System.out.print("\n\n");
        System.out.println("----------------------------------------------");

    }
}
