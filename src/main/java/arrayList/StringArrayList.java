package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>(3);
        Scanner data=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("enter user name ["+(i+1)+"]: ");
           list.add(i,data.next());
        }
        System.out.println(list);



    }
}
