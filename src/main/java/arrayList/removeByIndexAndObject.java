package arrayList;

import java.util.ArrayList;

public class removeByIndexAndObject {
    public static void main(String[] args) {
        String [] name={"mostafa","hamedo","sayed","ola","ezzat"};
        ArrayList<String> list =new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            list.add(name[i]);
        }
        System.out.println(list);
        // remove by object
        System.out.println("after remove : ");
        list.remove("mostafa");
        System.out.println(list);












    }


}
