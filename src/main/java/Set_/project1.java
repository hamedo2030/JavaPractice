package Set_;

import java.util.*;

public class project1 {
    public static void main(String[] args) {

  /*      Integer[] arr= {1,2,-5,-4,5,6,8,4,2,0,3,1,4,7,88,99,55,9};

        ArrayList<Integer> data=new ArrayList<>(Arrays.asList(arr));
        System.out.println(data);
        data.removeIf(element->((element<=0)));
       Collections.sort(data);
        System.out.println(data);
        Set<Integer> data2=new LinkedHashSet<>(data);
        System.out.println(data2);
        data.clear();
        data.addAll(data2);
        if(data.isEmpty())
        {
            data.add(0);
        }
        for(int i=1;i<=data.size();i++)
        {
            if((i!=data.get(i-1)))
            {
                System.out.println(i);
                break;
            }

        }
*/
        Integer[] arr= {-1,5,3,6,4,-5,-4,-2,2,5,5,4,4,5,888,9,6,3,2};
        System.out.println(check(arr));

    }

    public static Integer check(   Integer [] arr)
    {
        Integer Result;
        ArrayList<Integer> data=new ArrayList<>(Arrays.asList(arr));
        System.out.println("my data :"+data);
        data.removeIf(element->((element<=0))); //to  remove the element less than or equal zero
        Collections.sort( data);   // to sort the the data
        System.out.println("data sorting :"+data);
        Set<Integer> data2=new LinkedHashSet<>(data); // to remove duplicated
        System.out.println("data without duplicated :"+data2);
        data.clear();
        data.addAll(data2);
        if(data.isEmpty())
        {
            data.add(0);
        }
        for(int i=1;i<=data.size();i++)
        {
            if((i!=data.get(i-1)))
            {
                Result =i;
                break;
            }


        }

        return Result ;

    }
}
