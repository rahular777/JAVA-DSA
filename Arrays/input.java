import java.util.Scanner;


public class input {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int n=scan.nextInt();
        int[] age={1,2,3,4,5};
        // System.out.println("Enter the array elements");
            // for(int i=0;i<age.length;i++){
                // age[i]=scan.nextInt();
            // }
            System.out.println("The array elements are");
            printarray(age);

            int[] age2=age.clone();

            System.out.println("The age2 array elements are");
            printarray(age2);

            

            System.out.println("The original array elements of age2 are");
            printarray(age);
            age2[0]=6;
            age2[1]=7;
            age2[2]=8;
            age2[3]=9;
            age2[4]=10;

            System.out.println("The updated array elemets of age2 are");
            printarray(age2);


        
    }
    
}
