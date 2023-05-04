package arrayOneDimension;

import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
/*
        int [] arr =new int[5];
        arr[0]=1 ;
        arr[1]=2 ;
        arr[2]=3 ;
        arr[3]=4 ;
        arr[4]=5 ;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
*/
        /*
        // create array during initialization
        int []arr={1,2,3,4,5} ;
        System.out.println(arr[2]);
         */
        /*
        // scan data from  user
        Scanner data =new Scanner(System.in) ;
        int [] id =new int[5] ;
        for(int i=0;i<id.length;i++)
        {
            System.out.println("enter id["+(i+1)+"]: " );
            id[i]=data.nextInt() ;
        }
        for(int i=0;i<id.length;i++)
        {
            System.out.println("user id ["+(i+1)+"] : " +id[i]);
        }*/

        /*
        String []name =new String[3];
        int []id =new int[3] ;
        int []salary =new int[3] ;

        Scanner data=new Scanner(System.in);
        for (int i=0;i<name.length;i++)
        {
            System.out.println("enter user name ["+(i+1)+"]");
            name[i]=data.next();
            System.out.println("enter user id ["+(i+1)+"]");
            id[i]=data.nextInt();
            System.out.println("enter user salary ["+(i+1)+"]");
            salary[i]=data.nextInt();
        }
        System.out.println("id\tname\tsalary");
        for (int i=0;i<name.length;i++)
        {
            System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
        }
        */


        // searching code
        int number = 10 ;
        int flag=0;
      int arr[]={1,2,3,4,5};
        int index =0;
      for(int i=0;i<arr.length;i++){
          if (number==arr[i])
          {

              flag=1 ;
              index =i ;
              break ;
          }
      }
        if(flag==1)
        {
            System.out.println("number ["+number+"] at index ["+index+"]");
        }
           else
        {
            System.out.println("not found");
        }









    }
}
