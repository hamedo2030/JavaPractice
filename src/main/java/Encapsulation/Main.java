package Encapsulation;

import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

//        rectangle r1=new rectangle() ;
//        r1.setLength(1003);
//        r1.setWidth(5020);
//        System.out.println(r1.getLength());
//        System.out.println(r1.getWidth());
        int[] myArray = {13, 14, 15};
        int n = myArray.length;
        Set<Integer> set = new HashSet<>();
        for(int a : myArray){
            if(a>0){
                set.add(a);
            }
        }
        for (int i=1;i<=n+1;i++){
            if(!set.contains(i)){
            }
        }





    }
}
