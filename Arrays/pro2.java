import java.util.*;
class Array_problems{
      void count(){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int count=0;
        int[] arr={1,4,2,5,3,6,5,6,8,6,9,5,5,5,2,3,4,1,2,3,8,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
            
        }
        System.out.println("The number x elements in the array is:"+ count);


      }

      void arr_greater(){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();

        }
        System.out.println("Enter the x");
        int x=scan.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
              count ++;
                
            }
        }
        System.out.println("The elements which are greater then x :" +count);


      }

      void lastOccurence(){
        int[] arr={1,4,2,5,3,1,1,1};
        int x=1;
          int lastindex=-1;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                lastindex=i;             
            }
        
        }
        System.out.println("The last occurence of x in the indexing position is :"+ lastindex);
      }

      void  sort_array(){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int n=scan.nextInt();
       int[] arr=new int[n];
       System.out.println("Enter the array elements");
       for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt();

       }
       boolean check=true;
       for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            check=false;
            break;
        }

       }
       System.out.println(check);


      }


}



public class pro2 {


    public static void main(String[] args) {
        Array_problems obj1=new Array_problems();
        // obj1.count();
        // obj1.arr_greater();
        // obj1.lastOccurence();
        obj1.sort_array();
    }


    
}
