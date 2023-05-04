package arrayList;

import java.util.ArrayList;

public class AddALL {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        ArrayList <Integer> num= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            num.add(arr[i]);
        }
        System.out.println("the array list is");
        System.out.println(num);
        System.out.println("----------------------");

        // remove by index
        num.remove(1);
        System.out.println(num);
        // remove by object
        System.out.println(num);
        num.clear();
        System.out.println(num);
        ArrayList<Integer>num1=new ArrayList<>();

        num1.add(10);
        num.addAll(num1);
        System.out.println(num);








    }
}
