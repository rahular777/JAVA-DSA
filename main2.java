import java.util.*;
public class main2 {
   static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ "");
        }



    }
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n=scan.nextInt();
        int[] age={5,6,7,8,9};
        // System.out.println("Enter the array elements");
        // for(int i=0;i<age.length;i++){
        //     age[i]=scan.nextInt();
        // }
        System.out.println("The elements are:");
        // for(int i=0;i<n;i++){
        //     System.out.println(age);
        // }

        printarray(age);

        int[] age2=age;
        System.out.println("copid elemets are");
        printarray(age2);

        //changing the value of age2
        age[0]=0;
        age[1]=0;
        age[2]=0;
        age[3]=0;
        age[4]=0;

        System.out.println("original value of age 2");
        printarray(age);

        System.out.println("The changed value of age2 is");
        printarray(age2);

        }
    
}
