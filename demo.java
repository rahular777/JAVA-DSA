// public class demo {
//     static void printArray(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
    
//      static void changeArray(int[] arr){
//             for(int i=0;i<arr.length;i++){
//                 arr[i]=0;
//             }
//         }
    
    
//     public static void main(String[] args) {
//         int[] age={5,6,3};
//         // changeArray(age);
//         printArray(age);
//         int[] age2=age.clone();
//         System.out.println("this are elements of age2 array");
//         printArray(age2);

//         age2[0]=25;
//         age2[1]=35;
//         age2[2]=35;

//         System.out.println("The original value of age2 array is ");
//         printArray(age);
//         System.out.println("The changed  value of age2 array is ");
//         printArray(age2);


//     }
// }

import java.util.Scanner;
 

class demo{
  
    static void countoccourence(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
       
        System.out.println(count);
        
    }

    static void lastoccurence(int[] arr,int x){
    int lastdigit=-1;
      for(int i=0;i<arr.length;i++){
        if(arr.length==x){
            lastdigit=i;
        }
      }
      System.out.println(lastdigit);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
      
        int[] age=new int[n];
        System.out.print("Enter the array elements");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        System.out.println("Enter X:");
        int x=sc.nextInt();
    //   System.out.println(" Count of x:");
    //   countoccourence(age, x);
    System.out.println("last occurence is");
          lastoccurence(age,x);
    }
}

