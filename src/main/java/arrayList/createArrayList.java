package arrayList;

import java.util.ArrayList;

public class createArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>(5);
        number.add(1);
        number.add(2);
        number.add(2,10);

        System.out.println(number);
        System.out.println(number.get(0));
        for(int i:number)
        {
            System.out.println(i);
        }
















    }





}
